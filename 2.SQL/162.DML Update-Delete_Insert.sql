-- D. SELECT - SLIDE 25-44
-- 1. Toàn bộ thông tin các loại hàng
    -- Mặt hàng thuộc loại hàng là 'Thắt lưng'
    -- Top 5 mặt hàng có giá bán cao nhất
    SELECT * FROM loaihang;
    SELECT mh.* FROM MatHang mh , loaihang lh   where mh.mamh=lh.MaLH and lh.malh= '%thắt lưng%';
    SELECT * FROM mathang mh join chitietmathang ctmh on mh.mamh=ctmh.mamh order by ctmh.giaban desc limit 5;
-- 2. Đơn hàng
    -- Được bán trong ngày 28/11/2019
    
    SELECT * FROM chitiettinhtrangdonhang  WHERE cast(thoigian as DATE) = str_to_date('28/11/2019','%d/%m/%y');
    -- ('28/11/2018','%d/%m/%y') ;
    
    SELECT * FROM chitiettinhtrangdonhang;
    -- Được bán từ ngày 28/11/2019 đến ngày 02/12/2019
    SELECT * from donhang  
    between''  and '';
    
    
    -- Được bán trong tháng 11/2019
    SELECT * FROM donhang  WHERE cast(thoigian as DATE) = str_to_date('28/11/2019','%d/%m/%y');
    -- Được giao hàng tại Hòa Khánh
    select * from donhang where DiaChiGiaoHang like '%hòa khánh%';
    
    
    /* 
    SELECT * FROM MatHang;
SELECT * FROm ChiTietMatHang;
UPDATE ChiTietMatHang ctmh
SET ctmh.GiaBan=444
WHERE EXISTS (SELECT * 
				FROM MatHang mh 
				WHERE mh.MaMH =ctmh.MaMH
                AND 
                EXISTS (SELECT * FROM LoaiHang lh
						WHERE TenLH LIKE '%ÁO%'
                        AND lh.MaLH=mh.MaLH)
				);*/
-- 3. Giá của toàn bộ các mặt hàng sau khi được khuyến mãi 20%, làm tròn 2 chữ số thập phân
SELECT *, ROUND(giaban*0.8,2) GIAKHUYENMAI FROM CHITIETMATHANG;

-- 4. Giảm giá 20% tất cả các mặt hàng trong ngày 25/11/2019
SELECT * FROm ChiTietMatHang;
SELECT *, ROUND(GIABAN*0.8,2) GIAKHUYENMAI FROM CHITIETMATHANG WHERE curdate()='2019-11-25';


-- 5. Liệt kê tất cả các màu sắc của sản phẩm có bán trong cửa hàng.
SELECT DISTINCT MAUSAC FROM MATHANG;


-- 7. Liệt kê tất cả các mặt hàng (MaMH, TenMH, ThoiGianDatHang) được bán trong ngày 23/11/2019

-- 8. Liệt kê các mặt hàng có giá bán từ 100 - 300
SELECT mh.* from mathang mh join chitietmathang ctmh on mh.mamh = ctmh.mamh where ctmh.GiaBan between 100 and 300;
-- 9. Liệt kê tất cả các mặt hàng thuộc loại hàng là 'Mũ' và 'Thắt lưng'
select * from mathang mh join loaihang lh on mh.malh = lh.malh where tenlh like '% mũ %' or '& thắt lưng&';

-- 10. Liệt kê các đơn hàng được đặt trong ngày (28/11/2019, 14/12/2019)
select * from donhang where date(thoigiandathang) in ('','');

-- ==============================================================
-- 11. Sắp xếp các mặt hàng với giá bán tăng dần
select * from chitietmathang order by giaban asc;

-- 12. Sắp xếp các mặt hàng với giá mua giảm dần
-- 13. Sắp xếp các mặt hàng với giá bán tăng dần, giá mua giảm dần
-- 14. Đếm số lượng các mặt hàng trong hệ thống
select count(*) soluongmathang,
group_concat(tenmh separator '-') chitietmathang
 from mathang;
 



