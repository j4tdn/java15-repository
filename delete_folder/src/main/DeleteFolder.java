package main;

import java.io.File;

public class DeleteFolder {
	public static void xoaFile(File fx) {
		if (fx.isFile()) {
			// Xoa neu la tap tin
			System.out.println("Da xoa: " + fx.getAbsolutePath());
			fx.delete();
		} else if (fx.isDirectory()) {
			// Lay cac file con
			File[] mangCon = fx.listFiles();
			for (File f : mangCon) {
				// Xoa cac file con
				xoaFile(f);

			}
			// Xoa ban than thu muc sau khi da xoa cac file con
			System.out.println("Da xoa: " + fx.getAbsolutePath());
			fx.delete();
		}
	}

	public static void main(String[] args) {
		File f0 = new File("D:\\JAVA15\\2.JAVA\\delete_folder\\F0");
		File f1 = new File("D:\\JAVA15\\2.JAVA\\delete_folder\\F1");
		File fex = new File("D:\\JAVA15\\2.JAVA\\delete_folder\\ex.txt");

		f0.deleteOnExit();
		f1.deleteOnExit();
		fex.deleteOnExit();
		
		DeleteFolder.xoaFile(f0);

	}
}
