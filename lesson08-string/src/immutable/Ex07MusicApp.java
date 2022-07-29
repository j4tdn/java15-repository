package immutable;

import java.util.Arrays;

public class Ex07MusicApp {
	public static void main(String[] args) {
		String[] paths= {"d:/music/shapeofyou.mp3"
				,"d:/music/allweknow.mp3"
				,"d:/music/onmyway.mov"};
		String[] songNames=getSongName(paths,".mp3");
		for(String songName:songNames) {
			System.out.print(songName + " ");
		}
		
	}
	private static String[] getSongName(String[] paths, String extension) {
		String[] result= new String[paths.length];
		int rid=0;
		for(String path:paths) {
			if(path.endsWith(extension)) {
				int lastSlashPos=path.lastIndexOf("/");
				int lastDotPos=path.lastIndexOf(".");
				String songName=path.substring(lastSlashPos+1, lastDotPos);
				result[rid++]=songName;
				
			}
		}
		return Arrays.copyOfRange(result, 0, rid);
	}
}
