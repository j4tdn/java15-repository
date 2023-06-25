package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex02 {
    public static List<Integer> extractNumbers(String input) {
        List<Integer> numbers = new ArrayList<>();
        
        // Tìm và trích xuất các đoạn ký tự số liên tục
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(input);
        
        while (matcher.find()) {
            String numberString = matcher.group();
            int maxNumber = findMaxNumber(numberString);
            numbers.add(maxNumber);
        }
        
        // Sắp xếp các số theo thứ tự không giảm
        Collections.sort(numbers);
        
        // Loại bỏ các số 0 không có ý nghĩa
        numbers.removeIf(num -> num == 0);
        
        return numbers;
    }
    
    private static int findMaxNumber(String numberString) {
        int maxNumber = 0;
        int currentNumber = 0;
        
        for (int i = 0; i < numberString.length(); i++) {
            char c = numberString.charAt(i);
            
            if (Character.isDigit(c)) {
                currentNumber = currentNumber * 10 + (c - '0');
            } else {
                maxNumber = Math.max(maxNumber, currentNumber);
                currentNumber = 0;
            }
        }
        
        maxNumber = Math.max(maxNumber, currentNumber);
        
        return maxNumber;
    }
    
    public static void main(String[] args) {
        String inputFilePath = "D:\\input.txt";
        String outputFilePath = "D:\\output.txt";
        
        try {
            // Đọc dữ liệu từ file input.txt
            BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
            StringBuilder inputBuilder = new StringBuilder();
            String line;
            
            while ((line = reader.readLine()) != null) {
                inputBuilder.append(line);
            }
            
            reader.close();
            
            String input = inputBuilder.toString();
            
            // Trích xuất kết quả
            List<Integer> result = extractNumbers(input);
            
            // Ghi kết quả vào file output.txt
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));
            
            for (Integer number : result) {
                writer.write(number.toString());
                writer.newLine();
            }
            
            writer.close();
            
            System.out.println("Kết quả đã được ghi vào file " + outputFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
