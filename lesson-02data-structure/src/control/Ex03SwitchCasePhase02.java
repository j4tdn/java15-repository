package control;

import java.util.Random;

public class Ex03SwitchCasePhase02 {
public static void main(String[] args) {
	int month = 1 + new Random().nextInt(12);
	switch (month) {
	case 1,3,5,7,8,10,12:
		System.out.println("31 days");
		break;
	case 4,6,9,11:
		System.out.println(month+ " 30 days");
		break;
	case 2:
		System.out.println(month+ " 28 days");
		break;

	default:
		break;
	}
}
}
