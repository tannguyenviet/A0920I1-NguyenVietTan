select* from customers;
-- buoc 1,2
create table product_2(
	id int primary key auto_increment,
    productCode int not null,
    productName nvarchar(50) not null, 
    productPrice int not null,
    productAmount int not  null,
    productDescription text,
    productStatus nvarchar(15)
);

insert into product_2(productCode,productName,productPrice,productAmount,productDescription,productStatus) 
values (1001,'BichTram',2500,3,'notthing','nottt');
insert into product_2(productCode,productName,productPrice,productAmount,productDescription,productStatus) 
values (1001,'BichTram2',2900,3,'notthing','nottt');
insert into product_2(productCode,productName,productPrice,productAmount,productDescription,productStatus) 
values (1001,'BichTram3',4000,3,'notthing','nottt');
insert into product_2(productCode,productName,productPrice,productAmount,productDescription,productStatus) 
values (1001,'BichTram3',4000,3,'notthing','nottt');
insert into product_2(productCode,productName,productPrice,productAmount,productDescription,productStatus) 
values (1001,'BichTram4',1500,3,'notthing','nottt');
insert into product_2(productCode,productName,productPrice,productAmount,productDescription,productStatus) 
values (1001,'BichTram5',2800,3,'notthing','nottt');
-- buoc 3
-- tao View
create view View_Product2 as
	select productCode,productName,productPrice,productStatus from product_2;
    
    
-- add index
alter table products add index index_proCode(productCode);
-- drop index
alter table products drop index index_proCode;


alter table products add index idx_Name_Price(productName,productPrice);


alter table customers drop index index_cusNum;

-- tao procedure
-- lay tat ca thong tin cua cac san pham trong bang producgt
DELIMITER //
create procedure getAllInfoFromProduct()
begin
	select * from products;
end;//
DELIMITER ;
-- Them mot san pham moi
DELIMITER //
create procedure insertNewProduct()
begin
	
end;//
DELIMITER ;
