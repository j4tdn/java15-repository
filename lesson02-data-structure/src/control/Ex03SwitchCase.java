package control;

/**
 * 
 * give a month as number print num of days in given month
 */
public class Ex03SwitchCase {
	public static void main(String[] args) {
		int month = 3;
		int daysInMonth = -1;
		switch (month) {
		case 1:
			daysInMonth = 31;
			break;
		case 2:
			daysInMonth = 28;
			break;
		case 3:
			daysInMonth = 31;
			break;

		case 4:
			daysInMonth = 30;
			break;

		case 5:
			daysInMonth = 31;
			break;

		case 6:
			daysInMonth = 30;
			break;

		case 7:
			daysInMonth = 31;
			break;
		case 8:
			daysInMonth = 31;
			break;
		case 9:
			daysInMonth = 30;
			break;
		case 10:
			daysInMonth = 31;
			break;
		case 11:
			daysInMonth = 30;
			break;
		case 12:
			daysInMonth = 31;
			break;

		default:
			System.out.println("invalid month");
			break;
		}
		System.out.println("====================");

		
	}
}
