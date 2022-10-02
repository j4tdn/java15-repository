package utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

public class FileUtils {
	private static Random rd = new Random();
	
	private FileUtils() {
		
	}
	
	
	public static File createRandomFiles(String dirPath, int nof, String ...extensions) {
		File dir = createNewDir(dirPath);
		for(int i = 0 ; i < nof ; i++) {
			String ext = extensions[rd.nextInt(extensions.length)];
			String filename = "f" + System.currentTimeMillis() + rd.nextInt(100) + "e" + "." + ext;
			
			File file = createNewFile(dir, filename);
			System.out.println(
					file.isFile() ? "File " + file.getName() + "is created ..." 
								  : "Cannot create file " + file.getName()
			);
			
		}
		return dir;
	}
	
	
	public static Path createNewDirAsPath(String pathname) {
		return createNewDir(pathname).toPath();
	}
	
	
	public static Path copy(String sourcePathName, String targetPathName) {
		Path source = Paths.get(sourcePathName);
		Path target = createNewDirAsPath(targetPathName);
		
        Path targetPath = null;
		try {
			targetPath = Files.copy(source, target.resolve(renameTo(source.getFileName())));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return targetPath;
	}
	
	public static Path renameTo(Path source) {
		String filename = source.toString();
		String renameTo = "rnf" + System.currentTimeMillis() 
								+ new Random().nextInt(100) 
								+ filename.substring(filename.lastIndexOf('.')); 
		return Paths.get(renameTo);
	}
	
	public static File createNewDir(String pathname) {
		File dir = new File(pathname);
		if(!dir.exists()) {
			boolean flag = dir.mkdirs();
			if(flag) {
				System.out.println("Folder " + dir.getName() + " created successful");
			}
		} else {
			System.out.println("Folder " + dir.getName() + " already existed");
		}
		return dir;
	}
	
	public static File createNewFile(File parent, String child) {
		return createNewFile(parent.getAbsoluteFile() + File.separator + child);
	}
	
	
	public static File createNewFile(String pathname) {
		File file = new File(pathname);
		File parent = createNewDir(file.getParent());
		if(parent.isDirectory()) {
			if(!file.exists()) {
				try {
					boolean isCreated = file.createNewFile();
					System.out.println("Create file" + (isCreated ? " success" : "fail"));
				} catch (IOException e) {
					e.printStackTrace();
				}
			} else {
				System.out.println("File " + file.getName() + " is existed !!!");
			}
		}
		return file;
	}
		
}
