package view;

public class Ex02CharacterSearch {
	public static void main(String[] args) {
		String str = "aaaababbbddc";
		int[] count = new int[256];
		char[] ars = new char[256];
		int arr[] = new int[256];
		for (int i = 0; i < str.length(); i++)
			arr[str.charAt(i)]++;
		char array[] = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			array[i] = str.charAt(i);
			int flag = 0;
			for (int j = 0; j <= i; j++) {
				if (str.charAt(i) == array[j])
					flag++;
			}
			if (flag == 1) {
				ars[i] = str.charAt(i); 
				count[i] = arr[str.charAt(i)];
			}
		}
		int maxAt = 0;

		for (int i = 0; i < count.length; i++) {
		    maxAt = count[i] > count[maxAt] ? i : maxAt;
		}
		
		System.out.println(ars[maxAt]);
		
	}
}








