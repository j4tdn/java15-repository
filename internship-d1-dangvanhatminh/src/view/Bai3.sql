1) Relationship between Student and Class is n-1...
2) 
select s.name, s.gender, c.name
from Student s
JOIN Class c
ON s.class_id = c.id
3) 
select c.teacher, count(*) numberOfMale
from Student s
JOIN Class c
ON s.class_id = c.id
WHERE c.name = "12A" AND s.gender = "Male"
4)
select c.name, rs.score
FROM Class c
JOIN Student s 
ON c.id = s.class_id
JOIN Result rs
ON s.id = rs.student_id
WHERE c.name = "12B" 