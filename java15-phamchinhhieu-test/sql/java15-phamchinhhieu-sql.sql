create database lesson23_phamchinhhieu_sql char set utf8mb4;
use lesson23_phamchinhhieu_sql;



create table KHACHHANG(
    MaKH int,
    TenKH varchar(200) not null,
    DiaChi varchar(200) not null,
    SDT varchar(200) not null,
    MaSoThue varchar(200) not null,
	constraint PK_DichVu primary key(MaKH)
);
ALTER TABLE KHACHHANG
MODIFY COLUMN MaKH varchar(200) not null;
ALTER TABLE HOADON DROP CONSTRAINT FK_HOADON_KHACHHANG;
ALTER TABLE HOADON ADD constraint FK_HOADON_KHACHHANG  foreign key (MaKH) references KHACHHANG(MaKH);
create table MUCTIENGIO(
    MaTienGio int,
    DonGia float,
	MoTa varchar(200) not null,
	constraint PK_MUCTIENGIO primary key(MaTienGio)
);
ALTER TABLE MUCTIENGIO
MODIFY COLUMN MaTienGio varchar(200) not null;
ALTER TABLE HOADON DROP CONSTRAINT FK_HOADON_MUCTIENGIO;
ALTER TABLE HOADON ADD constraint FK_HOADON_MUCTIENGIO  foreign key (MaTienGio) references MUCTIENGIO(MaTienGio);

create table PHONG(
    MaPhong int,
    SoKhachToiDa int,
    TrangThai varchar(200) not null,
	MoTa varchar(200) not null,
	constraint PK_PHONG primary key(MaPhong)
);
ALTER TABLE PHONG
MODIFY COLUMN MaPhong varchar(200) not null;
ALTER TABLE HOADON DROP CONSTRAINT FK_HOADON_PHONG;
ALTER TABLE HOADON ADD constraint FK_HOADON_PHONG  foreign key (MaPhong) references PHONG(MaPhong);
create table HOADON(
    MaHD int,
    MaKH int,
    MaPhong int,
    MaTienGio int,
    ThoiGianBatDauSD varchar(200) not null,
	ThoiGianKetThucSD varchar(200) not null,
    TrangThaiHD varchar(200) not null,

	constraint PK_HOADON primary key(MaHD),
	constraint FK_HOADON_KHACHHANG  foreign key (MaKH) references KHACHHANG(MaKH), 
   	constraint FK_HOADON_PHONG  foreign key (MaPhong) references PHONG(MaPhong),
    constraint FK_HOADON_MUCTIENGIO  foreign key (MaTienGio) references MUCTIENGIO(MaTienGio)
);
ALTER TABLE HOADON
MODIFY COLUMN MaKH varchar(200) not null;
ALTER TABLE HOADON
MODIFY COLUMN MaTienGio varchar(200) not null;
ALTER TABLE HOADON
MODIFY COLUMN MaPhong varchar(200) not null;
ALTER TABLE HOADON
MODIFY COLUMN MaHD varchar(200) not null;

create table DICHVU(
    MaDV int,
    TenDV varchar(200) not null,
    DonViTinh int,
    DonGia float,
	constraint PK_DichVu primary key(MaDV)

);
ALTER TABLE DICHVU
MODIFY COLUMN DonViTinh varchar(200) not null;
ALTER TABLE DICHVU
MODIFY COLUMN MaDV varchar(200) not null;
ALTER TABLE CHITIET_SUDUNGDV DROP CONSTRAINT FK_CHITIET_SUDUNGDV_DICHVU;
ALTER TABLE CHITIET_SUDUNGDV ADD constraint FK_CHITIET_SUDUNGDV_DICHVU  foreign key (MaDV) references DICHVU(MaDV);
create table CHITIET_SUDUNGDV(
	MaHD int,
    MaDV int,
    SoLuong int,
	constraint FK_CHITIET_SUDUNGDV_DICHVU  foreign key (MaDV) references DICHVU(MaDV),
    constraint FK_CHITIET_SUDUNGDV_HOADON  foreign key (MaHD) references HOADON(MaHD)

);
ALTER TABLE CHITIET_SUDUNGDV
MODIFY COLUMN MaDV varchar(200) not null;
ALTER TABLE CHITIET_SUDUNGDV
MODIFY COLUMN MaHD varchar(200) not null;

ALTER TABLE CHITIET_SUDUNGDV DROP CONSTRAINT FK_CHITIET_SUDUNGDV_HOADON;
ALTER TABLE CHITIET_SUDUNGDV ADD constraint FK_CHITIET_SUDUNGDV_HOADON  foreign key (MaHD) references HOADON(MaHD);


insert into KHACHHANG(MaKH, TenKH, DiaChi,SDT, MaSoThue)
values ('KH001', 'TRan Van A', 'Hai Chau', '34567','234534'),
		('KH002', 'Tran Van B', 'Lien Chieu', '4654634','644333'),
        ('KH003', 'Nguuyen Van C', 'Hai Chau', '2426','564547'),
		('KH004', 'Tran Van D', 'Lien Chieu', '4434','456453'),
		('KH005', 'Le Van Anh', 'Son Tra', '4434','456453');

insert into MUCTIENGIO(MaTienGio,DonGia, MoTa)
values ('MT01', 60000, '6h den 17h'),
		('MT02', 80000, '17h den 22h'),
        ('MT03', 100000, '22h den 6h');
		
insert into PHONG(MaPhong, SoKhachToiDa, TrangThai,MoTa)
values ('VIP01', 5, 'Duoc SD', 'Phong VIP'),
		('P02', 10, 'Duoc SD', 'Phong thuong'),
        ('P03', 15, 'Duoc SD', 'Phong thuong'),
        ('VIP04', 20, 'Duoc SD', 'Phong VIP'),
        ('P05', 25, 'Duoc SD', 'Phong thuong');
        
insert into DICHVU(MaDV,TenDV, DonViTinh, DonGia)
values ('DV01', 'Hat dua', 'Bao',5000),
		('DV02', 'Trai cay', 'Dia',30000),
        ('DV03', 'Bia', 'Lon',35000),
        ('DV04', 'Nuoc Ngot', 'Chai',10000),
        ('DV05', 'Ruou', 'Chai',200000);
        
        
insert into HOADON(MaHD,MaKH, MaPhong, MaTienGio,ThoiGianBatDauSD,ThoiGianKetThucSD,TrangThaiHD)
values ('HD001', 'KH001', 'VIP01','MT01','8:15','12:30','Da Thanh Toan'),
		('HD002', 'KH002', 'P02','MT01','13:10','17:20','Chua Thanh Toan'),
        ('HD003', 'KH001', 'P02','MT01','12:12','16:30','Da Thanh Toan'),
        ('HD004', 'KH003', 'VIP01','MT02','18:30','21:30','Chua Thanh Toan'),
        ('HD005', 'KH001', 'P03','MT02','20:15','21:45','Thanh Toan Mot Phan');
        
insert into CHITIET_SUDUNGDV(MaHD,MaDV, SoLuong)
values ('HD001', 'DV01', 5),
		('HD002', 'DV02', 5),
        ('HD003', 'DV05', 6),
        ('HD003', 'DV04', 1),
        ('HD005', 'DV02', 3);
        
        
        
        
-- QS03 Liet ke phong chua so luong toi da la 20
select * from Phong
where SoKhachToiDa =20;

-- QS04 
select * from DichVu 
where (DonViTinh = 'Chai' and DonGia <20000)
or (DonViTinh = 'Lon' and DonGia <30000);

-- qs05
select * from Phong where MaPhong like '%VIP%';