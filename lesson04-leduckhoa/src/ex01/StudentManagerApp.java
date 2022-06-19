package ex01;

public class StudentManagerApp {
	public static void main(String[] args) {
		Student s1 = new Student(1, "Le Duc khoa", 9f, 9.5f);
		Student s2 = new Student(2, "Tuong Le Bao Truc", 8f, 8.5f);
		Student s3 = new Student();
		s3.input();
		
		Student[] s = {s1,s2,s3};
		find(s);
		find1(s);
		
	}
	
	public static void find(Student[] s) {
		for(int i = 0; i<3; i++) {
			if(s[i].average() > 8.5) {
				System.out.println(s[i].toString());
			}
		}
	}
	
	public static void find1(Student[] s) {
		for(int i = 0; i<3; i++) {
			if(s[i].getScore1() > s[i].getScore2()) {
				System.out.println(s[i].toString());
			}
		}
	}
				
}
