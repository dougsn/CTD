# Empregados

# 1

DELIMITER $$
CREATE PROCEDURE sp_lista_nome_empregados(IN idempregado INT)
BEGIN
	SELECT *
		FROM empregados
        WHERE EmpregadoID = idempregado
        ORDER BY Nome ASC;
END $$
DELIMITER ;

# 2

CALL sp_lista_nome_empregados(1);

# Empregados por cidade

# 1
DELIMITER $$
CREATE PROCEDURE sp_cidade_funcionario(IN nome_cidade VARCHAR(30))
BEGIN
SELECT cidade, sobrenome, nome FROM empregados
WHERE Cidade = nome_cidade;
END $$
DELIMITER ;

# 2 

CALL sp_cidade_funcionario('Seattle');


# Cliente por país



















