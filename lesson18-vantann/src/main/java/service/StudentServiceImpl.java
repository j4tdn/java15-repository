package service;

import java.util.List;

import dao.HibernateStudentDao;
import dao.StudentDao;
import dto.StudentDto;
import persistence.Student;

public class StudentServiceImpl implements StudentService{
	private StudentDao studentDao;
	
	public StudentServiceImpl() {
		studentDao =  new HibernateStudentDao();
	}
	@Override
	public List<Student> getStudentById(int id) {
		return studentDao.getStudentById(id);
	}
	@Override
	public List<StudentDto> getGoodStudents() {
		return studentDao.getGoodStudents();
	}

}
