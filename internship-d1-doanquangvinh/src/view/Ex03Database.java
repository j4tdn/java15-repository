package view;

public class Ex03Database {
	public static void main(String[] args) {
     /*
      * 1. Relationship between Student and Class is n-1
      * 2. select sd.name , sd.gender , sd.class_id from Student sd;
      * 3. select cs.teacher , count(sd.gender) numberOfStudent   from Student sd join Class cs 
      *                          on sd.class_id = cs.id
      *                          where sd.gender = 'Male' and cs.name ='12A' ; 
      * 4. select sd.name , rs.score from student sd join result rs on sd.id = rs.student_id
      *                             join class cs on sd.class_id  = cs.id
      *                             where cs.name = '12B';
      */
	}
}
