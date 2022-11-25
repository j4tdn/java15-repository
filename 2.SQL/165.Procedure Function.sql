-- procedure : method return with void or no return
-- funcion : method with return 

-- when we will create function or procedure ?
-- feature need to call chain of operations 
-- can not compile to on sql statement

-- reuse in another place

-- function : this function will be called
-- and returned in another function/procedure

-- procedure : insert/delete/update/select



-- 1. Viết phương thức liệt kê các mặt hàng
delimiter $$
create procedure P_Get_Items()
begin
    select * from mathang;
 
end $$
delimiter ;
-- delimiter dùng để ngăn cách compile
call P_Get_Items();
-- 2. Viết phương thức liệt kê các mặt hàng theo loại hàng
delimiter $$
create procedure P_GET_ITEMS_BY_ITEMS_GROUP(p_itemGroupId int)
begin
   select * from mathang 
   where MaLH = p_itemGroupId ;
end $$ 
delimiter ;

call P_GET_ITEMS_BY_ITEMS_GROUP(3);
-- 3. Viết phương thức thêm N dòng dữ liệu cho bảng loại hàng
-- 1 A 2 B 3 C
-- N = 5 ==> 4 LH 4 --> 8 LH8
delimiter $$
create procedure P_INSERT_N_ROWS_INTO_ITEMS_GROUP(N_ROWS int)
begin
-- b1 : tim ma loai hang lon nhat
 declare MAX_IG_ID int default (select max(MaLH) from loaihang);
 declare RUNNING INT DEFAULT 1;
 while RUNNING <= N_ROWS do
 -- do something
 set MAX_IG_ID = MAX_IG_ID + 1;
 insert into loaihang(MaLH,TenLH)
 values(MAX_IG_ID,concat('Loai Hang', MAX_IG_ID));
 set RUNNING = RUNNING + 1;
 end while;
 end $$
 delimiter ;
 call P_INSERT_N_ROWS_INTO_ITEMS_GROUP(2);
 select * from loaihang;
-- 4. Viết phương thức liệt kê các phần tử chẵn nhỏ hơn N
delimiter $$
create function P_SELECT_EVEN_ELEMENTS(N INT)
begin
declare RESULT TEXT default '';
loop_label : loop
 if N <= 0 then
 leave loop_label;
 end if;
 
 if N mod 2 = 0 then 
 set RESULT = concat(result,N,' ');
 set N = N-2;
 else 
 set N = N-1;
 end if;
end loop;
select RESULT;
end $$
delimiter ;
call P_SELECT_EVEN_ELEMENTS(15);
-- create function
-- create view