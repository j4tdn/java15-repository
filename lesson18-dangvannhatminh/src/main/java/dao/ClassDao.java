package dao;

import java.util.List;

import dto.StudentOfClassDto;

public interface ClassDao {
	List<StudentOfClassDto> statisticStudentPerClass();
}
