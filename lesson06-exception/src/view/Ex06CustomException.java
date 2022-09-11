package view;

import exception.InvalidAgeException;

public class Ex06CustomException {
	public static void main(String[] args) {
		int age = 34;
		
		try {
			if (validate(age)) {
				System.out.println("Canbuy a ticket");
			}else {
				System.out.println("invalid object");
			}
		} catch (InvalidAgeException e) {

			System.out.println(e.getMessage());
		}
	}
	private static boolean validate(int age) throws InvalidAgeException {
		if(age < 16) {
			//throw new RuntimeException("Invalid age - At least 16");
			throw new InvalidAgeException(16);
		}
		return true;
	}
}
