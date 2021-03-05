

DROP PROCEDURE IF EXISTS `findAllCustomers`;
DROP PROCEDURE IF EXISTS `getCusbyId`;
DELIMITER //
CREATE PROCEDURE findAllCustomers()

BEGIN

   SELECT *  FROM customers where customerNumber = 175;

END; //
DELIMITER ;
call findAllCustomers();

DELIMITER //
create procedure getCusbyId
( idcus int(11))
begin
	select * from customers 
    where customerNumber = idcus;
end;//
DELIMITER;
call getCusbyId(175);     


select * into Customers from customers;

DELIMITER //

CREATE PROCEDURE SetCounter(

    INOUT counter INT,

    IN inc INT

)

BEGIN

    SET counter = counter + inc;

END//

DELIMITER 
