package ex04;

import java.util.Arrays;

import ex04.utils.CompareObjectHelper;
import ex04.utils.Data;
import ex04.utils.SortUtils;
import ex04.utils.Student;

public class SelectionSort {
	public static void main(String[] args) {
		Student[] student = Data.getStudent();
		selectionSort(student, new CompareObjectHelper() {
			@Override
			public int compare(Student i1, Student i2) {
				// ASC name,age
				String storeId1 = i1.getName();
				String storeId2 = i2.getName();

				if (storeId1 != storeId2) {
					return storeId1.compareTo(storeId2);
				}

				int itemId1 = i1.getAge();
				int itemId2 = i2.getAge();

				return itemId1 - itemId2;

			}
		});
		System.out.println("tang dan: "+Arrays.toString(student));
	
		selectionSort(student, new CompareObjectHelper() {
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
	private static void selectionSort(Student[] origin,CompareObjectHelper helper) {
		for (int round = origin.length - 1; round > 0; round--) {
			for (int i = 0; i < round; i++) {
				if (helper.compare(origin[i], origin[round])>0) {
					SortUtils.swap(origin, i, round);
				}
			}
		}
	}
}
