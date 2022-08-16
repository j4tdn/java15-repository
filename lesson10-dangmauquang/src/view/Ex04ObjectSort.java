package view;
/**
	Bài 4: Cho mảng số nguyên integer gồm 10 phần tử ngẫu nhiều từ 1-100
	Đối với Object Sort tạo mảng các Student: {id, name, age}. Sắp xếp tăng dần, giảm
	dần theo name, age
	Tạo package sorting => code các thuật toán sau, mỗi thuật toán một hàm.
	1. Sắp xếp Nổi bọt – Buble Sort
	2. Săp xếp Kiểu chọn – Selection Sort
	
	3. Sắp xếp Kiểu chèn – Insertion Sort
	4. Sắp xếp các đối tượng – Object Sort
	5. Shell Sort
	6. Merge Sort
	7. QuickSort (Tìm hiểu thuật toán phân hoạch để xử lý)
 */
import java.util.Arrays;

import bean.Student;
import model.DataModel;
import utils.CompareObjectHelper;
import utils.SortUtils;

public class Ex04ObjectSort {
	public static void main(String[] args) {
		Student[] students = DataModel.getStudent();
		
		// bubleSort
		// selectionSort
		insertionSort
		(students, new CompareObjectHelper() {
			// name, age asc
			@Override
			public int compare(Student s1, Student s2) {
				if(s1 == null) {
					return -1;
				}
				
				if(s2 == null) {
					return 1;
				}
				
				int age1 = s1.getAge();
				int age2 = s2.getAge();
				
				if(age1 != age2) {
					return age1 - age2;
				}
				
				String name1 = s1.getName();
				String name2 =  s2.getName();
				
				return name1.compareTo(name2);
			}
		});
		
		System.out.println(Arrays.toString(students));
	}
	
	private static void bubleSort(Student[] elements, CompareObjectHelper helper) {
		for (int round = 0; round < elements.length; round++) {
			for (int i = 0; i < elements.length - round - 1; i++) {
				if (helper.compare(elements[i], elements[i + 1]) >  0) {
					SortUtils.swap(elements, i, i + 1);
				}
			}
		}
	}
	

	private static void selectionSort(Student[] elements, CompareObjectHelper helper) {
		for(int round = elements.length - 1; round > 0; round --) {
			for(int i = 0; i < round; i++) {
				if(helper.compare(elements[i], elements[round]) >  0) {
					SortUtils.swap(elements, i, round);
				}
			}
		}
	}
	
	private static void insertionSort(Student[] elements, CompareObjectHelper helper) {
		for(int i = 0; i < elements.length; i++) {
			for(int j = 0; j < i; j++) {
				if(helper.compare(elements[i], elements[j]) >  0) {
					SortUtils.swap(elements, i, j);
				}
			}
		}
	}
	
}