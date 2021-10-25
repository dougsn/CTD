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

/*Inseridno dados no Banco "Universo_Leitura"*/

/*Tabela Associados*/

INSERT INTO associados(rg,nome,sobrenome,endereco,cidade,estado) 
VALUES (1547542, "Douglas","Nascimento","Rua Waldemar Cardoso Teixeira","São Gonçalo","RJ");

INSERT INTO associados(rg,nome,sobrenome,endereco,cidade,estado) 
VALUES (1241547, "Rafaella","Cuba","Rua Fulano","Niterói","RJ");

INSERT INTO associados(rg,nome,sobrenome,endereco,cidade,estado) 
VALUES (1414789, "Diane","Silva","Rua de Tal","Itaboraí","RJ");

INSERT INTO associados(rg,nome,sobrenome,endereco,cidade,estado) 
VALUES (1424784, "Renato","Lessa","Rua Beltrano","Maricá","RJ");

INSERT INTO associados(rg,nome,sobrenome,endereco,cidade,estado) 
VALUES (1421365, "Rodrigo","Pessanha","Rua Cliclano","Magé","RJ");

DELETE FROM `universo_leitura`.`associados` WHERE (`id_associado` = '6');
DELETE FROM `universo_leitura`.`associados` WHERE (`id_associado` = '7');


/*Tabela Telefones*/

INSERT INTO telefones (telefone_socio,id_associado)
VALUES ("(21)-92185-4124",1);

INSERT INTO telefones (telefone_socio,id_associado)
VALUES ("(21)-91245-2354",1);

INSERT INTO telefones (telefone_socio,id_associado)
VALUES ("(21)-98745-9320",2);

INSERT INTO telefones (telefone_socio,id_associado)
VALUES ("(21)-92847-1693",3);

INSERT INTO telefones (telefone_socio,id_associado)
VALUES ("(11)-92963-1032",3);

INSERT INTO telefones (telefone_socio,id_associado)
VALUES ("(11)-97104-9641",4);

INSERT INTO telefones (telefone_socio,id_associado)
VALUES ("(21)-97842-0241",5);


/*Tabela Autores*/

INSERT INTO autores (sobrenome, nome)
VALUES ("Nascimento","Douglas");

/*Tabela Editoras*/

INSERT INTO editoras (razao_social,telefone)
VALUES ("exemplo1","(21)95124-3261");

INSERT INTO editoras (razao_social,telefone)
VALUES ("exemplo2","(21)96214-4741");

INSERT INTO editoras (razao_social,telefone)
VALUES ("exemplo2","(21)98514-2332");


/*Tabela Livros*/

INSERT INTO livros (cod_isbn,titulo,ano_criacao,ano_publicacao,id_autor,id_editora)
VALUES ("9788533302273","Dom Quixote","1605-02-20","1605-03-01",1,1);

INSERT INTO livros (cod_isbn,titulo,ano_criacao,ano_publicacao,id_autor,id_editora)
VALUES ("1201458741021"," Guerra e Paz","1869-01-20","1869-02-10",1,1);

INSERT INTO livros (cod_isbn,titulo,ano_criacao,ano_publicacao,id_autor,id_editora)
VALUES ("1021054715214","A Montanha Mágica","1924-04-10","1924-04-20",1,2);

INSERT INTO livros (cod_isbn,titulo,ano_criacao,ano_publicacao,id_autor,id_editora)
VALUES ("1012302102154","Cem Anos de Solidão","1967-05-20","1967-05-30",1,1);

INSERT INTO livros (cod_isbn,titulo,ano_criacao,ano_publicacao,id_autor,id_editora)
VALUES ("2012362102154","Ulisses","1967-05-20","1922-08-22","1922-08-30",1,1);

INSERT INTO livros (cod_isbn,titulo,ano_criacao,ano_publicacao,id_autor,id_editora)
VALUES ("2017895462159","Em Busca do Tempo Perdido","1913-11-13","1913-11-27",1,2);


/*Tabela Exemplares*/

INSERT INTO exemplares (sinistro,id_livro)
VALUES(0,1);

INSERT INTO exemplares (sinistro,id_livro)
VALUES(0,5);

INSERT INTO exemplares (sinistro,id_livro)
VALUES(0,2);

INSERT INTO exemplares (sinistro,id_livro)
VALUES(1,4);

INSERT INTO exemplares (sinistro,id_livro)
VALUES(0,3);

/*Tabela Emprestimo_Exemplares*/

INSERT INTO emprestimo_exemplares (id_emprestimo,id_exemplar)
VALUES (1,1);

INSERT INTO emprestimo_exemplares (id_emprestimo,id_exemplar)
VALUES (2,3);

INSERT INTO emprestimo_exemplares (id_emprestimo,id_exemplar)
VALUES (3,5);

/*Tabela Emprestimo*/

INSERT INTO emprestimo (data_emprestimo,prazo_devolucao,data_devolucao,id_associado)
VALUES ("2020-02-25","2020-03-25","2020-03-20",1);

INSERT INTO emprestimo (data_emprestimo,prazo_devolucao,data_devolucao,id_associado)
VALUES ("2020-08-15","2020-09-15","2020-09-14",2);

INSERT INTO emprestimo (data_emprestimo,prazo_devolucao,data_devolucao,id_associado)
VALUES ("2021-07-20","2021-08-20","2021-08-10",3);


/*Excluir um associado*/

DELETE FROM associados 
WHERE id_associado = 5; #da erro, pois ela está sendo associada como FK na tabela emprestimo

/*Excluir um livros*/

DELETE FROM livros
WHERE id_livro = 1; #da erro, pois ela está sendo associada como FK na tabela exemplares


/*Atualizando um registro na tabela associado*/

UPDATE associados
SET endereco = "Rua das Flores, 860" 
WHERE id_associado = 3;







