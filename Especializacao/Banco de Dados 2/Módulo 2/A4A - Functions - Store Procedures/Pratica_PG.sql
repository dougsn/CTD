use musimundos;

DELIMITER $$
CREATE FUNCTION f_qtd_notas_cliente (id_passado tinyint)
RETURNS tinyint
DETERMINISTIC
BEGIN
	RETURN (SELECT c.nome, COUNT(f.id) as qtd_faturas from faturas inner join faturas f on f.id = c.id where id_passado = f.id_cliente group by c.nome);
END;
$$
