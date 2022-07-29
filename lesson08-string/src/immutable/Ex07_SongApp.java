package immutable;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex07_SongApp {
	public static void main(String[] args) {
		String[] paths = { "d:/music/shapeofyou.mp3", "d:/music/allweknow.mp3", "d:/music/onmyway.mov" };
		String[] aa = getSongName(paths, ".mov");
		for(int i = 0; i < aa.length; i++) {
			System.out.println(aa[i]);
		}
	}

	private static String[] getSongName(String[] paths, String extension) {
		String[] names = new String[paths.length];
		int count = 0;
		for (int i = 0; i < paths.length; i++) {
			if (paths[i].endsWith(extension)) {
				String name = paths[i].substring(paths[i].lastIndexOf("/") + 1, paths[i].lastIndexOf("."));
	
			names[count] = name;
			count++;
			}
		}
		return Arrays.copyOfRange(names,0,count);
	}
}
