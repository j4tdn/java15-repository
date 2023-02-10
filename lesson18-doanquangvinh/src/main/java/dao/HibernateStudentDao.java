package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;

import persistence.Student;

public class HibernateStudentDao extends AbstractHibernateDao implements StudentDao {
	private static String GET_ALL_OF_STUDENTS = "SELECT SD.* FROM STUDENT SD JOIN CLASS CS ON SD.Class_id = CS.id GROUP BY CS.id"
			;
	
	
	public List<Student> getAll() {
		Session session = openSession();
		NativeQuery<T>
		// TODO Auto-generated method stub
		return null;
	}

}
