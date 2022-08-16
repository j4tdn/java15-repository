package ex04;

import java.util.Arrays;
import java.util.Comparator;

import ex04.utils.Data;
import ex04.utils.Student;

public class ArraysSort {
	public static void main(String[] args) {
		Student[] student = Data.getStudent();

		Arrays.sort(student, new Comparator<Student>() {

			@Override
			public int compare(Student i1, Student i2) {
				// ASC name,age
				String nameId1 = i1.getName();
				String nameId2 = i2.getName();

				if (nameId1 != nameId2) {
					return nameId1.compareTo(nameId2);
				}

				int ageId1 = i1.getAge();
				int ageId2 = i2.getAge();

				return ageId1 - ageId2;
			}
		});
		
		System.out.println("tang dan: "+Arrays.toString(student));
	
		Arrays.sort(student, new Comparator<Student>() {

			@Override
			public int compare(Student i1, Student i2) {
				// ASC name,age
				String nameId1 = i1.getName();
				String nameId2 = i2.getName();

				if (nameId1 != nameId2) {
					return nameId2.compareTo(nameId1);
				}

				int ageId1 = i1.getAge();
				int ageId2 = i2.getAge();

				return ageId2 - ageId1;
			}
		});
		
		System.out.println("giam dan: "+Arrays.toString(student));
	
	
	}
	
	public static Student[] getStudent() {
		return new Student[] { 
				new Student("1", "Anh", 35), 
				new Student("2", "Duy", 17),
				new Student("3", "Cuong", 29),
				new Student("4", "Bao", 55), 
				new Student("5", "Khanh", 16),
				new Student("6", "Hang", 48),
				new Student("7", "Huong", 70), 
			};

	}
	
}