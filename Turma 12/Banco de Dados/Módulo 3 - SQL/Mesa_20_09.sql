

# Grupo: Wellington Siqueira, Douglas Nascimento, Paulo Catena, Moises Bollela

# 1
CREATE VIEW contato_cliente AS 
SELECT ClienteID, Contato, Fax,  Telefone
FROM clientes;

SELECT * FROM contato_cliente;	

# 2

SELECT Telefone FROM clientes
WHERE Fax = "";

SELECT * FROM contato_cliente
WHERE Fax = "";

# Fornecedores

# 1

CREATE VIEW dados_fornecedores AS
SELECT ProvedorID, Contato, Empresa, 
concat(Endereco, "", Cidade, "", CodigoPostal, "",Pais) AS 'Endereço'
FROM provedores;

SELECT * FROM dados_fornecedores;

# 2 

SELECT Empresa, Contato, Endereco FROM provedores
WHERE Endereco LIKE '%Av. das Americanas%';

SELECT * FROM dados_fornecedores
WHERE Endereço LIKE "%Av. das Americanas%";

# VIEW - Parte II - Desafio

CREATE VIEW controle_estoque AS
SELECT ProdutoID, ProdutoNome, ROUND(PrecoUnitario, 0) AS "Preço Unitário", UnidadesEstoque, UnidadesPedidas, 
																						  CASE
																							WHEN UnidadesPedidas = 0 THEN 'Baixa'
                                                                                            WHEN UnidadesPedidas < UnidadesEstoque THEN 'Média'
                                                                                            WHEN UnidadesPedidas < (UnidadesEstoque * 2) THEN 'Urgente'
                                                                                            ELSE 'Prioritário'
																							END AS Prioridade
FROM produtos;

SELECT * FROM controle_estoque;

# 2 

SELECT Prioridade, COUNT('Preço Unitário') AS 'Produtos' FROM controle_estoque
GROUP BY Prioridade;



