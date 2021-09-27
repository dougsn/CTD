/*
Grupo -> Douglas Nascimento, Marcel Augustoo, Edimilsoon Sousa, Rafa Vasconcelos, Alisson Souza, Cecilia Valim
*/

# 1 
		
SELECT A.Contato, A.Telefone, A.Endereco,  COUNT(*) AS 'Quantidade de Compra', MIN(B.DataFatura) AS 'Menor data',  MAX(B.DataFatura) AS 'Maior Data'FROM clientes A
INNER JOIN faturas B
ON A.ClienteID = B.ClienteID 
WHERE B.DataFatura BETWEEN '1996-01-01 00:00:00' AND '1996-12-30'
GROUP BY A.ClienteID;


# 2 


SELECT  CONCAT('000',A.FaturaId), A.CidadeEnvio, DATE_FORMAT(A.DataFatura, '%Y - %m - %d') AS 'Data  da Fatura', B.Pais, B.Cidade AS 'Cidade do Cliente' FROM faturas A
INNER JOIN clientes B
ON A.ClienteID = B.ClienteID
HAVING A.CidadeEnvio <> B.Cidade AND B.Pais = 'UK';

# 3 

SELECT A.Empresa, A.CorreioID , SUM(B.Transporte) AS 'Transporte Total'
FROM correios A
INNER JOIN faturas B
ON A.CorreioID = B.FormaEnvio 
GROUP BY A.Empresa;

# 4

SELECT A.ProdutoNome, C.CategoriaNome FROM produtos A
INNER JOIN detalhefatura B
ON A.ProdutoID = B.ProdutoID
INNER JOIN categorias C
ON A.CategoriaID = C.CategoriaID
GROUP BY A.ProdutoID
ORDER BY A.ProdutoNome;
 
 # 5

 SELECT A.FaturaId, A.DataFatura, C.Empresa , B.Contato AS Cliente, D.CategoriaNome, E.ProdutoNome, E.PrecoUnitario, F.Quantidade
 FROM faturas A 
	INNER JOIN clientes B
 ON A.ClienteID = B.ClienteID
	INNER JOIN correios C 
 ON A.FormaEnvio = C.CorreioID
	INNER JOIN detalhefatura D
ON A.FaturaId = D.FaturaId
	INNER JOIN produtos E
ON E.ProdutoID = D.ProdutoID
	INNER JOIN categorias F
ON F.CategoriaID = E.CategoriaID;
 
 
 