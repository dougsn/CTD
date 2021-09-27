CREATE DATABASE DHTube;

USE DHTube;

CREATE TABLE avatar (
	id_avatar INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(45),
    urlimagem VARCHAR(100)
);

CREATE TABLE pais (
	id_pais INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100)
);


CREATE TABLE usuario (
	id_usuario INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(45),
    email VARCHAR(45),
    senha VARCHAR(45),
    dataNascimento DATETIME,
    cep VARCHAR(45),
    id_pais INT,
    id_avatar INT,
    CONSTRAINT fk_usuario_pais
    FOREIGN KEY(id_pais)
    REFERENCES pais(id_pais),
    CONSTRAINT fk_usuario_avatar
    FOREIGN KEY(id_avatar)
    REFERENCES avatar(id_avatar)
);



CREATE TABLE canal (
	id_canal INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(45),
    descricao TEXT,
    dataCriacao DATETIME,
    id_usuario INT,
    CONSTRAINT fk_canal_usuario
    FOREIGN KEY (id_usuario)
    REFERENCES usuario(id_usuario)
);

CREATE TABLE video (
	id_video INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    titulo VARCHAR(100),
    descricao TEXT,
    tamanho DOUBLE,
    nomeArquivo VARCHAR(100),
    duracao DOUBLE,
    imagem VARCHAR(100),
    qtdReproducoes INT(11),
    qtdlikes INT(11),
    qtdDislikes INT(11),
    privado SMALLINT(6),
    dataPublicacao DATETIME,
	id_usuario INT,
    CONSTRAINT fk_video_usuario
    FOREIGN KEY (id_usuario)
    REFERENCES usuario (id_usuario)
);



CREATE TABLE playlist (
	id_playlist INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(45),
    dataCriacao DATETIME,
    privado SMALLINT(6),
    id_usuario INT,
    CONSTRAINT fk_playlist_usuario
    FOREIGN KEY (id_usuario)
    REFERENCES usuario (id_usuario)
);



CREATE TABLE playlist_video (
	id_video INT,
    id_playlist INT,
    CONSTRAINT fk_playlist_video_video
    FOREIGN KEY (id_video)
    REFERENCES video (id_video),
    CONSTRAINT fk_playlist_video_playlist
    FOREIGN KEY (id_playlist)
    REFERENCES playlist(id_playlist)
);


# CRUD no Banco de Dados

#CREATE

INSERT INTO avatar (nome)
VALUES ('Douglas'),('Antonio'),('Bruno'),('Jonathas'),('Matheus');

#READE

SELECT id_avatar, nome FROM avatar;

#UPDATE

UPDATE avatar 
SET nome = 'Douglas_Nascimento'
WHERE id_avatar = 1;

UPDATE avatar 
SET nome = 'Bruno_Barreto'
WHERE id_avatar = 3;

#DELETE

DELETE #SELECT *
FROM avatar 
WHERE id_avatar = 4;

DELETE FROM avatar
WHERE id_avatar in (6,7,8,9,10);


/* 

GRUPO 

Bruno Barreto, Douglas Nascimento, Matheus Galvão, Antonio Henrique, Jonathas Magalhães.

*/

