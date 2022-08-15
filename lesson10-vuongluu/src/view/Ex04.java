package view;

import java.util.Arrays;

import bean.Student;
import model.DataModel;
import utils.CompareObjectHelper;
import utils.SortUtils;

public class Ex04 {
	public static void main(String[] args) {
		Student[] students = DataModel.getStudents();
		sort(students, (s1,s2)->{
			if(s1.getAge()==s2.getAge()) {
				return s1.getName().compareTo(s2.getName());
			}
			return s2.getAge()-s1.getAge();
		});
		System.out.println(Arrays.toString(students));
	}
	private static void sort(Student[] source, CompareObjectHelper helper) {
		for (int i = 0; i < source.length; i++) {
			for (int j = 0; j < source.length - i - 1; j++) {
				if (helper.compare(source[j],source[j+1]) > 0) {
					SortUtils.swap(source, j, j + 1);
				}
			}
		}
	}
}
