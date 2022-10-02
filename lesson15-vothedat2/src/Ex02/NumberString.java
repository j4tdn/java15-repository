package Ex02;

public class NumberString {
	public static void main(String[] args) {
		String s = "aaaababbbddc";

		System.out.println(findmaxStringElements(s));
	}

	 public static char findmaxStringElements(String str)
	    {
	        int count[] = new int[256];
	
	        for (int i = 0; i < str.length(); i++)
	            count[str.charAt(i)]++;
	 
	        int max = -1; 
	        char result = ' '; 
	 
	        for (int i = 0; i < str.length(); i++) {
	            if (max < count[str.charAt(i)]) {
	                max = count[str.charAt(i)];
	                result = str.charAt(i);
	            }
	        }
	 
	        return result;
	    }
}
