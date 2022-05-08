package control;

public class Ex04SwitchCasePhase2 {
	public static void main(String[] args) {
		int month = new Random().nextInt(12);
		System.out.println("month: " + month);
		
		switch (month) {
		case 1,3,5,7:
			System.out.println(month + "has 31 days!");
			break;
		}
		
		if(mont == 1 || mont == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			System.out.println(month + "has 31 days!");
		}else if (month == 4 || month == 6 || month == 9 || month == 11) {
			System.out.println(month + "has 30 days");
		}
	}

}
