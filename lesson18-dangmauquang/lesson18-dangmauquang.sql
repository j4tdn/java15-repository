-- 1. Primary key of Result table is student_id and subject
-- 2.
SELECT Student.name, Student.gender, Class.teacher
FROM Student
JOIN Class ON Student.class_id = Class.id;
-- 3.
SELECT Class.teacher, count(Student.id) SoLuongHocSinh12C
FROM Class
JOIN Student ON Student.class_id = Class.id
GROUP BY Class.id
HAVING Class.id = 3;

-- 4.
SELECT Class.name, count(Student.id) HocSinhGioiToanVan
FROM Class
JOIN Student ON Student.class_id = Class.id
JOIN Result ON Student.id = Result.student_id
WHERE Result.subject = 'Math' OR Result.subject = 'Literature' 
		AND Result.score >= 8
GROUP BY Class.id;

SELECT *, avg(Result.score)
FROM Student
JOIN Result ON Student.id = Result.student_id
GROUP BY Student.id;
HAVING avg(Result.score) > 8;
















