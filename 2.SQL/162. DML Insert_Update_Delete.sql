-- INSERT 
SELECT * FROM MatHang;
SELECT * FROM LoaiHang;

INSERT INTO LoaiHang(MaLH,TenLH)
VALUES(1, 'Loại hàng 01'),
       (2,'Loại hàng 02');
/*INSERT INTO MatHang(MaMH, TenMH,MauSac,MaLH)
VALUES(101,'Mặt Hàng 101','Xanh',1),
	 (102,'Mặt Hàng 102','Xanh',1),
	 (103,'Mặt Hàng 103','Vàng',2),
     (104,'Mặt Hàng 104','Đỏ',2);*/
INSERT INTO MatHang(MaMH, TenMH,MauSac,MaLH)
VALUES(105,'Mặt Hàng 105','Xanh',3);

 SET FOREIGN_KEY_CHECKS = 0;
 SET FOREIGN_KEY_CHECKS = 1;
 -- DELETE --
 DELETE FROM MatHang WHERE MaMH = 102;
 DELETE FROM LoaiHang WHERE MALH = 2;
 
 ALTER TABLE MatHang 
 DROP FOREIGN KEY FK_MatHang_LoaiHang;
 ALTER TABLE MatHang
 ADD CONSTRAINT FK_MatHang_LoaiHang FOREIGN KEY(MaLH) REFERENCES LoaiHang(MaLH);
 
 INSERT INTO LoaiHang(MaLH,TenLH)
VALUES(3, 'Loại hàng 03');
SET FOREIGN_KEY_CHECKS =0;
SET FOREIGN_KEY_CHECKS =1;
INSERT INTO MatHang(MaMH,TenMH,MauSac,MaLH)
VALUES(106,'Mặt Hàng 06','Xanh',99);
-- remove items which have ig_id not exists in item 
DELETE FROM MatHang 
WHERE NOT EXISTS (SELECT MaLH FROM LoaiHang 
                  WHERE MatHang.MaLH = LoaiHang.MaLH);

 
     
	

