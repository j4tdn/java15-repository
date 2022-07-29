package Ex01;

public class Main {
	public static void main(String[] args) {
		Students[] Student = { new Students("102", "Nam", Enum.C), 
				new Students("103", "Bảo", Enum.F),
				new Students("104", "Hoàng", Enum.D), 
				new Students("109", "Lan", Enum.A),
				new Students("105", "Nguyên", Enum.B), 
				new Students("107", "Vũ", Enum.F),
				new Students("103", "Bảo", Enum.F),
				new Students("202", "Đạt", Enum.C),
				new Students("107", "Vũ", Enum.C),
				new Students("193", "Bảo", Enum.B),
				new Students("104", "Hoàng", Enum.B) };
		studentGetA(Student);
		studenLearnAgain(Student);
	}

	private static void studentGetA(Students[] Students) {
		for (Students Student : Students) {
			if (Student.getLevel() == Enum.A) {
				System.out.println("Student get A: " + Student);
			}
		}
	}

	public static void studenLearnAgain(Students[] Students) {
		for (int i = 0; i < Students.length; i++) {
			for (int j = i + 1; j < Students.length; j++) {
				if (Students[i].getId() == Students[j].getId()) {
					System.out.println(
							"Student learn again :" + Students[i] + " Point learn Again: " + Students[j].getLevel());
				}
			}
		}
	}

}
