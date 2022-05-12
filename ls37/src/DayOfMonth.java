
public class DayOfMonth {
	public static void main(String[] args) {
	int month = 2;
	int year = 2000;
	switch (month) {
	case 1, 3, 5, 7, 8, 10, 12:
		System.out.println("thang " +month+ " co 31 ngay");
		break;
	case 4, 6, 9, 11:
		System.out.println("thang co 30 ngay");
		break;
	case 2:
		if(year % 4 == 0 & year % 100 != 0 || year % 400 == 0) {
			System.out.println("thang 2 co 29 ngay");
			
		}else {
			System.out.println("thang 2 co 28 ngay");
		}
		break;
	default:
		System.out.println("lam gi co thang do ha thang kia");
		break;
	}
	}
}
