select  max(num) as num

from (select 
num from MYNumbers
group by num
having  count(num)<=1) as single_numbers;
