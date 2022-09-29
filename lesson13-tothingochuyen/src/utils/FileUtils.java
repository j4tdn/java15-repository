package utils;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Random;

public class FileUtils {
	private FileUtils() {
		
	}
	
	public static File createNewDir(String pathname) {
		File dir = new File(pathname);
		if(!dir.exists()) {
			boolean flag = dir.mkdirs();
			if(flag) {
				System.out.println("Folder " + dir.getName() + " created successful");
			}
		}else {
			System.out.println("Folder " + dir.getName() + " existed!!!");
		}
		return dir;
	}
	
	public static File creatNewFile(String pathname) {
		File file = new File(pathname);
		if (file.exists()) {
			return file;
		}
		File parent = file.getParentFile();
		if (!parent.exists()) {
			parent.mkdirs();
		}
		boolean isFileCreated = false;
		if (!file.exists()) {
			try {
				isFileCreated = file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return isFileCreated ? file : null;
	}
	
	public static void createFiles(String path, String[] extensions, int number) {
		Random rd = new Random();
		for(int i = 1; i <= number; i++) {
			String pathname = path + File.separator + System.currentTimeMillis() + extensions[rd.nextInt(extensions.length)];
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			FileUtils.creatNewFile(pathname);
		}
	}
	
	public static File[] getFile(String path, String extension) {
		File dir = new File(path);
		String[] extensions = extension.split("[,\\s]+"); 
		if (dir.exists()) {
			File[] files = dir.listFiles(new FileFilter() {
				@Override
				public boolean accept(File file) {
					String fileName = file.getName();
					String extension = fileName.substring(fileName.lastIndexOf('.') + 1);
					for (String ex : extensions) {
						if (ex.equals(extension)) {
							return true;
						}
					}
					return false;
				}
			});
			return files;
		}
		return null;
	}
	
	public static void moveFiles(File[] files, String targetPath) {
		for (File file : files) {
			try {
				Files.move(Paths.get(file.getAbsolutePath()),Paths.get(targetPath + File.separator + file.getName()) , StandardCopyOption.REPLACE_EXISTING);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void copyFiles(File[] files, String targetPath) {
		for (File file : files) {
			try {
				Files.copy(Paths.get(file.getAbsolutePath()),Paths.get(targetPath + File.separator + file.getName()), StandardCopyOption.REPLACE_EXISTING);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
