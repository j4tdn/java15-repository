CREATE TABLE `java15-buunghia-sql`.`khachhang` (
  `MaKH` VARCHAR(10) NOT NULL,
  `TenKH` VARCHAR(255) NOT NULL,
  `DiaChi` VARCHAR(255) NOT NULL,
  `SoDT` VARCHAR(11) NOT NULL,
  `MaSoThue` INT NOT NULL,
  PRIMARY KEY (`MaKH`));
  
CREATE TABLE `java15-buunghia-sql`.`muctiengio` (
  `MaTienGio` VARCHAR(10) NOT NULL,
  `DonGia` DOUBLE NOT NULL,
  `MoTa` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`MaTienGio`));
  
CREATE TABLE `java15-buunghia-sql`.`phong` (
  `MaPhong` VARCHAR(10) NOT NULL,
  `SoKhachToiDa` INT NOT NULL,
  `TrangThai` VARCHAR(100) NOT NULL,
  `MoTa` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`MaPhong`));

CREATE TABLE `java15-buunghia-sql`.`dichvu` (
  `MaDV` VARCHAR(10) NOT NULL,
  `TenDV` VARCHAR(100) NOT NULL,
  `DonViTinh` VARCHAR(45) NOT NULL,
  `DonGia` DOUBLE NOT NULL,
  PRIMARY KEY (`MaDV`));
  
CREATE TABLE `java15-buunghia-sql`.`hoadon` (
  `MaHD` VARCHAR(10) NOT NULL,
  `MaKH` VARCHAR(10) NOT NULL,
  `MaPhong` VARCHAR(10) NOT NULL,
  `MaTienGio` VARCHAR(10) NOT NULL,
  `ThoiGianBatDauSuDung` DATETIME NOT NULL,
  `ThoiGianKetThucSuDung` DATETIME NOT NULL,
  `TrangThaiHoaHD` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`MaHD`),
  CONSTRAINT `fk_makhachhang`
    FOREIGN KEY (`MaKH`)
    REFERENCES `java15-buunghia-sql`.`khachhang` (`MaKH`)
  CONSTRAINT `fk_maphong`
    FOREIGN KEY (`MaPhong`)
    REFERENCES `java15-buunghia-sql`.`phong` (`MaPhong`)
  CONSTRAINT `fk_matiengio`
    FOREIGN KEY (`MaTienGio`)
    REFERENCES `java15-buunghia-sql`.`muctiengio` (`MaTienGio`)
    
CREATE TABLE `java15-buunghia-sql`.`chitiet_sudungdv` (
  `MaHD` VARCHAR(10) NOT NULL,
  `MaDV` VARCHAR(10) NOT NULL,
  `SoLuong` INT NOT NULL,
  PRIMARY KEY (`MaHD`, `MaDV`));

ALTER TABLE `java15-buunghia-sql`.`chitiet_sudungdv`
ADD CONSTRAINT `fk_mahd`
  FOREIGN KEY (`MaHD`)
  REFERENCES `java15-buunghia-sql`.`hoadon` (`MaHD`)
  

ALTER TABLE `java15-buunghia-sql`.`chitiet_sudungdv`
ADD CONSTRAINT `fk_madv`
  FOREIGN KEY (`MaDV`)
  REFERENCES `java15-buunghia-sql`.`dichvu` (`MaDV`)
  
  
INSERT INTO `java15-buunghia-sql`.`khachhang` (`MaKH`, `TenKH`, `DiaChi`, `SoDT`, `MaSoThue`) VALUES ('KH001', 'Phan Ngoc Quyen', 'Lien Chieu', '0905050803', '12345678');
INSERT INTO `java15-buunghia-sql`.`khachhang` (`MaKH`, `TenKH`, `DiaChi`, `SoDT`, `MaSoThue`) VALUES ('KH002', 'Dang Van Nhat Minh', 'Thanh Khe', '0905052325', '12345679');
INSERT INTO `java15-buunghia-sql`.`khachhang` (`MaKH`, `TenKH`, `DiaChi`, `SoDT`, `MaSoThue`) VALUES ('KH003', 'Tran Dang Hieu', 'Hai Chau', '0905123412', '12345677');
INSERT INTO `java15-buunghia-sql`.`khachhang` (`MaKH`, `TenKH`, `DiaChi`, `SoDT`, `MaSoThue`) VALUES ('KH004', 'Tran Cong Nguyen Hai', 'Son Tra', '0934062723', '12343546');
INSERT INTO `java15-buunghia-sql`.`khachhang` (`MaKH`, `TenKH`, `DiaChi`, `SoDT`, `MaSoThue`) VALUES ('KH005', 'Dang Quang Vinh', 'Ngu Hanh Son', '0934922354', '12345573');

INSERT INTO `java15-buunghia-sql`.`phong` (`MaPhong`, `SoKhachToiDa`, `TrangThai`, `MoTa`) VALUES ('VIP01', '5', 'DuocSuDung', 'phong vip');
INSERT INTO `java15-buunghia-sql`.`phong` (`MaPhong`, `SoKhachToiDa`, `TrangThai`, `MoTa`) VALUES ('P02', '10', 'DuocSuDung', 'phong binh thuong');
INSERT INTO `java15-buunghia-sql`.`phong` (`MaPhong`, `SoKhachToiDa`, `TrangThai`, `MoTa`) VALUES ('P03', '12', 'DuocSuDung', 'phong binh thuong');
INSERT INTO `java15-buunghia-sql`.`phong` (`MaPhong`, `SoKhachToiDa`, `TrangThai`, `MoTa`) VALUES ('VIP04', '5', 'DuocSuDung', 'phong vip');
INSERT INTO `java15-buunghia-sql`.`phong` (`MaPhong`, `SoKhachToiDa`, `TrangThai`, `MoTa`) VALUES ('P05', '15', 'DuocSuDung', 'phong binh thuong');

