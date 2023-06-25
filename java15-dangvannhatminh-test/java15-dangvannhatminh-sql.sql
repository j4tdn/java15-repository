CREATE DATABASE java15_final_test CHAR SET utf8mb4;
USE java15_final_test;

CREATE TABLE KhachHang (
	MaKH VARCHAR(255) PRIMARY KEY,
    TenKH VARCHAR(200) ,
    DiaChi VARCHAR(200),
    SoDT VARCHAR(200),
    MaSoThue VARCHAR(200)
    
);
CREATE TABLE MucTienGio (
	MaTienGio VARCHAR(255) PRIMARY KEY,
    DonGia  BIGINT,
    MoTa VARCHAR(255)
);
CREATE TABLE DichVu (
	MaDV VARCHAR(255) PRIMARY KEY,
    TenDV VARCHAR(255),
    DonViTinh VARCHAR(255),
    DonGia BIGINT
);
CREATE TABLE Phong (
	MaPhong VARCHAR(100) PRIMARY KEY,
    SoKhachToiDa INT,
    TrangThai VARCHAR(200),
    MoTa VARCHAR(255)
);
CREATE TABLE HoaDon (
	MaHD VARCHAR(255) PRIMARY KEY,
    MaKH  VARCHAR(255) ,
    MaPhong VARCHAR(100),
    MaTienGio VARCHAR(255),
    ThoiGianBatDauSD TIMESTAMP,
    ThoiGianKetThucSD TIMESTAMP,
    TrangThaiHD VARCHAR(255),
    CONSTRAINT FK_KH FOREIGN KEY (MaKH) REFERENCES KhachHang(MaKH),
	CONSTRAINT FK_PHong FOREIGN KEY (MaPhong) REFERENCES Phong(MaPhong),
	CONSTRAINT FK_MATIENGIO FOREIGN KEY (MaTienGio) REFERENCES MucTienGio(MaTienGio)
);

CREATE TABLE CHITIET_SUDUNGDV (
	MaHD VARCHAR(255) ,
    MaDV VARCHAR(255),
    SoLuong VARCHAR(255),
    CONSTRAINT PK_CTDH PRIMARY KEY (MaHD,MaDV),
    CONSTRAINT FK_DonHang FOREIGN KEY (MaHD) REFERENCES HoaDon(MaHD),
    CONSTRAINT FK_DichVu FOREIGN KEY (MaDV) REFERENCES DichVu(MaDV)
);


INSERT INTO KhachHang(MaKH,TenKH,DiaChi,SoDT,MaSoThue) values("KH01","Tran Van Nam","Hai Chau", "0129301239","1234242123");
INSERT INTO KhachHang(MaKH,TenKH,DiaChi,SoDT,MaSoThue) values("KH02","Tran Van A","Hai Chau", "0129323231","12342423433");
INSERT INTO KhachHang(MaKH,TenKH,DiaChi,SoDT,MaSoThue) values("KH03","Tran Van B","Lien Chieu", "01292323439","123234123");
INSERT INTO KhachHang(MaKH,TenKH,DiaChi,SoDT,MaSoThue) values("KH04","Tran Van C","Son Tra", "012935675675","12342343423");
INSERT INTO KhachHang(MaKH,TenKH,DiaChi,SoDT,MaSoThue) values("KH05","Tran Van D","Hoa Khanh", "0129334353","1234234523");


INSERT INTO Phong (MaPhong, SoKhachToiDa, TrangThai, MoTa)
VALUES
("VIP01", 2, 'Duoc Su Dung', 'Phòng vip'),
("P02", 5, 'Duoc Su Dung', 'Phòng binh thuong'),
("VIP02", 30, 'Duoc Su Dung','Phòng vip'),
("P03", 15, 'Duoc Su Dung', 'Phòng binh thuong');


INSERT INTO DichVu (MaDV, TenDV, DonViTinh, DonGia)
VALUES
("DV01", 'Hat Dua', 'Bao', 50000),
("DV02", 'Trai Cay', 'Dia', 10000),
("DV03", 'Bia', 'Lon', 200000),
("DV04", 'Nuoc Ngot', 'Chai', 15000);

INSERT INTO MucTienGio (MaTienGio, DonGia, MoTa)
VALUES
("MT01", 50000, 'Từ 8:00 - 12:00'),
("MT02", 70000, 'Từ 12:00 - 18:00'),
("MT03", 100000, 'Từ 18:00 - 22:00'),
("MT04", 80000, 'Từ 22:00 - 8:00');

INSERT INTO HoaDon (MaHD, MaKH, MaPhong, MaTienGio, ThoiGianBatDauSD, ThoiGianKetThucSD, TrangThaiHD)
VALUES
("HD01", "KH01", "VIP01", "MT01", '2023-06-25 08:00:00', '2023-06-25 12:00:00', 'Hoàn thành'),
("HD02", "KH02", "P02", "MT02", '2023-06-25 12:00:00', '2023-06-25 18:00:00', 'Chưa thanh toán'),
("HD03", "KH03", "VIP02", "MT03", '2023-06-25 18:00:00', '2023-06-25 22:00:00', 'Hoàn thành'),
("HD04", "KH04", "P03", "MT04", '2023-06-25 22:00:00', '2023-06-26 08:00:00', 'Chưa thanh toán'),
("HD05", "KH01", "VIP01", "MT02", '2023-06-26 08:00:00', '2023-06-26 12:00:00', 'Hoàn thành'),
("HD06", "KH02", "P02", "MT03", '2023-06-26 12:00:00', '2023-06-26 18:00:00', 'Chưa thanh toán'),
("HD07", "KH03", "VIP02", "MT04", '2023-06-26 18:00:00', '2023-06-26 22:00:00', 'Hoàn thành'),
("HD08", "KH04", "P03", "MT01", '2023-06-26 22:00:00', '2023-06-27 08:00:00', 'Chưa thanh toán');

INSERT INTO CHITIET_SUDUNGDV (MaHD, MaDV, SoLuong)
VALUES
("HD01", "DV01", 2),
("HD01", "DV02", 3),
("HD02", "DV03", 1),
("HD03", "DV02", 2),
("HD04", "DV04", 4),
("HD05", "DV01", 12),
("HD05", "DV03", 30),
("HD06", "DV02", 20);

SELECT *
FROM Phong 
WHERE SoKhachToiDa < 20;

SELECT *
FROM DichVu
WHERE ( DonViTinh LIKE "%Chai%" AND DonGia < 20000 ) OR  ( DonViTinh LIKE "%Lon%" AND DonGia > 30000 );

SELECT *
FROM Phong 
WHERE MaPhong LIKE 'VIP%';
