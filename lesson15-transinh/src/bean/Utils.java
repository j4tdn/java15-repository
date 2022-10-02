package bean;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Utils {
	
	public static <T> List<T> readFile(Path path, Function<String, T> func) {
		List<String> lines = readFile(path);
		return lines.stream()
					.map(line -> func.apply(line))
					.collect(Collectors.toList());
	}
	
	public static List<String> readFile(Path path) {
		List<String> lines = null;
		try {
			lines = Files.readAllLines(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lines;
	}
}
