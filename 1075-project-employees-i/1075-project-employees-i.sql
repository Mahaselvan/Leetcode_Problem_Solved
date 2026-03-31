select p.project_id,
round(avg(e.experience_years),2) as average_years
from Employee e
join project p
on e.employee_id = p.employee_id
group by project_id;