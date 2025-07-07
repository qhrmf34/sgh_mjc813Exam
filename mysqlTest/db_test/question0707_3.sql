create view multi_view as 
select a.id as number,b.id as number2
from number_tbl a 
cross join
number_tbl b;

select number2 숫자, number 곱할수,number2*number 결과
from multi_view
order by 숫자 asc, 곱할수;

drop view multi_view;