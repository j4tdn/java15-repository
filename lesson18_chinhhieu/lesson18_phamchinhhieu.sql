create database lesson18_phamchinhhieu char set utf8mb4;
use lesson18_phamchinhhieu;

create table Class(
	Id int primary key,
    Name varchar(50) not null,
    Teacher varchar(50) not null
);
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
add constraint FK_Result_Student foreign key (Student_Id) references Student(Id);

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
 (3, 'History', 9.5),
 (4, 'Math', 6.8),
 (5, 'Literature', 4.9),
 (6, 'History', 8.2);
 
select cl.Name, st.Name, rs.score from result rs join student
 st on rs.Student_Id = st.Id
 join Class cl on 
 st.Class_Id = cl.Id
 where rs.Subject = "Math" or rs.Subject = "Literature";



with MonHoc AS (
	SELECT rs.*
     from Result rs where
     rs.score >= 8
),
ThongTinSinhVien AS (
	select rs.Student_Id, st.Name, st.Id, rs.score from result rs join student
 st on rs.Student_Id = st.Id
 join Class cl on 
 st.Class_Id = cl.Id
 where rs.Subject = "Math" or rs.Subject = "Literature"
)
select *
from MonHoc mh
join ThongTinSinhVien ttsv
on mh.Student_Id = ttsv.id;

        
