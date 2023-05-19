## Functions e Storage Procedures

######################################################        			 ######################################################
######################################################     Functions	 ######################################################   
######################################################        			 ######################################################

## As Functions são utilizadas para selecionar algo, com base no parâmetro recebido (De entrada 'IN') e na sua lógica interna.

DELIMITER $$ # Serve para abrir o escopo da função a ser criada/utilizada
CREATE FUNCTION categoria_salario(salario DOUBLE)
RETURNS VARCHAR(15) # Indica que o retorno da função será um VARCHAR de 15 caracteres
DETERMINISTIC # Indica que o retorno sempre será o mesmo resultado, quando os mesmos parêmetros são utilizados
BEGIN # Inicia a função
	DECLARE categoria VARCHAR(15) # Cria uma variavel que será utilizada dentro da função
    CASE WHEN salario < 200 THEN SET categoria = 'Baixo' # Caso o salário seja menos que 200, de o valor de 'Baixo' para a variavel categoria.
    WHEN salario < 1000 THEN SET categoria = 'Médio' # Se for menor que 1000, de o valor de 'Médio'
    ELSE SET categoria = 'Alto' END; # Se não de o valor de 'Alto', o END finaliza a lógica
    RETURN categoria; # Retorne a variavel categoria
END; # Finaliza a função
$$ # Fecha o escopo da função

SELECT  arquivo, salario, categoria_salario(salario) # Chamando a função criada, passando o parâmetro.
        FROM empregados
        
######################################################        			 ######################################################
###################################################### Storage Procedure ######################################################   
######################################################        			 ######################################################

## A Storage Procedure é utilizada para realizar alguma manipulação de dados, sendo Select, Insert, Update ou Delete.
# Parâmetro -> IN (Entrada de dados), OUT (Dados de retorno), INOUT (Recebe e devolve dados).

# IN
DELIMITER $$
CREATE PROCEDURE sp_nome_procedimento(IN id_user INT) # IN -> Dado de entrada
BEGIN
	SELECT nome_user from user where id_usuario = id_user ;
END;
$$

CALL sp_nome_procedimento(2); # Devolve o nome do usuário com o ID 2.

# OUT

DELIMITER $$
CREATE PROCEDURE sp_nome_procedure(OUT salario FLOAT) # OUT -> Dado de retorno
BEGIN
	SET salario = 25700.50; # Atribui um valor para a variavel que será exposta no OUT.
END;
$$

CALL sp_nome_procedure (@salario); # Cria uma 'variavel' para ser reutilizada no select abaixo.
SELECT @salario; # Pega o valor que foi retornado da procedure, por conta do OUT.

# INOUT

DELIMITER $$
CREATE PROCEDURE sp_nome_procedure(INOUT aumentar FLOAT)
BEGIN
	SET aumentar = aumentar + 25700.500;
END;
$$

SET @salario = 2000.00; # Declarando e atribuindo um valor a variável
CALL sp_nome_procedure(@salario) # Entregando o dado para realizar a lógica e retorno o novo valor abaixo
SELECT @salario; # Selecionando o valor que foi exposto para a função com INOUT.



















	