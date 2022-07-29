package ex;

import java.util.Arrays;

public class Ex03_Split {
	public static void main(String[] args) {
		String[] s = { "102-Nam-C", "104-Hoàng-D", "109-Lan-A", "103-Bảo-F", "105-Nguyên-B", "107-Vũ-F", "103-Bảo-F",
				"202-Đạt-C", "107-Vũ-C", "193-Bảo-B", "199-Tài-A" };
		String[] aa = getSongName(s);

		String[] aaa = getSong(aa);
		for (int i = 0; i < aaa.length; i++) {
			System.out.println(aaa[i]);
		}
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < aaa.length; j++) {
				if(s[i].substring(0, s[i].indexOf("-")).equals(aaa[j]) == false){
					System.out.println(s[i]);
				}
			}
		}

	}

	private static String[] getSong(String[] aa) {
		String[] count = new String[aa.length];
		int counts = 0;
		for (int i = 0; i < aa.length - 1; i++) {
			for (int j = i + 1; j < aa.length; j++) {
				if (aa[i].equals(aa[j])) {
					String name = aa[i];
					count[counts] = name;
					counts++;
				}
			}

		}
		return Arrays.copyOfRange(count, 0, counts);
	}

	private static String[] getSongName(String[] s) {
		String[] names = new String[s.length];
		int count = 0;
		for (int i = 0; i < s.length; i++) {
			String name = s[i].substring(0, s[i].indexOf("-"));
			names[count] = name;
			count++;
		}

		return Arrays.copyOfRange(names, 0, count);
	}

}
