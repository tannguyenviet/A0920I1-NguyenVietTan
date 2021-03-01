create table contacts(
contact_id INT(11) not null auto_increment,
last_name varchar(30) not null,
first_name varchar(25),
birthday DATE,
constraint contacts_pk primary key (contact_id)
);

create table suppliers(
supplier_id INT(11) not null auto_increment,
supplier_name varchar(50) not null,
account_rep Varchar(30) not null default 'TBD',
constraint suppliers_pk primary key (supplier_id)
);
/* chỉnh sửa  mô ta của cột*/
alter table contacts
	modify last_name varchar(50) null;
 /* Thay đổi cột */   
alter table contacts
	change column contact_type ctype
    varchar(20) not null;
    





  
