package dao;

import java.util.List;

import dto.StudentDto;
import persistence.Student;

public interface StudentDao {
	List<Student> getAll();
	
	List<StudentDto> getSudentForSubject();
}
