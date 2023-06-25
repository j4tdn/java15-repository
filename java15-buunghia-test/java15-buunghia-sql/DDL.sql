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
  
  



