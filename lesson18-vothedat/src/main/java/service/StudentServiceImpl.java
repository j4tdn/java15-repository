package service;

import java.util.List;

import dao.StudentDao;
import persistence.Student;

public class StudentServiceImpl implements StudentService{
	
	private StudentDao studentDao;
	
	public StudentServiceImpl() {
		studentDao = new HibernateStudentDao();
	}
	
	@Override
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return studentDao.getAll();
	}

}
