SELECT titulo, nome, sobrenome FROM atores
INNER JOIN ator_filme
ON atores.id = ator_filme.id
INNER JOIN filmes
ON filmes.id = atores.id
WHERE filmes.titulo LIKE '%Harry Potter%';

# CONCAT

SELECT CONCAT ('Nome: ', nome, ' ', sobrenome) AS Nome FROM atores;

# EXTRACT

SELECT EXTRACT(YEAR FROM NOW());

# REPLACE

SELECT REPLACE('abc abc', 'a', 'B');

# DATE_FORMAT

SELECT DATE_FORMAT(NOW(), '%W, %M, %e %Y');

# CASE -> WHEN (Quando a condição for verdadeira) -> THEN (Faça isso) -> END 

SELECT id, titulo, avaliacao,
CASE 
		WHEN avaliacao < 4 THEN 'Ruim'
        WHEN avaliacao < 6 THEN 'Regular'
        WHEN avaliacao < 8 THEN 'Bom'
        WHEN avaliacao < 9.5 THEN 'Muito Bom'
        ELSE 'Excelente'
	END AS 'Categorias de Avaliação'
FROM filmes
ORDER BY avaliacao;

# Funções de Agragação

# COUNT(*) -> Para obter uma quantidade

SELECT COUNT(*) FROM filmes
WHERE titulo LIKE 'Harry%';


# MAX() -> Para obter um valor máximo


SELECT MAX(duracao) FROM filmes
WHERE titulo LIKE 'Harry%';


# MIN() -> Para obter um valor minímo

SELECT MIN(duracao) FROM filmes
WHERE titulo LIKE 'Harry%';

# AVG() -> Para obter um valor médio

SELECT AVG(duracao) FROM filmes
WHERE titulo LIKE 'Harry%';


# SUM() -> Para obter a soma

SELECT SUM(duracao) FROM filmes
WHERE titulo LIKE 'Harry%';

