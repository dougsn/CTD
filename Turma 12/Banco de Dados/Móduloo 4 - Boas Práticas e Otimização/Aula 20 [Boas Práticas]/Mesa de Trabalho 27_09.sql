# Eduardo Gonzales, Douglas Nascimento, Pedro Oliveira, Antonio Henrique, Paulo Catena

# Where

# 1 

SELECT ProdutoNome FROM produtos
WHERE ProdutoNome LIKE  '%spread%';

# 2

SELECT contato FROM clientes
WHERE contato LIKE 'Y%';

# Order By

# 1

SELECT ProdutoNome, PrecoUnitario FROM produtos
ORDER BY PrecoUnitario DESC
LIMIT 5;

# Operadores & Joins

# 1
SELECT Contato, CONCAT(Endereco,", ", Cidade) AS 'Endereço e Cidade' FROM clientes
WHERE Cidade = 'London';

# 2

SELECT CONCAT(A.Nome, " " ,A.Sobrenome) AS Nome_Sobrenome, FORMAT(SUM(B.Transporte),2) AS Soma_Transporte FROM empregados A
INNER JOIN faturas B
ON A.EmpregadoID = B.EmpregadoID
GROUP BY Nome_Sobrenome
ORDER BY Soma_Transporte DESC;



# Joins e Group By

# 1


SELECT A.ProdutoNome, A.PrecoUnitario, B.Quantidade, (B.Quantidade * A.PrecoUnitario) AS Total_Vendido
FROM produtos A
INNER JOIN detalhefatura B
ON A.ProdutoID = B.ProdutoID
GROUP BY A.ProdutoNome;

# Having

SELECT A.ProdutoNome, A.PrecoUnitario, B.Quantidade, (B.Quantidade * A.PrecoUnitario) AS Total_Vendido
FROM produtos A
INNER JOIN detalhefatura B
ON A.ProdutoID = B.ProdutoID
GROUP BY A.ProdutoNome
HAVING  B.Quantidade > 40;


