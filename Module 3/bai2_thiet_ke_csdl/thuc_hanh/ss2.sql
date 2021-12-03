create database QuanLiLopHoc;
use QuanLiLopHoc;

create table `tai_khoan` (
username varchar(15) primary key,
`password` varchar(100) not null );   -- là bắt buộc nhập thông tin khi thêm mới hoặc sửa 


create table lop_hoc(
ma_lop_hoc int primary key auto_increment,
ten_lop_hoc varchar(100)
);

create table giang_vien(
ma_giang_vien int primary key auto_increment,
ten_giang_vien varchar(100),
ngay_sinh date
);

create table hoc_vien (
-- auto_increment : tự động tăng, áp dụng cho số
ma_hoc_vien int primary key auto_increment,
ten_hoc_vien varchar(100),
ngay_sinh date,
email varchar(100),
-- unique : không trùng lặp
username varchar(15) unique,
ma_lop_hoc int,
foreign key(ma_lop_hoc) references lop_hoc(ma_lop_hoc),
foreign key(username) references tai_khoan(username)
);

create table dia_chi(
ma_dia_chi int primary key auto_increment,
dia_chi varchar (255),
ma_hoc_vien int,
foreign key(ma_hoc_vien) references hoc_vien(ma_hoc_vien)
);

create table giang_vien_day_lop_hoc(
ma_giang_vien int,
ma_lop_hoc int,
primary key(ma_giang_vien,ma_lop_hoc), -- khóa phức hợp
foreign key(ma_giang_vien) references giang_vien(ma_giang_vien),
foreign key(ma_lop_hoc) references  lop_hoc(ma_lop_hoc)
);

select *from tai_khoan;
insert into tai_khoan(username,`password`) values
(`tri1`,`1`),
(`tri2`,`2`),
(`tri3`,`3`),
(`tri4`,`4`),
(`tri5`,`5`),
(`tri6`,`6`),
(`tri7`,`7`),
(`tri8`,`8`);

select *from lop_hoc;
insert into lop_hoc(ma_lop_hoc,ten_lop_hoc) values
(`01`,`a0721`),
(`02`,`a0722`),
(`03`,`a0723`),
(`04`,`a0724`),
(`05`,`a0725`),
(`06`,`a0726`),
(`07`,`a0727`);

select * from giang_vien;
insert into giang_vien values(1,"win","1999-01-01");
insert into giang_vien(ten_giang_vien, ngay_sinh) values
("tri1","1995-01-02"),
("tri2","1996-01-03"),
("tri3", "1997-01-04"),
("tri4", "1998-01-05"),
("tri5", "1999-06-06"),
("tri6", "2000-07-07");
insert into lop_hoc values (1,"A0721i1");
insert into lop_hoc(ten_lop_hoc) values("A0721i1"),("A0721i2"),("A0721i3"),("A0721i4"),("A0721i5"),("A0727i1");

select *from hoc_vien;
insert into hoc_vien values (1, "van","2000-01-01", "tringuyen1@gmail.com","tri", 01);
insert into hoc_vien(ten_hoc_vien, ngay_sinh, email, username, ma_lop_hoc) values
("huyen", "2001-14-02", "huyen@gmail.com", "huyen1", 02),
("nguyen", "2001-15-03", "nguyen@gmail.com", "nguyen1", 03),
("hieu", "2001-19-04", "hieu@gmail.com", "hieu1", 04),
("huy", "2001-02-05", "huy@gmail.com", "huy1", 05),
("trung", "2001-07-08", "trung@gmail.com", "trung1", 06),
("nhan", "2001-25-04", "nhan@gmail.com", "nhan1", 07);

select *from dia_chi;
insert into dia_chi values (1,"Ha Noi",1);
insert into dia_chi(dia_chi, ma_hoc_vien) values
("Da Nang", 2),
("Hue", 3),
("HCM", 4),
("Quang Nam", 5),
("Da Lat", 6),
("Nha Trang", 7);

select *from giang_vien_day_lop_hoc;
insert into giang_vien_day_lop_hoc values
(1,1),
(2,1),
(3,1),
(4,1),
(5,1),
(6,1),
(7,1);






