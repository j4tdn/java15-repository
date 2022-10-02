package utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class FileUtils {
	private static Random rd= new Random();
	private FileUtils() {
	}
	//==============================CREATE FILE=======================
	//Create Dir
	public static File createNewDir(String pathname) {
		File dir = new File(pathname);
		if (!dir.exists()) {
			boolean flag = dir.mkdirs();
			if (flag) {
				System.out.println("Folder " + dir.getName() + " created.");
			} else {
				System.out.println("Folder " + dir.getName() + " already existed.");
			}
		}
		return dir;
	}
	
	//Create Dir as Path
	public static Path createNewDirAsPath(String pathname) {
		return createNewDir(pathname).toPath();
	}
	
	//Create File
	//x\\y\\z\a.txt	
		public static File createNewFile(String pathname) {
			File file = new File(pathname);
			//File parent = file.getParentFile();
			File parent = createNewDir(file.getParent());
			if(parent.isDirectory()) {
				if(!file.exists()) {
					try {
						boolean flag=file.createNewFile();
						if(flag) {
							System.out.println("Created " + file.getName()+" successfull");
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				else {
					System.out.println("File " + file.getName()+ " already existed.");
				}
			}
			return file;
		}
		
		//Coppy by Path: source existed, target create new
		public static Path copy(String sourcePathName, String targetPathName) {
			Path source= Paths.get(sourcePathName);
			Path target= createNewDirAsPath(targetPathName);
			
			 Path targetPath =null;
			try {
				targetPath=Files.copy(source, target.resolve(renameTo(source.getFileName())));
			} catch (IOException e) {
				e.printStackTrace();
			}
			return targetPath;
		}
		
		//Rename 
		public static Path renameTo(Path source) {
			String filename=source.toString();
			String renameTo="rnf"
							+ System.currentTimeMillis() 
							+ new Random().nextInt(100)
							+filename.substring(filename.lastIndexOf("."));
			
			return Paths.get(renameTo);
		}
		//Create New File Random name
		public static File createRandomFiles( String dirPath,int numberOfFile, String ... extensions) {
			File dir = createNewDir(dirPath);
			for(int i=0; i<numberOfFile; i++) {
				String ext= extensions[rd.nextInt(extensions.length)];
				String filename= "f"+ System.currentTimeMillis()+rd.nextInt(100) + "e" + "." + ext;
				File file = createNewFile(dir, filename);
				System.out.println(file.isFile()? "File" + file.getName()+" is created ..." 
												: " Cannot create file" + file.getName() );
				
			}
			return dir;
		}
		
		// ===================================WRITE FILE=================================================
	//write file
		public static void writeFiles(File file, List<String> lines) {
			FileWriter fw= null;
			BufferedWriter bw= null;
			try {
				fw= new FileWriter(file);
				bw= new BufferedWriter(fw);
				for(String line:lines) {
					bw.write(line);
					bw.newLine();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				close(bw,fw);
			}
			System.out.println("Write file completely");
		}
		/*
	//Case1
	public static <T extends FileTransfer> void writeFileCase1(File file, List<T> ts) {
		FileWriter fw=null;
		BufferedWriter bw=null;
		try {
			 fw = new FileWriter(file);
			 bw = new BufferedWriter(fw);
			 
			 List<String> lines =ts.stream()
					 				.map(T::toLine)
					 				.collect(Collectors.toList());
			
			 
			 
			 for(String line:lines) {
				bw.write(line);
				bw.newLine();
			}
			 
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(fw !=null) {
				close(bw,fw);
			}
		}
		System.out.println("-->Write file completely");
	}
	*/
	//Case 2
	public static <T> void writeFileCase2(File file, List<T> ts,Function<T, String> func) {
		FileWriter fw=null;
		BufferedWriter bw=null;
		try {
			 fw = new FileWriter(file);
			 bw = new BufferedWriter(fw);
			 
			 List<String> lines =ts.stream()
					 				.map(t->func.apply(t))
					 				.collect(Collectors.toList());
			
			 
			 
			 for(String line:lines) {
				bw.write(line);
				bw.newLine();
			}
			 
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(fw !=null) {
				close(bw,fw);
			}
		}
		System.out.println("-->Write file completely");
	}
	
	
	public static File createNewFile(File parent,String child) {
		return createNewFile(parent.getAbsolutePath()+ File.separator+child);
	}
	//close finally writer
	public static void close(AutoCloseable ...closeables ) {
		for(AutoCloseable closeable:closeables) {
			if(closeable!=null) {
				try {
					closeable.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		}
	}
	
	public static Path createFileAsPath(String pathname) {
		return  new File(pathname).toPath();
	}
	//===================================READ FILE========================
	public static List<String> readFile(Path path){
		List<String> lines=null;
		
		try {
			lines=Files.readAllLines(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lines;
	}
	
	public static <T> List<T> readFileCase1(Path path, Function<String, T> func){
		List<String> lines= readFile(path);
		return lines.stream()
					.map(line->func.apply(line))
					.collect(Collectors.toList());
	}
	//======================SERIALIZE=================
	//write
	public static <T> void writeObject(File file, List<T> list) {
		FileOutputStream fos= null;
		ObjectOutputStream oos=null;
		try {
			fos= new FileOutputStream(file);
			oos= new ObjectOutputStream(fos);
			
			oos.writeObject(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			close(oos,fos);
		}
		System.out.println("Write Obecjt completely...");
	}
	//read
	@SuppressWarnings("unchecked")
	public static <T> List<T> readObecjt(File file){
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		try {
			fis= new FileInputStream(file);
			ois= new ObjectInputStream(fis);
			
			
			return (List<T>) ois.readObject();
		} catch (Exception e) {
			
		}finally {
			close(fis,ois);
		}
		System.out.println("read object completely");
		return null;
	}
}	

