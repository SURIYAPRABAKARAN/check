use mydb

create table employee(
id int,
name varchar(20)
)

drop table employee

Identity Generator:

CREATE TABLE employee(

id INT PRIMARY KEY AUTO_INCREMENT,
NAME VARCHAR(20)
);

Update the DB Schema for Table Strategy :

CREATE TABLE employee(
id INT PRIMARY KEY,
NAME VARCHAR(20)
);

create table id_gen(
gen_name varchar(60) PRIMARY KEY,
gen_val int(20)
)

delete from employee;

Custom Random Generator:

CREATE TABLE employee(

id INT PRIMARY KEY,
NAME VARCHAR(20)
);