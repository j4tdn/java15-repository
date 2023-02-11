package service;

import java.util.List;

import dao.HibernateStudentDao;
import dao.StudentDao;
import persistence.Student;

public class StudentServiceImp implements StudentService {
	private StudentDao studentDao ;
	public StudentServiceImp() {
		studentDao = new HibernateStudentDao();
	}
	
	
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return studentDao.getAll();
	}


	@Override
	public List<Student> sortGrade() {
		// TODO Auto-generated method stub
		return studentDao.sortGrade();
	}

}
