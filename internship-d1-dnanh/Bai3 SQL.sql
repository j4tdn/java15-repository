-- 1:	Relationship between Student and Class n-1

-- 2:
SELECT Student.FullName, Student.Gender, Class.ClassName
	FROM Class 
    JOIN Student 
    ON Class.ID = Student.ID;
-- 3: 
SELECT Class.Teacher, SUM(Result.score) 
	FROM Class
    JOIN Student
    ON Class.ID = Student.ID
    JOIN Result 
    ON Student.ID = Result.Student_ID
    WHERE Class.Name_Class LIKE '12A' 
    AND Result.score = 1 ;
-- 4
SELECT Student.FullName, Result.Score 
	FROM Class
    JOIN Student
    ON Class.ID = Student.ID
    JOIN Result 
    ON Student.ID = Result.Student_ID
    WHERE Class.Name_Class LIKE '12B';
