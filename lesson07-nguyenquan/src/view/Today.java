package view;
 import static utils.Dateutils.*;

public class Today {
	public static void main(String[] args) {
		System.out.println(thePresentTime());
		System.out.println(lastDayofthemonth());
		startAndEndOfWeek();
		System.out.println("đang ở tuần thứ "+ today()+" trong năm ");
		twentyMoreDays();
		thebirth();
		
	}
}