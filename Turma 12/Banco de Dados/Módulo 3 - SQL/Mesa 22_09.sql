
# Grupo -> Eduardo Gonzales, Douglas Nascimento, Moises Bollela, Glauber Silva, Geyson, Maria Rosa

# Operadoores & Joins

# 1

SELECT Contato, Endereco, Cidade  FROM clientes
WHERE Cidade = 'London';

# 2

SELECT A.Nome, A.Sobrenome, B.Transporte 
FROM empregados A
INNER JOIN faturas B
ON A.EmpregadoID = B.EmpregadoID
ORDER BY Transporte DESC;

# Funções de Agregação

# 1

SELECT DataFatura FROM faturas
ORDER BY DataEnvio DESC;

# 2

SELECT ProdutoNome, PrecoUnitario FROM produtos
ORDER BY PrecoUnitario ASC
LIMIT 1;



