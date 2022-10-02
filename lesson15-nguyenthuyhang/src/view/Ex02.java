package view;

public class Ex02 {
	public static void main(String[] args) {
		String s = "aaaababbbddc";
		String mostUsedChar = "";
		int count = 0;
		String[] array = s.split("");

		for (int i = 0; i < array.length; i++) {
			int tempCount = 0;

		for (int j = 0; j < array.length; j++) {
			if (array[i].equals(array[j])) {
				tempCount++;
			}
				if (tempCount > count) {
					count = tempCount;
					mostUsedChar = array[i];
				}
			}
		}
		System.out.println("Most characters in string: " + mostUsedChar);
	}
}
    
    
