package dao;

import java.util.List;

import org.hibernate.query.NativeQuery;
import org.hibernate.transform.AliasToBeanResultTransformer;
import org.hibernate.type.IntegerType;
import org.hibernate.type.StringType;

import dto.StudentOfClassDto;

public class HibernateClassDao extends AbstractHibernateDao implements ClassDao {
	
	private static final String GET_STUDENT_PER_CLASS = ""
			+ "SELECT class.id " + StudentOfClassDto.SQL_CLASS_ID + ","
			+ "		  class.name " + StudentOfClassDto.SQL_CLASS_NAME + ","
			+ "		  count(student.id) " + StudentOfClassDto.SQL_CLASS_amount + "\n"
			+ "FROM student \n"
			+ "JOIN class\n"
			+ "ON student.class_id = class.id\n"
			+ "GROUP BY class.id";
	
	public List<StudentOfClassDto> statisticStudentPerClass() {
		NativeQuery<?> query = openSession().createNativeQuery(GET_STUDENT_PER_CLASS);
		query.addScalar(StudentOfClassDto.SQL_CLASS_ID, IntegerType.INSTANCE)
		 	 .addScalar(StudentOfClassDto.SQL_CLASS_NAME, StringType.INSTANCE)
		 	 .addScalar(StudentOfClassDto.SQL_CLASS_amount, IntegerType.INSTANCE)
		 	 .setResultTransformer(new AliasToBeanResultTransformer(StudentOfClassDto.class));
		return safeList(query);
	}
}
