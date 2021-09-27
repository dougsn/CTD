USE EMarket;

# GRUPO:
# RAFAEL VASCONCELOS
# DOUGLAS NASCIMENTO
# FABRINA NUNES
# MOISES BOLLELA
# TAYNAN VITOR

# Categorias e produtos

# 1

SELECT *
    FROM Categorias;
    
# 2
    
SELECT CategoriaNome, Descricao
    FROM Categorias;
    
# 3

SELECT *
    FROM Produtos;

# 4

SELECT *
    FROM Produtos
    WHERE Descontinuado = 1;

# 5
    
SELECT *
    FROM Produtos
    WHERE ProvedorID=8;
    
# 6
    
SELECT *
    FROM Produtos
    WHERE PrecoUnitario BETWEEN 10 AND 22;
    
# 7
    
SELECT *
    FROM Produtos
    WHERE UnidadesEstoque < NivelReabastecimento;
    
# 8
    
SELECT *
    FROM Produtos
    WHERE UnidadesEstoque < NivelReabastecimento
    AND UnidadesPedidas = 0;
    
# Clientes

# 1
    
SELECT *
    FROM Clientes
    ORDER BY Pais;
    
# 2
    
SELECT *
    FROM Clientes
    WHERE Titulo = 'Owner';
    
# 3
   
SELECT *
    FROM Clientes
    WHERE Contato LIKE 'c%';
   
# Faturas

# 1
   
SELECT *
    FROM Faturas
    ORDER BY DataFatura;
    
# 2
    
SELECT *
    FROM Faturas
    WHERE PaisEnvio = 'USA'
    AND FormaEnvio != 3;
    
# 3    

SELECT *
    FROM Faturas
    WHERE ClienteID = 'GOURL';
    
# 4
    
SELECT *
    FROM Faturas
    WHERE EmpregadoID IN(2, 3, 5, 8, 9);
    
# Parte 2

# Produtos

# 1 

SELECT * FROM produtos 
ORDER BY PrecoUnitario DESC;

# 2 

SELECT * FROM produtos
ORDER BY  PrecoUnitario DESC
LIMIT 5;

# 3

SELECT * FROM produtos
ORDER BY UnidadesEstoque DESC
LIMIT 10;

# Detalhe Fatura

# 1 

SELECT FaturaID, PrecoUnitario, Quantidade FROM detalhefatura;

# 2 

SELECT FaturaID, PrecoUnitario, Quantidade FROM detalhefatura
ORDER BY Quantidade DESC;

# 3 

SELECT FaturaID, PrecoUnitario, Quantidade FROM detalhefatura
WHERE Quantidade BETWEEN 50 AND 100
ORDER BY Quantidade DESC;

# 4

SELECT FaturaId AS 'NÃºmero da Fatura', ProdutoID AS 'Produto', PrecoUnitario, PrecoUnitario * Quantidade AS Total 
    FROM detalhefatura;
    
# EXTRAS

# 1

SELECT *
    FROM Clientes
    WHERE Pais = 'BRAZIL'
    OR Pais = 'MÉXICO'
    OR Titulo = 'SALES';
    
# 2 

SELECT *
    FROM Clientes
    WHERE Empresa LIKE 'A%';
    
# 3

SELECT Cidade, Contato AS 'Nome e Sobrenome', Titulo AS 'Cargo'
    FROM Clientes
    WHERE Cidade = 'Madrid';
    
# 4

SELECT *
    FROM Faturas
    WHERE FaturaId BETWEEN 10000 AND 10500;
    
# 5

SELECT * FROM Faturas
    WHERE FaturaID BETWEEN 10000 AND 10500 OR ClienteID LIKE 'B%';    

# 6

SELECT *
    FROM Faturas
    WHERE CidadeEnvio = 'Vancouver' OR FormaEnvio = 3;
    
# 7 

SELECT * FROM empregados
    WHERE Sobrenome = 'Buchanan';

# 8 
SELECT Notas FROM empregados
    WHERE EmpregadoID = 5;