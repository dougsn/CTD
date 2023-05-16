select * from adventureworks.employee;

drop function adventureworks.get_age;

DELIMITER $$
create function adventureworks.f_get_age (databorn date) returns tinyint
deterministic # a entrada sempre será um tipo date
begin
declare result tinyint; # declarando um variavel do mesmo tipo da entrada	
set result = (select timestampdiff(YEAR, databorn, curdate()));
return result;
end;
$$

DELIMITER $$
drop procedure adventureworks.usp_Employee_SELECT;
$$

DELIMITER $$
create procedure adventureworks.usp_Employee_SELECT()
begin
	select e.EmployeeID, f_get_age(e.BirthDate) as age from adventureworks.employee as e order by e.EmployeeID;
end;
$$

DELIMITER $$
call adventureworks.usp_Employee_SELECT()
$$
