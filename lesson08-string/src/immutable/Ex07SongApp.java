package immutable;

import java.util.Arrays;

public class Ex07SongApp {
	public static void main(String[] args) {
				String bh1 = "d:/music/shapeofyou.mp3";
				String bh2 = "d:/music/allweknow.mp3";
				String bh3 = "d:/music/onmyway.mov";
				String [] paths = {bh1, bh2, bh3};
				String[] list = GetSongName(paths,".mp3");
				System.out.println(Arrays.toString(list));
	}
	private static String[] GetSongName(String[] paths, String text) {
		String[] list = new String[paths.length];
		int i = 0;
		for(String path : paths) {
			if(path.endsWith(text)) {
				String temp = path.substring(path.lastIndexOf("/")+1, path.lastIndexOf("."));
				list[i++] = temp;
			}
		}
		return Arrays.copyOfRange(list, 0, i);
	}
}
