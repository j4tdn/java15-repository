-- Which is relationship between tables Student and Result. 
  n - 1

-- List name, gender and class name of all students.
 SELECT Student.name, Student.gender, Class.name
 FROM Student 
 JOIN Class
 ON Student.id = Class.id

-- List teacher name and number of female student in class 12B.
SELECT Class.teacher, COUNT(*)
FROM Student
JOIN Class
ON Student.class_id = Class.id
WHERE Student.gender LIKE 'Female'
AND Class.name LIKE '12B'
-- List the names of the students and their History scores in class 12C in order by the score from high to low.
SELECT Student.name, Result.Score, 
FROM Student
JOIN Result
ON Student.id = Result.student_id
JOIN Class
ON Student.class_id = Class.id
WHERE Result.subject LIKE 'History'
AND Class.name LIKE '12C'
ORDER BY Result.Score DESC
