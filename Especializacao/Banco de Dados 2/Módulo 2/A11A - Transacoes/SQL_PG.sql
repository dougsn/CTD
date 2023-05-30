# 1 - Gere uma transação na tabela generos onde, dentro dela, vamos inserir o registro com id 30 e o nome que queremos.
# Então vamos salvar a mudança.

SELECT * FROM musimundos.generos;

START TRANSACTION;

INSERT INTO musimundos.generos (id, nome) values (30, 'Teste');

COMMIT;

# 2 -   Verifique se o registro foi inserido na tabela de gêneros.

SELECT * FROM musimundos.generos;

# 3 - Gere uma transação onde, dentro dela, vamos deletar o registro com id 30 e depois vamos descartar a alteração.
# Tenha em mente que você deve desabilitar a verificação dos FKs das outras tabelas e habilitá-la novamente.
# Uma dica: no infográfico de transações que vimos anteriormente, há um exemplo.

START TRANSACTION;

SET foreign_key_checks = 0;

DELETE FROM generos WHERE generos.id = 30;

SET foreign_key_checks = 1;
ROLLBACK;



# 3 - Agora vamos revisar o que aconteceu na tela Saída quando executamos a transação. Percebemos algo diferente do que 
# quando fazemos uma exclusão comum? Por fim, fazemos um SELECT para verificar o que aconteceu com a alteração feita 
# no ponto anterior. 

SELECT * FROM musimundos.generos;
