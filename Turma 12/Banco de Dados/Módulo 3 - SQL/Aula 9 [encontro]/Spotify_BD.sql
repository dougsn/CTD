CREATE DATABASE spotify;

USE spotify;

CREATE TABLE grupo (
	Douglas_Nascimento VARCHAR(100),
    Juliana_Ruama VARCHAR(100),
    Vinicius_Evandro VARCHAR(100),
    Fabrina_Nunes VARCHAR(100),
    Lucas_Pimenta VARCHAR(100),
    Cecilia_Valim VARCHAR(100)
);


CREATE TABLE usuario (
	idUsuario INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nomeusuario VARCHAR(45),
    data_nac DATE,
    sexo VARCHAR(1),
    email VARCHAR(150),
    senha VARCHAR(45)
);


CREATE TABLE artista (
	idArtista INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(45),
    sobrenome VARCHAR(100)
);

CREATE TABLE genero (
	idGenero INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    genero VARCHAR(45)
);

CREATE TABLE album (
	idAlbum INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    titulo VARCHAR (45),
    idArtista INT,
    CONSTRAINT fk_album_artista
    FOREIGN KEY (idArtista)
    REFERENCES artista(idArtista)
);


CREATE TABLE cancoes (
	idCancao INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    titulo VARCHAR(45),
    duracao DOUBLE,
    qtdreproducao INT(11),
    qtdlikes INT(11),
    idAlbum INT,
	CONSTRAINT fk_cancoes_album
    FOREIGN KEY (idAlbum)
    REFERENCES album(idAlbum)
);

CREATE TABLE generocancao (
	idGeneroCancao INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    idCancao INT,
    idGenero INT,
    CONSTRAINT fk_generocancao_cancao
    FOREIGN KEY (idCancao)
    REFERENCES cancoes(idCancao),
	CONSTRAINT fk_generocancao_genero
    FOREIGN KEY (idGenero)
    REFERENCES genero(idGenero)
);

CREATE TABLE playlist (
	idPlaylist INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    titulo VARCHAR(45),
    qtdcancoes INT,
    datacriacao DATETIME,
    idusuario INT,
    CONSTRAINT fk_playlist_usuario
    FOREIGN KEY (idusuario)
    REFERENCES usuario(idUsuario)
);

CREATE TABLE playlist_cancao (
	idPlaylist_Cancao INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    idCancao INT,
    idPlaylist INT,
    CONSTRAINT fk_playlist_cancao_cancao
    FOREIGN KEY (idCancao)
    REFERENCES cancoes(idCancao),
	CONSTRAINT fk_playlist_cancao_playlist
    FOREIGN KEY (idPlaylist)
    REFERENCES playlist(idPlaylist)
);

/*Inserindo Registros nas Tabelas: usuario,cancoes e album*/


INSERT INTO usuario (nomeusuario,data_nac,sexo,email,senha)
VALUES ("Douglas","1999-03-09","M","douglas@gmail.com","123456789");


INSERT INTO usuario (nomeusuario,data_nac,sexo,email,senha)
VALUES ("Juliana","1997-05-21","F","juliana@gmail.com","abcdefgh");

INSERT INTO usuario (nomeusuario,data_nac,sexo,email,senha)
VALUES ("Vinicius","1995-03-10","F","vinicius@gmail.com","sda123dasd");


/*Album*/

INSERT INTO album (titulo)
VALUES ("titulo1");

INSERT INTO album (titulo)
VALUES ("titulo2");

INSERT INTO album (titulo)
VALUES ("titulo3");


/*Cancoes*/

INSERT INTO cancoes (titulo,duracao,qtdreproducao,qtdlikes)
VALUES ("titulo1",5,3,10);

INSERT INTO cancoes (titulo,duracao,qtdreproducao,qtdlikes)
VALUES ("titulo2",2,10,7);

INSERT INTO cancoes (titulo,duracao,qtdreproducao,qtdlikes)
VALUES ("titulo3",3,7,12);








