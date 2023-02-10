package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;


import persistence.Student;

public class HibernateStudentDao extends AbstractHibernateDao implements StudentDao{
	public List<Student> getAll(Integer classId) {
		Session session = openSession();
		String sql = "SELECT * \n"
				   + "  FROM student std\n"
				   + "  JOIN class cls\n"
				   + "    ON std.class_id = cls.id\n"
				   + " WHERE cls.id = :classId";
		Query<Student> query = session.createNamedQuery(sql, Student.class);
		query.setParameter("classId", classId);
		return query.getResultList();
	}
}
