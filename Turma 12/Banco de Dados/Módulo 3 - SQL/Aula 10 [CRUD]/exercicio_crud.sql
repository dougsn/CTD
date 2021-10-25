USE filmes_db;

# SELECT

SELECT * FROM filmes;

SELECT nome,sobrenome,avaliacao FROM atores;

SELECT titulo FROM series;

# WHERE e ORDE BY

SELECT nome,sobrenome  FROM atores
WHERE avaliacao > 7.5;

SELECT titulo, avaliacao, premios FROM filmes
WHERE avaliacao > 7.5 AND premios > 2;

SELECT titulo, avaliacao FROM filmes
ORDER BY avaliacao DESC;

# BETWEEN e LIKE

SELECT titulo, avaliacao FROM filmes
WHERE titulo LIKE '%Toy Story%';

SELECT * FROM atores
WHERE nome LIKE "Sam%";

SELECT titulo FROM filmes
WHERE data_lancamento BETWEEN '2004-01-01' AND '2008-12-31';
