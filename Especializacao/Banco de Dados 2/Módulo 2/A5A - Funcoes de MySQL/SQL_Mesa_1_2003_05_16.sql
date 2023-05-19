/* Grupo: Andrea Matsunaga, Douglas Nascimento, Mateus Praxedes, Matheus Emanoel, Ricardo Brito, Marcelo Barbosa.
*/

/*1. Queremos adicionar um novo atributo à tabela de funcionários chamado Idade. 
Visto que fizemos a mudança na estrutura da tabela, devemos preencher as informações 
para cada um dos funcionários. Para isso, criaremos uma função chamada idade(), onde ela 
recebe uma determinada data de nascimento como parâmetro e calcula a idade. Finalmente,
 para atualizar fisicamente os dados em nossa tabela, geraremos uma stored procedure chamada 
 atualizar_idade() onde atualizaremos a idade de todos os funcionários. Isso nos ajudará 
a executá-la uma vez por ano e atualizar as idades de todos os funcionários novamente.*/

DELIMITER $$
create function musimundos.f_idade(databorn date) returns tinyint
deterministic # a entrada sempre será um tipo date
begin
    declare result tinyint; # declarando um variavel do mesmo tipo da entrada	
    set result = (select timestampdiff(YEAR, databorn, curdate()));
    return result;
end;
$$
/* Alteração na tabela */
ALTER TABLE musimundos.empregados 
    ADD IDADE integer;

DELIMITER $$
create procedure musimundos.f_atualizar_idade()
begin
    UPDATE musimundos.empregados SET idade = musimundos.f_idade(data_nascimento);
end

$$

call musimundos.f_atualizar_idade();
    
SELECT nome, idade FROM musimundos.empregados;

/*
2. Liste  as canções e seus compositores, utilizando a função de janela ROW_NUMBER, 
para exibir o número de músicas de mesmo compositor. 
*/
select c.nome
		, c.compositor
        , ROW_NUMBER() OVER (
        PARTITION BY c.compositor
        ORDER BY c.compositor)
from musimundos.cancoes c
where c.compositor != '';
/*
03. Utilizando a tabela faturas, crie uma consulta que traga o id da fatura, 
o id do cliente, a data da compra e próxima data da compra do cliente. 
Para esta consulta, você deve utilizar a função de janela LEAD.
*/

SELECT f.id, c.nome, f.data_fatura,
     LEAD(f.data_fatura,1) OVER (
        PARTITION BY c.nome
        ORDER BY f.data_fatura ) proximaData
  from musimundos.faturas f
  join musimundos.clientes c on f.id_cliente = c.id;
  
  /*
  04. Agora, utilize a função LAG para trazer as datas anteriores das compras. 
  */
  
  SELECT f.id, c.nome, f.data_fatura,
     LAG(f.data_fatura,1) OVER (
        PARTITION BY c.nome
        ORDER BY f.data_fatura ) proximaData
  from musimundos.faturas f
  join musimundos.clientes c on f.id_cliente = c.id;