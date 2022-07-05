package view;

import java.util.Scanner;

public class Ex04ReadNumber {
	static void convert_to_words(char[] num) {
		int len = num.length;

		if (len > 3) {
			System.out.println("Length more than 3 is not supported");
			return;
		}
		String[] single_digits = new String[] { "Không", "Một", "Hai", "Ba", "Bốn", "Năm", "Sáu", "Bảy", "Tám",
				"Chín" };
		String[] two_digits = new String[] { "", "Mười", "Mười Một", "Mười Hai", "Mười Ba", "Mười Bốn", "Mười Lăm",
				"Mười Sáu", "Mười Bảy", "Mười Tám", "Mười Chín" };
		String[] tens_multiple = new String[] { "", "", "Hai Mươi", "Ba Mươi", "Bốn Mươi", "Năm Mươi", "Sáu Mươi",
				"Bảy Mươi", "Tám Mươi", "Chín Mươi" };
		String[] three_digits = new String[] { "Trăm" };

		System.out.print(String.valueOf(num) + ": ");

		if (len == 1) {
			System.out.println(single_digits[num[0] - '0']);
			return;
		}
		int x = 0;
		while (x < num.length) {

			if (len == 3) {
				if (num[x] - '0' != 0) {
					System.out.print(single_digits[num[x] - '0'] + " ");
					System.out.print(three_digits[len - 3] + " ");
				}
				--len;
			}

			else {
				if(num[x] - '0' == 0) {
					System.out.print("Lẻ ");
				}
				if (num[x] - '0' == 1) {
					int sum = num[x] - '0' + num[x + 1] - '0';
					System.out.println(two_digits[sum]);
					return;
				}

				else if (num[x] - '0' == 2 && num[x + 1] - '0' == 0) {
					System.out.println(tens_multiple[2]);
					return;
				}

				else {
					int i = (num[x] - '0');
					if (i > 0)
						System.out.print(tens_multiple[i] + " ");
					else
						System.out.print("");
					++x;
					if (num[x] - '0' != 0)
						if (num[x] - '0' == 5) {
							System.out.println("Lăm");
						} else {
							if (num[1] - '0' != 0 && num[x] - '0' == 1) {
								System.out.println("Mốt");
							} else {
								System.out.println(single_digits[num[x] - '0']);
							}
						}
				}
			}
			++x;
		}
	}

	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);
		String[] arr = new String[7];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("N = ");
			arr[i] = ip.nextLine();
		}
		for (int i = 0; i < arr.length; i++) {
			
			convert_to_words(arr[i].toCharArray());
		}

	}
}
