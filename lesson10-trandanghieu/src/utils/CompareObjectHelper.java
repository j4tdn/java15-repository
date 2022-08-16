package utils;

import bean.Student;

@FunctionalInterface
public interface CompareObjectHelper {
	int compare(Student s1, Student s2);
}
