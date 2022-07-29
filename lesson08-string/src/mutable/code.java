package mutable;

public class code {
	public static void main(String[] args) {
		String text = "aaabaaabbaaaaa";
		numberMaxMin(text);
	}
	private static void numberMaxMin(String text) {
		int numberMax= 1;
		int numberMin =text.length();
		int number=0;
		
		for(int i = 0; i< text.length()-1; i++) {
			if(text.charAt(i) == text.charAt(i+1)) {
				number++;
				
			}
			else {
				if(numberMin>number) {
					numberMin = number;
				}
				if(numberMax<number) {
					numberMax = number;
				}
				number = 1;
			}
			
		}
		System.out.println(numberMax);
		System.out.println(numberMin);
		
		
	}

}
