# Clientes

# 1

CREATE VIEW vw_clientes AS
SELECT ClienteID, Contato, Fax, Telefone FROM clientes;

SELECT * FROM vw_clientes;

# 2 

SELECT * FROM vw_clientes 
WHERE Fax = " ";

SELECT ClienteID, Contato, Fax, Telefone FROM clientes
WHERE Fax = " ";


# Fornecedores

# 1

CREATE VIEW vw_dados_fornecedores AS
SELECT ProvedorID, Contato, Empresa, CONCAT(Endereco, ", ",Cidade, ", ",CodigoPostal, ", ", Pais) AS 'Endereço' FROM provedores;

SELECT * FROM vw_dados_fornecedores;

# 2

SELECT * FROM vw_dados_fornecedores 
WHERE Endereço LIKE  "%Av. das Americanas%";

SELECT Contato, Empresa, Endereco FROM provedores
WHERE Endereco LIKE "%Av. das Americanas%";

# VIEW - Parte II - Desafio

# 1
DROP VIEW vw_controle_estoque;
CREATE VIEW vw_controle_estoque AS
SELECT ProdutoID, ProdutoNome, ROUND(PrecoUnitario, 0) AS PrecoUnitario, UnidadesEstoque, UnidadesPedidas,
																											  CASE 
																												WHEN UnidadesPedidas = 0 THEN 'Baixa'
                                                                                                                WHEN UnidadesPedidas = UnidadesEstoque THEN 'Média'
                                                                                                                WHEN UnidadesPedidas < (UnidadesEstoque * 2) THEN 'Urgente'
                                                                                                                ELSE 'Prioritário'
																											  END AS Prioridade
FROM produtos;

SELECT * FROM vw_controle_estoque;

# 2 

SELECT Prioridade, COUNT(Prioridade) AS Quantidade, FORMAT(AVG(PrecoUnitario),  2) AS PrecoMédio FROM vw_controle_estoque
WHERE UnidadesEstoque > 5
GROUP BY Prioridade;

