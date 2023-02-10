package dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.AliasToBeanResultTransformer;
import org.hibernate.type.IntegerType;
import org.hibernate.type.StringType;

import dto.StudentDto;
import persistence.Student;

public class HibernateStudentDao extends AbstractHibernateDao implements StudentDao{
	private static String sql1 = "SELECT * FROM Student WHERE id = ";
	private static String sql2 = ""
			+ "SELECT cl.name,"
			+ "		   Count(st.name) soluong"
			+ "			st.name"
			+ "FROM Student st"
			+ "JOIN Class cl"
			+ "ON st.class_id = cl.id"
			+ "JOIN Result rs"
			+ "ON st.id = rs.student_id"
			+ "WHERE rs.subject = '%Math%' rs.score > 8.0";
	@Override
	public List<Student> getStudentById(int id) {
		
		return getOpenSession().createNativeQuery(sql1 + id, Student.class).getResultList();
	}
	@SuppressWarnings("deprecation")
	@Override
	public List<StudentDto> getGoodStudents() {
	NativeQuery<?> query = getOpenSession().createNativeQuery(sql2);
	
	query.addScalar("className", StringType.INSTANCE)
		 .addScalar("numberOfStudent", IntegerType.INSTANCE)
		 .addScalar("studentName", StringType.INSTANCE)
		 .setResultTransformer(new AliasToBeanResultTransformer(StudentDto.class));
	return safeList(query);
	}

}
