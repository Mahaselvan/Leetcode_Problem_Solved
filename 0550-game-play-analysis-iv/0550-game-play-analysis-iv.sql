select 
ROUND(SUM(case when a2.player_id is not null then 1 else 0 end)/count(*),2) as fraction
from (
select player_id , min(event_date)as first_date 
 from Activity
group by player_id)a1
left join activity a2 on a1.player_id=a2.player_id
and a2.event_date=DATE_ADD(a1.first_date,Interval 1 day);
