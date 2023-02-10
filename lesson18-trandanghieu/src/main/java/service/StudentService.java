package service;

import java.util.List;

import persistence.Student;

public interface StudentService {
	List<Student> getStudentByClassId(int class_id);
	List<Student> getAll();
	
}
