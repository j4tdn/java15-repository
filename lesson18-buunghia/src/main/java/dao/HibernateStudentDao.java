package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.hibernate.type.IntegerType;
import org.hibernate.type.StringType;

import persistence.Student;

public class HibernateStudentDao extends AbstractHibernateDao implements StudentDao {
	private static String GET_ALL_STUDENT = ""
			+ "SELECT * \n"
			+ "FROM Student st\n"
			+ "JOIN Class cl \n"
			+ "ON st.ClassId = cl.ClassId\n"
			+ "ORDER BY cl.ClassId";
	private static String GET_ALL_STUDENT_WITH_SCORE = ""
			+ "SELECT st.*,rs.SubjectName,rs.Score\n"
			+ "FROM Student st\n"
			+ "JOIN Result rs\n"
			+ "ON rs.StudentId = st.StudentId\n"
			+ "WHERE rs.SubjectName = :Math OR rs.SubjectName =:Literature\n"
			+ "AND rs.Score > :score";
	public List<Student> getAll() {
		Session session = openSession();
		Query<Student> query = session.createNativeQuery(GET_ALL_STUDENT,Student.class);
		return query.getResultList();
	}

	@Override
	public List<Student> getStudentsWithScore() {
		Session session = openSession();
		Query<Student> query = session.createNativeQuery(GET_ALL_STUDENT_WITH_SCORE,Student.class);
		query.setParameter("Math","Math",StringType.INSTANCE);
		query.setParameter("Literature","Literature",StringType.INSTANCE);
		query.setParameter("score",8,IntegerType.INSTANCE);
		
		return query.getResultList();
	}

}
