-- Seleção padrão realizada diariamente, com custos altos para a tabela employee, pois precisou realizar um full scan da tabela, até encontrar o resultado desejado.

select contact.ContactID, contact.Firstname, contact.LastName,  employee.Title
from contact
inner join employee on contact.ContactID = employee.ContactID
where FirstName like 'C%';

-- Criando mais uma condição WHERE para diminuir o custo da consulta.

select c.Firstname, c.LastName,  e.Title
from contact c
inner join employee e on c.ContactID = e.ContactID
where c.FirstName like 'C%' and e.EmployeeID between 3 and 200;
