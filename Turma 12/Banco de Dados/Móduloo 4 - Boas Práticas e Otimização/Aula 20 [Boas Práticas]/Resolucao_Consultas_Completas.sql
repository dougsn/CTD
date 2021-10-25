/*De  volta ao Passado II

Where

/* 1- Exiba os nomes dos produtos que possuem qualquer combinação de ‘spread’


Resposta:  */
SELECT ProdutoNome
FROM produtos
WHERE ProdutoNome LIKE '%spread%'

/* 2 - Mostre os contatos cujos nomes começam com a letra "Y"

Resposta: */
SELECT Contato
FROM clientes
where Contato like 'Y%'

/* ORDER BY

1 - Mostre cinco produtos mais caros e seus nomes em ordem decrescente
Resposta: */
SELECT ProdutoNome, PrecoUnitario
FROM produtos
Order by PrecoUnitario desc
LIMIT 5;

/* OPERADORES E JOINS

1 - Mostre o contato, o  endereço concatenado com a cidade dos clientes cuja cidade tenha qualquer referênciaa a ‘London’*/

SELECT Contato, concat(endereco, ' ', cidade) as endereco
from clientes
where cidade like '%London%'

/* 2 - Concatene o nome  e o sobrenome dos empregados e mostre a soma dos valores em Transporte para cada um. Ordene os valores de forma decrescente.

Resposta: */
SELECT concat(e.nome,' ', e.sobrenome) as Empregado,
sum(transporte) as total
 FROM empregados e
 left join faturas f
 on e.EmpregadoID = f.EmpregadoID
 group by Empregado
 order by total desc;

/* FUNÇÕES DE AGREGAÇÃO

1 - Mostre a data da fatura mais recente

Resposta:*/
SELECT max(DataFatura)
FROM faturas;

/* 2 - Mostre o produto mais barato.

Resposta:  */
SELECT ProdutoNome, MIN(PrecoUnitario)  AS Valor
FROM produtos;


 
 /* JOINN e GROUP BY
 1 - Mostre o  nome dos produtos, o valor unitário,  a quantidade e o total vendido por produto.

Resposta: Não*/
SELECT p.ProdutoID, p.ProdutoNome, d.PrecoUnitario, d.Quantidade, (d.Quantidade * d.PrecoUnitario) AS Total
from produtos p
inner join detalhefatura d
on p.ProdutoID  = d.ProdutoID
group by p.ProdutoNome
order by Total desc


/* HAVING
1 - Mostre o  nome dos produtos, o valor unitário,  a quantidade e o total vendido por produto. Liste apenas os dados dos produtos que 
venderam mais de 40 unidades.

Resposta: */
SELECT p.ProdutoID, p.ProdutoNome, d.PrecoUnitario, d.Quantidade, (d.Quantidade * d.PrecoUnitario) AS Total
from produtos p
inner join detalhefatura d
on p.ProdutoID  = d.ProdutoID
group by p.ProdutoNome
having  Quantidade > 40
order by Total desc

/* INDICES
 1 - Exiba os índices existentes na tabela produtos;

Resposta: */
SHOW index from produtos;

/* 2 - Exclua o índice Produtos_ProdutoNome da tabela Produtos;
Resposta: */
drop index Produtos_ProdutoNome on produtos;

/* 3 - Crie uma consulta que traga os campos ProdutoNome da tabela produtos,  ProdutoID, PrecoUnitario e Quantidade da tabela detalhefatura. 
Observe o tempo de duração da consulta.

Resposta: */
select p.ProdutoNome,d.produtoID, d.PrecoUnitario,d.Quantidade
from produtos p
inner join detalhefatura d
on p.ProdutoID = d.ProdutoID;

/* 4 - Crie o índice Produtos_ProdutoNome no campo ProdutoNome da tabela produtos e repita a consulta do item 3. 
Observe o tempo de duração da consulta. Houve alguma diferença? Descreva o que você observou.


Resposta: */
create index Produtos_ProdutoNome on produtos (ProdutoNome);

select p.ProdutoNome,d.produtoID, d.PrecoUnitario,d.Quantidade
from produtos p
inner join detalhefatura d
on p.ProdutoID = d.ProdutoID;