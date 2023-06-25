-- Câu 1: Tạo đầy đủ lược đồ cơ sở dữ liệu quan hệ như mô tả ở trên. Sinh viên tự định nghĩa kiểu dữ liệu cho các cột
CREATE SCHEMA `karaoke` DEFAULT CHARACTER SET utf8 ;
USE karaoke;

CREATE TABLE `karaoke`.`khachhang` (
  `MaKH` VARCHAR(10) NOT NULL,
  `TenKH` VARCHAR(45) NULL,
  `DiaChi` VARCHAR(45) NULL,
  `SoDT` VARCHAR(45) NULL,
  `MaSoThue` VARCHAR(45) NULL,
  PRIMARY KEY (`MaKH`));
  
CREATE TABLE `karaoke`.`phong` (
  `MaPhong` VARCHAR(10) NOT NULL,
  `SoKhachToiDa` INT NULL,
  `TrangThai` VARCHAR(45) NULL,
  `Mota` VARCHAR(255) CHARACTER SET 'cp1251' NULL,
  PRIMARY KEY (`MaPhong`));
  
CREATE TABLE `karaoke`.`dichvu` (
  `MaDV` VARCHAR(10) NOT NULL,
  `TenDV` VARCHAR(45) NULL,
  `DonViTinh` VARCHAR(45) NULL,
  `DonGia` DOUBLE NULL,
  PRIMARY KEY (`MaDV`));

CREATE TABLE `karaoke`.`muctiengio` (
  `MaTienGio` VARCHAR(10) NOT NULL,
  `DonGia` DOUBLE NULL,
  `MoTa` VARCHAR(255) NULL,
  PRIMARY KEY (`MaTienGio`));

