use quanlibanhang;

create table customer(
cID int primary key auto_increment,
cName varchar(50),
cAge int
);

create table orderr(
oID double primary key auto_increment,
cID int,
oDate date,
oTotalPrice double,
foreign key (cID) references customer(cID) 
);

create table product(
pID int primary key auto_increment,
pName varchar(50),
pPrice double
);

create table orderDetal(
oID double,
pID int ,
odQTY varchar(45),
primary key (pID,oID),
foreign key (pID) references product(pID),
foreign key (oID) references orderr(oID)
);
