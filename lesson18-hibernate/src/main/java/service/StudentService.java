package service;

import java.util.List;

import dto.StudentDto;
import persistence.Student;

public interface StudentService {
	List<Student> getAll();
	List<StudentDto> getSudentForSubject();
	List<Student> getStudentForAvgPoint();
	List<Student> getStudentForMaxAvgPoint();
	List<StudentDto> getStudenPerClass();


}
