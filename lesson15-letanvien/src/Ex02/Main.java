package Ex02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		List<Character> s = getLetters("aaabbbbbcccccdd"); 
		System.out.println("letter appear the most:" + s);
	}
	private static List<Character> getLetters(String in) {
		List<Character> result = new ArrayList<Character>();
		Set<Character> letterUniques = new HashSet<Character>();
		char[] c = in.toCharArray();
		for (char i : c) {
			letterUniques.add(i);
		}

		List<Integer> counts = new ArrayList<Integer>();
		int count = 0;
		for (Character item : letterUniques) {
			for (char c1 : c) {
				if (item == c1) {
					count++;
				}
			}
			counts.add(count);
			count = 0;
		}

		int max = counts.get(0);
		for (Integer item : counts) {
			if (item >= max) {
				max = item;
			}
		}
		int index = 0;
		for (Character i : letterUniques) {
			if (counts.get(index++) == max) {
				result.add(i);
			}
		}

		return result;

	}
}