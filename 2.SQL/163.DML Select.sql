-- D. SELECT - SLIDE 25-44
-- 1. Toàn bộ thông tin các loại hàng
SELECT * FROM LoaiHang;
--     -- Mặt hàng thuộc loại hàng là 'Thắt lưng'
SELECT mh.*
  FROM MatHang mh, LoaiHang lh 
 WHERE mh.MaLH=lh.MaLH
   AND lh.TenLH LIKE '%thắt lưng%';
--     -- Top 5 mặt hàng có giá bán cao nhất
SELECT *
  FROM MatHang mh
  JOIN ChiTietMatHang ctmh
 ORDER BY ctmh.GiaBan DESC
 LIMIT 5;
 -- y/m/d or y-m-d => DATE
 -- str_to_date(value,format) -> varchar --> date
 -- date_format(value, format) -> date -> varchar
 -- cast(datetime AS DATE) --> datetime -> date
-- 2. Đơn hàng
--     -- Được bán trong ngày 28/11/2019
SELECT * 
  FROM DonHang
  WHERE cast(ThoiGianDatHang AS DATE) ='2020-12-17';
 -- WHERE date(ThoiGianDatHang) = str_to_date('17/12/2020','%d/%m/%y');
  
--     -- Được bán từ ngày 28/11/2019 đến ngày 02/12/2019
SELECT *
  FROM DonHang 
  WHERE date(ThoiGianDatHang) BETWEEN '2019-11-28' AND '2022-12-11';
--     -- Được bán trong tháng 11/2019
SELECT * 
  FROM DonHang
 WHERE month(ThoiGianDatHang) =11 
 AND year(ThoiGianDatHang)=2019;
--     -- Được giao hàng tại Hòa Khánh
SELECT *
FROM DonHang
WHERE DiaChiGiaoHang LIKE '%Hòa Khánh%';
-- 3. Giá của toàn bộ các mặt hàng sau khi được khuyến mãi 20%, làm tròn 2 chữ số thập phân
SELECT *, ROUND(GiaBan * 0.8,2) GiaKhuyenMai,
		CAST(GiaBan*0.8 AS DECIMAL(6,2)) GiaKhuyenMai
FROM ChiTietMatHang;
-- 4. Giảm giá 20% tất cả các mặt hàng trong ngày 25/11/2019
SELECT *, ROUND(GiaBan*0.8,2) GiaKhuyenMai
 FROM ChiTietMatHang
 WHERE curdate()= '2019-11-25';
 
-- 5. Liệt kê tất cả các màu sắc của sản phẩm có bán trong cửa hàng.
SELECT DISTINCT MauSac
 FROM MatHang;
-- 7. Liệt kê tất cả các mặt hàng (MaMH, TenMH, ThoiGianDatHang) được bán trong ngày 23/11/2019

-- 8. Liệt kê các mặt hàng có giá bán từ 100 - 300
SELECT mh.*
FROM MatHang mh
JOIN ChiTietMatHang ctmh
WHERE ctmh.GiaBan BETWEEN 100 AND 300;  -- []
-- 9. Liệt kê tất cả các mặt hàng thuộc loại hàng là 'Mũ' và 'Thắt lưng'
SELECT mh.*
FROM MatHang mh
JOIN LoaiHang lh
  ON mh.MaLH=lh.MaLH
WHERE TenLH LIKE '%Mũ%' OR TenLH LIKE '%Thăt lưng%';
-- 10. Liệt kê các đơn hàng được đặt trong ngày (28/11/2019, 14/12/2019)
SELECT *
 FROM DonHang
 WHERE date(ThoiGianDatHang) IN ('2019-11-18','2019,12,14');
-- ==============================================================
-- 11. Sắp xếp các mặt hàng với giá bán tăng dần
SELECT * 
  FROM ChiTietMatHang
ORDER BY GiaBan ASC;
-- 12. Sắp xếp các mặt hàng với giá mua giảm dần
-- 13. Sắp xếp các mặt hàng với giá bán tăng dần, giá mua giảm dần
-- 14. Đếm số lượng các mặt hàng trong hệ thống
SELECT COUNT(*)
  FROM MatHang;
SELECT SUM(SoLuong) SoLuongMatHang 
  FROM ChiTietMatHang;
-- 15. Số lượng 'áo sơ mi nam' được bán trong ngày 23/11/2019
SELECT mh.TenMH,
  SUM(ctdh.SoLuong) SoLuongBan
  FROM DonHang dh
  JOIN ChiTietDonHang ctdh
    ON dh.MaDH= ctdh.MaDH
  JOIN MatHang mh
    ON mh.MaMH=ctdh.MaDH
WHERE mh.TenMH LIKE '%áo sơ mi nam%';
-- 16. Đếm số lượng các mặt hàng theo từng loại hàng
--     MaLoai  TenLoai SoLuong
-- 	1       Giày    20
-- 	2       Áo      28

-- 17. Tìm mặt hàng có giá bán cao nhất trong loại hàng 'Giày'
SELECT lh.TenLh,
	MAX(ctmh.GiaBan)
    FROM LoaiHang lh
    JOIN MatHang mh
      ON lh.MaLH=mh.MaLH
	JOIN ChiTietMatHang ctmh
      ON ctmh.MaMH = mh.MaMH
 WHERE LH.TenLH LIKE '%GIÀY%';

	
