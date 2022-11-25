CREATE DATABASE internship_test CHAR SET utf8mb4;
USE internship_test;

CREATE TABLE Class(
	id_class INT PRIMARY KEY,
    name_class VARCHAR(200) NOT NULL,
    teacher VARCHAR(200) NOT NULL
);

SELECT * FROM Class;

CREATE TABLE Student(
	id_student INT,
    name_std VARCHAR(200) NOT NULL,
    gender VARCHAR(200) NOT NULL,
    id_class INT,
    CONSTRAINT PK_Student PRIMARY KEY (id_student),
    CONSTRAINT FK_Student_Class FOREIGN KEY (id_class) REFERENCES Class(id_class)
);
SELECT * FROM Student;


CREATE TABLE Result(
	id_student INT,
    subjectt VARCHAR(200) NOT NULL,
    score VARCHAR(200),
    CONSTRAINT PK_CTDH PRIMARY KEY (id_student) 
);
SELECT * FROM Result;

-- Answer 1

-- Answer 2
SELECT std.name_std, std.gender, c.name_class
  FROM Student std, Class c;
  
-- Answer 3
SELECT c.teacher, COUNT(SELECT gender * FROM Student, Class WHERE gender LIKE '%male%' AND WHERE id_class = 12A),
  FROM Student std, Class c;
  
-- Answer 4

SELECT * 
  FROM Class c
  JOIN Student std
    ON std.id_class = c.id_class




