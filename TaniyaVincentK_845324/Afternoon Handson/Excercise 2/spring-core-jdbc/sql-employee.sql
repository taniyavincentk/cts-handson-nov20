create database cts_db;
use cts_db;
create table employee(
id integer primary key,
name varchar(15),
salary double
);

insert into employee
values
(1, "Taniya", 55000),
(2, "Anaya", 45000),
(3, "Appu", 38000);
