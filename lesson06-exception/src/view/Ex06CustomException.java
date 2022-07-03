package view;

import exception.InvalidAgeException;

public class Ex06CustomException {
	public static void main(String[] args) {
		int age = 2;
		
		try {
			if(validate(age)){
				System.out.println("Can buy a ticket");
			}else {
				System.out.println("Invalid object");
			}
		}catch(InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
	private static boolean validate(int age) throws InvalidAgeException {
		if(age < 16) {
			//throw new RuntimeException("Invalid age - At least 16 !");
			throw new InvalidAgeException(16);
		}
		return true; 
	}
}
