package dao;

import java.util.List;

import org.hibernate.query.NativeQuery;
import org.hibernate.transform.AliasToBeanResultTransformer;
import org.hibernate.type.IntegerType;
import org.hibernate.type.StringType;

import dto.StudentsOfClassDTO;

public class HibernateClassDao extends AbstractHibernateDao implements ClassDao {
	
	private static final String GET_STUDENTS_PER_CLASS = ""
														+ "SELECT class.id " + StudentsOfClassDTO.SQL_CLASS_ID + ","
														+ "		  class.name " + StudentsOfClassDTO.SQL_CLASS_NAME + ","
														+ "		  count(student.id) " + StudentsOfClassDTO.SQL_CLASS_QUANTITY + "\n"
														+ "FROM student \n"
														+ "JOIN class\n"
														+ "ON student.class_id = class.id\n"
														+ "GROUP BY class.id";

	public List<StudentsOfClassDTO> countStudentsPerClass() {
		NativeQuery<?> query = openSession().createNativeQuery(GET_STUDENTS_PER_CLASS);
		query.addScalar(StudentsOfClassDTO.SQL_CLASS_ID, IntegerType.INSTANCE)
		 	 .addScalar(StudentsOfClassDTO.SQL_CLASS_NAME, StringType.INSTANCE)
		 	 .addScalar(StudentsOfClassDTO.SQL_CLASS_QUANTITY, IntegerType.INSTANCE)
		 	 .setResultTransformer(new AliasToBeanResultTransformer(StudentsOfClassDTO.class));
		return safeList(query);
	}

}
