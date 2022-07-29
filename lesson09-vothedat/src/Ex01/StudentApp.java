package Ex01;

public class StudentApp {
	public static void main(String[] args) {
		Students v = new Students();
		Students[] students = {
		new Students(102, "Nam", Score.C),
		new Students(103, "Bảo", Score.F),
		new Students(104, "Hoàng", Score.D),
		new Students(105, "Nguyên", Score.B),
		new Students(107, "Vũ", Score.F),
		new Students(109, "Lan", Score.A),
		new Students(202, "Đạt", Score.C),
		new Students(103, "Bảo", Score.F),
		new Students(107, "Vũ", Score.C),
		new Students(104, "Hoàng", Score.B)
		};
		String[] result
		for(Students x: students) {
			if(v.getScore() == Score.F) {
				System.out.println("Không qua môn");
				v.toString();
			}
		}
	}
}