-- 15. Số lượng 'Giày da Nam' được bán trong ngày 23/11/2019
select * from donhang dh join  chitietdonhang  ctdh on dh.mamh =ctdh.madh join mathang mh where mh.TenMH like 'áo sơ mi nam';
-- 16. Đếm tổng (SUM) số lượng các mặt hàng theo từng loại hàng
--     MaLoai  TenLoai SoLuong
-- 	1       Giày    20
-- 	2       Áo      28
select lh.* ,
sum(ctmh.soluong) SoLUong
from loaihang lh 
join mathang mh 
on lh.malh = mh.maLh 
join chitietmathang 
on mh.mamh =ctmh.mamh  group by lh.maLH;


-- 17. Tìm mặt hàng có giá bán cao nhất trong loại hàng 'Giày'
select  *from mathang mh join chitietmathang ctmh on mh.MaLH=mh.MaLH where TenMH like '%giày%' order by GiaBan desc limit 1;

-- 18. Tìm mặt hàng có giá bán cao nhất của mỗi loại hàng
with Thongtinmathang as (
select mh.*,
	lh.tenlh,
    ctmh.giaban
    from loaihang lh
    join mathang mh
    on mh.malh = lh.MaLH
    join chitietmathang ctmh 
    on ctmh.mamh = mh.mamh
),
thongtingiaban as (
select malh,
	max(giaban) Giabancaonhat
    from thongtinmathang
    group by malh
)
select * 
from thongtinmathang mh
join thongtingiaban gb 
on mh.malh = gb.malh
and mh.giaban = gb.giabancaonhat
group by mh.giaban;
    
    



-- 19. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống >> 16

-- 20. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống
--     Điều kiện tổng số lượng > 20 mặt hàng >> HAVING




















SELECT * FROM MatHang;
SELECT * FROM LoaiHang;
INSERT INTO ChucVu(MaCV,TenCV)
VALUES (4,'Bộ phận kiểm toán');
-- default: setAutoCommit(true) --> Run -> Inmediately affect to database
-- 			setAutoCommit(false)

-- Afftect:commit
-- Unfftect: Rollback
-- commit/rollback
-- INSERT/DELETE/UPDATE --
INSERT INTO LoaiHang(MaLH,TenLH)
VALUES(1,'Loại hàng 01'),
		(2,'Loại hàng 02');
        
-- CTE: common table expression
/*
WITH temp_data AS(
SELECT 3 ItemGroupId, 'Loại hàng 03' ItemGroupName
UNION 
SELECT 4 , 'Loại hàng 04' 
) 
SELECT * FROM temp_data; 
INSERT INTO LoaiHang(MaLH,TenLH)  
*/    

INSERT INTO LoaiHang(MaLH,TenLH)
SELECT 5,'Loại hàng 05';

/*
INSERT INTO MatHang(MaMH,TenMH,MauSac,MaLH)
VALUES(101,'Mặt hàng 101', 'Xanh',1),
	(102,'Mặt hàng 102', 'Xanh',1),
	(103,'Mặt hàng 103', 'Đỏ',2),
    (104,'Mặt hàng 104', 'Vàng',1);
 */
 INSERT INTO MatHang(MaMH, TenMH,MauSac,MaLH)
 VALUES (106,'Mặt hàng 106','Xanh',7);
 -- disable/enable fk
 -- checks for next commands
 -- ignore check for existed data
 SET FOREIGN_KEY_CHECKS =0;
  SET FOREIGN_KEY_CHECKS =1;
 -- TODO : delete elements from MatHang has FK not existed in LoaiHang
 -- merge into: if data available -> update
 -- insert/update
 
 
 
 
 -- DELETE --
 -- set autocommit = false;
 -- startTransaction --> endTransaction
 SELECT * FROM MatHang;
 DELETE FROM MatHang;
 ROLLBACK;
 
 
 DELETE FROM MatHang WHERE MaMH=101;
 DELETE FROM LoaiHang WHERE MaLH=1;
 
 ALTER TABLE MatHang
 DROP FOREIGN KEY FK_MatHang_LoaiHang;
 
 ALTER TABLE MatHang
 ADD CONSTRAINT FK_MatHang_LoaiHang FOREIGN KEY(MaLH) REFERENCES LoaiHang(MaLH)
 ON DELETE RESTRICT 
 ON UPDATE RESTRICT;
 
 DELETE FROM LoaiHang WHERE MaLH=2;
 SET FOREIGN_KEY_CHECKS=0;
 SET FOREIGN_KEY_CHECKS=1;
 INSERT INTO MatHang(MaMH,TenMh,MauSac,MaLH)
 VALUES(106,'Mặt hàng 106','Xanh',99);
 
 -- remove items which have ig_id not exits in item_group table
 
 SELECT *  FROM MatHang
 WHERE MaLH NOT IN (SELECT MaLH FROM LoaiHang); 
 -- CLAUSE LIMIT: 1000 VALUES
 -- sub query
