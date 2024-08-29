with cte as
(select *,LEAD(id) OVER(order by id) AS next,
LAG(id) OVER(order by id) AS prev 
from SEAT)
select case when MOD(id,2)=1 and next is not null then next 
when MOD(id,2)=0 then prev
else id end AS id,student from cte 
order by id asc

