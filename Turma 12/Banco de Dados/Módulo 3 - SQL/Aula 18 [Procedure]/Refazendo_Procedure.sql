
# Empregados

DELIMITER $$
CREATE PROCEDURE sp_empregados()
BEGIN
	
    SELECT Sobrenome, Nome FROM empregados;
    
END $$
DELIMITER ;

CALL sp_empregados;

# Empregados por Cidade

DELIMITER $$
CREATE PROCEDURE sp_cidade_funcionario(IN nomecidade VARCHAR(30))
BEGIN
	SELECT Nome,Sobrenome,Cidade FROM empregados
    WHERE nomecidade =  Cidade;
END $$
DELIMITER ;

CALL sp_cidade_funcionario('Seattle');

# Clientes por País

DELIMITER $$
CREATE PROCEDURE sp_pais_clientes(nomepais VARCHAR(15), OUT qtd_pais INT)
BEGIN
	SELECT COUNT(ClienteID)  INTO qtd_pais FROM clientes
    WHERE Pais = nomepais;
    
END $$
DELIMITER ;

CALL sp_pais_clientes('Germany', @quantidade);

SELECT @quantidade;

# Produtos sem Estoque


DELIMITER $$
CREATE  PROCEDURE sp_lista_produtos(IN numestoque INT)
BEGIN
	SELECT A.ProdutoNome, A.UnidadesEstoque,B.CategoriaNome FROM produtos A
    INNER JOIN categorias B
    ON B.CategoriaID = A.CategoriaID
    WHERE A.UnidadesEstoque < numestoque ;
    
END $$
DELIMITER ;

CALL sp_lista_produtos(10);

CALL sp_lista_produtos(1);









 