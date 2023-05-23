SELECT * FROM dhemprestimos.clientes;

## Faltou verificar se o existe 1 RG igual.

## Precisamos criar um procedimento armazenado que insira um cliente, SP_Cliente_Insert, 
## que receba os dados do cliente e os insira na tabela clientes, caso não haja cliente com o mesmo número de RG.

delimiter $$
create procedure sp_cliente_insert(rg varchar(50), sobrenome varchar(50), nome varchar(50), data_nasc date)
begin

	insert into clientes (rg, sobrenome, nome, data_nasc) 
		   values (rg, sobrenome, nome, data_nasc);
end
$$

call sp_cliente_insert('12323542', 'Silva', 'Douglas', '1999-03-09');

## Criar uma função fn_ValidaIdade que, dada a data de nascimento da pessoa (AAAAMMDD), 
## a data de início do empréstimo (AAAAMMDD) e a qtd  de parcelas, 
## verifique se atende à condição de que a pessoa não tenha mais de 80 anos no final do empréstimo.

delimiter $$
create function fn_validadeIdade(data_nasc date, data_inicio_emprestimo date, qtd_parcelas int)
returns varchar(50)
deterministic
begin
	declare dataFinalEmprestimo date;
    declare idadeFinalEmprestimo int;
    
    set dataFinalEmprestimo = date_add(data_inicio_emprestimo, interval qtd_parcelas month);
    set idadeFinalEmprestimo = timestampdiff(year, data_nasc, dataFinalEmprestimo); 
    
    if idadeFinalEmprestimo > 80 then
		return 'O cliente terá mais que 80 anos.';
	else 
		return 'O cliente terá menos que 80 anos.';
    end if;
end
$$

select fn_validadeIdade('2000-01-01', '2022-01-01', 12) as idade_maior_que_80;
select fn_validadeIdade('2000-01-01', '2090-01-01', 12) as idade_maior_que_80;

## Criar uma função fn_diaUtil que, dada uma data (AAAAMMDD), retorne a mesma data se for um dia útil — segunda a sexta — 
## ou se não for dia útil — se for sábado ou domingo — retorne a data do primeiro dia útil seguinte.

delimiter $$
create function fn_diaUtil(dia date)
returns date
deterministic
begin

	declare dia_semana int;
					## A função DAYOFWEEK() retorna um número inteiro representando o dia da semana para a data fornecida como argumento. O valor retornado varia de 1 (domingo) a 7 (sábado).    
    set dia_semana = dayofweek(dia); 
    
    if dia_semana in (1, 7) then
		return date_add(dia, interval 9 - dia_semana day);
	else
		return dia;
	end if;
end
$$

select fn_diaUtil('2022-01-04') as diaUtil;

##


CREATE TEMPORARY TABLE parcelas(valor DECIMAL(10,2), data_vencimento DATE);
DROP TABLE parcelas;

DELIMITER //
CREATE PROCEDURE SP_Gera_Parcela(IN valor DECIMAL(10,2), IN data_inicio DATE, IN num_parcelas INT)
BEGIN
    DECLARE i INT DEFAULT 1;
    DECLARE data_vencimento DATE;
    WHILE i <= num_parcelas DO
        SET data_vencimento = DATE_ADD(data_inicio, INTERVAL (i-1)*30 DAY);
        -- Verificar se a data de vencimento é um dia útil e ajustar se necessário
        INSERT INTO parcelas(valor, data_vencimento) VALUES (valor, data_vencimento);
        SET i = i + 1;
    END WHILE;
    SELECT * FROM parcelas;
END 
//

call SP_Gera_Parcela(100000,'20220101',5);



