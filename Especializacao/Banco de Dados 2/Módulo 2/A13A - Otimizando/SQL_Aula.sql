-- 1. Acesse a tabela productmodel e responda:
--  ● Quantos índices clusterizados existem nessa tabela?
--  ● Quantos índices não clusterizados existem nessa tabela?

show index from adventureworks.productmodel;


-- 2. Crie um índice FULLTEXT, utilizando como parâmetro as colunas name e catalogDescription
create fulltext index idx_descModel on adventureworks.productmodel(Name, CatalogDescription);

-- 3. Crie uma consulta Fulltext, que retorne o modelo e a quantidade de catálogos que
-- possuam a descrição “A light yet stiff aluminum bar for long distance riding”.
-- ● Quantos registros retornaram?
-- ● Qual o tempo de duração dessa consulta?

select p.Name, 
       count(p.ProductModelID) as contador
  from adventureworks.productmodel as p
 where match (p.Name, p.CatalogDescription) against ('A light yet stiff aluminum bar for long distance riding') 
 group by p.Name;

-- 4. Crie uma consulta, utilizando a sentença Match( ) Against( ) que retorne a
-- porcentagem de relevância da descrição “A light yet stiff aluminum bar for long 
-- distance riding” para todos os modelos envolvidos.
-- ● Em qual modelo a descrição teve maior relevância?
-- ● Em qual modelo a descrição foi menos relevante?
-- ● Qual o tempo de duração dessa consulta?

select p.ProductModelID, 
       p.Name, 
       format(match(p.Name, p.CatalogDescription) against ('A light yet stiff aluminum bar for long distance riding'), 2 )
  from adventureworks.productmodel as p
 where match (p.Name, p.CatalogDescription) against ('A light yet stiff aluminum bar for long distance riding') ;