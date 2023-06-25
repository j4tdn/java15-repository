import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
	private static String file = "i675npu785875t.txt";

	public static void main(String[] args) {
		System.out.println(maxNum(file));
	}

	public static List<String> readFile(String fileName) throws IOException {
		File file = new File(fileName);
		InputStream inputStream = new FileInputStream(file);
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader reader = new BufferedReader(inputStreamReader);

		List<String> result = new ArrayList<>();
		String line;
		while ((line = reader.readLine()) != null) {
			result.add(line);
		}
		return result;
	}

	public static int maxNum(String lines) {
		Integer max = Integer.MIN_VALUE;
		
		String str = lines.replaceAll("[^0-9,-\\.]", ",");
		
		String[] line = str.split(",");
		
		for (int i = 0; i < line.length; i++) {
		try {
		int n = Integer.parseInt(line[i]);
		if(max < n) {
			max = n;
		}
		} catch (NumberFormatException e) {
		}
		
	};
	return max;
}
}
