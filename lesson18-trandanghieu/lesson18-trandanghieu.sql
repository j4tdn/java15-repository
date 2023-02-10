CREATE DATABASE students;
-- DROP DATABASE STUDENTS;
USE students;
CREATE TABLE student(
	id INT(10)  NOT NULL,
    name VARCHAR(20) NOT NULL,
    gender VARCHAR(10) NOT NULL,
    class_id INT(10) NOT NULL,
    CONSTRAINT student_pk PRIMARY KEY (id)
);

INSERT INTO `students`.`student` (`id`, `name`, `gender`, `class_id`) VALUES ('1', 'Dinh Thi Ngoc', 'Female', '2');
INSERT INTO `students`.`student` (`id`, `name`, `gender`, `class_id`) VALUES ('2', 'Nguyen Thanh Hung', 'Male', '1');
INSERT INTO `students`.`student` (`id`, `name`, `gender`, `class_id`) VALUES ('3', 'Tran Mai Hoa', 'Female', '2');
INSERT INTO `students`.`student` (`id`, `name`, `gender`, `class_id`) VALUES ('4', 'Doan Quang Vinh', 'Male', '1');
INSERT INTO `students`.`student` (`id`, `name`, `gender`, `class_id`) VALUES ('5', 'Cao Anh Dao', 'Female', '3');
INSERT INTO `students`.`student` (`id`, `name`, `gender`, `class_id`) VALUES ('6', 'Tran Kim Tuyen', 'Male', '3');
INSERT INTO `students`.`student` (`id`, `name`, `gender`, `class_id`) VALUES ('7', 'Hua Yen Le', 'Female', '3');
INSERT INTO `students`.`student` (`id`, `name`, `gender`, `class_id`) VALUES ('8', 'Huynh Ngoc Cam', 'Female', '3');
INSERT INTO `students`.`student` (`id`, `name`, `gender`, `class_id`) VALUES ('9', 'Nguyen Thu Thao', 'Female', '3');


CREATE TABLE result
(
	student_id INT(10) NOT NULL,
    subject    VARCHAR(20) NOT NULL,
    score      DOUBLE NOT NULL,
	CONSTRAINT result_pk PRIMARY KEY (student_id)
);
INSERT INTO `students`.`result` (`student_id`, `subject`, `score`) VALUES ('6', 'History', '8,2');
CREATE TABLE class
(
	id INT(10) NOT NULL,
    name VARCHAR(10) NOT NULL,
    teacher VARCHAR(20) NOT NULL,
    CONSTRAINT class_pk PRIMARY KEY (id)
);
INSERT INTO `students`.`class` (`id`, `name`, `teacher`) VALUES ('1', '12A', 'Ho Cong Thang');
INSERT INTO `students`.`class` (`id`, `name`, `teacher`) VALUES ('2', '12B', 'Dang Tu Anh');
INSERT INTO `students`.`class` (`id`, `name`, `teacher`) VALUES ('3', '12C', 'Nguyen Van Tam');

ALTER TABLE result 
ADD CONSTRAINT fk_result 
FOREIGN KEY (student_id) 
REFERENCES student(id);

ALTER TABLE student 
ADD CONSTRAINT fk_student
FOREIGN KEY (class_id) 
REFERENCES class(id);

-- RESULT
-- 1. Primary key of Result tale is student_id 
-- 2 
SELECT  st.name,
		st.gender,
        cl.teacher
FROM    student st
JOIN    class cl
ON      st.class_id = cl.id;
-- 3 
SELECT cl.teacher,
	   COUNT(cl.name) NumberOfStudents
FROM   student st
JOIN   class cl
ON     st.class_id = cl.id
WHERE  cl.name LIKE '%12C%';
-- 4 
WITH InfTeacherStudent AS (
	SELECT st.id, 
           cl.name
      FROM student st
	  JOIN class cl
        ON st.class_id = cl.id
),
InfResuiltStudent AS (
	SELECT st.idstudent
     FROM student st
     JOIN result re
       ON re.student_id = st.id 
    WHERE re.subject LIKE '%Math%' or re.subject LIKE '%Literature%' AND re.score >=8.0
)
SELECT  it.name,
		COUNT(ir.id) SumOfStudent
  FROM InfTeacherStudent it
  JOIN InfResuiltStudent ir
    ON it.id=ir.id


	
   


     


  






