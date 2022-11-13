-- ==> Service 
-- ==> Workbench
-- 1. Tạo cơ sở dữ liệu java11_shopping_manually
  CREATE  DATABASE java15_shopping_test CHAR SET utf8mb4;
  USE java15_shopping_test;
-- 2. Tạo table MatHang, LoaiHang
   create table LoaiHang(
    MaLH int primary key,
    TenLH varchar(200) not null
   );
   create table MatHang(
    MaMH int,
    TenMH varchar(200) not null,
    MauSac varchar(50) not null,
    MaLH int,
    constraint PK_MH primary key (MaMH) , 
    constraint FK_MH foreign key (MaLH) references LoaiHang(MaLH)
   );
-- 3. Tạo ràng buộc PK, FK cho 2 tables trên
-- 4. Thêm column NgayTao kiểu DATE vào table LoaiHang
alter table LoaiHang
add NgayTao date not null;

-- 5. Thay đổi tên tên column NgayTao thành DATE_CREATED trong bảng LoaiHang
alter table LoaiHang
rename column NgayTao to DATE_CREATED;
-- 6. Tạo table DonHang, MatHang
create table DonHang(
MaDH int ,
constraint pk_ma_kh primary key (MaDH),
MaKH int ,
DiaChiGiaoHang text,
SDT varchar(20),
ThoiGianGiaoHang datetime,
PhiVanChuyen double,
TongTien double ,
MaNV int
);




-- 7. Tạo table ChiTietDonHang
create table ChiTietDonHang(
MaDH int ,
MaMH int,
Soluong int,
constraint pk_ctdh primary key (MaDH, MaMH)
);
-- 8. Tạo ràng buộc PK, FK trong bảng ChiTietDonHang
alter table ChiTietDonHang
add constraint fk_ctdh_madh foreign key (MaDH) references DonHang(MaDH);
alter table ChiTietDonHang
add constraint fk_ctdh_mamh foreign key (MaMH) references MatHang(MaMH);
-- 9. Xóa column DATE_CREATED trong table LoaiHang
alter table LoaiHang
drop column  DATE_CREATED;
-- 10. Truncate table
-- truncate table ;