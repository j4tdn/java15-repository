CREATE DATABASE KARAOKE;
USE KARAOKE;

CREATE TABLE KhangHang(
	MaKH		VARCHAR(50) NOT NULL,			
    TenKH		VARCHAR(50) NOT NULL,
    DiaChi		VARCHAR(50) NOT NULL,
    SoDT		VARCHAR(50) NOT NULL,
    MaSoThue 	INT 		NOT NULL,
    PRIMARY KEY (MaKH),
    CONSTRAINT fk_khachhang_hoadon
		FOREIGN KEY (MaKH)	
		REFERENCES	HoaDon(MaKH)
);
CREATE INDEX idx_hoadon_makh ON HoaDon (MaKH);


CREATE TABLE HoaDon(
	MaHD				VARCHAR(50)	NOT NULL,
    MaKH				VARCHAR(50)	NOT NULL,
    MaPhong				VARCHAR(50) NOT NULL,
    MaTienGio			VARCHAR(50) NOT NULL,
    ThoiGianBatDauSD	DATETIME 	NOT NULL,
    ThoiGianKetThucSD	DATETIME	NOT NULL,
    TrangThaiHD			VARCHAR(50)	NOT NULL,
     PRIMARY KEY (MaHD),
      CONSTRAINT fk_hoadon_chitietsudungdichvu
		FOREIGN KEY (MaHD)	
		REFERENCES	ChiTiet_SuDungDV(MaHD)
	
);

CREATE TABLE ChiTiet_SuDungDV(
	MaHD	VARCHAR(50)	NOT NULL,
    MaDV	VARCHAR(50) NOT NULL,
    SoLuong	INT			NOT NULL,
	PRIMARY KEY (MaHD, MaDV)

);
CREATE INDEX idx_hoadon_matiengio ON HoaDon (MaTienGio);
CREATE TABLE MucTienGio(
	MaTienGio	VARCHAR(50)	NOT NULL,
	DonGia		INT			NOT NULL,
    MoTa		VARCHAR(99) NOT NULL,
	PRIMARY KEY (MaTienGio),
    CONSTRAINT fk_muctiengio_hoadon
		FOREIGN KEY (MaTienGio)	
		REFERENCES	HoaDon(MaTienGio)
    

);
CREATE INDEX idx_hoadon_maphong ON HoaDon (MaPhong);

CREATE TABLE Phong(
	MaPhong			VARCHAR(50)		NOT NULL,
	SoKhachToiDa	INT				NOT NULL,
    TrangThai		VARCHAR(50)		NOT NULL,
    MoTa			VARCHAR(50)		NOT NULL,
    PRIMARY KEY (MaPhong),
    CONSTRAINT fk_phong_hoadon
		FOREIGN KEY (MaPhong)	
		REFERENCES	HoaDon(MaPhong)
);
CREATE TABLE DichVu(
	MaDV		VARCHAR(50)		NOT NULL,
    TenDichVu	VARCHAR(50)		NOT NULL,
    DonViTinh	VARCHAR(50)		NOT NULL,
    DonGia		INT				NOT NULL,
	PRIMARY KEY (MaDV),
	CONSTRAINT fk_dichvu_chitietsudungdichvu
		FOREIGN KEY (MaDV)	
		REFERENCES	ChiTiet_SuDungDV(MaDV)
);
CREATE INDEX idx_chitiet_sudungdv_madv ON ChiTiet_SuDungDV (MaDV);


INSERT INTO chitiet_sudungdv (MaHD, MaDV, SoLuong) VALUES ('HD001', 'DV01', '5');
INSERT INTO chitiet_sudungdv (MaHD, MaDV, SoLuong) VALUES ('HD002', 'DV01', '8');
INSERT INTO chitiet_sudungdv (MaHD, MaDV, SoLuong) VALUES ('HD002', 'DV02', '5');
INSERT INTO chitiet_sudungdv (MaHD, MaDV, SoLuong) VALUES ('HD002', 'DV03', '2');
INSERT INTO chitiet_sudungdv (MaHD, MaDV, SoLuong) VALUES ('HD003', 'DV04', '1');
INSERT INTO chitiet_sudungdv (MaHD, MaDV, SoLuong) VALUES ('HD003', 'DV05', '6');
INSERT INTO chitiet_sudungdv (MaHD, MaDV, SoLuong) VALUES ('HD004', 'DV01', '5');
INSERT INTO chitiet_sudungdv (MaHD, MaDV, SoLuong) VALUES ('HD005', 'DV02', '3');

INSERT INTO `karaoke`.`muctiengio` (`MaTienGio`, `DonGia`, `MoTa`) VALUES 	('MT01', '60000', 'Ap dung tu 6 gio den 17 gio'),
																			('MT02', '80000', 'Ap dung sau 17 gio den 22 gio'),
																			('MT03', '100000', 'Ap dung tu sau 22 gio den 6 gio');
                                                                            
INSERT INTO HoaDon (MaHD, MaKH, MaPhong, MaTienGio, ThoiGianBatDauSD, ThoiGianKetThucSD, TrangThaiHD)
VALUES ('HD001', 'KH001', 'VIP01', 'MT01', '2023-06-25 09:00:00', '2023-06-25 10:00:00', 'Da thanh toan'),
       ('HD002', 'KH002', 'P02', 'MT01', '2023-06-25 10:30:00', '2023-06-25 12:00:00', 'Chua thanh toan'),
       ('HD003', 'KH003', 'P02', 'MT02', '2023-06-25 10:30:00', '2023-06-25 12:00:00', 'Chua thanh toan'),
       ('HD004', 'KH004', 'P02', 'MT03', '2023-06-25 10:30:00', '2023-06-25 12:00:00', 'Chua thanh toan');

INSERT INTO Phong (MaPhong, SoKhachToiDa, TrangThai, MoTa) VALUES 	('P02', '10', 'Duoc su dung', 'phong binh thuong'),
																	('VIP01', '5', 'Duoc su dung', 'phong vip');
                                                                    

-- Cau 1:	Done
-- Cau 2: Done
-- Cau 3:
SELECT MaPhong, SoKhachToiDa
  FROM Phong
 WHERE SoKhachToiDa < 20;
-- Cau 4:
SELECT *
FROM DichVu
WHERE (DonViTinh = 'Chai' AND DonGia < 20000)
   OR (DonViTinh = 'Lon' AND DonGia > 30000);

-- Cau 5:
SELECT *
  FROM Phong
 WHERE MaPhong LIKE 'VIP%';








