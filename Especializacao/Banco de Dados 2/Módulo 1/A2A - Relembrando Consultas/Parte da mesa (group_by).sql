# Operadores & Joins

# 1

select  adventureworks.employee.EmployeeID, 
		adventureworks.employee.Title, 
        adventureworks.employee.HireDate, 
        adventureworks.employee.VacationHours
from adventureworks.employee
where adventureworks.employee.HireDate like '2%';

# Group By

# 1 

select  adventureworks.employee.BirthDate,
		count(employee.EmployeeID) as funcionarios
from adventureworks.employee
group by adventureworks.employee.BirthDate
order by adventureworks.employee.BirthDate desc;

# 2 

select  adventureworks.product.ProductID, 
		avg(adventureworks.product.ListPrice) as preco_medio, 
        adventureworks.product.SellEndDate
from adventureworks.product
group by adventureworks.product.ProductID;

# 3 

select  adventureworks.salesorderdetail.ProductID, 
		max(adventureworks.salesorderdetail.LineTotal) as total_vendido
from adventureworks.salesorderdetail
group by adventureworks.salesorderdetail.ProductID
order by total_vendido;

# 4 

select  adventureworks.salesorderdetail.SalesOrderID,
		avg(adventureworks.salesorderdetail.LineTotal) as media_vendida
from adventureworks.salesorderdetail
group by adventureworks.salesorderdetail.SalesOrderID
order by media_vendida;

