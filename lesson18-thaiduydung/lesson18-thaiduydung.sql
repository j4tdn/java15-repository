--  Câu1. Primary key of Result table is student_id 
-- Câu 2.
SELECT Student.name, Student.gender, Class.teacher
FROM Student
JOIN Class ON Student.class_id = Class.id;
-- Câu 3.
SELECT Class.teacher, count(Student.id) NumberOfAllStudents
FROM Class
JOIN Student ON Student.class_id = Class.id
WHERE Class.name LIKE '%12C%';
-- Câu 4.
SELECT Class.name, count(Student.id) NumberOfTheStudents
FROM Student
JOIN Class ON Class.class_id = Student.id
JOIN Result ON Student.id = Result.student_id
WHERE Result.score >= 8 AND Result.subject LIKE (
      SELECT rs1.subject
      FROM Result AS rs1
      WHERE rs1.subject LIKE 'Math' OR rs1.subject LIKE 'Literature');













