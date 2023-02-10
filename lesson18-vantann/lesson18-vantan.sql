
CREATE DATABASE student_manage;
use student_manage;
create table Student (
id int primary key,
name varchar(255),
gender varchar(25),
class_id int,
 CONSTRAINT FK_ST_CL FOREIGN KEY (class_id) REFERENCES Class(id)
);
create table Class(
id int primary key,
name varchar(255),
teacher varchar(255)

);
create table Result(
	student_id int primary key,
    subject varchar(255),
    score double,
    CONSTRAINT FK_RS_ST FOREIGN KEY (student_id) REFERENCES Student(id)
);
drop table result;
INSERT INTO Class(id, name, teacher)
VALUES(1, '12A', 'Ho Cong Trung'),
		(2, '12B', 'Dang Tu Anh'),
        (3, '12C', 'Nguyen Van Tam');
INSERT INTO Student(id, name, gender, class_id)
VALUES(1, 'Dinh Nhu Ngoc', 'female', 2),
		(2, 'Nguyen Thanh Hung', 'Male', 1),
        (3, 'Tran Mai Hoa', 'female', 2);
INSERT INTO Result(student_id, subject, score)
VALUES(1, 'MATH', 8),
	  (2, 'Literature', 7),
      (3, 'History', 9.5);
Select * from result;
-- 1. primary key of Result table is student_id and subject

-- 2
SELECT st.name,
	   st.gender,
       cl.teacher
FROM Student st
JOIN Class cl
ON st.class_id = cl.id;

-- 3
SELECT cl.teacher,
	   count(st.id)
FROM Student st
JOIN Class cl
ON st.class_id = cl.id
WHERE cl.name = '%12C%'
GROUP BY st.id;
-- 4
SELECT st.name,
	   st.gender,
       cl.teacher
FROM Student st
JOIN Class cl
ON st.class_id = cl.id;

