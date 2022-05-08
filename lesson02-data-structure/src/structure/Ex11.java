package structure;

import javax.sound.midi.Sequence;

public class Ex11 {

	public static void main(String[] args) {
		// Kiem tra ki tu nhap vao co phai laf so hay khong
		// Kiem tra chuoi nhap vao cos phai la so hay khong
		// TH1 : Tu code ra
		// TH2 : Dung ham co san
		char letter = 'x';
		System.out.println(letter + "is digit ?-->" + isDigit(letter));
		System.out.println(letter + "is digit ?-->" + Character.isDigit(letter));
		
		System.out.println("\n=================\n");
		String sequence = "125";
		System.out.println(sequence + " is number -->" + isNumber(sequence));
		System.out.println(sequence + " is number -->" + sequence.matches("[0-9]{1,}"));
		isNumber(sequence);
	}
	private static boolean isNumber(String input) {
		for(int i = 0;i< input.length();i++) {
			char tmp = input.charAt(i);
			
			if(!isDigit(tmp)) {
				return false;
			}
		}
		return true;
	}

	private static boolean isDigit(char input) {
		return (input >= '0' && input <= '9');

	}
}
