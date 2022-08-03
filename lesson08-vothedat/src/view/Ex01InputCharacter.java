package view;

import java.util.Scanner;

public class Ex01InputCharacter {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("1.In ra mỗi kí tự trên một dòng");
		System.out.println("2.In ra mỗi từ trên một dòng");
		System.out.println("3.In ra chuỗi đảo ngược theo kí tự");
		System.out.println("4.In ra chuỗi đảo ngược theo từ");
		System.out.println("5.Thoát");
		System.out.println("Mời bạn nhập: ");
		int t = Integer.parseInt(ip.nextLine());
		boolean flag = true;
		while (flag) {
			switch (t) {
			case 1:
				String s = ip.nextLine();
				for (int i = 0; i < s.length(); i++) {
					System.out.print(s.charAt(i) + "  ");
				}
				break;
			case 2:
				String s1 = ip.nextLine();
				String[] words = s1.split("[\\s,-]+");
				for (String word : words) {
					System.out.println(word);
				}
				break;
			case 3:
				String s2 = ip.nextLine();
				for (int i = s2.length() - 1; i >= 0; i--) {
					System.out.print(s2.charAt(i));
				}
				break;
			case 4:
				String s3 = ip.nextLine();
				String formattedText = "";
				String k = s3.replaceAll("\\s+", " ");
				String[] words3 = k.split("\\s");
				for (int i = 0; i < words3.length; i++) {
					String word = words3[i];
					String Text = "";
					for (int j = word.length() - 1; j >= 0; j--) {
						Text = Text + word.charAt(j);
					}
					formattedText = formattedText + Text + " ";
				}
				System.out.println(formattedText);
				break;
			default:
				System.out.println("Thoát");
				flag = false;
				break;
			}
		}
	}
}
