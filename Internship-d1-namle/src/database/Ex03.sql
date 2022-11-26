-- cau 1 Relationship between Student and Class is 1-N...
-- cau 2
select std.name, std.gender ,c.name
from student std join class c
on std.class_id = c.id;									

-- cau 3
select c.teacher, count(c.id)
from student std join class c
on std.id = c.id
where std.gender = 'Male' and c.name = '12A';	

-- cau 4 
select std.name, rst.score 
from Student std join Result rst
on std.id = rst.student_id
join Class c On 
std.class_id = c.id 
where c.name = '12B';	