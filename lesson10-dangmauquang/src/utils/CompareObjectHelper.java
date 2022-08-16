package utils;

import bean.Student;

@FunctionalInterface
public interface CompareObjectHelper {
	int compare(Student i1, Student i2);
}