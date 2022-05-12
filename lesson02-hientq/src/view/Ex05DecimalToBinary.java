package view;

import java.nio.charset.Charset;
import java.util.Scanner;

public class Ex05DecimalToBinary {
	private static Scanner sc = new Scanner(System.in);

	private static int inputValue(String promt, String error) {
		int n;
		do {
			String nInText;
			System.out.print(promt);
			nInText = sc.nextLine();
			if (nInText.matches("-?\\d+")) {
				n = Integer.parseInt(nInText);
				break;
			} else {
				System.out.println(error);
			}
		} while (true);
		return n;
	}

	/**
	 * Hàm trả về form binary của một số decimal
	 * 
	 * @param n Tham số ở form decimal
	 * @return Trả về form binary với kiểu String
	 */
	private static String convertToBinary(int n) {
		// Dù có âm hay dương đều cho lấy giá trị tuyệt đối và gán cho biến temp
		int temp = Math.abs(n);
		String tempBinaryText = "";
		String binaryText = "";
		// Mỗi lần chia lấy dư biến temp cho 2 (kết quả 0 hoặc 1) để nối vào chuỗi
		// tempBinaryText
		// Và chia lấy nguyên biến temp cho 2 để tiếp tục quá trình chuyển đổi decimal
		// sang binary
		// cho đến khi temp != 0 thì dừng loop
		while (temp != 0) {
			tempBinaryText = tempBinaryText.concat(temp % 2 + "");
			temp /= 2;
		}
		// Sau khi chạy loop trên thì tempBinaryText hiện đang ở dạng bị đảo ngược, nên
		// cần phải reverse lại
		for (int i = 0; i < tempBinaryText.length(); i++) {
			char ch = tempBinaryText.charAt(i);
			binaryText = ch + binaryText;
		}
		// Nếu n ban đầu là số âm thì nhớ cho thêm character '-' phía trước binaryText
		// để trả về cho đúng
		if (n < 0) {
			binaryText = '-' + binaryText;
		}
		return binaryText;
	}

	public static void main(String[] args) {
		Charset utf8 = Charset.forName("UTF-8");
		int n = inputValue("Nhap mot so he 10: ", "Invalid value! Please try again!");
		String subscriptDecimal = new String("\u208D\u2081\u2080\u208E".getBytes(utf8));
		String subscriptBinary = new String("\u208D\u2082\u208E".getBytes(utf8));
		System.out.println(n + subscriptDecimal + " = " + convertToBinary(n) + subscriptBinary);
	}
}
