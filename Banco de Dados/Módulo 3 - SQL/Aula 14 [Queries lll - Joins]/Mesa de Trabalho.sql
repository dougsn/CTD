
# Grupo = Edimilson Souso, Douglas Nascimento, Robelsa Vasconcelos, Juliane Alves, Vinicius Evandro, Fabrina

# 1

SELECT A.nome, B.titulo FROM artistas A
INNER JOIN albuns B
ON B.id_artista = A.id
ORDER BY A.id;

# 2

SELECT A.nome, B.valor_total  FROM clientes A
INNER JOIN faturas B
ON A.id = B.id_cliente
HAVING B.valor_total > 5
ORDER BY B.valor_total DESC;

# 3

SELECT B.nome, A.nome FROM tipos_de_arquivo A
	INNER JOIN  cancoes B
	ON  B.id_tipo_de_arquivo = A.id
ORDER BY B.id;