-- 18. Tìm mặt hàng có giá bán cao nhất của mỗi loại hàng
WITH ThongTinMatHang AS(
	SELECT mh.*,
			lh.TenLH,
            ctmh.GiaBan
	  FROM LoaiHang lh
      JOIN MatHang mh
        ON mh.MaLH=lh.MaLH
	  JOIN ChiTietMatHang ctmh
        ON ctmh.MaMH = mh.MaMH
),
ThongTinGiaBan AS(
	SELECT MaLH,
           max(GiaBan) GiaBanCaoNhat
	  FROM ThongTinMatHang
      GROUP BY MaLH
)
SELECT * 
  FROM ThongTinMatHang mh
  JOIN ThongTinGiaBan gb
    ON mh.MaLH = gb.MaLH
   AND mh.GiaBan = gb.GiaBanCaoNhat
GROUP BY mh.GiaBan;
  


-- 19. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống >> 16
-- 20. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống
--     Điều kiện tổng số lượng > 20 mặt hàng >> HAVING
-- ==============================================================
-- 21. Hiển thị mặt hàng có số lượng nhiều nhất trong mỗi loại hàng

-- 22. Hiển thị giá bán trung bình của mỗi loại hàng
-- 23. In ra 3 loại hàng có số lượng hàng còn lại nhiều nhất ở thời điểm hiện tại
-- 24. Liệt kê những mặt hàng có MaLoai = 2 và thuộc đơn hàng 100100
-- 25. Tìm những mặt hàng có Mã Loại = 2 và đã được bán trong ngày 28/11
-- 26. Liệt kê những mặt hàng là 'Mũ' không bán được trong ngày 14/02/2019
-- 27. Cập nhật giá bán của tất cả các mặt hàng thuộc loại hàng 'Áo' thành 199
-- 28. Backup data. Tạo table LoaiHang_SaoLuu(MaLoai, TenLoai)
--     Sao chép dữ liệu từ bảng LoaiHang sang LoaiHang_SaoLuu

-- 30. Liệt kê 2 sản phẩm (có số lượng tồn kho nhiều nhất) của loại hàng 'Áo' và 'Quần'
-- -- B1: Tìm số lượng hàng còn lại của mỗi mặt hàng thuộc loại hàng 'Áo', 'Quần'
-- -- B2: ORDER BY SoLuongTon DESC
-- -- B3: LIMIT 2

-- 31. Tính tổng tiền cho đơn hàng 02
--     Với tổng tiền được tính bằng tổng các sản phẩm và số lượng của sản phẩm tương ứng
-- 32. Xuất thông tin hóa đơn của đơn hàng 02 với thông tin như sau.
-- 	SoDH ChiTietDonHang           TongTien
--         02   TenMH:GiaBan:SoLuong     100






-- THEORY
SELECT * FROM MatHang;

SELECT * 
FROM MatHang, LoaiHang;
-- CROSS JOIN
--  A
-- 1 
-- 2
-- B 
-- 3
-- 4
-- A B
-- 1 3
-- 1 3
-- 2 3
-- 3 4 
SELECT lh.*
FROM MatHang mh, LoaiHang lh
WHERE mh.MaLH = lh.MaLH;
-- same INNER JOIN 
SELECT *, GiaBan*0.9 AS GiaKhuyenMai
FROM ChiTietMatHang;
-- case when --
-- SoLuong <50(Bán nhanh) || SoLuong >=50(Bán chậm)
SELECT MaMH,
	   GiaBan,
	   SoLuong,
       CASE SoLuong <50
		WHEN TRUE THEN 'Bán nhanh'
		ELSE 'Bán chậm'
	   END TinhTrang
       
  FROM ChiTietMatHang;
  SELECT MaMH,
	   GiaBan,
	   SoLuong,
       CASE 
		WHEN SOLUONG<50 THEN  'Bán nhanh'
		ELSE 'Bán chậm'
	     END TinhTrang
       
  FROM ChiTietMatHang;
-- GROUP BY --
SELECT * 
  FROM MatHang 
ORDER BY MaLH ASC;
-- gom nhóm các mặt hàng theo mã loại hàng 
-- các mặt hàng chung ma loại hàng  --> đưa về 1 nhóm -> 1 hàng 
-- 1 hàng Map<MaLH, List<MatHang>> 
-- nên in ra thuộc tính gom nhóm và các hàm như count, sum , avg, max , min 
-- Nếu in ra các thuộc tính không phải gom nhóm --> in ra phần tử đầu tiên trong list
SELECT * 
  FROM MatHang 
GROUP BY MaLH
ORDER BY MaLH ASC;
-- in ra các loại hàng có tổng số lượng >100
SELECT lh.*,
	GROUP_CONCAT(DISTINCT mh.TenMH) DanhSachMatHang,
    sum(ctmh.soluong) TongSoLuong
  FROM LoaiHang lh,mathang mh, chitietmathang ctmh
  WHERE lh.MaLH=mh.MALH
  AND mh.MaMH = ctmh.MaMH
  GROUP BY lh.malh
  ;




