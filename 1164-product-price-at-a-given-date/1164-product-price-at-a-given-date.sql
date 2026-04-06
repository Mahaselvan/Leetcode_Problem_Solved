select 
product_id,
coalesce((
    select 
    pr.new_price
    from products pr 
    where p.product_id=pr.product_id
    and pr.change_date<="2019-08-16"
    
    order by change_date desc limit 1 
),10)as price
from(select
product_id from Products
group by product_id)as p;
