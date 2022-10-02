package view;

import java.util.Arrays;
import java.util.function.Consumer;

public class Ex04Lambda {

	public static void main(String[] args) {
		// signature
		//Suplier, Consumer, predicate (boolean), Funtion(T --> R)
		
		//Create an instance of functional interface
		Consumer<Integer> consumer = new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		};
		// lambda lad một kiểu dữ liệu đối tượng 
		// using lambda: cachs viết ngắn gọn để tạo instance of functinal interface
		consumer = (number) -> {
			System.out.println(number);
		};
		Arrays.asList(1,2,3)
				.forEach(consumer);
		//Lý thuyết: Tìm hiểu functional interface, lambda để áp dụng trong những functinon có sẵn 	của java hoặc tự viết ra
		
		
		
	}

}















