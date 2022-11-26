CREATE DATABASE intern_test CHAR SET utf8mb4;
USE intern_test;
-- Answer 1
Relationship between Student and Result is n-1
-- Answer 2
SELECT st.name,
        st.gender,
        cl.name
FROM Student st
JOIN Class cl
ON st.Class_id = cl.id;
-- Answer 3
SELECT cl.teacher,
        COUNT(*)
FROM Student st
JOIN Class cl
ON st.Class_id = cl.id
WHERE cl.name LIKE '%12B%'
AND st.gender LIKE '%Male%';
-- Answer 4
SELECT st.name,
        rs.score
FROM Student st
JOIN Result rs
ON st.id = rs.student_id
JOIN class cl 
ON cl.id = st.class_id
WHERE cl.id = 2
AND rs.Subject LIKE '%History%'
ORDER BY rs.score DESC;