CREATE TABLE `karaoke`.`hoadon` (
  `MaHD` VARCHAR(10) NOT NULL,
  `MaKH` VARCHAR(10) NULL,
  `MaPhong` VARCHAR(10) NULL,
  `MaTienGio` VARCHAR(10) NULL,
  `ThoiGianBatDauSD` DATETIME NULL,
  `ThoiGianKetThucSD` DATETIME NULL,
  `TrangThaiHD` VARCHAR(45) NULL,
  PRIMARY KEY (`MaHD`),
  INDEX `fk_makh_idx` (`MaKH` ASC) VISIBLE,
  INDEX `fk_maphong_idx` (`MaPhong` ASC) VISIBLE,
  INDEX `fk_matiengio_idx` (`MaTienGio` ASC) VISIBLE,
  CONSTRAINT `fk_makh`
    FOREIGN KEY (`MaKH`)
    REFERENCES `karaoke`.`khachhang` (`MaKH`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_maphong`
    FOREIGN KEY (`MaPhong`)
    REFERENCES `karaoke`.`phong` (`MaPhong`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_matiengio`
    FOREIGN KEY (`MaTienGio`)
    REFERENCES `karaoke`.`muctiengio` (`MaTienGio`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

CREATE TABLE `karaoke`.`chitiet_sudungdv` (
  `MaHD` VARCHAR(10) NOT NULL,
  `MaDV` VARCHAR(10) NOT NULL,
  `SoLuong` INT NULL,
  PRIMARY KEY (`MaHD`, `MaDV`),
  INDEX `fk_madv_idx` (`MaDV` ASC) VISIBLE,
  CONSTRAINT `fk_mahd`
    FOREIGN KEY (`MaHD`)
    REFERENCES `karaoke`.`hoadon` (`MaHD`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_madv`
    FOREIGN KEY (`MaDV`)
    REFERENCES `karaoke`.`dichvu` (`MaDV`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

-- Câu 2: Chèn 5 dòng dữ liệu mẫu cho mỗi bảng đã được minh họa ở trên vào tất cả các bảng một cách chính xác
INSERT INTO `karaoke`.`khachhang` (`MaKH`, `TenKH`, `DiaChi`, `SoDT`, `MaSoThue`) VALUES ('KH001', 'Tran Nam', 'Hai Chau', '0905123456', '12345671');
INSERT INTO `karaoke`.`khachhang` (`MaKH`, `TenKH`, `DiaChi`, `SoDT`, `MaSoThue`) VALUES ('KH002', 'Nguyen Mai Anh', 'Lien Chieu', '0905123474', '12345672');
INSERT INTO `karaoke`.`khachhang` (`MaKH`, `TenKH`, `DiaChi`, `SoDT`, `MaSoThue`) VALUES ('KH003', 'Ho Hoai Anh', 'Hoa Vang', '0905123423', '12345673');
INSERT INTO `karaoke`.`khachhang` (`MaKH`, `TenKH`, `DiaChi`, `SoDT`, `MaSoThue`) VALUES ('KH004', 'Chau Tinh Tri', 'Hoa Cam', '0905123468', '12345674');
INSERT INTO `karaoke`.`khachhang` (`MaKH`, `TenKH`, `SoDT`, `MaSoThue`) VALUES ('KH005', 'Phan Nhu Thao', '0905123485', '12345675');

INSERT INTO `karaoke`.`phong` (`MaPhong`, `SoKhachToiDa`, `TrangThai`, `Mota`) VALUES ('VIP01', '5', 'Duoc su dung', 'phong vip');
INSERT INTO `karaoke`.`phong` (`MaPhong`, `SoKhachToiDa`, `TrangThai`, `Mota`) VALUES ('P02', '15', 'Duoc su dung', 'phong binh thuong');
INSERT INTO `karaoke`.`phong` (`MaPhong`, `SoKhachToiDa`, `TrangThai`, `Mota`) VALUES ('VIP03', '10', 'Duoc su dung', 'phong vip');
INSERT INTO `karaoke`.`phong` (`MaPhong`, `SoKhachToiDa`, `TrangThai`, `Mota`) VALUES ('P04', '20', 'Duoc su dung', 'phong binh thuong');
INSERT INTO `karaoke`.`phong` (`MaPhong`, `SoKhachToiDa`, `TrangThai`, `Mota`) VALUES ('P05', '25', 'Duoc su dung', 'phong binh thuong');

INSERT INTO `karaoke`.`dichvu` (`MaDV`, `TenDV`, `DonViTinh`, `DonGia`) VALUES ('DV01', 'Hat Dua', 'Bao', '5000');
INSERT INTO `karaoke`.`dichvu` (`MaDV`, `TenDV`, `DonViTinh`, `DonGia`) VALUES ('DV02', 'Trai Cay', 'Dia', '30000');
INSERT INTO `karaoke`.`dichvu` (`MaDV`, `TenDV`, `DonViTinh`, `DonGia`) VALUES ('DV03', 'Bia', 'Lon', '35000');
INSERT INTO `karaoke`.`dichvu` (`MaDV`, `TenDV`, `DonViTinh`, `DonGia`) VALUES ('DV04', 'Nuoc Ngot', 'Chai', '10000');
INSERT INTO `karaoke`.`dichvu` (`MaDV`, `TenDV`, `DonViTinh`, `DonGia`) VALUES ('DV05', 'Ruou', 'Chai', '200000');

INSERT INTO `karaoke`.`muctiengio` (`MaTienGio`, `DonGia`, `MoTa`) VALUES ('MT01', '60000', 'Ap dung tu 6 gio den 17 gio');
INSERT INTO `karaoke`.`muctiengio` (`MaTienGio`, `DonGia`, `MoTa`) VALUES ('MT02', '80000', 'Ap dung tu 17 gio den 22 gio');
INSERT INTO `karaoke`.`muctiengio` (`MaTienGio`, `DonGia`, `MoTa`) VALUES ('MT03', '100000', 'Ap dung tu 22 gio den 6 gio');

INSERT INTO `karaoke`.`hoadon` (`MaHD`, `MaKH`, `MaPhong`, `MaTienGio`, `ThoiGianBatDauSD`, `ThoiGianKetThucSD`, `TrangThaiHD`) VALUES ('HD001', 'KH001', 'VIP01', 'MT01', '2015/11/20 8:15', '2015/11/20 12:30', 'Da thanh toan');
INSERT INTO `karaoke`.`hoadon` (`MaHD`, `MaKH`, `MaPhong`, `MaTienGio`, `ThoiGianBatDauSD`, `ThoiGianKetThucSD`, `TrangThaiHD`) VALUES ('HD002', 'KH002', 'P02', 'MT01', '2015-12-20 08:15:00', '2015-12-20 10:15:00', 'Chua thanh toan');
INSERT INTO `karaoke`.`hoadon` (`MaHD`, `MaKH`, `MaPhong`, `MaTienGio`, `ThoiGianBatDauSD`, `ThoiGianKetThucSD`, `TrangThaiHD`) VALUES ('HD003', 'KH001', 'P02', 'MT01', '2015-09-20 08:15:00', '2015-09-20 09:15:00', 'Da thanh toan');
INSERT INTO `karaoke`.`hoadon` (`MaHD`, `MaKH`, `MaPhong`, `MaTienGio`, `ThoiGianBatDauSD`, `ThoiGianKetThucSD`, `TrangThaiHD`) VALUES ('HD004', 'KH003', 'VIP01', 'MT02', '2015-11-17 08:15:00', '2015-11-17 11:15:00', 'Da thanh toan');
INSERT INTO `karaoke`.`hoadon` (`MaHD`, `MaKH`, `MaPhong`, `MaTienGio`, `ThoiGianBatDauSD`, `ThoiGianKetThucSD`, `TrangThaiHD`) VALUES ('HD005', 'KH001', 'P05', 'MT02', '2015-05-11 08:15:00', '2015-05-11 12:15:00', 'Thanh toan 1 phan');

INSERT INTO `karaoke`.`chitiet_sudungdv` (`MaHD`, `MaDV`, `SoLuong`) VALUES ('HD001', 'DV01', '5');
INSERT INTO `karaoke`.`chitiet_sudungdv` (`MaHD`, `MaDV`, `SoLuong`) VALUES ('HD002', 'DV01', '8');
INSERT INTO `karaoke`.`chitiet_sudungdv` (`MaHD`, `MaDV`, `SoLuong`) VALUES ('HD002', 'DV02', '5');
INSERT INTO `karaoke`.`chitiet_sudungdv` (`MaHD`, `MaDV`, `SoLuong`) VALUES ('HD002', 'DV03', '2');
INSERT INTO `karaoke`.`chitiet_sudungdv` (`MaHD`, `MaDV`, `SoLuong`) VALUES ('HD003', 'DV04', '1');

-- Câu 3: Liệt kê những phòng karaoke chứa được số lượng tối đa dưới 20 khách
SELECT *
FROM phong
WHERE sokhachtoida <= 20;

-- Câu 4: Liệt kê thông tin của các dịch vụ có đơn vị tính là "Chai" với đơn giá nhỏ hơn 20.000
-- VNĐ và các dịch vụ có đơn vị tính là "Lon" với đơn giá lớn hơn 30.000 VNĐ
SELECT *
FROM dichvu
WHERE (Donvitinh = "Chai" AND DonGia < 20000) OR (Donvitinh = "Lon" AND DonGia > 30000);

-- Câu 5: Liệt kê thông tin của các phòng karaoke có mã phòng bắt đầu bằng cụm từ "VIP"
SELECT *
FROM phong
WHERE MaPhong LIKE "VIP%";
