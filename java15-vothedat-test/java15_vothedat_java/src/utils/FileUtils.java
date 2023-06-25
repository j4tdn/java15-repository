package utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FileUtils {
	public static File createNewFile(String pathname) {
		File file = new File(pathname);
		if (!file.exists()) {
			try {
				boolean flag = file.createNewFile();
				if (flag) {
					System.out.println("Create file " + file.getName() + " successful");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("File" + file.getName() + " already exist");
		}
		return file;
	}
    
	public static List<String> readFile(Path path) {
		List<String> lines = null;
		try {
			lines = Files.readAllLines(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lines;
	}
	
	
//	public static <T extends FileTransfer> void writeFile(File file, List<T> ts) {
//        FileWriter fw = null;
//        BufferedWriter bw = null;
//        try {
//            fw = new FileWriter(file);
//            bw = new BufferedWriter(fw);
//
//            List<String> lines = ts.stream()
//                    .map(T::toLine)
//                    .collect(Collectors.toList());
//
//            for (String line : lines) {
//                bw.write(line);
//                bw.newLine();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (bw != null) {
//                    bw.close();
//                }
//                if (fw != null) {
//                    fw.close();
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        System.out.println("--> Write file completely");
//    }
	
	public static void writeFile(File file, List<Integer> numericResults) throws IOException {
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);

        for (int number : numericResults) {
            bw.write(String.valueOf(number));
            bw.newLine();
        }

        bw.close();
        fw.close();
    }

}
