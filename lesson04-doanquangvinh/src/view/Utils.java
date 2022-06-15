package view;

public class Utils {
	public static String filterMark(Student student) {
		String name = "";
		if (student.caculateAverageMark() > 8.5) {
			name = student.toString();
		}
		return name;
	}
	public static String compareMark(Student student) {
		String tmp = "";
		if (student.getTmark() > student.getPmark()) {
			tmp = student.toString();
		}
		return tmp;
	}
}
