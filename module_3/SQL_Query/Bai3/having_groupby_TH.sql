select status,count(status) as 'quantity' from orders 
group by status;

select * from orderDetails;
select orderNumber,sum(quantityOrdered*priceEach) 
from orderdetails
group by orderNumber;

select year(orderDate) as year, sum(quantityOrdered * priceEach) as total
from orders
inner join  orederdetails on oreders.orderNumber = orderdetails.orderNumber
where status = 'shipped'
group by status
having  year >2003