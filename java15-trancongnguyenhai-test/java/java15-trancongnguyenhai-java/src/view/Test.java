package view;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		String path = "input.txt";
		try {
			FileInputStream fis = new FileInputStream(path);
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			
			String line;
			List<String> lines = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                lines.add(line);
            } 
            
            
            
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
