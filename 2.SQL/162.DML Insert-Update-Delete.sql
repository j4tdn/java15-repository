 select * from mathang;
 select * from loaihang;

-- insert into loaihang(MaLH , TenLH)
-- values (1,'Loai hang 01') ,
-- (2, 'Loai hang 02');
-- insert into mathang(MaMH, TenMH ,Mausac ,MaLH)
 -- values (101,'Mat hang 01','Xanh',1),
  --     (102,'Mat hang 02','Do',2),
  --     (103,'Mat hang 03','Tim',1),
   --    (104,'Mat hang 04','Vang',1);
-- disable/ enable fk
set FOREIGN_KEY_CHECKS = 0;
-- checks for next commands
-- ignore check for existed data
set FOREIGN_KEY_CHECKS = 1;
-- TODO : delete elements from MatHang has FK not existed in LoaiHang 
 -- DELETE ---
 -- set auto commit = false;
 -- start transaction --> end transaction
 delete from mathang where MaMH = 101;
 select * from mathang;
 delete from loaihang where MaLH = 1;
 select * from loaihang;
 
 alter table mathang 
 drop foreign key  FK_MatHang_LoaiHang ;
 alter table mathang
 add constraint FK_MatHang_LoaiHang foreign key (MaLH) references loaihang(MaLH) 
 on delete restrict
 on update restrict;
 select * from mathang;
 select * from loaihang;
 set FOREIGN_KEY_CHECKS = 0;
 set FOREIGN_KEY_CHECKS = 1;
 insert into mathang
 values (106,'Mat hang 10','Xanh',99);
 -- remove items which have item group id not exists in item group table
 delete from mathang where ( select MaLH from loaihang);
 select * from loaihang;
 select * from mathang;
 select * from mathang where MaLH not in (select MaLH from loaihang);
 -- clause not in is limited ( 1000 parameters)
 delete from mathang where not exists ( select MaLH from loaihang where mathang.MaLH = loaihang.MaLH);
 select * from mathang;
 
 -- update
 select * from loaihang;
 update loaihang set TenLH = 'Item Group 2' where MaLH = '2';
 -- -------------------------------------------------------------------------- --
 -- Bai tap --
 -- B. DELETE
-- 1. Xóa nhân viên có tên 'Văn Hoàng' trong hệ thống
-- 2. Xóa bộ phận giao hàng trong hệ thống
-- 3. Xóa tất cả các mặt hàng thuộc loại hàng là mũ
-- 4. Xóa tất cả các mặt hàng trong hệ thống
-- 5. Vì hệ thống bị lỗi. Hủy tất cả các đơn hàng ngày 23/11/2019
  --  Thực hiện xóa các đơn hàng bị lỗi
-- run shopping refresh data.sql
-- ======================= REFRESH DATA =======================
-- C. UPDATE
-- 1. Cập nhật tên mới cho phòng ban có MaPB = 2 thành 'Bộ phận quản lý'
-- 2. Cập nhật ghi chú của đơn hàng 01 thành 'Giao hàng sau 10H sáng'
-- 3. Đơn hàng 01 đã được giao hàng thành công. Thực hiện cập nhật
  -- MaTT = 03, TrangThai = 'Đã giao', ThoiGian = Thời gian hiện tại
-- 4. Cập nhật số tiền cần thanh toán trong bảng hóa đơn thành 890 cho đơn hàng 01
-- 5. Cập nhật tất cả các mặt hàng thuộc loại hàng là 'Mũ' với giá bán là 199K