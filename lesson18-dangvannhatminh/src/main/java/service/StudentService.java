package service;

import java.util.List;

import dto.ResultStudentClassDto;
import persistence.Student;

public interface StudentService {
	List<Student> getAllStudentByClassId(int class_id);
	List<Student> getStudentsByAvgScore(double avgScore);
	List<ResultStudentClassDto> statisticAvgScoreStudentPerClass();
	
}
