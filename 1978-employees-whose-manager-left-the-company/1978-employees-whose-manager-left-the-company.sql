select e.employee_id
from Employees e
left join Employees t 
on e.manager_id = t.employee_id
where e.salary<30000 
and e.manager_id is not null
and t.employee_id is null
order by e.employee_id;