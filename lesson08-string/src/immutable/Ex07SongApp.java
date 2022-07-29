package immutable;

import java.util.Arrays;

/**
 * Viết chương trình in ra danh sách tên các bài nhạc mp3 có trong thư mục music
Input: String bh1 = "d:/music/shapeofyou.mp3"
String bh2 = "d:/music/allweknow.mp3"
String bh3 = "d:/music/onmyway.mov"
String [] paths = {bh1, bh2, bh3};
Output: String[] songs = {"shapeofyou", "onmyway"};
 * */
public class Ex07SongApp {
	public static void main(String[] args) {
		//lấy danh sách các bài nhạc mp3
		String[] paths = {
				"d:/music/shapeofyou.mp3",
				"d:/music/allweknow.mp3",
				"d:/music/onmyway.mov"
		};
		String[] songNames = getSongNames(paths, ".mov");
		for(String songName: songNames) {
			System.out.println(songName + " ");
		}
				
	}
	
	private static String[] getSongNames (String[] paths, String extension) {
		String[] result = new String[paths.length];
		int rid = 0;
		for(String path: paths) {
			if(path.endsWith(extension)) {
				int lastSlashPos = path.lastIndexOf("/");
				int lastDotPos = path.lastIndexOf(".");
				String songName = path.substring(lastSlashPos+1, lastDotPos);
				result[rid++] = songName;
			}
		}
		return Arrays.copyOfRange(result, 0, rid);
	}
}