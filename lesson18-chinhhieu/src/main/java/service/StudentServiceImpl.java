package service;

import java.util.List;

import dao.HibernateStudentDao;
import dao.StudentDao;
import dto.StudentDto;
import persistence.Student;

public class StudentServiceImpl implements StudentService {
	private StudentDao studentDao;
	
	public StudentServiceImpl() {
		studentDao = new HibernateStudentDao();
	}

	public List<Student> getAll() {
		return studentDao.getAll();
	}


	public List<StudentDto> getSudentForSubject() {
		return studentDao.getSudentForSubject();
	}


	public List<Student> getStudentForAvgPoint() {
		return studentDao.getStudentForAvgPoint();
	}


	public List<Student> getStudentForMaxAvgPoint() {
		return studentDao.getStudentForMaxAvgPoint();

	}

	public List<StudentDto> getStudenPerClass() {
		return studentDao.getStudenPerClass();

	
	}
}



