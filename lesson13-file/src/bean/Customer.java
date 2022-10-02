package bean;

public class Customer {
	private int id;
	private String name;
	private int age;
	private String address;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(int id, String name, int age, String address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String toLine() {
		return getId() + ", "
				+ getName() + ", "
				+ getAge() + ", "
				+ getAddress();
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
}
package utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

public class FileUtils {
	private static Random rd = new Random();
	private FileUtils() {
		
	}
	
	private static void writeFile(File file, List<String> lines) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		//FileWriter, BufferWriter
		try {
			 fw = new FileWriter(file);
			 bw = new BufferedWriter(fw);
			 for (String line: lines) {
				 bw.write(line);
				 bw.newLine();
			 }
			 //txt file --> list of strings
			 bw.write("Line 1 - Data Test"); bw.newLine();
			 bw.write("Line 2 - Data Test"); bw.newLine();
		} catch (IOException e) {
			
			e.printStackTrace();
		} finally {
			close(bw, fw);
		}
		System.out.println("Write file completely");
	}
	public static File createRandomFile(String dirPath, int nof, String ... extensions ) {
		File dir = createNewDir(dirPath);
		
		for(int i = 0; i < nof; i++) {
			String ext = extensions[rd.nextInt(extensions.length)];
			String filename = "f" + System.currentTimeMillis() + rd.nextInt(100)
							+ "e" + "." + ext;
			File file = createNewFile(dir, filename);
			System.out.println(
				file.isFile() ? "File" + file.getName() + "isCreated ..."
								: "cannot create file " + file.getName() 
			);
		}
		
		return dir;
	}
	
	public static Path copy(String sourcePathName, String targetPathName) {
		Path source = Paths.get(sourcePathName);
		Path target = createNewDirAsPath(targetPathName);
		
		Path targetPath = null;
		try {
			targetPath = Files.copy(source, target.resolve(renameTo(source.getFileName())));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return targetPath;
	}
	
	public static Path renameTo(Path source) {
		String filename = source.toString();
		String renameTo = "rnf" + System.currentTimeMillis() 
							+ new Random().nextInt(100)
							+ filename.substring(filename.lastIndexOf("."));
		return Paths.get(renameTo);
	}
	
	public static File createNewFile(String pathname) {
		File file = new File(pathname);
		File parent = createNewDir(file.getParent());
		if(parent.isDirectory()) {
			if(!file.exists()) {
				try{
					boolean flag = file.createNewFile();
					if(flag) {
						System.out.println("Folder " + file.getName() + " created successful");
					}
				}catch(IOException e) {
					e.printStackTrace();
				}
			}else {
				System.out.println("File " + file.getName() + " existed!!!");
			}
		}
		return file;
	}
	
	//parent; a/b/c
	//child: x.txt
	public static File createNewFile(File parent, String child) {
		return createNewFile(parent.getAbsoluteFile() + File.separator + child);
	}
	
	public static File createNewDir(String pathname) {
		File dir = new File(pathname);
		if(!dir.exists()) {
			boolean flag = dir.mkdirs();
			if(flag) {
System.out.println("Folder " + dir.getName() + " created successful");
			}
		}else {
			System.out.println("File " + dir.getName() + " existed!!!");
		}
		return dir;
	}
	
	public static Path createNewDirAsPath(String pathname) {
		return createNewDir(pathname).toPath();
	}

	
	public static void close(AutoCloseable ...closeables) {
		for (AutoCloseable closeable: closeables) {
			if(closeable != null) {
				try {
					closeable.close();
				} catch (Exception e) {
					
					e.printStackTrace();
				}
			}
		}
	}
}