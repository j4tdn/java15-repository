package view;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import utils.FileUtils;

public class calculate {
	private static String path = "input.txt";
	private static String pathOutSource = "output.txt";

	public static void main(String[] args) {
		File file = FileUtils.createNewFile(path);
		List<String> lines;
		try {
			lines = Files.readAllLines(file.toPath());
			List<String> sentences = new ArrayList<>();
			List<String> results = new ArrayList<>();
			for (String line : lines) {
			    String[] lineSentences = line.split("\n");
			    sentences.addAll(Arrays.asList(lineSentences));
			}
			
			for (int i = 1; i < sentences.size(); i++) {
			    List<String> extractedSequences = extractNumberSequences(sentences.get(i));
			    results.addAll(extractedSequences);
			}
			
			List<Integer> numericResults = new ArrayList<>();
			for (String result : results) {
			    int number = Integer.parseInt(result);
			    numericResults.add(number);
			}

			Collections.sort(numericResults);
			File fileResult = FileUtils.createNewFile(pathOutSource);
			FileUtils.writeFile(fileResult, numericResults);
			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		

	}
	
	public static List<String> extractNumberSequences(String input) {
	    List<String> numberSequences = new ArrayList<>();
	    Pattern pattern = Pattern.compile("\\d+");
	    Matcher matcher = pattern.matcher(input);

	    while (matcher.find()) {
	        String sequence = matcher.group();
	        if (sequence.startsWith("0")) {
	            int number = Integer.parseInt(sequence);
	            number *= 1;
	            sequence = String.valueOf(number);
	        }
	        numberSequences.add(sequence);
	    }
	    return numberSequences;
	}
}
