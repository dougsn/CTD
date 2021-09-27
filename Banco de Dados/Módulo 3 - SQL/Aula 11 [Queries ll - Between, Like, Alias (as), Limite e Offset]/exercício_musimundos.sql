USE musimundos;
# 1

SELECT * FROM clientes;

# 2

SELECT * FROM clientes
WHERE pais = 'USA';


# 3

SELECT id, nome, duracao_milisegundos FROM cancoes
WHERE duracao_milisegundos BETWEEN "200000" AND "300000";

# 4

SELECT * FROM clientes
WHERE pais = "Spain";

SELECT * FROM clientes
WHERE pais = "Argentina";

# 5

SELECT * FROM generos
ORDER BY nome ASC;

# 6

SELECT nome FROM clientes
ORDER BY pais, cidade DESC; 















