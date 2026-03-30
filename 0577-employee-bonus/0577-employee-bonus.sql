select Employee.name,Bonus.bonus
from Employee 
left join Bonus 
on Employee.empId=Bonus.empId 
having bonus is null or bonus < 1000;