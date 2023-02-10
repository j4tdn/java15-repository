package service;

import java.util.List;

import dao.HibernateStudentDao;
import dao.StudentDao;
import persistence.Student;

public class StudentServiceImpl implements StudentService {
	private StudentDao studentDao;
	
	public StudentServiceImpl() {
		studentDao = new HibernateStudentDao();
	}
	public List<Student> getStudentByClassId(int class_id) {
		return studentDao.getStudentByClassId(class_id);
	}


	public List<Student> getAll() {
		return studentDao.getAll();
	}
	
}
