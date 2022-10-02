package student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import bean.Students;

public class Student {
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public static List<Students> getStudents(){
		return Arrays.asList(
				new Students(102130174, "Le Na", 7.8, "Nu")
				new Students(102130125, "Hoang Nam", 8.2, "Nam")
				new Students(102130176, "Le Na", 7.8, "Nu")
				new Students(102130174, "Le Na", 7.8, "Nu")
				new Students(102130174, "Le Na", 7.8, "Nu")
				new Students(102130174, "Le Na", 7.8, "Nu")
				)
	}
}
