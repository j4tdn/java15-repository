package view;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;



public class Exercise {
	public static void main(String[] args) {
        List<String> lines = stringList("input.txt");
        System.out.println("Content of input.txt: " + lines);
        List<Integer> numbers = lines.stream()
        	 .map(s -> findLargestNumber(s))
        	 .sorted()
        	 .collect(Collectors.toList());
        System.out.println("List of sorted  largest number from each line: " + numbers);
        try {
            FileWriter fileWriter = new FileWriter("output.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Integer number : numbers) {
                bufferedWriter.write(number.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            System.out.println("Successfully written to output.txt");
        } catch (IOException e) {
            System.err.println("Error writing to output.txt: " + e.getMessage());
        }
    }
	private static List<String> stringList (String filename){
		BufferedReader bf = null;
        List<String> listOfLines = new ArrayList<>();

        try {
        	bf = new BufferedReader(new FileReader(filename));
            String line = bf.readLine();
            while (line != null) {
                listOfLines.add(line);
                line = bf.readLine();
            }
            return listOfLines;
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        } finally {
            try {
                if (bf != null) {
                    bf.close();
                }
            } catch (IOException e) {
                System.err.println("Error closing the file: " + e.getMessage());
            }
        }
        return null;
	}
	private static Integer findLargestNumber(String line) {
		
		Pattern pattern = Pattern.compile("\\D+");
		List<Integer> numbers = pattern.splitAsStream(line)
                					   .filter(s -> !s.isEmpty())
                					   .map(Integer::parseInt)
                					   .collect(Collectors.toList());
		return Collections.max(numbers);
	}
}
