DELIMITER //

DROP PROCEDURE IF EXISTS `findAllCustomers`//

CREATE PROCEDURE findAllCustomers()

BEGIN

   SELECT *  FROM customers where customerNumber = 175;

END; //

call findAllCustomers();


create procedure getCusbyId
( idcus int(11))
begin
	select * from customers 
    where customerNumber = idcus;
end;

getCusbyId(175);


select * into Customers from customers;
