create database QuanLiResort;
use QuanLiResort;

create table vi_tri(
ma_vi_tri int primary key auto_increment,
ten_vi_tri varchar(45)
);

create table trinh_do(
ma_trinh_do int primary key auto_increment,
ten_trinh_do varchar(45)
);

create table bo_phan(
ma_bo_phan int primary key auto_increment,
ten_bo_phan varchar(45)
);

create table loai_khach(
ma_loai_khach int primary key auto_increment,
ten_loai_khach varchar(45)
);

create table loai_dich_vu(
ma_loai_dich_vu int,
ten_loai_dich_vu varchar(45)
);

create table kieu_thue(
ma_kieu_the int primary key auto_increment,
ten_kieu_thue varchar(45) 
);

create table dich_vu_di_kem(
ma_dich_vu_di_kem int primary key auto_increment,
ten_dich_vu_di_kem varchar(45),
gia double,
don_vi varchar(10),
trang_thai  varchar(45)
);

create table hop_dong_chi_tiet(
ma_hop_dong_chi_tiet int primary key auto_increment,
ma_hop_dong int,
ma_dich_vu_di_kem int,
so_luong int,
foreign key (hop_dong) references hop_dong(ma_hop_dong),
foreign key (dich_vu) references dich_vu(ma_dich_vu_di_kem)
);



create table nhan_vien(
ma_nhan_vien int primary key auto_increment,
ho_ten varchar(45),
ngay_sinh date,
so_cmnd  varchar(45),
luong  double,
so_dien_thoai varchar(45),
email varchar(45),
dia_chi varchar (45), 
ma_vi_tri int,
ma_trinh_do int,
ma_bo_phan int,
foreign key(vi_tri) references vi_tri(ma_vi_tri),
foreign key(trinh_do) references trinh_do(ma_trinh_do),
foreign key(bo_phan) references bo_phan(ma_bo_phan)
);

create table hop_dong(
ma_hop_dong int,
ngay_lam_hop_dong datetime,
ngay_ket_thuc datetime,
ten_dat_coc double,
ma_nhan_vien int,
ma_khach_hang int,
ma_dich_vu int,
foreign key (nhan_vien) references nhan_vien(ma_nhan_vien),
foreign key (khach_hang) references khach_hang(ma_khach_hang),
foreign key (dich_vu) references  dich_vu(ma_dich_vu)
);

create table khach_hang(
ma_khach_hang int primary key auto_increment,
ma_loai_khach int,
ho_ten varchar(45),
ngay_sinh date,
gioi_tinh bit(1),
so_cmnd varchar(45),
so_dien_thoai varchar(45),
email varchar(45),
dia_chi varchar(45),
foreign key(loai_khach) references loai_khach(ma_loai_khach )
);



create table dich_vu(
ma_dich_vu int primary key  auto_increment,
ten_dich_vu varchar(45),
dien_tich int,
chi_phi_thue double,
so_nguoi_toi_da varchar(45),
ma_kieu_thue int,
ma_loai_dich_vu int,
tieu_chuan_phong varchar(45),
mo_ta_tien_nghi_khac varchar(45),
dien_tich_tien_nghi_khac varchar(45),
dien_tich_ho_boi double,
so_tang int,
foreign key (kieu_thue) references kieu_thue(ma_kieu_thue),
foreign key (loai_dich_vu) references loai_dich_vu(ma_loai_dich_vu)
);


