/*Criação da base da dados e criação/alteração da tabela*/

CREATE DATABASE teste;

USE teste;

CREATE TABLE usuario (
	id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    sobrenome VARCHAR(50),
    email VARCHAR(100) NOT NULL,
    data_nascimento DATE
);

ALTER TABLE usuario
ADD telefone VARCHAR(50);

/*Inserindo, modificando e deletando informações da base de dados*/

INSERT INTO usuario (nome,sobrenome,email,data_nascimento,telefone) 
VALUES ("Douglas","Nascimento","douglassnascimet@gmail.com","1999-03-09",21982565216);

UPDATE usuario SET
nome = "Rafaella",
sobrenome = "Cuba"
WHERE  id = 1;

DELETE FROM usuario 
WHERE id = 1;

/*Selecionando/Consultando os dados com o SELECT*/

SELECT nome,sobrenome FROM usuario; /*Trás o que foi especificado antes do FROM*/

SELECT * FROM usuario; /*Trás todas as informações da tabela*/

/*Where e ORDER BY (DESC / ASC)*/
 



















