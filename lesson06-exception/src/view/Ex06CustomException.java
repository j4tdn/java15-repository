package view;

import exception.InvalidAgeException;

public class Ex06CustomException {
	public static void main(String[] args) {
		int age = 2;
		
		try {
			if(validate(age)) {
				System.out.println("Can buy a ticket");
			} else {
				System.out.println("Incalid object");
			}
		} catch (InvalidAgeException e) {
			
			System.out.println(e.getMessage());
		}
	}
	
	private static boolean validate(int age) throws InvalidAgeException {
		if(age < 16) {
			throw new InvalidAgeException(age);
		}
		return true;
	}
	
	
}