INSERT INTO `java15-buunghia-sql`.`dichvu` (`MaDV`, `TenDV`, `DonViTinh`, `DonGia`) VALUES ('DV01', 'Hat dua', 'Bao', '15000');
INSERT INTO `java15-buunghia-sql`.`dichvu` (`MaDV`, `TenDV`, `DonViTinh`, `DonGia`) VALUES ('DV02', 'Trai cay', 'Dia', '40000');
INSERT INTO `java15-buunghia-sql`.`dichvu` (`MaDV`, `TenDV`, `DonViTinh`, `DonGia`) VALUES ('DV03', 'Bia', 'Lon', '35000');
INSERT INTO `java15-buunghia-sql`.`dichvu` (`MaDV`, `TenDV`, `DonViTinh`, `DonGia`) VALUES ('DV04', 'Nuoc ngot', 'Chai', '20000');
INSERT INTO `java15-buunghia-sql`.`dichvu` (`MaDV`, `TenDV`, `DonViTinh`, `DonGia`) VALUES ('DV05', 'Ruou', 'Chai', '300000');

INSERT INTO `java15-buunghia-sql`.`muctiengio` (`MaTienGio`, `DonGia`, `MoTa`) VALUES ('MT01', '60000', '6h den 17h');
INSERT INTO `java15-buunghia-sql`.`muctiengio` (`MaTienGio`, `DonGia`, `MoTa`) VALUES ('MT02', '80000', '17h den 22h');
INSERT INTO `java15-buunghia-sql`.`muctiengio` (`MaTienGio`, `DonGia`, `MoTa`) VALUES ('MT03', '100000', '22h den 6h');

INSERT INTO `java15-buunghia-sql`.`hoadon` (`MaHD`, `MaKH`, `MaPhong`, `MaTienGio`, `ThoiGianBatDauSuDung`, `ThoiGianKetThucSuDung`, `TrangThaiHoaHD`) VALUES ('HD001', 'KH001', 'VIP01', 'MT01', '2015/11/20 8:15:00', '2015/11/20 12:30:00', 'Da thanh toan');
INSERT INTO `java15-buunghia-sql`.`hoadon` (`MaHD`, `MaKH`, `MaPhong`, `MaTienGio`, `ThoiGianBatDauSuDung`, `ThoiGianKetThucSuDung`, `TrangThaiHoaHD`) VALUES ('HD002', 'KH002', 'P02', 'MT01', '2015/12/12 13:15:00', '2015/12/12 15:15:00', 'Chua thanh toan');
INSERT INTO `java15-buunghia-sql`.`hoadon` (`MaHD`, `MaKH`, `MaPhong`, `MaTienGio`, `ThoiGianBatDauSuDung`, `ThoiGianKetThucSuDung`, `TrangThaiHoaHD`) VALUES ('HD003', 'KH001', 'P02', 'MT01', '2014/10/15 13:15:00', '2014/10/15 16:15:00', 'Da thanh toan');
INSERT INTO `java15-buunghia-sql`.`hoadon` (`MaHD`, `MaKH`, `MaPhong`, `MaTienGio`, `ThoiGianBatDauSuDung`, `ThoiGianKetThucSuDung`, `TrangThaiHoaHD`) VALUES ('HD004', 'KH003', 'VIP01', 'MT02', '2015/9/20 18:30:00', '2015/9/20 21:00:00', 'Chua thanh toan');
INSERT INTO `java15-buunghia-sql`.`hoadon` (`MaHD`, `MaKH`, `MaPhong`, `MaTienGio`, `ThoiGianBatDauSuDung`, `ThoiGianKetThucSuDung`, `TrangThaiHoaHD`) VALUES ('HD005', 'KH005', 'P03', 'MT02', '2015/9/20 18:30:00', '2015/9/20 21:00:00', 'Thanh toan mot phan');

INSERT INTO `java15-buunghia-sql`.`chitiet_sudungdv` (`MaHD`, `MaDV`, `SoLuong`) VALUES ('HD001', 'DV01', '5');
INSERT INTO `java15-buunghia-sql`.`chitiet_sudungdv` (`MaHD`, `MaDV`, `SoLuong`) VALUES ('HD002', 'DV01', '8');
INSERT INTO `java15-buunghia-sql`.`chitiet_sudungdv` (`MaHD`, `MaDV`, `SoLuong`) VALUES ('HD002', 'DV02', '5');
INSERT INTO `java15-buunghia-sql`.`chitiet_sudungdv` (`MaHD`, `MaDV`, `SoLuong`) VALUES ('HD002', 'DV03', '2');
INSERT INTO `java15-buunghia-sql`.`chitiet_sudungdv` (`MaHD`, `MaDV`, `SoLuong`) VALUES ('HD003', 'DV04', '1');


