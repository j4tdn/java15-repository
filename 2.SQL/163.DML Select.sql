-- theory --
use shopping_recreatev2;
select * from mathang;
select * from mathang , loaihang ;
-- cross join
-- A 1 2
-- B 3 4
-- result : 13 14 23 24
select lh.* from mathang mh , loaihang lh 
where mh.MaLH = lh.MaLH;
-- inner join
select * from chitietmathang;
select * , GiaBan*0.9 as GiaKhuyenMai from chitietmathang;

-- case when --
select MaMH , GiaBan , SoLuong,
    /*  case SoLuong < 50
        when true then 'Bán nhanh'
        else 'Bán chậm'
        end TinhTrang */ 
 case 
 when SoLuong < 50 then 'Bán Nhanh'
 else 'Bán Chậm'
 end TinhTrang
 from chitietmathang; 
 -- group by--
 select * from mathang order by MaLH ASC;

  select * from mathang 
  group by MaLH -- gom nhóm các mặt hàng theo mã loại hàng --> các mặt hàng chung mã loại hàng --> đưa về 1 nhóm --> 1 hàng
  -- 1 hàng Map<MaLH,List<mathang>>
  -- nên in ra cái thuộc tính gom nhóm và các hàm như count , sum , avg , max , min , ...
  -- nếu in ra các thuộc tính không gom nhóm --> in ra phần tử đầu tiên trong list map.get(tt).get(0);
  order by MaLH ASC;
-- in ra các loại hàng có tổng số lượng > 300
select lh.* ,group_concat(distinct mh.TenMH) ,  sum(ctmh.SoLuong) TongSoLuong from chitietmathang ctmh , loaihang lh , mathang mh  WHERE lh.MaLH = mh.MaLH and mh.MaMH = ctmh.MaMH group by lh.MaLH
having TongSoLuong > 200;
-- select MaKH from khachhang where MaKH = 2 union select MaKH from donhang
