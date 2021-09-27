USE filmes_db;

# 1 não entendi

SELECT titulo AS TITULO, data_lancamento AS DATA_LANCAMENTO, data_termino AS DATA_TERMINO, genero_id AS GERENO_ID FROM series;

# 2

SELECT * FROM filmes
WHERE avaliacao > 3 AND premios > 1 AND data_lancamento 
BETWEEN '1988-01-01' AND '2009-12-31'
ORDER BY avaliacao DESC;

# 3

SELECT * FROM filmes
WHERE avaliacao > 3 AND premios > 1 AND data_lancamento 
BETWEEN '1988-01-01' AND '2009-12-31'
ORDER BY avaliacao DESC
LIMIT 3 OFFSET 10;

# 4

SELECT * FROM episodios
ORDER BY avaliacao ASC
LIMIT 3;

# 5

SELECT id AS Identificação, nome AS Nome, sobrenome AS Sobrenome , avaliacao AS Classificação FROM atores;
