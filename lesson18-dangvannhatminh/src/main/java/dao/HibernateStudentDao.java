package dao;

import java.util.List;

import org.hibernate.query.NativeQuery;
import org.hibernate.transform.AliasToBeanResultTransformer;
import org.hibernate.type.DoubleType;
import org.hibernate.type.IntegerType;
import org.hibernate.type.StringType;

import dto.ResultStudentClassDto;
import dto.StudentOfClassDto;
import persistence.Student;

public class HibernateStudentDao extends AbstractHibernateDao implements StudentDao {
	
	private static final String GET_STUDENTS_BY_CLASS_ID = ""
			+ "SELECT *\n"
			+ "  FROM student\n"
			+ " WHERE student.class_id = :classId\n";
	private static final String GET_STUDENTS_HAVE_AVG_SCORE_GTR_THAN = ""
			+ "WITH ThongTinHocSinh AS (\r\n"
			+ "SELECT student.*, avg(result.score) DiemTrungBinh\r\n"
			+ "FROM student\r\n"
			+ "JOIN result\r\n"
			+ "ON student.id = result.student_id\r\n"
			+ "GROUP BY student.id)\r\n"
			+ "SELECT ThongTinHocSinh.id, ThongTinHocSinh.name, ThongTinHocSinh.gender\r\n"
			+ "FROM ThongTinHocSinh\r\n"
			+ "WHERE DiemTrungBinh >= :avgScore";
	private static final String GET_STUDENTS_HAVE_MAX_AVG_SCORE_PER_CLASS = ""
			+ "WITH ThongTinHocSinh AS (\r\n"
			+ "SELECT student.*, avg(result.score) DiemTrungBinh\r\n"
			+ "FROM student\r\n"
			+ "JOIN result\r\n"
			+ "ON student.id = result.student_id\r\n"
			+ "GROUP BY student.id),\r\n"
			+ ""
			+ " ThongTinDiem AS (\r\n"
			+ "SELECT class.id, class.name, max(DiemTrungBinh) DiemTrungBinh\r\n"
			+ "FROM ThongTinHocSinh tths\r\n"
			+ "JOIN class\r\n"
			+ "ON tths.class_id = class.id\r\n"
			+ "GROUP BY class.id\r\n"
			+ ")\r\n"
			+ ""
			+ "SELECT ttd.id " + ResultStudentClassDto.SQL_CLASS_ID + ", "
			+ "		ttd.name  "+ ResultStudentClassDto.SQL_CLASS_NAME +" , "
			+ "     tths.name "+ ResultStudentClassDto.SQL_STUDENT_NAME+", "
			+ "     tths.DiemTrungBinh "+ ResultStudentClassDto.SQL_MAX_AVG_SCORE +" \r\n"
			+ "FROM ThongTinHocSinh tths\r\n"
			+ "JOIN ThongTinDiem ttd\r\n"
			+ "ON tths.DiemTrungBinh = ttd.DiemTrungBinh";
			
	public List<Student> getAllStudentByClassId(int classId) {
		System.out.println(GET_STUDENTS_BY_CLASS_ID);
		return openSession().createNativeQuery(GET_STUDENTS_BY_CLASS_ID,Student.class)
				            .setParameter("classId", classId,IntegerType.INSTANCE)
				            .getResultList();
	}
	public List<Student> getStudentsByAvgScore(double avgScore) {
		return openSession().createNativeQuery(GET_STUDENTS_HAVE_AVG_SCORE_GTR_THAN,Student.class)
	            .setParameter("avgScore", avgScore,DoubleType.INSTANCE)
	            .getResultList();
	}
	@SuppressWarnings("deprecation")
	public List<ResultStudentClassDto> statisticAvgScoreStudentPerClass() {
		NativeQuery<?> query = openSession().createNativeQuery(GET_STUDENTS_HAVE_MAX_AVG_SCORE_PER_CLASS);
		query.addScalar(ResultStudentClassDto.SQL_CLASS_ID, IntegerType.INSTANCE)
		 	 .addScalar(ResultStudentClassDto.SQL_CLASS_NAME, StringType.INSTANCE)
		 	 .addScalar(ResultStudentClassDto.SQL_STUDENT_NAME, StringType.INSTANCE)
		 	 .addScalar(ResultStudentClassDto.SQL_MAX_AVG_SCORE, DoubleType.INSTANCE)
		 	 .setResultTransformer(new AliasToBeanResultTransformer(ResultStudentClassDto.class));
		return safeList(query);
	}
}
