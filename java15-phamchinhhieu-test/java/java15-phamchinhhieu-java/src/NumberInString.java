import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberInString {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        List<String> chuoiList = new ArrayList<>();

        try (BufferedReader reader = Files.newBufferedReader(Paths.get(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                chuoiList.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        List<Integer> soList = new ArrayList<>();

        Pattern p = Pattern.compile("\\d+");

        for (String chuoi : chuoiList) {
            Matcher m = p.matcher(chuoi);

            while (m.find()) {
                String so = m.group();
                soList.add(Integer.parseInt(so));
            }
        }

        Collections.sort(soList);

        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(outputFile))) {
            for (int so : soList) {
                writer.write(Integer.toString(so));
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Done!!!");
    }
}
