-- Cau 1: student_id
-- Cau 2:
SELECT st.name, st.gender, cs.teacher
FROM Student AS st
JOIN Class AS cs
ON st.class_id = cs.id;
-- Cau 3:
SELECT cs.teacher, COUNT(st.id)
FROM Student AS st
JOIN Class AS cs
ON st.class_id = cs.id;
WHERE cs.name = '12C';
-- Cau 4:
SELECT cs.name, COUNT(st.id)
FROM Student AS st
JOIN Class AS cs
ON st.class_id = cs.id
JOIN Result AS rs
ON rs.student_id = st.id
WHERE rs.score >= 8 AND rs.subject LIKE (
      SELECT rs1.subject
      FROM Result AS rs1
      WHERE rs1.subject LIKE 'Math' OR rs1.subject LIKE 'Literature');

