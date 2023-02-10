package dao;

import java.util.List;

import dto.StudentsOfClassDTO;

public interface  ClassDao {
	List<StudentsOfClassDTO> countStudentsPerClass();
}
