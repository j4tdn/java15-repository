create DATABASE learningmanegement;
use learningmanegement;
Create table Student(
id int  primary key,
name nvarchar(255) ,
gender nvarchar(255),
class_id int
);
Create table Result (
Student_id int ,
subject nvarchar(255),
score DOUBLE(40,2)
);
Create table Class(
 id int primary key,
name nvarchar(255),
teacher nvarchar(255)
);
INSERT INTO class (id,name,teacher) values(1,"12A","Ho Cong Trung"),(2,"12B","Dang Tu Anh"),(3,"12C","Nguyen Van Tam");
INSERT INTO student(id,name,gender,class_id) values(1,"Dinh Thi Ngoc","Female",2),(2,"Nguyen Thanh Hung","Male",1),(3,"Tran Mai Hoa","Female",2),(4,"Doan Quang Vinh","Male",1),(5,"Cao Anh Dao","Female",3),(6,"Tran Kim Tuyen","Male",3);
 INSERT INTO result(student_id,subject,score) values(1,"Math",8.0),(2,"Literature",7.0),(3,"History",9.5),(4,"Math",6.8),(5,"Literature",4.9),(6,"History",8.2);
alter table student add constraint fk_student_class FOREIGN KEY(class_id) REFERENCES class(id); 
alter table result add constraint fk_result_student FOREIGN KEY(student_id) REFERENCES student(id); 

SELECT st.name, st.gender,cl.teacher  FROM Student st JOIN Class cl ON cl.id = st.class_id;
SELECT cl.teacher, count(st.id) FROM Class cl JOIN Student st   ON cl.id = st.class_id WHERE cl.name like "12C";
SELECT cl.name, count(st.id) FROM Student st 
		JOIN Result Rs ON rs.student_id = st.id
        JOIN Class cl ON cl.id = st.class_id
        WHERE  rs.subject like "MATH" AND rs.subject ="Literature" AND rs.socre >8;
        