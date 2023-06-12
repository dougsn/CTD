## Verificar que tabela é a modelo.

SELECT * FROM adventureworks.productdescription;

-- 1 - Crie um índice FULLTEXT na tabela productdescription, utilizando como parâmetro a coluna `description`.
create fulltext index indice_description on adventureworks.productdescription (description);

-- 2 - Crie uma consulta que retorne o nome do modelo e a quantidade de vezes que a descrição 
-- “Suitable for any type of riding, on or off-road” aparece em cada modelo.

select p.Description, 
	   count(p.ProductDescriptionID) as contador 
from adventureworks.productdescription as p
where match (p.description)
against ('"Suitable for any type of riding, on or off-road"' in boolean mode)
group by p.Description;

## Quantos registros retornaram?
	-- Retornou 1 registro.

## Qual o tempo de duração dessa consulta?
    -- 0 segundos

## Em quais modelos a descrição citada aparece mais de uma vez?
	-- Só em 1 *


## 3 - Crie uma consulta que retorne a porcentagem de relevância da descrição
--  “Suitable for any type of riding, on or off-road.”  para todos os modelos envolvidos.
 
 select  p.ProductDescriptionID,
		 p.Description,
         format(match(p.Description) against ('"Suitable for any type of riding, on or off-road"'), 2)
from adventureworks.productdescription as p
where match (p.Description)
against ('"Suitable for any type of riding, on or off-road"' in boolean mode);
 


## 4 - Visualize todos os índices da tabela productdescription

## Em qual coluna está o índice clusterizado?
	-- Está na coluna ProductDescriptionID
    
## Em qual coluna está o índice não clusterizado?
	-- Está na coluna Description
    
## Qual o tipo de estrutura do índice clusterizado?
	-- BTREE
## Qual o tipo de estrutura do índice não clusterizado?
	-- FULLTEXT

## 5 - Acesse o  Schema Inspector do banco de dados AdventureWorks e responda:

## Qual o tamanho do banco de dados?
	-- 72.2MiB
## Qual o tamanho da maior tabela desse banco de dados?
	-- 11.5MiB

##  Acesse o Table Inspector da tabela productdescription e responda:

## Qual o tamanho estimado da tabela?
	-- 144.0KiB
    
## 7 - Selecione a guia Indexes e clique no índice  FULLTEXT. Responda:

## Qual a cardinalidade do índice criado?
	-- 762
    
## Justifique esse valor.
	-- Indica o número de valores diferente contidos nessa coluna.
    
## 8 - Exclua o indice criado

alter table adventureworks.productdescription
drop index indice_description;

show index from adventureworks.productdescription;
    