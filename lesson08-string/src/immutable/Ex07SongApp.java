package immutable;

public class Ex07SongApp {
	public static void main(String[] args) {
		//lấy danh sách các bài nhạc mp3
		String [] paths = {
				"d:/music/shapeofyou.mp3",
				"d:/music/allweknow.mp3",
				"d:/music/onmyway.mov"
		};
	}
	
	private static String [] getSongNames(String[] paths) {
		for(String path: paths) {
			if(path.endsWith(".mp3")) {
				int lastSlashPos = path.lastIndexOf("/");
				int lastDotPos = path.lastIndexOf(".");
				String songName = path.substring(lastSlashPos + 1, lastDotPos);  
			}
		}
		return getSongNames(paths);
	}
}
