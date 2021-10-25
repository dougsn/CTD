/*

INNER traz o conjunto das 2 tabelas.

LEFT traz tudo que tem na PRIMEIRA tabela independente de ter ou NÃO relação com a SEGUNDA tabela.
 
RIGHT traz tudo que tem na  SEGUNDA tabela independente de ter ou NÃO relação com a PRIMEIRA tabela.


*/




# Relatórios 2 - parte 1 - Revisando INNER JOIN

/*
	Faça uma consulta sobre o faturamento do e-market. Inclua as seguintes informações:
	ID da fatura
	data da fatura
	nome da empresa de correio (O id da empresa consta da tabela faturas no campo FormaEnvio)
	nome do cliente
	categoria do produto vendido
	nome do produto(Você chega ao produto consultando os detalhes da fatura)
	preço unitário
	quantidade

*/

# Bruno Barreto - Matheus Galvao - Rafa Vasconcelos - Eduardo Gonzales - Douglas Nascimento - Guilherme Pereira

USE emarket;

SELECT  A.FaturaId,  A.DataFatura, B.Empresa AS Cliente, C.Contato, D.CategoriaNome, E.ProdutoNome, E.PrecoUnitario, F.Quantidade 
FROM faturas A
INNER JOIN clientes C
ON A.ClienteID = C.ClienteID
INNER JOIN correios B
ON A.FormaEnvio = B.CorreioID
INNER JOIN detalhefatura F
ON A.FaturaId = F.FaturaId
INNER JOIN produtos E
ON F.ProdutoID = E.ProdutoID
INNER JOIN categorias D
ON D.CategoriaID = E.CategoriaID;


# Relatórios II parte II - INNER, LEFT e RIGHT JOIN

# 1 - Liste todas as categorias junto com informações sobre seus produtos. Incluir todas as categorias, mesmo que não tenham produtos.

SELECT A.CategoriaID, A.CategoriaNome, A.Descricao, B.ProdutoID, B.ProdutoNome, B.CategoriaID FROM categorias A
LEFT JOIN produtos B
ON A.CategoriaID = B.CategoriaID;

# 2 - Liste as informações de contato de clientes que nunca compraram no emarket.

SELECT A.Contato, A.Endereco , A.Cidade, A.Regioes  FROM clientes A
LEFT JOIN faturas B
ON A.ClienteID = B.ClienteID
WHERE ISNULL(B.FaturaId);

# 3 - Faça uma lista de produtos. Para cada um, indique seu nome, categoria e as informações de contato de seu fornecedor. Lembre-se que podem existir produtos para os quais o fornecedor não foi indicado.

SELECT A.ProdutoNome, B.CategoriaNome, C.Contato FROM produtos A
INNER JOIN provedores C
ON A.ProvedorID = C.ProvedorID
INNER JOIN categorias B
ON A.CategoriaID = B.CategoriaID;

# 4

SELECT A.CategoriaNome, AVG(B.PrecoUnitario) AS 'Preço Unitário Médio' FROM categorias A
INNER JOIN produtos B
ON A.CategoriaID = B.CategoriaID
GROUP BY A.CategoriaNome;


















