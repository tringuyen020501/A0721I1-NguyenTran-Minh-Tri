create database module3;
use module3;
create table Class(
id int,
`name` varchar(100)
);
SELECT *FROM module3.Class;
insert into Class(id,name) value (1,"Tri");
select *from Class;

create table Teacher(
id int,
`name` varchar(100),
age double,
`country` varchar(100)
);
SELECT *FROM module3.Teacher;
insert into Teacher(id,name, age,country) value(1,"tri",6.0,"DN");
select *from Teacher;


