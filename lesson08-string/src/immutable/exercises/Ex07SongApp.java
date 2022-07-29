package immutable.exercises;

import java.util.Arrays;

public class Ex07SongApp {
	public static void main(String[] args) {
		String[] paths = {
				"d:/music/shapeofyou.mp3",
				"d:/music/allweknow.mp3",
				"d:/music/onmyway.mov"
		};
		
		String[] result = getSongNames(paths, "mov");
		System.out.println(Arrays.toString(result));
		
	}
	
	private static String[] getSongNames(String[] paths, String extension) {
		String[] result = new String[paths.length];
		int i=0;
		for(String path:paths) {
			if(path.endsWith(extension)) {
				int lastSlasPos = path.lastIndexOf("/");
				int lastDotPos = path.lastIndexOf(".");
				String songname = path.substring(lastSlasPos+1, lastDotPos);
				result[i++] = songname;
			}
		}
		return Arrays.copyOfRange(result, 0, i);
	}
}
