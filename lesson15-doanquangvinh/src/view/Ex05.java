package view;

import java.io.File;
import java.nio.file.Path;
import java.util.List;

import common.Student;
import model.DataModel;
import utils.FileUtils;

public class Ex05 {
	private  static String pathName = String.join(File.separator, "data","student.txt");
	public static void main(String[] args) {
     File file = FileUtils.createNewFile(pathName);
     List<Student> students = DataModel.getStudents();
     FileUtils.writeObject(file, students);
	}
	
}
