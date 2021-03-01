create table user(
	user_id int auto_increment primary key,
    username varchar(40),
    password varchar(255),
    email varchar(255)
);
create table role(
	role_id int auto_increment,
    role_name varchar(50),
    primary key (role_id)
);

create table userrole(
	user_id int not null,
    role_id int not null,
    primary key (user_id,role_id),
    FOREIGN KEY(user_id) REFERENCES USERS(user_id),
   FOREIGN KEY(role_id) REFERENCES ROLES(role_id)		
)