package service;

import java.util.List;

import dto.StudentsOfClassDTO;

public interface ClassService {
	List<StudentsOfClassDTO> countStudentsPerClass();
}
