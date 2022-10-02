package utils;

import java.io.File;
import java.io.IOException;
import java.util.Random;

public class FileUtils {
	private static Random rd = new Random();
	private FileUtils() {
		
	}
	
	public static File createRamdomFiles(String dirPath, int nof, String ...extensions) {
		File dir = createNewDir(dirPath);
				
				for(int i = 0; i<nof;i++) {
					String ext = extensions[rd.nextInt(extensions.length)];
					String filename = "f"+ System.currentTimeMillis() + rd.nextInt(100)+"e"+ "." + ext;
					File file = createNewFile(dir,filename);
					System.out.println(
							file.isFile() ? "File"+ file.getName()+"is created ...": "Cannot create file "+ file.getName());
				}
				return dir;
	}
	public static File createNewFile(String pathname) {
		File file = new File(pathname);
		File parent = file.getParentFile();
		if(parent ) {
			if(!file.exists()) {
				try {
					boolean flag = file.createNewFile();
					if(flag) {
						System.out.println();
					}
				}
				catch(IOException e) {
					e.printStackTrace();
				}
			}
			
		}
	}
	public static File createNewFile(File parent,String child) {
		return createNewFile(parent.getAbsolutePath()+file. )
	}
	public static boolean createNewDir(String pathname) {
		File dir = new File(pathname);
		if(!dir.exists()) {
			boolean flag = dir.mkdirs();
			if(flag) {
				System.out.println("Folder"
				+ dir.getName()
				+"Created successful");
			}
			else {
				System.out.println("Folder"
						+ dir.getName()
						+"Already successful");
			}
			return dir.isDirectory();
		}
	}
}

