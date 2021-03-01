
drop table customers;
create table customers(
customerNumber int primary key  ,
customerName nvarchar(50) not null,
contactLastName nvarchar(50) not null,
contactFirstName nvarchar(50) not null,
phone nvarchar(50) not null,
addressLine1 nvarchar(50) not null,
addressLine2 nvarchar(50) not null,
city nvarchar(50) not null,
state nvarchar(50) not null,
postalCode nvarchar(15) not null,
country nvarchar(50) not null,
creditLimit double
);
	
create table orders(
	orderNumber int primary key ,
    orderDate date not null,
    requiredDate date not null,
    shippedDate date not null,
    status 	nvarchar(15) not null,
    quantityOrdered int not null,
    priceEach double not null,
    customerNumber int ,
	foreign key (customerNumber) references customers(customerNumber)
);
create table productlines(
	productLine nvarchar(50) primary key,
    textDescription text,
    image text
);

create table products(
	productCode nvarchar(15) primary key,
    productName nvarchar(50)  not null,
    productScale nvarchar(10) not null,
    productVender nvarchar(50) not null,
    productDescription  text not null,
    quantityInStock int not null,
    buyPrice double not null,
    MSRP double not null,
    productLine nvarchar(50),
    foreign key (productLine) references productlines (productLine)
);
create table orderDetails(
	orderNumber int,
    productCode nvarchar(15),
    primary key (orderNumber,productCode),
    foreign key (productCode) references products(productCode),
    foreign key (orderNumber) references orders(orderNumber)
);
create table payments(
	customerNumber int ,
    checkNumber nvarchar(50) not null,
    paymentDate date not null,
	amount double not null,
	foreign key (customerNumber) references customers (customerNumber)
);


create table employees(
	employeeNumber int primary key,
    lastName nvarchar(50),
    firstName nvarchar(50),
    email nvarchar(50),
    jobTitle  nvarchar(50)
);
alter table customers 
	add salesRepEmployeeNumber int,
	add foreign key (salesRepEmployeeNumber) references employees(employeeNumber);

create table offices(
	officeCode int primary key,
    city nvarchar(50),
    phone nvarchar(50),
    addressLine1 nvarchar(50) not null,
	addressLine2 nvarchar(50) not null,
	state nvarchar(50) not null,
	postalCode nvarchar(15) not null,	
	country nvarchar(50) not null
);
alter table employees
	add officeCode int,
    add foreign key (officeCode) references offices(officeCode);
-- drop table orders;
-- alter table orders
-- 	add foreign key (customerNumber) references orders(customerNumber);
--     
--     
-- ALTER TABLE Orders
-- ADD CONSTRAINT FK_PersonOrder
-- FOREIGN KEY (PersonID) REFERENCES Persons(PersonID);

