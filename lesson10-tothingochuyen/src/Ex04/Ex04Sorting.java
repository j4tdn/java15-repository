package Ex04;

import java.util.Arrays;

/**
 * Cho mảng số nguyên integer gồm 10 phần tử ngẫu nhiều từ 1-100
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
 * */
public class Ex04Sorting {
	public static void main(String[] args) {
		int[] numbers = {13, 10, 30, 12, 1, 9, 3, 25, 5, 17};
		
		bubbleSort(numbers, (a, b) -> a > b);
		System.out.println("Bubble Sort: " +  Arrays.toString(numbers));
		
		selectionSort(numbers, (a, b) -> a > b);
		System.out.println("Selection Sort: " +  Arrays.toString(numbers));
		
		insertionSort(numbers, (a, b) -> a < b);
		System.out.println("Insertion Sort: " +  Arrays.toString(numbers));
		
		Student[] students = {
				new Student("111", "Jenny", 24),
				new Student("221", "Jonny", 25),
				new Student("112", "Jin", 23),
				new Student("225", "Anna", 21),
				new Student("101", "Tom", 21),
				new Student("215", "Jerry", 25) };
		
		objectSort(students, new CompareObjectHelper() {
			
			@Override
			public int compare(Student s1, Student s2) {
				if(s1 == null) {
					return -1;
				}
				
				if(s2 == null) {
					return 1;
				}
				
				int ageS1 = s1.getAge();
				int ageS2 = s2.getAge();
				if(ageS1 != ageS2) {
					return ageS2 - ageS1;
				}
				
				String nameS1 = s1.getName();
				String nameS2 = s2.getName();
				return nameS1.compareTo(nameS2);
			}
		});
		System.out.println(Arrays.toString(students));
		
		
	}
	
	private static void swap(int[] numbers, int pre, int next) {
		int temp = numbers[pre];
		numbers[pre]  = numbers[next];
		numbers[next] = temp;
	}
	
	private static void swap(Student[] students, int i, int j) {
		Student temp = students[i];
		students[i]  = students[j];
		students[j] = temp;
	}
	
	private static void bubbleSort (int[] numbers, CompareIntHelper helper) {
		for(int round = 0; round < numbers.length; round++) {
			for(int i = 0; i < numbers.length - round - 1; i++) {
				if(helper.compare(numbers[i], numbers[i+1])) {
					swap(numbers, i, i+1);
				}
			}
		}
	}
	
	private static void selectionSort(int[] numbers, CompareIntHelper helper) {
		for (int round = numbers.length - 1; round > 0; round--){
			for(int i = 0; i < round; i++) {
				if(helper.compare(numbers[i], numbers[round])) {
					swap(numbers, i , round);
				}
			}
		}
	}
	
	private static void insertionSort(int[] numbers, CompareIntHelper helper) {
		for(int i = 1; i < numbers.length; i++) {
			for(int j = 0; j < i; j++) {
				if(helper.compare(numbers[i], numbers[j])) {
					swap(numbers, i ,j);
				}
			}
		}
	}
	
	private static void objectSort(Student[] students, CompareObjectHelper helper) {
		for(int round = 0; round < students.length; round++) {
			for(int i = 0; i < students.length - round - 1; i++) {
				if(helper.compare(students[i], students[i+1]) > 0) {
					swap(students, i, i+1);
				}
			}
		}
	}
}
