package service;

import java.util.List;

import dao.HibernateItemDao;
import dao.HibernateItemGroupDao;
import dao.HibernateStudentDao;
import dao.ItemDao;
import dao.ItemGroupDao;
import dao.StudentDao;
import dto.StudentDto;
import persistence.Item;
import persistence.ItemGroup;
import persistence.Student;

public class StudentServiceImpl implements StudentService {
private StudentDao studentDao;
	
	public StudentServiceImpl() {
		studentDao = new HibernateStudentDao();
	}

	@Override
	public List<Student> getAll() {
		return studentDao.getAll();
	}

	@Override
	public List<StudentDto> getSudentForSubject() {
		return studentDao.getSudentForSubject();
	}

	@Override
	public List<Student> getStudentForAvgPoint() {
		return studentDao.getStudentForAvgPoint();
	}

	@Override
	public List<Student> getStudentForMaxAvgPoint() {
		return studentDao.getStudentForMaxAvgPoint();

	}

	@Override
	public List<StudentDto> getStudenPerClass() {
		return studentDao.getStudenPerClass();
	}


}
