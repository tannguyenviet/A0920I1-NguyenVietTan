select customerName, state, country from customers
where state ='CA' and country ='USA' ;

select productCode,productname,buyprice from products inner join productlines
on products.productline = productlines.productline
where buyprice>56.76 and buyprice <95.59;

explain select concat (m.lastname,' ',m.firstname) as 'manager'
		,concat (e.lastname,' ',m.firstname) as 'reportTo'
from employees e
inner join employees m
where  m.employeeNumber=  e.reportsTo;

select * from products;

select customers.customerNumber,customerName,orderNumber,status
from customers left join orders
on customers.customerNumber = orders.customerNumber
where orderNumber is null;

select status,count(status) as 'quantity' from orders 
group by status;