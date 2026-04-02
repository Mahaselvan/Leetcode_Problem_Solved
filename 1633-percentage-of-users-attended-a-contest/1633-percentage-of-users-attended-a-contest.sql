select r.contest_id,
round(count(r.user_id)*100/(select count(*)from Users),2) as percentage
from Register r 
join Users u 
on r.user_id = u.user_id
group by r.contest_id
order by percentage desc ,contest_id asc;