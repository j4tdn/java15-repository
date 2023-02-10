package dao;

import java.util.List;

import org.hibernate.Session;

import dto.StudentDto;
import persistence.Student;

public class HibernateStudentDao extends AbstractHibernateDao implements StudentDao {
	private static String GET_ALL_STUDENTS = ""
			+ "select * from Student";
	private static String GET_STUDENTS_FOR_SUBJECT =""
			+ "with MonHoc AS (\r\n"
			+ "	SELECT rs.*\r\n"
			+ "     from Result rs where\r\n"
			+ "     rs.score >= 8\r\n"
			+ "),\r\n"
			+ "ThongTinSinhVien AS (\r\n"
			+ "	select rs.Student_Id, st.Name, st.Id, rs.score from result rs join student\r\n"
			+ " st on rs.Student_Id = st.Id\r\n"
			+ " join Class cl on \r\n"
			+ " st.Class_Id = cl.Id\r\n"
			+ " where rs.Subject = \"Math\" or rs.Subject = \"Literature\"\r\n"
			+ ")\r\n"
			+ "select *\r\n"
			+ "from MonHoc mh\r\n"
			+ "join ThongTinSinhVien ttsv\r\n"
			+ "on mh.Student_Id = ttsv.id;"; 
	@Override
	public List<Student> getAll() {
		Session sesson = openSession();
		return sesson.createNativeQuery(GET_ALL_STUDENTS, Student.class).getResultList();
	}
	@Override
	public List<StudentDto> getSudentForSubject() {
		Session sesson = openSession();
		return sesson.createNativeQuery(GET_STUDENTS_FOR_SUBJECT, StudentDto.class).getResultList();
	}

}
