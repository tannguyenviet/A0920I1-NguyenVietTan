select * from orderdetails;

create view view_name as
select orderNumber,sum(priceEach) from orderdetails
group by orderNumber
