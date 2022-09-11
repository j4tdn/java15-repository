package immutable;

import java.util.Arrays;

public class Ex07SongsApp {
	public static void main(String[] args) {
		String[] paths = {
				"d:/music/shapeofyou.mp3",
				"d:/music/allweknow.mp3",
				"d:/music/onmyway.mov"
		};
		//System.out.println(Arrays.toString(getSongNames(paths)));
		String[] songNames = getSongNames(paths, "mov");
		for (String songName : songNames) {
			System.out.println(songName);
		}
	}
	private static String[] getSongNames(String[] paths, String extension) {
		String[] result = new String[paths.length];
		int index = 0;
		for(String path : paths) {
			if(path.endsWith(extension)) {
				int lastSlashPos = path.lastIndexOf("/");
				int lastDotPos = path.lastIndexOf(".");
				String songName = path.substring(lastSlashPos + 1, lastDotPos);
				result[index++] = songName;
			}
		}
		return Arrays.copyOfRange(result, 0, index);
	}
}
