package immutable;

import java.util.Arrays;

public class Ex07SongApp {
	public static void main(String[] args) {
		// Lấy danh sách các bài nhạc mp3
		String[] paths = {
			"d:/music/english/shapeofyou.mp3",
			"d:/download/allweknow.mp3",
			"d:/music/onmyway.mov"
		};
		String[] songNames = getSongNames(paths, ".mov");
		for (String songName: songNames) {
			System.out.print(songName + " ");
		}
	}
	
	private static String[] getSongNames(String[] paths, String extension) {
		String[] result = new String[paths.length];
		int rid = 0;
		for (String path: paths) {
			if (path.endsWith(extension)) {
				int lastSlashPos = path.lastIndexOf("/");
				int lastDotPos = path.lastIndexOf(".");
				String songName = path.substring(lastSlashPos+1, lastDotPos);
				result[rid++] = songName;
			}
		}
		return Arrays.copyOfRange(result, 0, rid);
	}
}
