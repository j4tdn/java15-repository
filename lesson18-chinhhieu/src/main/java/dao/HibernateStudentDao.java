package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.FloatType;
import org.hibernate.type.IntegerType;
import org.hibernate.type.StringType;

import dto.StudentDto;
import persistence.Student;

public class HibernateStudentDao extends AbstractHibernateDao implements StudentDao {
	private static String GET_ALL_STUDENTS = ""
			+ "select * from Student";
	private static String GET_STUDENTS_FOR_SUBJECT =""
			+ "with ThongTinSinhVien AS (\n"
			+ "	select st.Id,cl.Cl_Name, st.Name, rs.score from result rs join student\n"
			+ " st on rs.Student_Id = st.Id\n"
			+ " join Class cl on \n"
			+ " st.Class_Id = cl.Id\n"
			+ " where (rs.Subject = \"Math\" or rs.Subject = \"Literature\") and rs.score >= :score\n"
			+ "  group by st.Id\n"
			+ "\n"
			+ ")\n"
			+ "select ttsv.Cl_Name " + StudentDto.PROP_CLASS_NAME+ " , "
			+ "group_concat(concat(ttsv.Name)) "
			+ " " + StudentDto.PROP_STUDENT_NAME + ", count(ttsv.Cl_Name)" +StudentDto.PROP_AMOUNT + "\n"
			+ "from ThongTinSinhVien ttsv\n"
			+ "group by ttsv.Cl_Name";
			
	private static String GET_STUDENTS_FOR_AVG_POINT = " "
			+ "with DiemTrungBinh as(\n"
			+ "select st.*, avg(rs.score) AvgPoint from result rs \n"
			+ "join student st\n"
			+ "on  rs.Student_Id = st.Id\n"
			+ "group by st.Id\n"
			+ ")\n"
			+ "select dtb.Id, dtb.Name, dtb.Gender\n"
			+ "from DiemTrungBinh dtb\n"
			+ "where AvgPoint >= :point";
	private static String GET_STUDENT_FOR_MAX_AVG_POINT = ""
			+ "with DiemTrungBinh as(\n"
			+ "select st.*, avg(rs.score) AvgPoint from result rs \n"
			+ "join student st\n"
			+ "on  rs.Student_Id = st.Id\n"
			+ "group by st.Id\n"
			+ "\n"
			+ "),\n"
			+ " DiemTrungBinhMax as\n"
			+ " (\n"
			+ "select max(dtb.AvgPoint) DTBM\n"
			+ "from DiemTrungBinh dtb\n"
			+ "group by dtb.Class_Id\n"
			+ "),\n"
			+ "HocSinh as(\n"
			+ "select dtb.Id, dtb.Name, dtb.Class_Id, dtb.Gender\n"
			+ "from DiemTrungBinh dtb\n"
			+ ")\n"
			+ "select dtb.Id, dtb.Name, dtb.Gender from DiemTrungBinhMax dtbm\n"
			+ "join DiemTrungBinh dtb \n"
			+ "on dtb.AvgPoint = dtbm.DTBM";
	private static String GET_AMOUT_STUDENT_PER_CLASS = ""
			+ "select cl.Cl_Name " + StudentDto.PROP_CLASS_NAME +","
			+ " group_concat(st.Name) " +StudentDto.PROP_STUDENT_NAME + ","
			+ " count(Class_Id) "+ StudentDto.PROP_AMOUNT + " from Student st\n"
			+ "join Class cl\n"
			+ "on st.Class_Id = cl.Id\n"
			+ "group by Class_Id;";
	public List<Student> getAll() {
		Session sesson = openSession();
		return sesson.createNativeQuery(GET_ALL_STUDENTS, Student.class).getResultList();
	}
	@SuppressWarnings("deprecation")
	public List<StudentDto> getSudentForSubject() {
		//Session sesson = openSession();
		//return sesson.createNativeQuery(GET_STUDENTS_FOR_SUBJECT, StudentDto.class).getResultList();
		NativeQuery<?> query = openSession().createNativeQuery(GET_STUDENTS_FOR_SUBJECT);
		query.addScalar(StudentDto.PROP_CLASS_NAME, StringType.INSTANCE)
			.addScalar(StudentDto.PROP_STUDENT_NAME, StringType.INSTANCE)
			.addScalar(StudentDto.PROP_AMOUNT, IntegerType.INSTANCE)
			.setParameter("score", 8f, FloatType.INSTANCE)
		.setResultTransformer(Transformers.aliasToBean(StudentDto.class));
		
		return safeList(query);

	}
	@SuppressWarnings("deprecation")
	public List<Student> getStudentForAvgPoint() {
		NativeQuery<?> query = openSession().createNativeQuery(GET_STUDENTS_FOR_AVG_POINT);
		query.setParameter("point",8f, FloatType.INSTANCE)
				.setResultTransformer(Transformers.aliasToBean(Student.class));
		return safeList(query);

	}
	public List<Student> getStudentForMaxAvgPoint() {
		Session sesson = openSession();
		return sesson.createNativeQuery(GET_STUDENT_FOR_MAX_AVG_POINT, Student.class).getResultList();
	}
	@SuppressWarnings("deprecation")
	public List<StudentDto> getStudenPerClass() {
		NativeQuery<?> query = openSession().createNativeQuery(GET_AMOUT_STUDENT_PER_CLASS);
		query.addScalar(StudentDto.PROP_CLASS_NAME, StringType.INSTANCE)
			.addScalar(StudentDto.PROP_STUDENT_NAME, StringType.INSTANCE)
			.addScalar(StudentDto.PROP_AMOUNT, IntegerType.INSTANCE)
		.setResultTransformer(Transformers.aliasToBean(StudentDto.class));
		
		return safeList(query);
	}

}
