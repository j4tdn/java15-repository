package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;

import persistence.Student;

public class HibernateStudentDao extends AbstractHibernateDao implements StudentDao{

	private static String GET_ALL = ""
			+ "SELECT *\n"
			+ "FROM Class\n"
			+ "JOIN Student ON Class.id = Student.class_id\n"
			+ "ORDER BY Class.id";

	@Override
	public List<Student> getAll() {
		Session session = openSession();
		NativeQuery<Student> query = session.createNativeQuery(
				GET_ALL, Student.class);
		List<Student> result = query.getResultList();
		return result;
	}
}
	

