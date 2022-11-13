-- 1. Tạo cơ sở dữ liệu java11_shopping_manually
CREATE DATABASE java15_shopping_test CHAR SET utf8mb4;
USE java15_shopping_test;
-- 2. Tạo table MatHang, LoaiHang
CREATE TABLE LoaiHang(
   MALH INT PRIMARY KEY,
   TenLH VARCHAR(200) NOT NULL
   
   );
CREATE TABLE MatHang(
     MaMH INT,
     TenMH VARCHAR(200) NOT NULL,
     MauSac VARCHAR(50) NOT NULL,
     MaLH INT ,
     CONSTRAINT PK_MH PRIMARY KEY(MaMH),
     CONSTRAINT PK_MH_LH FOREIGN KEY (MaLH) REFERENCES LoaiHang(MaLH)
     );


-- 3. Tạo ràng buộc PK, FK cho 2 tables trên


-- 4. Thêm column NgayTao kiểu DATE vào table LoaiHang
ALTER TABLE LoaiHang 
ADD NgayTao DATE;

-- 5. Thay đổi tên tên column NgayTao thành DATE_CREATED trong bảng LoaiHang

-- 6. Tạo table DonHang, MatHang
-- 7. Tạo table ChiTietDonHang
-- 8. Tạo ràng buộc PK, FK trong bảng ChiTietDonHang
-- 9. Xóa column DATE_CREATED trong table LoaiHang

-- 10. Truncate table