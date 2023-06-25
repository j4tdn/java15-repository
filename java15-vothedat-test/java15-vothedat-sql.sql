-- Cau 1--  
create database KARAOKE;
use KARAOKE;
create table KHACHHANG(
     MaKH varchar(50) primary key,
     TenKH varchar(255) not null,
     DiaChi varchar(255),
     SoDT int,
     MaSoThue int
);

create table MUCTIENGIO(
    MaTienGio varchar(50) primary key,
    DonGia Float,
    MoTa varchar(255)
);

create table DICHVU(
    MaDV varchar(50) primary key,
    TenDV varchar(255) not null,
    DonViTinh varchar(50),
    DonGia float
);

create table PHONG(
    MaPhong varchar(50) primary key,
    SoKhachToiDa int not null,
    TrangThai varchar(50),
    Mota varchar(255)
);

create table CHITIET_SUDUNGDV(
    MaHD varchar(50),
    MaDV varchar(50),
    SoLuong int,
    primary key(MaHD, MaDV)
);

create table HOADON(
    MaHD varchar(50) primary key,
    MaKH varchar(50) not null,
    foreign key (MaKH) references KHACHHANG(MaKH),
    MaPhong varchar(50) not null,
    foreign key (MaPhong) references Phong(MaPhong),
    MaTienGio varchar(50) not null,
    foreign key (MaTienGio) references MUCTIENGIO(MaTienGio),
    ThoiGianBatDauSD time,
    ThoiGianKetThucSD time,
    TrangThaiHD varchar(50)
);

-- Cau 2--  
INSERT INTO DICHVU values('DV01', 'Hat Dua', 'Bao', 5000),
                         ('DV02', 'Trai cay', 'Dia', 30000),
                         ('DV03', 'Bia', 'Lon', 35000),
                         ('DV04', 'Nuoc Ngot', 'Chai', 10000),
                         ('DV05', 'Ruou', 'Chai', 200000);

-- Cau 3--
select p.*
from PHONG AS p
where p.SoKhachToiDa < 20;

-- Cau 4--
select dv.*
from DICHVU AS dv
WHERE (dv.DonViTinh = 'Chai' and dv.DonGia < 20000) or 
	  (dv.DonViTinh = 'Lon' and dv.DonGia > 30000);
-- Cau 5--
select p.*
from PHONG AS p
where p.MaPhong LIKE 'VIP%'

