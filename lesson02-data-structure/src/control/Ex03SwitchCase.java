package control;

/**
 * Give a month as number
 * 
 *  ==> print number of days in given month
 */
public class Ex03SwitchCase {
	public static void main(String[] args) {
		
	int month = 1;
	int daysInMonth = -1;

	
	switch (month) {
	case 1:
		daysInMonth = 31;
		//break;
	}
	switch (month) {
	case 2:
		daysInMonth = 28;
	//	break;
	}
	switch (month) {
	case 3:
		daysInMonth = 31;
	//	break;
	}
	switch (month) {
	case 4:
		daysInMonth = 30;
		break;
	}
	switch (month) {
	case 5:
		daysInMonth = 31;
		break;
	}
	switch (month) {
	case 6:
		daysInMonth = 30;
		break;
	}
	switch (month) {
	case 7:
		daysInMonth = 31;
		break;
	}
	switch (month) {
	case 8:
		daysInMonth = 31;
		break;
	}
	switch (month) {
	case 9:
		daysInMonth = 30;
		break;
	}
	switch (month) {
	case 10:
		daysInMonth = 31;
		break;
	}
	switch (month) {
	case 11:
		daysInMonth = 30;
		break;
	}
	switch (month) {
	case 1:
		daysInMonth = 31;
		break;

	default:
		System.out.println("Invalid month");
		return; //dừng, thoát khỏi hàm return void
	}
	System.out.println("số ngày trong tháng " + month + ": " + daysInMonth);
	System.out.println("========================");
	
	if(month == 1) {
		daysInMonth = 31;
	}
	else if(month == 2) {
		daysInMonth = 28;
	}
	else if(month == 3) {
		daysInMonth = 31;
	}
	else if(month == 4) {
		daysInMonth = 30;
	}
	else if(month == 5) {
		daysInMonth = 31;
	}
	else if(month == 12) {
		daysInMonth = 31;
	}
	System.out.println("Days In Month: " + month);

}
}
