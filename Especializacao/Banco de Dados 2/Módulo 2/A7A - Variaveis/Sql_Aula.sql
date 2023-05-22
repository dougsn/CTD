select 
    if (emp.data_nascimento is null,  'sem dados', data_nascimento) as data_nas
from musimundos.empregados emp;

select 
    case when emp.data_nascimento is null then 'sem dados' 
         when emp.data_nascimento = '' then 'sem dados'
    else emp.data_nascimento end as data_nas
from musimundos.empregados emp;

