package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.hibernate.type.DoubleType;
import org.hibernate.type.IntegerType;

import persistence.Student;

public class HibernateStudentDao extends AbstractHibernateDao implements StudentDao {

	public List<Student> getAll() {
		Session session = openSession();
		Query<Student> query = session.createQuery("SELECT sd FROM Student sd WHERE sd.classId =: num ", Student.class);
		query.setParameter("num", 1, IntegerType.INSTANCE);
		List<Student> result = query.getResultList();
		return result;
	}

	@Override
	public List<Student> sortGrade() {
		Session session = openSession();
		Query<Student> query = session.createQuery(
				"SELECT sd from Student sd JOIN Result rs ON sd.id = rs.student_id WHERE rs.score >= :grade  ",
				Student.class);
		query.setParameter("grade", 8.2, DoubleType.INSTANCE);
		List<Student> result = query.getResultList();
		return result;
	}

}
