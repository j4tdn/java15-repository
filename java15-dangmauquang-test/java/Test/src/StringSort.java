import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StringSort {
    public static void main(String[] args) {
        try {
            File input = new File("input.txt");
            Scanner scanner = new Scanner(input);
            List<Integer> outputContent = new ArrayList<>();
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                
                String[] dataArray = data.split(" ");
                for (String item : dataArray) {
                	item = item.replaceAll("[^0-9]+", " ");
            		List<String> arr = Arrays.asList(item.trim().split(" "));

            		int  max = Integer.parseInt(arr.get(0));
            		
           		 	for(int i = 1; i < arr.size(); i++) {
           		 		if(max < Integer.parseInt(arr.get(i))) {
           		 			max = Integer.parseInt(arr.get(i));
           		 		}
           		 	}
           		 	outputContent.add(max);
                }
            }
            Collections.sort(outputContent);
            outputContent.forEach(System.out::println);
            scanner.close();

            FileWriter writer = new FileWriter("output.txt");
            writer.write(outputContent.toString());
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred: File not found.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("An error occurred: IOException.");
            e.printStackTrace();
        } finally {
			System.out.println("=======================");
		}
    }
}
