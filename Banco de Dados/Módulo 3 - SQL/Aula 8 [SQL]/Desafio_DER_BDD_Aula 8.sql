CREATE DATABASE universo_leitura; 

USE universo_leitura;

CREATE TABLE editoras (
	id_editora INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    razao_social VARCHAR(150),
    telefone VARCHAR(100)
);

CREATE TABLE autores (
	id_autor INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    sobrenome VARCHAR(100),
    nome VARCHAR(100)
);

CREATE TABLE livros (
	id_livro INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    cod_isbn VARCHAR(13),
    titulo VARCHAR(200),
    ano_criacao DATE,
    ano_publicacao DATE,
    id_autor int,
    id_editora int,
    CONSTRAINT fk_autor
    FOREIGN KEY (id_autor)
    REFERENCES autores(id_autor),
    CONSTRAINT fk_editora
    FOREIGN KEY (id_editora)
    REFERENCES editoras(id_editora)
);


CREATE TABLE exemplares (
	id_exemplar INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    sinistro BOOL,
    id_livro INT,
    CONSTRAINT fk_livro
    FOREIGN KEY (id_livro)
	REFERENCES livros(id_livro)
);


CREATE TABLE associados (
	id_associado INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	rg CHAR(7),
    nome VARCHAR(50),
    sobrenome VARCHAR(50),
    endereco VARCHAR(50),
    cidade VARCHAR(50),
    estado VARCHAR(2)
);


CREATE TABLE telefones (
	telefone_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    telefone_socio VARCHAR(100),
    id_associado INT,
    CONSTRAINT fk_telefone_associado
    FOREIGN KEY (id_associado)
    REFERENCES associados(id_associado)
);

DROP TABLE emprestimo;

CREATE TABLE emprestimo (
	id_emprestimo INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    data_emprestimo DATE,
    prazo_devolucao DATE,
    data_devolucao DATE,
    id_associado INT,
    CONSTRAINT fk_emprestimo_associado
    FOREIGN KEY (id_associado)
    REFERENCES associados (id_associado)
);

CREATE TABLE emprestimo_exemplares (
	id_emprestimo_exemplares INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    id_emprestimo INT,
    id_exemplar INT,
    CONSTRAINT fk_emprestimo
    FOREIGN KEY (id_emprestimo)
    REFERENCES emprestimo(id_emprestimo),
    CONSTRAINT fk_exemplar
    FOREIGN KEY (id_exemplar)
    REFERENCES exemplares(id_exemplar)
);

CREATE TABLE grupo (
	Douglas_Nascimento VARCHAR(10),
    Marcos_Fonseca VARCHAR(10),
    Marcos_Rodrigues VARCHAR(10),
    Mateus_Praxedes VARCHAR(10),
    Cristiano VARCHAR(10),
    Vinicius VARCHAR(10)  
);





