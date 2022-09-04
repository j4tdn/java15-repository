package ex02;

import java.util.ArrayList;
import java.util.List;

public class Ex02 {
	public static void main(String[] args) {
		List<CD> list = new ArrayList<>();
		list.add(new CD(3, "A", "Anh", 10, 1500));
		list.add(new CD(6, "B", "Bao", 20, 3000));
		list.add(new CD(1, "E", "Em", 30, 9500));
		list.add(new CD(4, "F", "Phu", 40, 5000));
		list.add(new CD(2, "C", "Cuong", 50, 500));
		list.add(new CD(5, "D", "Dat", 60, 100));
		
		CD add = new CD(5, "D", "D", 60, 100);
		
		System.out.println("Number of CD in list: " + list.size());
		
		double sum=0;
		for(CD element:list) {
			sum+=element.getPrice();
		}
		System.out.println("Sum: "+sum);
	}
}
