package dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.internal.build.AllowSysOut;
import org.hibernate.query.NativeQuery;
import org.hibernate.type.IntegerType;

import persistence.Student;

public class HibernateStudentDao extends AbstractHibernateDao implements StudentDao {
	private String Q_GET_ALL = "SELECT * FROM STUDENT";
	private static final String GET_STUDENTS_BY_CLASS_ID = "" 
														+ "SELECT *\n" + "  FROM student\n"
														+ " WHERE student.class_id = :classId\n";

	public List<Student> getStudentByClassId(int classId) {

		System.out.println(GET_STUDENTS_BY_CLASS_ID);
		return openSession().createNativeQuery(GET_STUDENTS_BY_CLASS_ID, Student.class)
				.setParameter("classId", classId, IntegerType.INSTANCE).getResultList();
	}

	public List<Student> getAll() {
		Session session = openSession();
		NativeQuery<Student> query = null;
		Transaction transaction = session.beginTransaction();
		try {
			query = session.createNativeQuery(Q_GET_ALL, Student.class);
			// transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		}
		return query.getResultList();

	}

}
