package ex04;

import java.util.Arrays;

import ex04.utils.CompareObjectHelper;
import ex04.utils.Data;
import ex04.utils.SortUtils;
import ex04.utils.Student;

public class BubbleSort {
	public static void main(String[] args) {
		Student[] student = Data.getStudent();
		bubblesort(student, new CompareObjectHelper() {
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
		
		bubblesort(student, new CompareObjectHelper() {
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

	

	private static void bubblesort(Student[] elements, CompareObjectHelper helper) {
		for (int round = 0; round < elements.length; round++) {
			for (int i = 0; i < elements.length - round - 1; i++) {
				if (helper.compare(elements[i], elements[i + 1]) > 0) {
					SortUtils.swap(elements, i, i + 1);
				}
			}
		}
	}

}
