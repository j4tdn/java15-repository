

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main {
    public static void main(String[] args) {
        try {
            // Đọc dữ liệu từ file input.txt
            BufferedReader reader = new BufferedReader(new FileReader("src/input.txt"));
            int n = Integer.parseInt(reader.readLine());
            System.out.println(n);
            List<String> strings = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                strings.add(reader.readLine());
            }
            reader.close();

            // Trích xuất và sắp xếp các số từ xâu
            List<Integer> numbers = extractAndSortNumbers(strings);

            // Ghi dãy số đã sắp xếp vào file output.txt
            BufferedWriter writer = new BufferedWriter(new FileWriter("src/output.txt"));
            for (int number : numbers) {
                writer.write(String.valueOf(number));
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<Integer> extractAndSortNumbers(List<String> strings) {
        List<Integer> numbers = new ArrayList<>();
        for (String str : strings) {
            String[] numberAsStr = str.split("[^0-9]+");
            for (String number : numberAsStr) {
                try {
                    Integer value = Integer.parseInt(number);
                    numbers.add(value);
                } catch (Exception e) {}
            }
        }
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);
        return numbers;
    }


}