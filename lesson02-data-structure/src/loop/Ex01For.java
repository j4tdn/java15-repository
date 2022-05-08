package loop;

public class Ex01For {
	public static void main(String[] args) {
		int n = 100;
		for (int i = 1; i <= n; i++) {
			System.out.print(i + "\t");
			if (i % 10 == 0) {
				System.out.println();
			}
		}
		
		System.out.println("==============");
		
		for (int i = n; i >= 0; i--) {
			System.out.print(i + "\t");
			if (i % 10 == 0) {
				System.out.println();
			}
		}
		
		System.out.println("===============");
		
		//for index
		String[] elements = {"A", "B", "C"};
		for (int i = 0; i < elements.length; i++) {
			System.out.println(elements[i]);
		}
		
		System.out.println("===============");
		
		//for each
		for (String element: elements) {
			System.out.println(element);
		}
	}
}
