package service;

import java.util.List;

import persistence.Student;

public interface StudentService {
	List<Student> getAll();
	List<Student> sortGrade();
}
