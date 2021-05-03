drop database if exists ct_servlet;
create database ct_servlet;
-- ***********************position have 2 "n"
drop table if exists ct_servlet.positionn;
create table ct_servlet.positionn(
	position_id int primary key,
    position_name varchar(45)
);
drop table if exists ct_servlet.education_degree;
create table ct_servlet.education_degree(
	education_degree_id int primary key,
    edcation_degree_name varchar(45)
);
drop table if exists ct_servlet.division;
create table ct_servlet.division(
	division_id int primary key,
    division_name varchar(45)
);
drop table if exists ct_servlet.role;
create table ct_servlet.role(
	role_id int primary key,
    role_name varchar(255)
);
drop table if exists ct_servlet.user;
create table ct_servlet.user(
	username varchar(255) primary key,
    password varchar(255)
);
drop table if exists ct_servlet.user_role;
create table user_role(
	role_id int primary key ,
    username varchar(255),
     foreign key (role_id) references role(role_id),
     foreign key (username) references user(username)
);
drop table if exists ct_servlet.employee;
create table ct_servlet.employee(
	employee_id int primary key,
    employee_name varchar(45),
    employee_birthday DATE,
    employee_id_card varchar(45),
    employee_salary Double,
    employee_phone varchar(45),
    employee_email varchar(45),
    position_id int,
    education_degree_id int,
    division_id int,
	username varchar(255),
	foreign key (position_id) references positionn(position_id),
	foreign key (education_degree_id) references education_degree(education_degree_id),
	foreign key (division_id) references division(division_id),
	foreign key (username) references user(username)
);
drop table if exists ct_servlet.customer_type;
create table ct_servlet.customer_type(
	customer_type_id int primary key,
    customer_type_name varchar(45)
);
drop table if exists ct_servlet.customer;
create table ct_servlet.customer(
	customer_id int primary key,
    customer_type_id int,
    customer_name varchar(45),
    customer_birthday date,
    customer_gender bit(1),
    customer_id_card varchar(45),
    customer_phone varchar(45),
    customer_email varchar(45),
    customer_address varchar(45),
	foreign key (customer_type_id) references customer_type(servicecustomer_type_id_type)
);
drop table if exists ct_servlet.service_type;
create table ct_servlet.service_type(
	service_type_id int,
    service_type_name varchar(45)
);
drop table if exists ct_servlet.rent_type;
create table ct_servlet.rent_type(
	rent_type_id int primary key,
    rent_type_name varchar(45),
    rent_type_cost double
);
drop table if exists ct_servlet.service;
create table ct_servlet.service(
	service_id int primary key,
    service_name varchar(45),
    service_area int,
    service_cost double,
    service_max_people int,
    rent_type_id int,
    service_type_id int,
    standard_room varchar(45),
    description_other_convenience varchar(45),
    pool_area double,
    number_of_floors int,
    foreign key (rent_type_id) references rent_type(rent_type_id),
    foreign key (service_type_id) references service_type(service_type_id)
);
drop table if exists ct_servlet.contract;
create table ct_servlet.contract (
	contrac_id int primary key,
    contract_start_date datetime,
    contract_end_date datetime,
    contract_deposit double,
    contract_total_money double,
    employee_id int,
    customer_id int,
    service_id int,
    foreign key (employee_id) references employee(employee_id),
    foreign key (customer_id) references customer(customer_id),
    foreign key (service_id) references service(service_id)
);

drop table if exists ct_servlet.attach_service;
create table ct_servlet.attach_service(
	attach_service_id int primary key,
    attach_service_name varchar(45),
    attach_service_cost double,
    attach_service_unit int,
    attach_service_status varchar(45)
);
drop table if exists ct_servlet.contract_detail;
create table ct_servlet.contract_detail(
	contract_detail_int int primary key,
    contract_id int,
    attach_service_id int,
    quantity int,
    foreign key (contract_id) references contract(contract_id),
    foreign key (attach_service_id) references attach_service(attach_service_id)
    
)







