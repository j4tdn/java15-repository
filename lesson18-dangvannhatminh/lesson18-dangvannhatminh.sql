CREATE DATABASE java15_class_test CHAR SET utf8mb4;
USE java15_class_test;

CREATE TABLE class (
	id INT PRIMARY KEY,
    name VARCHAR(200) ,
    teacher VARCHAR(200)
    
);
CREATE TABLE student (
	id INT PRIMARY KEY,
    name VARCHAR(200) ,
    gender VARCHAR(200),
    class_id INT,
    CONSTRAINT FK_student_class FOREIGN KEY (class_id) REFERENCES class(id) 
);
CREATE TABLE result (
	student_id int ,
    subject VARCHAR(200),
    score double,
    CONSTRAINT PK_CTDH PRIMARY KEY (student_id,subject),
    CONSTRAINT FK_student_result FOREIGN KEY (student_id) REFERENCES student(id) 
);
INSERT INTO class(id,name,teacher) values(1,"12A","Ho Cong Tung ");
INSERT INTO class(id,name,teacher) values(2,"12B","Ho Cong Tap ");
INSERT INTO class(id,name,teacher) values(3,"12C","Ho Cong Teo ");

INSERT INTO student(id,name,gender,class_id) values (1, "NVA", "Female",2);
INSERT INTO student(id,name,gender,class_id) values (2, "NVB", "Female",1);
INSERT INTO student(id,name,gender,class_id) values (3, "NVC", "Male",2);
INSERT INTO student(id,name,gender,class_id) values (4, "NVD", "Female",1);
INSERT INTO student(id,name,gender,class_id) values (5, "NVE", "Male",3);
INSERT INTO student(id,name,gender,class_id) values (6, "NVF", "Female",3);

INSERT INTO result(student_id,subject, score) values (1,"Math",8);
INSERT INTO result(student_id,subject, score) values (1,"Literature",9);
INSERT INTO result(student_id,subject, score) values (2,"Literature",7);
INSERT INTO result(student_id,subject, score) values (3,"History",5);
INSERT INTO result(student_id,subject, score) values (4,"Math",8);
INSERT INTO result(student_id,subject, score) values (5,"Literature",6);
INSERT INTO result(student_id,subject, score) values (6,"History",9);



-- question 1
-- Primary key of result table is student_id and subject

-- question 2
SELECT st.name, st.gender, class.teacher
FROM student st
JOIN class
ON st.class_id = class.id;

-- question 3
SELECT class.teacher, count(*)
FROM student st
JOIN class
ON st.class_id = class.id
WHERE class.name LIKE "%12C%";
-- question 4
SELECT *
FROM student st
JOIN class
ON st.class_id = class.id
JOIN result
ON st.id = result.student_id
WHERE ( result.subject LIKE "%Math%" AND result.score >= 8 )
UNION
SELECT *
FROM student st
JOIN class
ON st.class_id = class.id
JOIN result
ON st.id = result.student_id
WHERE ( result.subject LIKE "%Literature%" AND result.score >= 8 );











-- temp
SELECT class.teacher, count(*)
FROM student st
JOIN class
ON st.class_id = class.id
GROUP BY class.id;

WITH ThongTinHocSinh AS (
SELECT student.*, avg(result.score) DiemTrungBinh
FROM student
JOIN result
ON student.id = result.student_id
GROUP BY student.id),
 ThongTinDiem AS (
SELECT class.id, class.name, max(DiemTrungBinh) DiemTrungBinh
FROM ThongTinHocSinh tths
JOIN class
ON tths.class_id = class.id
GROUP BY class.id
)
SELECT ttd.id, ttd.name , tths.name, tths.DiemTrungBinh
FROM ThongTinHocSinh tths
JOIN ThongTinDiem ttd
ON tths.DiemTrungBinh = ttd.DiemTrungBinh;

