package dao;

import java.util.List;

import org.hibernate.query.NativeQuery;
import org.hibernate.query.QueryProducer;

import com.mysql.cj.Session;
import com.mysql.cj.xdevapi.SessionFactory;

import persistence.Student;

public class HibernateStudentDao extends AbstractHibernateDao implements StudentDao{
	static SessionFactory sessionFactory;

	private static String GET_ALL_STUDENTS = ""
			+ "SELECT * FROM Student"
	        + "GROUP BY Student.class_id";
	   @Override
		public List<Student> getAll() {
			Session session = openSession();
			NativeQuery<Student> query = ((QueryProducer) session).createNativeQuery(GET_ALL_STUDENTS, Student.class);
			List<Student> result = query.getResultList();
		    return result;
		}
}
