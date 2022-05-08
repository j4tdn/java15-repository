package control;

public class Ex03SwitchCase {
	public static void main(String[] args) {
		int month = 1;
		int DayInMonth;
		switch (month) {
		case 1: {

			DayInMonth = 31;
			break;
		}
		case 2: {

			DayInMonth = 28;
			break;
		}
		case 3: {

			DayInMonth = 31;
			break;
		}
		case 4: {

			DayInMonth = 30;
			break;
		}
		case 5: {

			DayInMonth = 31;
			break;
		}
		case 6: {

			DayInMonth = 30;
			break;
		}
		case 7: {

			DayInMonth = 31;
			break;
		}
		case 8: {

			DayInMonth = 31;
			break;
		}
		case 9: {

			DayInMonth = 30;
			break;
		}
		case 10: {

			DayInMonth = 31;
			break;
		}
		case 11: {

			DayInMonth = 30;
			break;
		}
		case 12: {

			DayInMonth = 31;
			break;
		}

		default:
			System.out.println("Invalid month");
			return;
		}
		System.out.println("Số ngày trong tháng " + month +": " + DayInMonth);
	}
	
}
