DELIMITER $$
CREATE FUNCTION dhtube.f_tinyint_to_bool (dado tinyint)
RETURNS CHAR(3) # Vai retornar 3 caracteres
DETERMINISTIC
BEGIN
	RETURN (CASE WHEN dado = 0 THEN 'Nao' ELSE 'Sim' END); # O caso when funciona como o Switch Case, para condicionais
END;
$$

select v.titulo, v.descricao, f_tinyint_to_bool(privado) as privado from dhtube.video as v;

DELIMITER $$
CREATE FUNCTION dhtube.f_extensao(dado VARCHAR(255))
RETURNS CHAR(5)
DETERMINISTIC
BEGIN
	RETURN RIGHT(dado, LOCATE('.', REVERSE(dado)) -1); 
END;
$$

select v.titulo, v.descricao, dhtube.f_extensao(nomeArquivo) as extensao from dhtube.video as v;