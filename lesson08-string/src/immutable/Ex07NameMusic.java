package immutable;

import java.util.Arrays;

public class Ex07NameMusic {
	public static void main(String[] args) {
		String[] paths = { "d:/music/shapeofyou.mp3", "d:/music/allweknow.mp3", "d:/music/onmyway.mp3" };
		for (String songName : getSongNames(paths, ".mp3")) {
			System.out.println(songName);
		}
	}

	private static String[] getSongNames(String[] paths, String extension) {
		String[] songNames = new String[paths.length];
		int rid = 0;
		for (String path : paths) {
			if (path.endsWith(extension)) {
				int lastSlashPos = path.lastIndexOf("/");
				int lastDotPos = path.lastIndexOf(".");
				String songName = path.substring(lastSlashPos + 1, lastDotPos);
				songNames[rid++] = songName;
			}
		}
		return Arrays.copyOfRange(songNames, 0, rid);
	}

}
