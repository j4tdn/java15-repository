package immutable;

import java.util.Arrays;

public class Ex07SongApp {
// Buoc 1: Duyệt mảng
	public static void main(String[] args) {
		
		String[] paths = {
				"d:/music/shapeofyou.mp3",
				"d:/music/allweknow.mp3",
				"d:/music/onmyway.mov"
		};
		String[] songNames = getSongNames(paths);
		for(String songName: songNames) {
			System.out.println(songName + " ");
		}
		
	}
	
	private static String[] getSongNames(String[] paths) {
		String[] result = new String[paths.length];
		int rid=0;
		for(String path : paths) {
			if (path.endsWith(".mp3")) {
				int lastSlashPos = path.lastIndexOf("/");
				int lastDoPos = path.lastIndexOf(".");
				String songName = path.substring(lastSlashPos + 1, lastDoPos);
				result[rid++] = songName;
			}
		}
		return Arrays.copyOfRange(result, 0, rid);
	}

}
