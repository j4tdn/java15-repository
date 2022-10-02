package Ex05;

import java.io.File;
import java.util.List;

import Ex05Utils.Ex05CreateNewFile;

public class Ex05CreateFile {
	private static String pathname =   "student.txt";
    public static void main(String[] args) {
            File file = Ex05CreateNewFile.createNewFile(pathname);
            System.out.println("file --> " + file.getName());
            List<Customer> listStudents = Ex05CreateNewFile.readObject(file);
    }
    
}
