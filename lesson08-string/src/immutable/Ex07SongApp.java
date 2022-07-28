package immutable;

import java.util.Arrays;

// Lấy danh sách các bài nhạc mp3
public class Ex07SongApp {
	public static void main(String[] args) {
		String[] paths = { 
				"d:/music/shapeofyou.mp3",
				"d:/music/allweknow.mp3",
				"d:/music/onmyway.mov",
		};
		String[] songNames = getSongNames(paths, ".mp3");
		for(String songName: songNames) {
			System.out.println(songName + " ");
		}
	}

	private static String[] getSongNames(String[] paths, String extention) {
		String[] result = new String[paths.length];
		int rid = 0;
		for (String path : paths) {
			if (path.endsWith(extention)) {
				int lastSlashPos = path.lastIndexOf("/");
				int lastDotPos = path.lastIndexOf(".");
				String songName = path.substring(lastSlashPos + 1, lastDotPos);
				result[rid++] = songName;
			}
		}

		return Arrays.copyOfRange(result, 0, rid);
	}
}
