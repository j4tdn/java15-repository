package immutable;

import java.util.ArrayList;

public class Ex07Mp3Music {
	public static void main(String[] args) {
		String bh1 = "d:/music/shapeofyou.mp3";
		String bh2 = "d:/music/allweknow.mp3";
		String bh3 = "d:/music/onmyway.mov";
		String[] paths = { bh1, bh2, bh3 };
		function(paths);
	}

	public static void function(String[] paths) {
		ArrayList<String> listSong = new ArrayList<String>();
		for (String bh : paths) {
			bh = bh.replace("d:/music/", "");
			// System.out.println(bh);
			if (bh.endsWith(".mp3")) {
				bh = bh.replace(".mp3", "");
				listSong.add(bh);
			}
		}
        System.out.println(listSong);
	}
}
