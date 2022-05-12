package main;

import java.io.File;
import java.util.Scanner;

public class ExFolder {
	File file;

	public ExFolder(String fileName) {
		this.file = new File(fileName);
	}

	public boolean exCanExecute() {
		return this.file.canExecute();
	}

	public boolean exCanRead() {
		return this.file.canRead();
	}

	public boolean exCanWrite() {
		return this.file.canWrite();
	}

	public void getLink() {
		System.out.println("Link " + this.file.getAbsolutePath());
	}

	public void getFileName() {
		System.out.println("filename " + this.file.getName());
	}

	public void testFile() {
		if (this.file.isDirectory()) {
			System.out.println("Đây là thư mục");
		} else if (this.file.isFile()) {
			System.out.println("Đây là tệp tin");
		}
	}

	public void getAllfolder() {
		if (this.file.isDirectory()) {
			File[] arr = this.file.listFiles();
			for (File file : arr) {
				System.out.println(file.getName());

			}

		} else if (this.file.isFile()) {
			System.out.println("Đây là tập tin");
		}

	}

	public void treeFolder() {
		this.allTreeFolder(this.file, 1);
	}

	public void allTreeFolder(File f, int level) {
		for (int i = 0; i < level; i++) {
			System.out.print("\t");

		}
		System.out.print("|__");
		System.out.println(f.getName());
		if (f.canRead() && f.isDirectory()) {
			File[] arr = f.listFiles();
			for (File fx : arr) {
				allTreeFolder(fx, level + 1);
			}

		}
	}
//	public void inCayThuMuc() {
//		this.inChiTietCayThucMuc(this.file, 1);
//	}
//
//	public void inChiTietCayThucMuc(File f, int bac) {
////		System.out.print("|");
//		for (int i = 0; i < bac; i++) {
//			System.out.print("\t");
//		}
//		System.out.print("|__");
//		System.out.println(f.getName());
//		if (f.canRead()&&f.isDirectory()) {
//			File[] mangCon = f.listFiles();
//			for (File fx : mangCon) {
//				inChiTietCayThucMuc(fx, bac + 1);
//			}
//		}
//		
//	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		System.out.println("Nhập tên file");
		String fileName = sc.nextLine();
		ExFolder ef = new ExFolder(fileName);
		do {
			System.out.println("MENU ---------- ");
			System.out.println("1. Kiểm tra file có thể thực thi: ");
			System.out.println("2. Kiểm tra file có thể đọc: ");
			System.out.println("3. Kiểm tra file có thể ghi: ");
			System.out.println("4. In đường dẫn: ");
			System.out.println("5. In tên file: ");
			System.out.println("6. Kiểm tra file là thư mục hoặc tập tin: ");
			System.out.println("7. In ra danh sách các file con: ");
			System.out.println("8. In ra cây thư mục: ");
			System.out.println("0. Thoát chương trình.");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Có thể thực thi trên file " + ef.exCanExecute());

				break;
			case 2:
				System.out.println("Có thể đọc file" + ef.exCanRead());

				break;
			case 3:
				System.out.println("Có thể ghi file" + ef.exCanWrite());

				break;
			case 4:
				ef.getLink();

				break;
			case 5:
				ef.getFileName();

				break;
			case 6:
				ef.testFile();

				break;
			case 7:
				ef.getAllfolder();

				break;
			case 8:
				ef.treeFolder();

				break;
			default:
				break;
			}
		} while (choice != 0);

	}

}
