# 1 

CREATE VIEW vw_faturas AS
SELECT FaturaId, DATE_FORMAT(DataFatura, "%d/%m/%y") AS "Data da Fatura", Transporte, CONCAT(EnderecoEnvio, ', ' ,CidadeEnvio, ', ' , CodigoPostalEnvio, ', ' , PaisEnvio ) AS "Destino"
From faturas;

SELECT * FROM vw_faturas;

# 2

CREATE VIEW vw_estoque AS
SELECT A.ProdutoID, B.CategoriaID, A.ProdutoNome, A.PrecoUnitario, A.UnidadesPedidas  FROM produtos A
INNER JOIN categorias B
ON B.CategoriaID = A.CategoriaID;

SELECT * FROM vw_estoque
WHERE UnidadesPedidas != 0;
