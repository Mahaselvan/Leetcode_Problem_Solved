select q.query_name,
Round(sum(q.rating/q.position)/ count(*),2) as quality,
round(sum(case when q.rating<3 then 1 else 0 end)*100/count(*),2) as poor_query_percentage

from Queries q
group by q.query_name;