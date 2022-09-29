package view;

import java.io.File;
import java.util.Arrays;

import utils.FileUtils;

/*
Trong thư mục đường dẫn tương đối của dự án. Tạo thư mục “garbage”
Trong thư mục garbage. Tiếp tục tạo 4 thư mục “image, music, system, coding”, 20 files với cú
pháp như sau:
 fileName: System.currentTimeMillis()
 extension: .png, .jpg, .jpeg, .mp3, .mp4, .bat, .java, .txt
Viết chương trình thực hiện thác tác với file và thư mục tương ứng
*/
public class Ex01 {
	private static String path = "garbage";
	private static String[] childPath = {"image", "music", "system", "coding"};
	private static String[] extensions = {".png", ".jpg", ".jpeg", ".mp3", ".mp4", ".bat", ".java", ".txt"};
	
	public static void main(String[] args) {
		for(int i = 0; i < childPath.length; i++) {
			FileUtils.createNewDir("garbage" + File.separator + childPath[i]);
		}
		
		FileUtils.createFiles(path, extensions, 20);
		
		File[] imageFiles = FileUtils.getFile(path, "png, jpg, jpeg");
		FileUtils.moveFiles(imageFiles, "garbage" + File.separator + "image" + File.separator);
		
		File[] musicFiles = FileUtils.getFile(path, "mp3, mp4");
		FileUtils.moveFiles(musicFiles, "garbage" + File.separator + "music" + File.separator);
		
		File[] systemFiles = FileUtils.getFile(path, "bat");
		FileUtils.moveFiles(systemFiles, "garbage" + File.separator + "system" + File.separator);
		
		File[] codingFiles = FileUtils.getFile(path, "java");
		FileUtils.copyFiles(codingFiles, "garbage" + File.separator + "coding" + File.separator);
		
		File[] txtFiles = FileUtils.getFile(path, "txt");
		Arrays.stream(txtFiles).forEach(file -> file.delete());
	}
}
