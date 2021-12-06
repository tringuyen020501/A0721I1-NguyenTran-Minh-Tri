create database quanlibanhang;
use quanlibanhang;

create table customer(
cID int primary key ,
cName varchar(50),
cAge tinyint
);

create table orderr(
oID int primary key auto_increment,
cID int,
oDate date,
oTotalPrice int,
foreign key (cID) references customer(cID) 
);

create table product(
pID int primary key,
pName varchar(50),
pPrice int
);

create table orderDetal(
oID int,
pID int ,
odQTY int(45),
primary key (pID,oID),
foreign key (pID) references product(pID),
foreign key (oID) references orderr(oID)
);


