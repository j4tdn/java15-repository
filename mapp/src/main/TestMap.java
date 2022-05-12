package main;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class TestMap {
	Map<String, String> key = new TreeMap<String, String>();

	public String addWord(String word, String mean) {
		return this.key.put(word, mean);
	}

	public String removeWord(String word) {
		return this.key.remove(word);
	}

	public String getMean(String word) {
		String mean = this.key.get(word);
		return mean;
	}

	public void printAllWord() {
		Set<String> keyWord = this.key.keySet();
		System.out.println(Arrays.toString(keyWord.toArray()));
	}

	public int sizeWord() {
		return this.key.size();
	}

	public void clearAllWord() {
		this.key.clear();
	}

	public static void main(String[] args) {
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		TestMap tm = new TestMap();

		do {
			System.out.println("------------------");
			System.out.println("-----MỜI CHỌN-----");
			System.out.println("Tra từ điển Anh - Việt:\n"
					+ "1. Thêm từ (Từ khóa, Ý nghĩa)\n"
					+ "2. Xóa từ\n"
					+ "3. Tìm ý nghĩa của từ khóa ⇒ Tra từ\n"
					+ "4. In ra danh sách từ khóa\n"
					+ "5. Lấy số lượng từ\n"
					+ "6. Xóa tất cả các từ khóa\n"
					+ "0. Thoát khỏi chương trình\n"
					+ "");
			choice = sc.nextInt(); sc.nextLine();
			if(choice==1) {
					System.out.println("Nhập từ muốn thêm vào từ điển");
					String word = sc.nextLine();
					System.out.println("Ý nghĩa của từ");
					String mean = sc.nextLine();
					tm.addWord(word, mean);
					
				}else if (choice == 2 || choice == 3) {
					System.out.println("nhập từ muốn tìm kiếm");
					String word = sc.nextLine();
					if(choice==2) {
						tm.removeWord(word);
					}else {
						System.out.println("Ý nghĩa là: "+ tm.getMean(word));
					}
					
				}else if( choice == 4) {
					System.out.println("Đây là tất cã nội dung");
					tm.printAllWord();
				}else if(choice == 5) {
					System.out.println("Số lượng từ vựng có trong từ điển " +tm.sizeWord());
				}else if (choice == 6) {
					System.out.println("ĐÃ xóa tất cã các từ trong từ điển ");
					tm.clearAllWord();
				}
				
		} while (choice != 0);
	}
}
