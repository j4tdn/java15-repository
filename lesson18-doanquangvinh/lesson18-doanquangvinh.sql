CREATE DATABASE exam ;
USE exam ;
CREATE TABLE class (
	id INT NOT NULL , 
	name VARCHAR(50) NOT NULL ,
	teacher VARCHAR(50) NOT NULL , 
	CONSTRAINT pk_id PRIMARY KEY (id)
);
SELECT * FROM class ;
INSERT INTO class(id , NAME , teacher )
VALUES
	(1,'12A','Ho Cong Trung'),
	(2,'12B','Dang Tu Anh'),
	(3,'12C', 'Nguyen Van Tam');
	
CREATE TABLE student(
	id INT NOT NULL , 
	NAME VARCHAR(50) NOT NULL ,
	gender VARCHAR(50) NOT NULL , 
	class_id INT ,
	CONSTRAINT pk_id PRIMARY KEY (id) , 
	CONSTRAINT FOREIGN KEY (class_id) REFERENCES class(id)
)	;
	SELECT * FROM student ;
	INSERT INTO student(id,NAME,gender,class_id)
	VALUES 
	(1,'Dinh Thi Ngoc', 'Female',2),
	(2,'Nguyen Thanh Hung','Male',1),
	(3,'Tran Mai Hoa','Female',2),
	(4,'Doan Quang Vinh','Male',1),
	(5,'Cao Anh Dao' , 'Female',3),
	(6,'Tran Kim Tuyen','Male',3);
	
	CREATE TABLE result(
		student_id INT   NOT NULL , 
		SUBJECT VARCHAR(50)   NOT NULL ,
		score DOUBLE NOT NULL ,
		CONSTRAINT pk PRIMARY KEY (student_id , SUBJECT), 
		CONSTRAINT FOREIGN KEY (student_id) REFERENCES student(id)
	);
	SELECT * FROM result;
	SET FOREIGN_KEY_CHECKS=1;
	INSERT INTO result(student_id,SUBJECT,score)
	VALUES 
	(1,'Math',8),
	(2,'Literature',7),
	(3,'History',9.5),
	(4,'Math',6.8),
	(5,'Literature',4.9),
	(6,'History',8.2),
	(7,'Math',9.8),
	(8,'Literature',7.2),
	(9,'History',8.8);
	-- 1 . the primary key Of Result Table are student_id and subject
	-- 2. 
		SELECT sd.name , sd.gender , cs.teacher FROM student sd JOIN class cs ON sd.class_id = cs.id ;
	-- 3. 
		SELECT cs.teacher , COUNT(sd.name) numberOfStudents FROM student sd JOIN class cs ON sd.class_id = cs.id WHERE cs.name = '12C';
	-- 4. 
		SELECT sd.NAME StudentName , cs.name Grade  FROM student sd JOIN result rs ON sd.id = rs.student_id 
														JOIN  class cs ON sd.class_id = cs.id	WHERE (rs.SUBJECT = 'Literature' AND rs.score >= 8 )   OR  (rs.SUBJECT = 'Math' AND rs.score >= 8 );