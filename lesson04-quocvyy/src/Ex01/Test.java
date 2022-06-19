package Ex01;

public class Test {
	public static void main(String[] args) {
		Students s1 = new Students("nguyen duc quoc", 102200, 3.0f, 4.0f);
		Students s2 = new Students("leoneo messi", 123, 5.0f, 6.0f);
		Students s3 = new Students();
		System.out.print("nhập sinh viên:");
		Gpa.add();
		Students[] s = { s1, s2, s3 };
		System.out.print("tìm học sinh có điểm trng bình lớn hơn 8.5:");
		Gpa.search01(s);
		System.out.println("==================");
		System.out.print("học sinh có điểm lí thuyết lớn hơn thục hành:");
		Gpa.seach02(s);
	}
}
