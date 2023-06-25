-- Câu 3
SELECT *
  FROM phong
 WHERE SoKhachToiDa < 20;
 
-- Câu 4
SELECT *
  FROM dichvu
 WHERE DonViTinh LIKE '%Chai%' AND DonGia <= 20000
 UNION 
 SELECT *
  FROM dichvu
 WHERE DonViTinh LIKE '%Lon%' AND DonGia >= 30000;
 
-- Câu 5
SELECT *
  FROM phong
 WHERE MaPhong LIKE 'VIP%';
  