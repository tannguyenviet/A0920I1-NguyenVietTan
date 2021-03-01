DELIMITER //
drop procedure findAllCustomers; -- xoa di va tao lai procedure moi neu muon thay the

CREATE PROCEDURE findAllCustomers()

BEGIN

  SELECT * FROM customers;

END //

DELIMITER ;

