CREATE DATABASE lesson18_exam CHAR SET utf8mb4;

CREATE TABLE Class(
	id INT,
    name VARCHAR(200) NOT NULL,
    teacher_name VARCHAR(50) NOT NULL,
    CONSTRAINT PK_Class PRIMARY KEY (id)
);

CREATE TABLE Student(
	id INT,
    name VARCHAR(200) NOT NULL,
    gender VARCHAR(50) NOT NULL,
    class_id INT,
    CONSTRAINT PK_Student PRIMARY KEY (id),
    CONSTRAINT FK_Stdent_Class FOREIGN KEY(class_id) REFERENCES Class(id)
);


CREATE TABLE Result(
	student_id INT,
    subject VARCHAR(200) NOT NULL,
    score FLOAT,
    CONSTRAINT PK_Result PRIMARY KEY (student_id),
    CONSTRAINT FK_Result_Student FOREIGN KEY(student_id) REFERENCES Student(id)
);

SELECT * FROM Class;
SELECT * FROM Student;
SELECT * FROM Result;		

-- 1. Primary key of Result table is student_id
-- 2 --

SELECT std.name, std.gender, class.teacher_name
FROM Student std
JOIN Class c
ON std.id = c.id;

-- 3 --
SELECT Class.teacher_name, count(*)
FROM Student std
JOIN Class c
ON std.id = c.id
WHERE c.name LIKE "%12C%";
-- 4 -- 
SELECT *
FROM Student std
JOIN Class c
ON std.id = c.id
JOIN Result
ON std.id = result.student_id
WHERE ( result.subject LIKE "%Math%" AND result.score >= 8 )
UNION
SELECT *
FROM student st
JOIN class
ON st.class_id = class.id
JOIN result
ON st.id = result.student_id
WHERE ( result.subject LIKE "%Literature%" AND result.score >= 8 );









