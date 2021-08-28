CREATE DATABASE saude_dh;

USE saude_dh;

CREATE TABLE pacientes (
	paciente_id 		INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    paciente_nome 		VARCHAR(50),
    paciente_sobrenome	VARCHAR(50)
    /*Ou poderiamos coloocar a chave primária assim: PRIMARY KEY (paciente_id) */
);

CREATE TABLE especialidades (
	especialidade_id	 INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    especialidade_nome	 VARCHAR(100)
);

CREATE TABLE medicos (
	medico_id		 	INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    medico_nome 	 	VARCHAR(40),
    medico_sobrenome 	VARCHAR(60),
    especialidade_id 	INT,
    CONSTRAINT fk_medico_especialidade 		#nome					/*É uma boa prática fazer uma constraint que para nomear a FOREIGN KEY.*/
    FOREIGN KEY (especialidade_id) 			#atributo que vai receber a referencia de outra tabela.				
    REFERENCES especialidades(especialidade_id) 	#referencia de onde está vindo a ligação, que é a tabela especialidades(campo da chave primária dela).
);

CREATE TABLE consultas (
	consulta_id 		INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    id_paciente 		INT NULL,
    id_medico 			INT NULL,
    data_consulta 		DATE,
    hora_consulta 		TIME,
    CONSTRAINT fk_paciente
    FOREIGN KEY (id_paciente)
    REFERENCES pacientes(paciente_id),
    CONSTRAINT fk_medico
    FOREIGN KEY (id_medico)
    REFERENCES medicos(medico_id)
);



