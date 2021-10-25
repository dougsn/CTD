USE projeto_spotify;

# Grupo: Douglas Nascimento, Rodrigo Escobar, Alex Crespo, Guilherme Carvalho

# 2

SELECT * FROM cancao
WHERE titulo LIKE '%z%';

# 3

SELECT * FROM cancao
WHERE titulo LIKE '_a%' '%s';



# 4

SELECT idPlaylist AS 'Id Playlist', idusuario AS 'Id Usuário' , titulo AS 'Titulo', qtdcancoes AS 'Quantidade Canções', idestado AS 'Id Estado', Datacriacao AS 'Data de Criação', Dataexclusao AS 'Data de Exclusão' 
FROM playlist
ORDER BY qtdcancoes DESC;

# 5 

SELECT * FROM usuario
ORDER BY Data_nac DESC
LIMIT 5
OFFSET 10;

# 6

SELECT * FROM cancao
ORDER BY qtdreproducao DESC
LIMIT 5;

# 7 

SELECT * FROM album
ORDER BY titulo ASC;

# 8 

SELECT * FROM album
WHERE imagemcapa IS NULL;

# 9

SELECT * FROM tipousuario;

SELECT * FROM pais;

SELECT * FROM usuario;

INSERT INTO usuario (idUsuario, Nomeusuario, NomeCompleto, Data_nac, sexo, Cod, senha, Pais_idPais, IdTipoUsuario)
VALUES (20,'Elmer',' Elmer Santos', '1991-11-15', 'M','B4129ATF','S4321m', 9, 3);

# 10

SELECT * FROM genero;

SELECT * FROM cancao;

SELECT * FROM generoxcancao;

DELETE FROM generoxcancao
WHERE idGenero = 9;


# 11

SELECT * FROM artista;

UPDATE artista 
SET imagem = 'Faltando Imagem'
WHERE idArtista IS NULL;


