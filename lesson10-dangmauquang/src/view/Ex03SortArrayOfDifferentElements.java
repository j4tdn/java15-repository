package view;
/**
	Bài 3: Cho mảng string có n phần tử (2 < n < 100). Mảng cho phép chứa các phần tử là
	số âm, số dương, chuỗi “special” và các chuỗi kí tự khác. Viết chương trình sắp xếp
	mảng string.
	Biết rằng. Khi chạy chương trình mảng sẽ sắp xếp như sau
	Special => số âm => số dương => tăng dần các chuỗi còn lại trong mảng.
	Ngược lại khi sắp xếp giảm dần sẽ được kết quả sau
	Giảm dần các chuỗi trong mảng => số dương => số âm => Special
	VD: String[] strings = {“-2”, “-6”, “10”, null, “4”, “8”, null, “Special”, “a”, “c”,
	“b”, “xx”}
	Tăng dần: Special, -6, -2, 4, 8, 10, a, b, c, xx, null, null
	Giảm dần: null, null, xx, c, b, a, 10, 8, 4, -2, -6, Special
 */
import java.util.Arrays;

import utils.CompareStringHelper;
import utils.SortUtils;

public class Ex03SortArrayOfDifferentElements {
	public static void main(String[] args) {
		String[] sequences = { "-2", "-6", "10", null, "4", "8", null, "Special", "a", "c", "b", "xx"};
		System.out.println(Arrays.toString(sequences));
		
		// ASC
		sort(sequences, new CompareStringHelper() {
			@Override
			public int compare(String s1, String s2) {
				// B1: Null first
				if (s1 == null) {
					return 1;
				}

				// s1 != null
				if (s2 == null) {
					return -1;
				}
				
				if(s1.matches("-?\\d+(\\.\\d+)?") && s2.matches("-?\\d+(\\.\\d+)?")){
					return Integer.parseInt(s1) - Integer.parseInt(s2);
				}
				
				return s1.compareTo(s2);
			}
		});

		System.out.println(Arrays.toString(sequences));
		
		
		//DESC
		sort(sequences, new CompareStringHelper() {
			@Override
			public int compare(String s1, String s2) {
				// B1: Null first
				if (s1 == null) {
					return -1;
				}

				// s1 != null
				if (s2 == null) {
					return 1;
				}
				
				if(s1.matches("-?\\d+(\\.\\d+)?") && s2.matches("-?\\d+(\\.\\d+)?")){
					return Integer.parseInt(s2) - Integer.parseInt(s1);
				}
				
				return s2.compareTo(s1);
			}
		});
		
		System.out.println(Arrays.toString(sequences));
	}
	
	private static void sort(String[] source, CompareStringHelper helper) {
		for (int round = 0; round < source.length; round++) {
			for (int i = 0; i < source.length - round - 1; i++) {
				if (helper.compare(source[i], source[i + 1]) >  0) {
					SortUtils.swap(source, i, i + 1);
				}
			}
		}
	}
}
