# 1

SELECT COUNT(pais) FROM clientes
WHERE pais = 'Brazil';

SELECT COUNT(pais) FROM clientes
WHERE pais = 'Brazil';
# 2

SELECT * FROM cancoes;

SELECT generos.id, generos.nome, COUNT(cancoes.id_album) FROM generos
INNER JOIN cancoes ON cancoes.id_genero = generos.id
GROUP BY cancoes.id_genero;


# 3 

SELECT SUM(valor_total) FROM faturas;

# 4

SELECT * FROM albuns;

SELECT albuns.id, albuns.titulo, AVG(cancoes.duracao_milisegundos) FROM albuns
INNER JOIN cancoes ON albuns.id = cancoes.id_album
group by albuns.titulo;

# 5

SELECT MIN(bytes) FROM cancoes;

# 6

SELECT faturas.id_cliente, SUM(valor_total), clientes.id FROM faturas
INNER JOIN clientes ON clientes.id = faturas.id_cliente
GROUP BY faturas.id_cliente;


