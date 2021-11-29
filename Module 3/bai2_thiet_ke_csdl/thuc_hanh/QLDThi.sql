create database QuanLyDiemThi;
use QuanLyDiemThi;
create table HocSinh(
	MaHS VARCHAR(20) PRIMARY KEY,
    TenHS VARCHAR(50),
    NgaySinh DATETIME,
    Lop VARCHAR(20),
    GT VARCHAR(20)
);

create table MonHoc(
	MaMH VARCHAR(20) PRIMARY KEY,
	TenMH VARCHAR(50)
);

create table BangDiem(
	MaHS VARCHAR(20),
    MaMH VARCHAR(20),
    DiemThi INT,
    NgayKT DATETIME,
    PRIMARY KEY (MaHS, MaMH),
    FOREIGN KEY (MaHS) REFERENCES HocSinh(MaHS),
    FOREIGN KEY (MaMH) REFERENCES MonHoc(MaMH)
);
create table GiaoVien(
	MaGV VARCHAR(20) PRIMARY KEY,
    TenGV VARCHAR(20),
    SDT VARCHAR(10)
);

ALTER TABLE MonHoc ADD MaGV VARCHAR(20);
ALTER TABLE MonHoc ADD CONSTRAINT FK_MaGV FOREIGN KEY (MaGV) REFERENCES GiaoVien(MaGV);