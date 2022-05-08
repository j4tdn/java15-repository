package loop;

public class Ex01For {
	public static void main(String[] args) {
		int n = 100;
		
		for (int i = 1; i < n; i++) {
			System.out.println(i + "\t ");
			if ( i % 10 == 0) {
				System.out.println();
			}
		}

// zero-index
String[] element = {"A", "B", "C"};
for (int i = 0; i < element.length; i++) {
	System.out.println(element[i]);
}
for (String element: elements) {
	System.out.println(element);
}
	}
}





