package viwer;

import java.util.ArrayList;

import java.util.HashMap;

public class Ex07 {
	public static int minLength(String a, String b) {

		HashMap<Character, Integer> Char = new HashMap<>();

		for (int i = 0; i < b.length(); i++) {
			Char.put(b.charAt(i), Char.getOrDefault(b.charAt(i), 0) + 1);
		}
		HashMap<Character, ArrayList<Integer>> CharacterIndex = new HashMap<>();
		for (int i = 0; i < a.length(); i++) {
			char x = a.charAt(i);

			if (Char.containsKey(x)) {
				if (CharacterIndex.get(x) == null) {
					CharacterIndex.put(x, new ArrayList<Integer>());
				}

				CharacterIndex.get(x).add(i);
			}
		}
		int len = Integer.MAX_VALUE;

		int flag;

		while (true) {

			flag = 1;

			int firstVar = 0, lastVar = 0;
			for (int i = 0; i < b.length(); i++) {

				// For first character of string b
				if (i == 0) {

					// If the first character of
					// b is not present in a
					if (CharacterIndex.containsKey(i)) {
						flag = 0;
						break;
					} else {
						int x = CharacterIndex.get(b.charAt(i)).get(0);

						CharacterIndex.get(b.charAt(i)).remove(CharacterIndex.get(b.charAt(i)).get(0));

						firstVar = x;
						lastVar = x;
					}
				} else {
					int elementFound = 0;
					for (Integer e : CharacterIndex.get(b.charAt(i))) {
						if (e > lastVar) {

							elementFound = 1;
							lastVar = e;
							break;
						}
					}
					if (elementFound == 0) {

						// If no index is possible
						flag = 0;
						break;
					}
				}
			}
			if (flag == 0) {

				break;
			}

			len = Math.min(len, Math.abs(lastVar - firstVar) + 1);
		}

		return len;
	}

	public static void main(String[] args) {

		String a = "abcdefababaef";
		String b = "abf";

		int len = minLength(a, b);
		if (len != Integer.MAX_VALUE) {
			System.out.println(len);
		} else {
			System.out.println("Impossible");
		}
	}

}
