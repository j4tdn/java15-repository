package service;

import java.util.List;

import dao.ClassDao;
import dao.HibernateClassDao;
import dto.StudentsOfClassDTO;

public class ClassServiceImpl implements ClassService {
	private static ClassDao classDao;

	public ClassServiceImpl() {
		classDao = new HibernateClassDao();
	}
	public List<StudentsOfClassDTO> countStudentsPerClass(){
		return classDao.countStudentsPerClass();
	}
	

	
}
