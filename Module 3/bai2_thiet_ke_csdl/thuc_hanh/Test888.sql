create database Test888;
use Test888;

create table admin(
username varchar(50),
password varchar(100)
);
select *from admin;
insert into admin(username, password) value (`admin`, `2501`);