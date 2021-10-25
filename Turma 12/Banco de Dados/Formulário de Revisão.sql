SELECT A.nome, B.nome, count(b.id_genero) FROM generos A
INNER JOIN cancoes B
ON A.id = B.id_genero
GROUP BY b.id_genero;

SELECT * FROM empregados
WHERE data_nascimento = '1984-09-12';

SELECT pais, COUNT(pais) AS pais FROM clientes
GROUP BY  pais
ORDER BY pais DESC;
