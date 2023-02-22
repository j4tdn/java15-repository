create database lesson18_phamchinhhieu char set utf8mb4;
use lesson18_phamchinhhieu;

create table Class(
	Id int primary key,
    Name varchar(50) not null,
    Teacher varchar(50) not null
);
alter table Class rename column Name to Cl_Name;
create table Student(
	Id int,
    Name varchar(200) not null,
    Gender varchar(50) not null,
    Class_Id int,
    constraint PK_Student primary key(Id),
    constraint FK_Student_Class  foreign key (Id) references Class(Id)
);
ALTER TABLE Student ADD CONSTRAINT FK_Student_Class  foreign key (Class_Id) references Class(Id);
create table Result(
Student_Id INT,
Subject varchar(50),
score INT,
constraint PK_Result primary key (Student_Id)
);
ALTER TABLE Result
MODIFY COLUMN score float;
-- 8 
alter table Result
add constraint FK_ReStudent_Idsult_Student foreign key (Student_Id) references Student(Id);

ALTER TABLE Result DROP PRIMARY KEY;
ALTER TABLE Result ADD CONSTRAINT PK_Result PRIMARY KEY (Student_Id,Subject);
ALTER TABLE Result DROP CONSTRAINT FK_Result_Student;
alter table Result
add constraint FK_Result_Student foreign key (Student_Id) references Student(Id);

insert into Class(Id, Name, Teacher)
values (1, '12A', 'He Cong Trung'),
		(2, '12B', 'Dang Tu Anh'),
        (3, '12C', 'Nguyen Van Tam');
        
insert into Student(Id, Name, Gender, Class_Id)
values (1, 'Dinh Thi Ngoc', 'Female', 2),
		(2, 'Nguyen Thanh Hung', 'Male', 1),
        (3, 'Tran Mai Hoa', 'Female', 2),
		(4, 'Doan Quang Vinh', 'Male', 1),
        (5, 'Cao Anh Dao', 'Female', 3),
		(6, 'Tran Kim Tuyen', 'Female', 3);
        
insert into Result(Student_Id, Subject, score)
values (1, 'Math', 8),
 (2, 'Literature', 7),
 (3, 'Math', 9.5),
 (4, 'Math', 6.8),
 (5, 'Literature', 4.9),
 (6, 'History', 8.2);
 insert into Result(Student_Id, Subject, score)
values  (3, 'Math', 9.5);

 
select cl.Name, st.Name, rs.score from result rs join student
 st on rs.Student_Id = st.Id
 join Class cl on 
 st.Class_Id = cl.Id
 where rs.Subject = "Math" or rs.Subject = "Literature";


-- question 2
with ThongTinSinhVien AS (
	select st.Id,cl.Cl_Name, st.Name, rs.score from result rs join student
 st on rs.Student_Id = st.Id
 join Class cl on 
 st.Class_Id = cl.Id
 where (rs.Subject = "Math" or rs.Subject = "Literature") and rs.score >=8
  group by st.Id

)
select ttsv.Cl_Name, group_concat(concat(ttsv.Name)) Students, count(ttsv.Cl_Name) NumberOfStudent
from ThongTinSinhVien ttsv
group by ttsv.Cl_Name;

select * from result;
-- question 4
with DiemTrungBinh as(
select st.*, avg(rs.score) AvgPoint from result rs 
join student st
on  rs.Student_Id = st.Id
group by st.Id

)
select dtb.Id, dtb.Name, dtb.Gender
from DiemTrungBinh dtb
where AvgPoint >= 8;


-- question 5
with DiemTrungBinh as(
select st.*, avg(rs.score) AvgPoint from result rs 
join student st
on  rs.Student_Id = st.Id
group by st.Id

),
 DiemTrungBinhMax as
 (
select max(dtb.AvgPoint) DTBM
from DiemTrungBinh dtb
group by dtb.Class_Id
),
HocSinh as(
select dtb.Id, dtb.Name, dtb.Class_Id, dtb.Gender
from DiemTrungBinh dtb
)
select dtb.Id, dtb.Name, dtb.Gender from DiemTrungBinhMax dtbm
join DiemTrungBinh dtb 
on dtb.AvgPoint = dtbm.DTBM;

select * from Student;
-- question 3
select cl.Cl_Name TenLop, group_concat(st.Name) Ten, count(Class_Id) amount from Student st
join Class cl
on st.Class_Id = cl.Id
group by Class_Id;
