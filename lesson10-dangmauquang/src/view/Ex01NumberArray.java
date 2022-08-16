package view;
/**
 * Bài 1: Tạo mảng số nguyên ngẫu nhiên gồm n phần tử. Viết các phương thức:
 * Loại bỏ những phần tử trùng nhau VD: {1,2,3,4,3,1} Kết quả: {2,4} So sánh giá
 * trị trung bình của n/2 phần tử đầu tiên với n/2 phần tử cuối cùng Tìm số lớn
 * thứ 3 trong mảng. Lưu ý trường hợp các phần tử lớn nhất trùng nhau VD: {7 8 8
 * 8 6 2 5 1} Kết quả: 6
 */
import java.util.Arrays;

public class Ex01NumberArray {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 3, 1 };
		int[] removeDuplicateElement = removeDuplicateElement(numbers);
		
		System.out.println("RemoveDuplicated Array: " + Arrays.toString(removeDuplicateElement));		
		averageComparison(numbers);
		System.out.println("Third Max Element: " + getThirdElement(numbers));
	}

	public static int[] removeDuplicateElement(int[] numbers) {
		int[] result = new int[numbers.length];
		int running = 0;
		boolean[] resignedFlags = new boolean[numbers.length];
		for (int i = 0; i < numbers.length - 1; i++) {
			if (!resignedFlags[i]) {
				for (int j = i + 1; j < numbers.length; j++) {
					if (!resignedFlags[j] && numbers[i] == (numbers[j])) {
						resignedFlags[i] = true;
						resignedFlags[j] = true;
					}
				}
			}
		}

		for (int i = 0; i < resignedFlags.length; i++) {
			if (!resignedFlags[i]) {
				result[running++] = numbers[i];
			}
		}
		return Arrays.copyOfRange(result, 0, running);
	}

	private static void averageComparison(int[] numbers) {
		int firstHalf = 0;
		int endHalf = 0;
		for(int i = 0; i < numbers.length/2; i++) {
			firstHalf += numbers[i];
		}
		for(int i = numbers.length - 1; i >= numbers.length/2; i--) {
			endHalf += numbers[i];
		}
		if(firstHalf > endHalf) {
			System.out.println("Trung bình nửa đầu lớn hơn nửa cuối");
		}else {
			System.out.println("Trung bình nửa cuối lớn hơn nửa đầu");
		}

	}
	
	private static int getThirdElement(int[] numbers) {
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		int third = Integer.MIN_VALUE;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > first) {
				first = numbers[i];
			}
		}
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < first && numbers[i] > second) {
				second = numbers[i];
			}
		}
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < second && numbers[i] > third) {
				third = numbers[i];
			}
		}
		return third;
	}
}
