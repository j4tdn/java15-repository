package java15_dangvannhatminh_java.view;

import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import utils.FileUtils;

public class View {
	private static String pathname = String.join(File.separator, 
			"storage", "data", "input.txt");
	private static String pathOutput = String.join(File.separator, 
			"storage", "data", "output.txt");
	
	public static void main(String[] args) {
		Path path = FileUtils.createNewFileAsPath(pathname);
		File file = FileUtils.createNewFile(pathOutput);
		
		List<String> lines = FileUtils.readFile(path);
		List<Integer> arrNumbers = new ArrayList<>();
		for(int i=1 ; i <= Integer.parseInt(lines.get(0)); i++) {
			arrNumbers.addAll(splitNumber(lines.get(i)));
		}
		List<String> result = arrNumbers.stream()
				.sorted(Comparator.comparing(Function.identity()))
				.map(t -> String.valueOf(t))
				.collect(Collectors.toList());
		FileUtils.writeFile(file, result);
	}
	
	public static List<Integer> splitNumber(String source) {
		String regex = "\\D+";
		int[] result = Arrays.stream(source.split(regex))
                .filter(s -> !s.isEmpty())
                .mapToInt(Integer::parseInt)
                .toArray();
		return Arrays.stream(result)
                .boxed()
                .collect(Collectors.toList());
		
	}
}
