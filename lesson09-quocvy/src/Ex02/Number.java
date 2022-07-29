package Ex02;
import java.util.Arrays;
public class Number {

		public static void main(String[] args) {
			String s = "aa6b326c6e22h";
			String[] extractNumber =extractNumber(s);
			System.out.println(extractNumber);
		}
		public static String[] extractNumber( String s) {                
		   String[] result = new String[s.length()] ;
		   int rid = 0;
				   for(int i = 0; i<s.length();i++) {
					   if(Character.isDigit(i)) {
						   int lastSlashPos = s.lastIndexOf("a-z");
						   int lastDotPos = s.lastIndexOf("a-z");
						   String number = s.substring(lastSlashPos+1,lastDotPos);
						   result[rid++]=number;
					   }
					   
				   }
		   
		    return Arrays.copyOfRange(result, 0, rid);
		}
	}


