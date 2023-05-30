# 1 -
# Modifique a tabela de artistas, adicione o campo userCreator varchar(50) e dateCreation datetime. Então faça o seguinte:
# Crie um trigger que ao inserir um registro na tabela de artistas, o usuário que criou o registro seja adicionado à 
# coluna userCreator. Dica: qual função usamos para obter o usuário?
# Além disso, deve-se adicionar no campo dateCreation em que dia e em que horário foi inserido o registro.
# Execute um insert na tabela de artistas e depois faça um select no último registro para ver os resultados. 
# Qual usuário foi adicionado?

SELECT * FROM musimundos.artistas;


ALTER TABLE artistas
ADD COLUMN userCreator VARCHAR(50),
ADD COLUMN dateCreation DATETIME;

DELIMITER //
CREATE TRIGGER artistas_before_insert
BEFORE INSERT ON artistas
FOR EACH ROW
BEGIN
    SET NEW.userCreator = CURRENT_USER();
    SET NEW.dateCreation = NOW();
END;
//
INSERT INTO artistas (id, nome) VALUES (502,'Teste');

SELECT * FROM artistas ORDER BY dateCreation DESC LIMIT 1;

# 2 - Modifique a tabela de artistas, adicione o campo userModification varchar(50) e dateModification datetime. 
# Então faça o seguinte:
# Crie um trigger que quando um registro for atualizado na tabela de artistas, o usuário que atualizou o registro seja 
# adicionado à coluna userModification.
# Além disso, deve-se adicionar no campo dateMoficacion em que dia e em que horário foi realizada a execução.
# Execute uma atualização na tabela de artistas e selecione no último registro para ver os resultados. 
# Qual foi o usuário  que modificou os dados?



ALTER TABLE artistas
ADD COLUMN userModification VARCHAR(50), # Adicionando uma nova coluna
ADD COLUMN dateModification DATETIME;

DELIMITER //
CREATE TRIGGER artistas_before_update # Criando a trigger
BEFORE UPDATE ON artistas # Depois que atualizar a tabela artista
FOR EACH ROW # Para cada linha faça
BEGIN
    SET NEW.userModification = CURRENT_USER(); # Pega o usuário corrente e atribui ao campo userModification
    SET NEW.dateModification = NOW(); # Pega a data atual e atribui ao campo dateModification
END; 
//

UPDATE artistas
SET nome = "Teste Modificado"
WHERE id = 502;

SELECT * FROM artistas ORDER BY dateModification DESC LIMIT 1;

SELECT * FROM musimundos.artistas;

# 3 - Crie a tabela artista_historico com os campos: id int, nome varchar(85), rating double(3,1), user varchar(50), 
# date datetime, ação varchar(10).

CREATE TABLE artista_historico (
	id int,
    nome varchar(85),
    usuario varchar(50),
    date datetime,
    acao varchar(10)
);

# 4 -
# Crie um trigger que quando um registro for inserido na tabela artistas, um valor seja inserido na tabela artista_historico,
# com os mesmos valores de id, nome e rating, o usuário que executou a ação, o dia e horário de execução e , em ação, 
# adicione o valor "Inserir"

DELIMITE //
CREATE TRIGGER artistas_insert
AFTER INSERT ON artistas
FOR EACH ROW
BEGIN
	INSERT INTO artista_historico(id, nome, usuario, date, acao) 
    VALUES(NEW.id, NEW.nome, CURRENT_USER(), NOW(), 'Inserir');
END;
//

INSERT INTO artistas (id, nome) VALUES (503,'Teste 3');
INSERT INTO artistas (id, nome) VALUES (504,'Teste 4');

SELECT * FROM artista_historico;


# 5 -
# Crie um trigger que quando for feita uma atualização de um registro na tabela artistas, 
# seja inserido um valor na tabela artista_histórico, com os mesmos valores de id, nome e rating, o usuário que 
# executou a ação, o dia e hora da execução e, em ação, adicionar o valor "Update"

DELIMITER //
CREATE TRIGGER artista_update
AFTER UPDATE ON artistas
FOR EACH ROW
BEGIN
	INSERT INTO artista_historico(id, nome, usuario, date, acao)
    VALUES(NEW.id, NEW.nome, CURRENT_USER(),NOW(), 'Update');
END;
//

UPDATE artistas
SET nome = "Teste Modificado 3 "
WHERE id = 53;


# 6 - 
# Crie uma trigger que quando um registro for deletado na tabela artistas, seja inserido um valor na tabela artista_historico
# com os mesmos valores de id, nome e rating, o usuário que executou a ação, o dia e hora da execução e, em ação,
# adicione o valor "Delete"

DELIMITER //
CREATE TRIGGER artista_delete
AFTER DELETE ON artistas
FOR EACH ROW
BEGIN
	INSERT INTO artista_historico(id, nome, usuario, date, acao)
    VALUES(OLD.id, OLD.nome, CURRENT_USER(), NOW(), 'Delete');
END;
//

DELETE FROM artistas WHERE id = 551;







