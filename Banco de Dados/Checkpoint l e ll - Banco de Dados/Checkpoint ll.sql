# Criação do banco de dados. 

CREATE DATABASE OFICINA; 

USE OFICINA;

# Criação das tabelas com chaves primárias e estrangeiras.

CREATE TABLE CLIENTE(
	IDCLIENTE INT PRIMARY KEY AUTO_INCREMENT,
	NOME VARCHAR(30) NOT NULL,
	SEXO ENUM('M','F') NOT NULL,
	ID_CARRO INT UNIQUE
);

CREATE TABLE TELEFONE(
	IDTELEFONE INT PRIMARY KEY AUTO_INCREMENT,
	TIPO ENUM('CEL','RES','COM') NOT NULL,
	NUMERO VARCHAR(30) NOT NULL,
	ID_CLIENTE INT 
);

CREATE TABLE MARCA(
	IDMARCA INT PRIMARY KEY AUTO_INCREMENT,
	MARCA VARCHAR(30) UNIQUE
);

CREATE TABLE CARRO(
	IDCARRO INT PRIMARY KEY AUTO_INCREMENT,
	MODELO VARCHAR(30) NOT NULL,
	PLACA VARCHAR(30) NOT NULL UNIQUE,
	ID_MARCA INT
);

CREATE TABLE COR(
	IDCOR INT PRIMARY KEY AUTO_INCREMENT,
	COR VARCHAR(30) UNIQUE
);

CREATE TABLE CARRO_COR(
	ID_CARRO INT,
	ID_COR INT,
	PRIMARY KEY(ID_CARRO,ID_COR)
);

/* CONSTRAINTS - As constraints foram construidas serapadamente, para ficar mais organizado o código*/

ALTER TABLE TELEFONE 
ADD CONSTRAINT FK_TELEFONE_CLIENTE
FOREIGN KEY(ID_CLIENTE)
REFERENCES CLIENTE(IDCLIENTE);


ALTER TABLE CLIENTE
ADD CONSTRAINT FK_CLIENTE_CARRO
FOREIGN KEY(ID_CARRO)
REFERENCES CARRO(IDCARRO);


ALTER TABLE CARRO
ADD CONSTRAINT FK_CARRO_MARCA
FOREIGN KEY(ID_MARCA)
REFERENCES MARCA(IDMARCA);


ALTER TABLE CARRO_COR
ADD CONSTRAINT FK_COR
FOREIGN KEY(ID_COR)
REFERENCES COR(IDCOR);


ALTER TABLE CARRO_COR
ADD CONSTRAINT FK_CARRO
FOREIGN KEY(ID_CARRO)
REFERENCES CARRO(IDCARRO);

/* 											EXPLICAÇÃO DO CRUD


Foram inseridos em quase todas as tabelas da base de dados algumas informações, para que fosse treinado o INNER JOIN. 
Nessas inserções eu coloquei um INSERT para cada tabela que não fizesse ligação (PK -> FK) com as chaves estrangeiras, para que, quando chegasse o momento de DELETÁ-LAS 
não ocorresse o erro de ligação.

Com a execução dos scripts, um por um, o processo do CRUD pode ser visto com sucesso. 

A ideia principal deste projeto, é construir um banco de dados relacional, onde o sistema pudesse fazer as consultas necessários dos clientes e seus respectivos carros, e também, servisse de base para que no futuro, 
pudesse ser incrementando mais tabelas, para que a base de dados tivesse também uma regra de negócio voltado para a oficina, direcionando as suas faturas e modelos de pagamento.

*/

# Inserção de dados em uma das tabelas (CREATE) C.

# Tabela Marca

INSERT INTO marca(MARCA) VALUES('Fiat');
INSERT INTO marca(MARCA) VALUES('Hyundai');
INSERT INTO marca(MARCA) VALUES('Volkswagen');
INSERT INTO marca(MARCA) VALUES('Chevrolet');

# Tabela Carro

INSERT INTO carro(MODELO,PLACA,ID_MARCA) VALUES ('Uno','ABC123',1);
INSERT INTO carro(MODELO,PLACA,ID_MARCA) VALUES ('HB20','AT5SAW',2);
INSERT INTO carro(MODELO,PLACA,ID_MARCA) VALUES ('Voyage','AW14S',3);
INSERT INTO carro(MODELO,PLACA) VALUES ('Cruzer','AWS897');

# Tabela Cliente

INSERT INTO cliente(NOME,SEXO,ID_CARRO) VALUES ('Douglas','M',1);
INSERT INTO cliente(NOME,SEXO,ID_CARRO) VALUES ('Caio','M',2);
INSERT INTO cliente(NOME,SEXO,ID_CARRO) VALUES ('Daniela','F',3);
INSERT INTO cliente(NOME,SEXO) VALUES ('Thaís','F');

# Tabela Telefone

INSERT INTO  telefone(TIPO,NUMERO,ID_CLIENTE) VALUES ('CEL','(21)98514-5698',1);
INSERT INTO  telefone(TIPO,NUMERO,ID_CLIENTE) VALUES ('COM','(21)95475-3297',2);
INSERT INTO  telefone(TIPO,NUMERO,ID_CLIENTE) VALUES ('RES','(21)2604-9587',3);
INSERT INTO  telefone(TIPO,NUMERO) VALUES ('RES','(21)2706-2874');

# Seleção de dados de uma das tabelas. (READ) - R

SELECT  A.IDMARCA, B.IDCARRO, C.NOME, D.NUMERO, D.TIPO ,C.SEXO ,A.MARCA, B.MODELO, B.PLACA FROM marca A
INNER JOIN carro B
ON A.IDMARCA = B.ID_MARCA
INNER JOIN cliente C
ON B.IDCARRO = C.ID_CARRO
INNER JOIN telefone D
ON C.IDCLIENTE = D.ID_CLIENTE
ORDER BY A.IDMARCA;

SELECT * FROM CLIENTE;
SELECT * FROM TELEFONE;


# Atualização de dados em uma das tabelas. (UPDATE) U

UPDATE carro SET PLACA = 'WRW547'
WHERE PLACA = 'AT5SA';

UPDATE carro SET PLACA = 'EFG456'
WHERE PLACA = 'ABC123';

UPDATE carro SET PLACA = 'QOS475'
WHERE PLACA = 'AW14S';

UPDATE telefone SET NUMERO = '(21)2706-1075'
WHERE IDTELEFONE = 4;


# Exclusão de dados em uma das tabelas. (DELETE) D

DELETE FROM carro WHERE IDCARRO = 4;

SELECT * FROM carro;











