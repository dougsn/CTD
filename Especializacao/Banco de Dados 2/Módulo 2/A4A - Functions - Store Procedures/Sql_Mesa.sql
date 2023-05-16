SELECT * FROM emarket.empregados;

# 1 - Empregados

DELIMITER $$
create function emarket.f_get_age (databorn date) returns tinyint
deterministic # a entrada sempre será um tipo date
begin
declare result tinyint; # declarando um variavel do mesmo tipo da entrada	
set result = (select timestampdiff(YEAR, databorn, curdate()));
return result;
end;
$$

DELIMITER $$
create procedure emarket.usp_Employee_SELECT()
begin
	select e.EmpregadoID, e.Sobrenome, e.Nome,  f_get_age(e.DataNascimento) as age from emarket.empregados as e order by e.Nome;
end;
$$

DELIMITER $$
call emarket.usp_Employee_SELECT()
$$

# 2 - Empregados por cidade

DELIMITER $$
create procedure emarket.usp_Employee_City_SELECT(in cidade varchar (100))
begin
	select e.EmpregadoID, e.Nome, e.Sobrenome, f_get_age(e.DataNascimento) as idade, e.Cidade from emarket.empregados as e
    where f_get_age(e.DataNascimento) > 25 and upper(e.Cidade) = upper(cidade)
    order by e.Nome;
end;
$$

DELIMITER $$
call emarket.usp_Employee_City_SELECT('London')
$$

# 3 - Clientes por país 



# 4 - Vendas com desconto

create function emarket.f_preco (porcentagem float, preco_produto float) returns float
begin
end;
$$

DELIMITER $$
create procedure emarket.usp_Vendas(in porcentagem float)
begin
	select emarket.ProdutoID, emarket.ProdutoNome from emarket.produtos
    where 
end;
$$


SELECT p.ProdutoNome, p.PrecoUnitario, df.PrecoUnitario, c.Empresa
  FROM emarket.clientes c
  JOIN emarket.faturas f on c.ClienteID = f.ClienteID
  JOIN emarket.detalhefatura df on f.FaturaId = df.FaturaId
  JOIN emarket.produtos p on df.ProdutoID = p.ProdutoID

