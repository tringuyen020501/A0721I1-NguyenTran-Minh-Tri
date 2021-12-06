use quanlibanhang;

insert into Customer values
(1,'Minh Quan', 10),
(2,'Ngoc Oanh', 20),
(3,'Hong Ha', 50);

insert into Orderr values
(1,1,"2009-06-5",null),
(2,2,"2009-06-5",null),
(3,3,"2009-06-5",null),
(4,2,"2009-06-5",null);

-- (1,1,"2006-03-21",null),
-- (2,2,"2006-03-23",null), 
-- (3,1,"2006-03-16",null),


insert into Product values
(1,'May Giat', 3),
(2,'Tu Lanh', 5),
(3,'Dieu Hoa', 7),
(4,'Quat', 1),
(5,'Bep Dien', 2);

insert into OrderDetal values
(1,1,3),
(1,3,7),
(1,4,2),
(2,1,1),
(3,1,8),
(2,5,4),
(2,3,3);


-- Hiển thị các thông tin  gồm oID, oDate, oPrice của tất cả các hóa đơn trong bảng Order
select *from orderr;

-- Hiển thị danh sách các khách hàng đã mua hàng, và danh sách sản phẩm được mua bởi các khách
select C.cName,p.pName 
from customer as C join orderr o on C.cID=o.cID
join orderdetal as od on o.oID=od.oID
join product as p on p.pID=od.pID;

-- Hiển thị tên những khách hàng không mua bất kỳ một sản phẩm nào
select C.cName,cID from Customer C where not exists(select *from Customer C2 inner join orderr O on C2.cID=O.cID and C2.cID=C.cID); 
-- Hiển thị mã hóa đơn, ngày bán và giá tiền của từng hóa đơn (giá một hóa đơn được tính bằng tổng giá bán của từng loại mặt hàng xuất hiện trong hóa đơn. Giá bán của từng loại được tính = odQTY*pPrice)





