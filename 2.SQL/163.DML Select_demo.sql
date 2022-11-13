-- theory --
SELECT * FROM mathang;
SELECT *FROM mathang ,loaihang;
SELECT lh.* FROM mathang mh ,loaihang lh WHERE nh.MaLH = lh.MaLH;
SELECT *, GiaBan*0.9 GiaKhuyenMai
FROM chitietmathang;
-- case when --
SELECT MaMH,
       GiaBan,
       SoLuong,
      
       CASE
        WHEN SoLuong  <50 THEN 'Ban nhanh'
       ELSE 'Ban cham'
       END TinhTrang
       FROM chitietmathang ;
      -- group by --
      -- các mặt hàng chung mã loại hàng sẽ đưa về chung một nhóm 
	 -- Nên in ra các thuộc tính  và các hàm như count ,sum,avg,max
     -- Nếu in ra các thuộc tính không pháir gom nhóm 
    -- --> ỉn ra các phần tử đầu tiên trong list
    
SELECT * 
FROM mathang 
GROUP BY MaLH  
ORDER BY MaLH ASC;
-- In ra các loại hàng có tổng số lượng lơn 100
SELECT lh.MaLH FROM mathang mh, loaihang lh, chitietmathang ctmh
WHERE lh.MaLH = mh.MaLH and ctmh.MaMH = mh.MaMH
-- GROUP BY lh.MaLH
-- having TongSoLuong >200;

	  
