package immutable.exercises;

import java.util.Arrays;

public class Ex08FormatString {
	public static void main(String[] args) {
		
		String text = "wElcome --- To jaVA15 Class";
		text.trim();
		char[] ch = text.toCharArray();
		//require --> fomat: first word letter have to be upper case, other will be lower case
		//Welcome To Java15 Class
		
		
//		if(	ch[0]>='a' && ch[0]<='z') {
//			ch[0]-=32;
//	    }
//		for(int i = 1; i< text.length();i++) {
//			if(ch[i] == ' ' && ch[i-1]==' ') ch[i] = ''
//			if(ch[i-1] == ' ') {
//				if(	ch[i]>='a' && ch[i]<='z') {
//					ch[i]-=32;
//			    }
//			}
//			else {
//					if(	ch[i]>='A' && ch[i]<='Z') {
//						ch[i]+=32;
//				    }
//			}
//		}
		
		System.out.println(format(text));
		
		
	 }
	
	private static String format(String text) {
		String formattedText = "";
		//[\\s,-]{1,} 1 hoặc nhiều dấu -
		String[] words = text.split("[\\s,-]+");
		for(String word : words) {
			
			String formattedWord =  Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase()+" ";
			formattedText +=formattedWord;
		}
		return formattedText;
	}
	   
	
	}
