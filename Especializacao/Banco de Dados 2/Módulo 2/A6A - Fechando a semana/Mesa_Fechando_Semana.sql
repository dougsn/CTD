DELIMITER $$
CREATE FUNCTION faturas_por_cliente(id INT, de DATE, ate DATE)
RETURNS DOUBLE DETERMINISTIC
BEGIN
	RETURN (SELECT SUM(valor_total) FROM faturas 
    WHERE id_cliente = id and data_fatura 
    BETWEEN de AND ate);
END
$$ ## Soma a fatura do cliente, com base no ID passado, e no intervalo das dadas passadas.

DELIMITER $$
CREATE PROCEDURE fatura_cliente (de DATE, ate DATE)
BEGIN
	SELECT *, (CASE WHEN faturas_por_cliente(id, de, ate) = 0 OR 
    faturas_por_cliente(id, de, ate) IS NULL THEN 'Sem dados' 
    ELSE faturas_por_cliente(id, de, ate)END) as fatura_total FROM clientes;
END 
$$

CALL fatura_cliente('2010-02-01', '2010-02-11');
CALL fatura_cliente('2010-02-01', '2011-02-12');

DELIMITER $$
CREATE PROCEDURE calcular_imposto(INOUT valor DOUBLE, IN imposto DOUBLE)
BEGIN
	SET valor = ((valor * imposto)/100) + valor;
END
$$

SET @valor = 5000;
SET @imposto = 21;

CALL calcular_imposto(@valor, @imposto);

SELECT @valor; ## novo valor com o imposto

SELECT @imposto;





