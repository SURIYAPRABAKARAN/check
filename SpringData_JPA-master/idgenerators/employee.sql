use mydb;

create table employee(

id int primary key auto_increment,
name varchar(20)
);

drop table employee;

select * from employee;

create table id_gen(
gen_name varchar(60) primary key,
gen_value int(20)
);
