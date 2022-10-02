package Ex05;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;


public class FileUtils {
	
	private FileUtils() {
		
	}
	
	public static <E> List<E> readLines(File file, Function<String, E> function) {
		List<E> rs = new ArrayList<>();
		try {
			rs = Files.lines(Path.of(file.getPath())).map(function).filter(Objects::nonNull)
					.collect(Collectors.toList());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return rs;
	}
		
}