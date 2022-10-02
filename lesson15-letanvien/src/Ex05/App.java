package Ex05;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import bean.Student;

public class App {
	public static void main(String[] args) {
		File file = new File("student");
		List<Student> Students = readFile(file.toPath());
		Students.forEach(System.out::println);
		System.out.println();
		System.out.println("1: List the student with GPA from low to high:");
		Students.stream().sorted(Comparator.comparing(GPA -> GPA.getPoint())).forEach(System.out::println);
		System.out.println();
		System.out.println("2: studen with GBA > 8 :\n");
		Students.stream().filter(GPA -> GPA.getPoint() > 8).forEach(System.out::println);
		System.out.println();
		System.out.println("3: Female Student: ");
		Students.stream().filter(sex -> sex.getSex().equals("Female")).forEach(System.out::println);
		System.out.println("4: Unique Student");
		Students.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);

	}

	private static List<Student> readFile(Path path) {
		List<Student> result = new ArrayList<Student>();
		try {
			List<String> elements = Files.readAllLines(path);

			for (String element : elements) {
				String[] temp = element.split(", ");
				Student item = new Student(temp[0], temp[1], Double.parseDouble(temp[2]), temp[3]);
				result.add(item);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		return result;
	}
}