import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test {
	private static String fileName_ip = "input.txt";
	private static String fileName_op = "output.txt";
	public static void main(String[] args) {
		List<String> ip = new ArrayList<>();
		Set<Integer> numbers = new TreeSet<>();
		try {
		ip = FileUtils.readFile(fileName_ip);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (String line : ip) {
		int maxNum = FileUtils.maxNum(line);
			numbers.add(maxNum);
		}
		try {
			FileWriter fw = new FileWriter(fileName_op);
			for (Integer num : numbers) {
				fw.write(num+" ");
				
			}
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
