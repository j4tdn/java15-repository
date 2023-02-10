package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;

import persistence.Student;

public class HibernateStudentDao extends AbstractHibernateDao implements StudentDao{

	private static String GET_ALL_STUDENTS = ""
			+ "SELECT *\n"
			+ "FROM Class\n"
			+ "JOIN Student ON Class.id = Student.class_id\n"
			+ "ORDER BY Class.id";
	
	private static String GET_STUDENT_HAVE_POINT = ""
			+ "SELECT *, avg(Result.score)\n"
			+ "FROM Student\n"
			+ "JOIN Result ON Student.id = Result.student_id\n"
			+ "GROUP BY Student.id;\n"
			+ "HAVING avg(Result.score) > 8.2";
	
	@Override
	public List<Student> getAllStudents() {
		Session session = openSession();
		NativeQuery<Student> query = session.createNativeQuery(
				GET_ALL_STUDENTS, Student.class);
		List<Student> result = query.getResultList();
		return result;
	}
	
	@Override
	public List<Student> get
}