SELECT *  FROM MatHang
WHERE  NOT EXISTS (SELECT MaLH FROM LoaiHang 
						WHERE MatHang.MaLH = LoaiHang.MaLH); 
                        
                        
 DELETE   FROM MatHang
WHERE  NOT EXISTS (SELECT MaLH FROM LoaiHang 
						WHERE MatHang.MaLH = LoaiHang.MaLH);  
                        
-- native sql
-- hql, jpql, h2 : 
-- java, sql, jdbc, hibernate, jpa, spring dataa jpa


-- UPDATE
UPDATE LoaiHang
SET TenLH = 'Item Group 2'
WHERE MaLH=2;
-- ========= -----
-- BT--
-- B. DELETE
SELECT * FROM NHANVIEN;
-- 1. Xóa nhân viên có tên 'Văn Hoàng' trong hệ thống
DELETE FROM nhanvien where TenNV = 'Văn Hoàng';
 SET FOREIGN_KEY_CHECKS=0;
 SET FOREIGN_KEY_CHECKS=1;
-- 2. Xóa chức vụ kiểm toán  trong hệ thống
DELETE FROM ChucVu WHERE TenCV LIKE '%kiểm toán%';
-- 3. Xóa tất cả các mặt hàng thuộc loại hàng là mũ
DELETE FROM MatHang 
 WHERE MaLH IN (SELECT MaLH
				FROM LoaiHang
				WHERE TenLH LIKE '%mũ%');
SELECT * 
FROM MatHang 
WHERE MaLH =5;
-- 4. Xóa tất cả các mặt hàng trong hệ thống


-- 5. Vì hệ thống bị lỗi. Hủy tất cả các đơn hàng ngày 23/11/2019
  -- Thực hiện xóa các đơn hàng bị lỗi
  DELETE FROM DonHang 
  WHERE cast(ThoiGianDatHang as DATE) =  str_to_date('18/12/2020','%d/%m/%y') ;

-- DEFAULT FOMMAT: '2020-12-18'
  
  -- SELECT date_format(curdate(),'%d,%m,%y');
  
 -- equals -> = 
-- --> startWith -> like ' value%', endsWith--> like '%value', contains--> like '%value%'
-- ======================= REFRESH DATA =======================
-- C. UPDATE
-- 1. Cập nhật tên mới cho phòng ban có MaPB = 2 thành 'Bộ phận quản lý'
-- 2. Cập nhật ghi chú của đơn hàng 01 thành 'Giao hàng sau 10H sáng'
-- 3. Đơn hàng 01 đã được giao hàng thành công. Thực hiện cập nhật
--   MaTT = 03,
-- TrangThai = 'Đã giao', 
-- ThoiGian = Thời gian hiện tại
-- Thực hiện cập nhật trạng thái đơn hàng 
SELECT * 
FROM ChiTietTinhTrangDonHang
WHERE MaDH=1;
SELECT * 
FROM TinhTrangDonHang;
INSERT INTO ChiTietTinhTrangDonHang(MaDH,MaTT,MaNV,ThoiGian)
VALUES (1,4,1,timestamp);



-- 4. Cập nhật số tiền cần thanh toán trong bảng hóa đơn thành 890 cho đơn hàng 01
-- 5. Cập nhật tất cả các mặt hàng thuộc loại hàng là 'Áo' với giá bán là 199K
SELECT * FROM MatHang;
SELECT * FROm ChiTietMatHang;
UPDATE ChiTietMatHang ctmh
SET ctmh.GiaBan=444
WHERE EXISTS (SELECT * 
				FROM MatHang mh 
				WHERE mh.MaMH =ctmh.MaMH
                AND 
                EXISTS (SELECT * FROM LoaiHang lh
						WHERE TenLH LIKE '%ÁO%'
                        AND lh.MaLH=mh.MaLH)
				);