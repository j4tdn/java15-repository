package service;

import java.util.List;

import dto.StudentDto;
import persistence.Student;

public interface StudentService {
	List<Student> getStudentById(int id);
	
	List<StudentDto> getGoodStudents();
}
