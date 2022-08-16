package ex03_lesson09_exam;

public class Ex03 {
	public static void main(String[] args) {
		String strings = "Welcome   to JAVA10   class";
		strings = strings.replaceAll("\\s+", " ");
		
		String[] a = strings.split(" ");
		for(int i = 0; i<a.length;i++) {
			for(int j = a[i].length()-1;j>=0;j--) System.out.print(a[i].charAt(j));
			System.out.print(" ");
		}
	}
}
