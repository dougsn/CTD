
# 1

CREATE VIEW vw_faturas_nacionais AS
SELECT A.id,B.id AS "ID_Cliente", A.data_fatura, B.nome, B.sobrenome, A.pais_cobranca , SUM(A.valor_total) AS "Valor Total"
FROM faturas A
INNER JOIN clientes B
ON A.id_cliente = B.id
WHERE A.pais_cobranca = 'Brazil'
GROUP BY valor_total;


SELECT * FROM vw_faturas_nacionais;


# 2 
CREATE VIEW  vw_latinos AS
SELECT A.nome, B.titulo, C.nome, D.nome FROM artistas A
INNER JOIN albuns B
ON A.id = B.id_artista
INNER JOIN cancoes C
ON B.id = C.id_album
INNER JOIN generos D
ON C.id_genero = D.id
WHERE D.nome = "Latin"
ORDER BY A.nome and C.nome;



# 3

CREATE VIEW vw_faturas_brazil AS
SELECT A.nome, A.sobrenome, B.pais_cobranca, SUM(B.valor_total) FROM clientes A
INNER JOIN faturas B
ON A.id = B.id_cliente
WHERE B.pais_cobranca = "Brazil"
GROUP BY B.valor_total;


SELECT * FROM vw_faturas_brazil;



