USE emarket;

/*
1. Liste os clientes que fizeram compras durante 1996.
A lista deve conter as seguintes colunas:
•	Contato, telefone, endereço
      *    Menor e maior data da Fatura
      *    Quantidade de compras no período 
*/
select a.Contato,
       a.Endereco, 
       a.ClienteID,
       a.Telefone, 
       min(b.DataFatura) as Menor_Data, 
       max(b.DataFatura) as Maior_data, 
       count(*) as Qtd_compra #select *
	 from Clientes AS a
    inner join Faturas as b
      on a.ClienteID = b.ClienteID
     where b.DataFatura between '1996-01-01' and '1996-12-31'
    group by Contato, 
             endereco,
             Telefone
	order by 1;
    
SELECT *
	FROM faturas
 where clienteId = 'TORTU'
  and DataFatura between '1996-01-01' and '1996-12-31';
  
/*
 2. Liste as faturas para as quais a remessa foi para uma cidade diferente da cidade do cliente. Considere apenas os clientes do Reino Unido.
   A listagem deve incluir:
•	O número da fatura completando com zeros principais 8 itens. Por exemplo, 00001234
•	A data da fatura no formato YYYY-MM-DD. Por exemplo, 1996-12-01
•	Cidade do cliente
*/
       
SELECT RIGHT(CONCAT('00000000',f.FaturaID),8) AS FaturaId,
       LPAD(f.FaturaId,8,'0') AS FaturaID_outraForma,
       DATE_FORMAT(f.dataFatura, '%Y-%m-%d') as dataFatura,
       c.Cidade, 
       f.CidadeEnvio
FROM faturas f
INNER JOIN clientes c
 ON f.ClienteID = c.ClienteID
WHERE c.Cidade <> f.CidadeEnvio 
  AND c.Pais = 'UK';

/*
3- Para cada empresa de correio, calcule o transporte total. Inclua todas as empresas de correio com os seus atributos.

*/
  
  SELECT co.Empresa,
		 co.Empresa,
         co.Telefone,
         sum(fa.Transporte) as total_transporte
  FROM correios co
INNER JOIN faturas fa
  ON co.CorreioId = fa.FormaEnvio
 GROUP BY co.Empresa,
		 co.Empresa,
         co.Telefone;
         
/*
 4. Liste todos os produtos que tiveram venda e quais é a sua categoria.
No caso de nomes de produtos, onde diz Mix ou Chef, substitua por MIX ou CHEF respectivamente.
Por exemplo: Em vez de Filo Mix, coloque Filo MIX.

*/         

SELECT DISTINCT c.CategoriaNome, 
       REPLACE(REPLACE(p.ProdutoNome,'Mix','MIX'),'Chef','CHEF')
FROM categorias c
inner JOIN produtos p
ON c.CategoriaId = p.CategoriaId
inner join detalhefatura           d
   on p.produtoid = d.produtoid
ORDER BY  p.ProdutoNome;

/*

5. Faça uma consulta sobre o faturamento do e-market. Inclua as seguintes informações:
•	ID da fatura
•	data da fatura
•	nome da empresa de correio (O id da empresa consta da tabela faturas no campo FormaEnvio)
•	nome do cliente
•	categoria do produto vendido
•	nome do produto(Você chega ao produto consultando os detalhes da fatura)
•	preço unitário
•	quantidade

*/
SELECT f.FaturaID, 
       DataFatura, 
       o.Empresa as correio, 
       Contato as cliente, 
       CategoriaNome, 
       ProdutoNome, 
       d.PrecoUnitario,
        Quantidade
  FROM faturas f
JOIN correios o
   ON f.formaEnvio = o.correioID
JOIN clientes l 
  ON f.ClienteID = l.ClienteID 
JOIN detalhefatura d 
   ON f.FaturaID = d.FaturaID
JOIN produtos p 
  ON d.ProdutoID = p.ProdutoID
JOIN categorias c 
   ON p.CategoriaID = c.CategoriaID
ORDER BY f.FaturaID, CategoriaNome, ProdutoNome;


    