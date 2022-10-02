package file.structure;

import java.io.File;
import java.io.IOException;

import utils.FileUtils;

public class Ex01FileCreator {
	private static String pathname = "storage" + File.separator + "data" + File.separator + "content.txt";

	// khi tao file thi kiem tra xem package chua no da ton tai chua
	public static void main(String[] args) {
		// filename data.txt
		// filename content\\data.txt
		// filename C:\\content\\data.txt
		// "\" la ky tu dac biet nen phai dung "\\"
		File file = FileUtils.createNewFile(pathname);
        System.out.println("file --> " + file.getName());
	}
}
