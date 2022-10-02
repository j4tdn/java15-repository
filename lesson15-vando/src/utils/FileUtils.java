package utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FileUtils {
	private FileUtils() {

	}

	public static <T> List<T> readFile(Path path, Function<String, T> func) {
		
		return readFile(path).stream()
							 .map(line -> func.apply(line))
							 .collect(Collectors.toList());
	
	}
	public static List<String> readFile(Path path) {
		List<String> lines = null;
		try {
			lines = Files.readAllLines(path);
		} catch (IOException e) {
		}
		
		return lines;
	
	}
}