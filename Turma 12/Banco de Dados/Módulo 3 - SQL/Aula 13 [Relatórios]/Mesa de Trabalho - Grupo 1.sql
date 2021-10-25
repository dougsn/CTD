# Exercício da Mesa


# Grupo 1 - Marcus Rodrigues, Juan Rafael, Moises Ballela, Guilherme Carvalho.

# 1

SELECT MAX(valor_total) AS 'Fatura mais alta de Oslo' FROM faturas
WHERE cidade_cobranca = "Oslo";

# 2 

SELECT MIN(valor_total) AS 'Fatura mais baixa de todas' FROM faturas;

# 3

SELECT AVG(valor_total) AS 'Fatura média do Canada' FROM faturas
WHERE pais_cobranca = 'Canada';

# 4 

SELECT pais_cobranca , COUNT(*) AS 'Quantidade de faturas do Canada' FROM faturas
WHERE pais_cobranca = 'Canada';

# 5

SELECT SUM(valor_total) AS 'Valor total de todas as faturas' FROM faturas;

# 6 

SELECT id, data_fatura, valor_total FROM faturas
WHERE valor_total <  (SELECT AVG(valor_total) AS 'Fatura média' FROM faturas);


# 7

SELECT MAX(data_nascimento) AS 'Funcionário mais Jovem' FROM empregados;

# 8

SELECT MIN(data_nascimento)  AS 'Funcionário mais Velho' FROM empregados;

# 9 

SELECT  DATE_FORMAT(data_nascimento,"%d %M %Y") FROM empregados;

# 10

SELECT compositor, COUNT(*) AS 'Número de canções' FROM cancoes
WHERE compositor = 'AC/DC';

# 11

SELECT AVG(duracao_milisegundos) AS 'Duração média das músicas'  FROM cancoes;

# 12 

SELECT AVG(bytes) AS 'Tamanho médio das músicas' FROM cancoes
WHERE compositor = 'AC/DC';

# 13

SELECT  COUNT(*) AS 'QTD clientes de SP' FROM clientes
WHERE cidade = 'São Paulo';

# 14

SELECT COUNT(*) AS 'QTD clientes de Paris' FROM clientes
WHERE cidade = 'Paris';

# 15

SELECT COUNT(*) AS 'QTD clientes com email yahoo' FROM clientes
WHERE email LIKE '%yahoo%';
