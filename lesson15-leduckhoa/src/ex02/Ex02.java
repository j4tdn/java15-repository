package ex02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/*
 * idea của bài này là em lấy từng phần tử để đưa vào set để lọc ra các phần tử phân biệt đồng thời cũng tạo ra mảng saveStrings
 * với mỗi phần tử của mảng là 1 ký tự của chuỗi string
 * sau đó chuyển set sang list (TickStrings[]) và tạo ra 1 cái mảng Tick[] để đánh dấu
 * duyệt vòng for mảng saveStrings và Tick[TickStrings.indexOf(saveStrings[i])]++;
 * sau đó tìm max của mảng Tick => lấy index rồi in ra ký tự TickStrings[index]
 * Các làm hơi phức tạp ạ -_-
 */
public class Ex02 {
	static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Mời nhập chuỗi: ");
		String string = ip.nextLine();
		Handle(string);
		
	}
	
	public static void Handle(String string) {
		String[] saveStrings = new String[string.length()];
		Set<String> str = new HashSet<>();
		
		for(int i = 0; i<string.length(); i++) {
			saveStrings[i] = string.substring(i, i+1);
			str.add(saveStrings[i]);
		}
		
		List<String> TickStrings = new ArrayList<>();
		TickStrings.addAll(str);
		
		int[] Tick = new int[str.size()];
		for(int i = 0; i<string.length(); i++) {
			Tick[TickStrings.indexOf(saveStrings[i])]++;
		}
		
		int max = -1;
		for(int i = 0; i<Tick.length;i++) {
			if(Tick[i] > max) max = Tick[i];
		}
		System.out.print("Kết quả: ");
		for(int i = 0; i<Tick.length;i++) {
			if(Tick[i] == max) System.out.print(TickStrings.get(i) + " ");
		}
	}
}
