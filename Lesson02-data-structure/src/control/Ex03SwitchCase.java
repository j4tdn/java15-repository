package control;

/**
 * Give a month as number => Print number of days in given month
 * 
 * @author MSI GL65
 *
 */
public class Ex03SwitchCase {

	public static void main(String[] args) {
         int month = 1;
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
			daysInMonth = 30;
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
			System.out.println(" Invalid Month");
			return ; // exit , stop method void 
		}
         System.out.println("Days in month : " + month + ": " + daysInMonth);
         
         System.out.println("================================================");
         
         if (month ==1) {
        	 daysInMonth = 31;
		} else if (month ==2) {
			daysInMonth = 28;
		} else if (month ==2) {
			daysInMonth = 28;
		}else if (month ==3) {
			daysInMonth = 30;
		} else if (month ==4) {
			daysInMonth = 17;
		} else if (month ==5) {
			daysInMonth =17;
		} else if (month ==6) {
			daysInMonth = 31;
		} 
	        
}}