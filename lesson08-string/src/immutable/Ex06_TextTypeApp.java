package immutable;

import bean.Number;

public class Ex06_TextTypeApp {
	public static void main(String[] args) {
		Number nb = new Number();
		String s = "aBcD172sdf";
		Count(s, nb);
		System.out.println(nb);
	}
	private static Number Count(String s, Number nb) {
		int count = 0;
		int count1 = 0;
		int count2 = 0;
		char[] letters = s.toCharArray();
		for(char letter: letters) {
			if(Character.isUpperCase(letter)) {
				count++; 
				continue;
			}
			nb.setNumberofUp(count);
			if(Character.isLowerCase(letter)) {
				count1++; 
				continue;
			}
			nb.setNumberofLow(count1);
			if(Character.isDigit(letter)) {
				count2++; 
			}
			nb.setNumberofnumber(count2);
		}
		return nb;
		
		
	}
}
