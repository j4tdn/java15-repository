package model;

import bean.Student;

public class ModelData {
  private ModelData() {
	  
  }
  public static Student [] getStudentInformation() {
	  return new Student[]{
	  new Student(103, "Nguyễn Văn Thịnh", 7),
	  new Student(108, "Nguyễn Văn Nam", 16),
	  new Student(105, "Nguyễn Thị Quỳnh", 8),
	  new Student(107, "Nguyễn Thị Lan", 24),
	  new Student(102, "Nguyễn Văn Bảo", 26),
	  new Student(101, "Nguyễn Văn Minh", 15),
	  };
  }
}
