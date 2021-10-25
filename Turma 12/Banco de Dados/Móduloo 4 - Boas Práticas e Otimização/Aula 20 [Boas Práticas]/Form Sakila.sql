
# 1 

SELECT COUNT(*) FROM ator;


# 3

SELECT count(*) FROM cliente
WHERE ativo = 0;

# 4

SELECT * FROM sakila.filme 
INNER JOIN filme_categoria 
ON filme.filme_id = filme_categoria.filme_id
INNER JOIN categoria
ON filme_categoria.categoria_id = categoria.categoria_id
WHERE categoria.nome = 'Action';



