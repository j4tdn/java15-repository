package file.content;

import java.io.File;
import java.nio.file.Path;
import java.util.List;
import java.util.function.Function;

import bean.Customer;
import utils.FileUtils;

public class Ex03FileReader {
	private static String pathname = String.join(File.separator,
			"storage", "data", "content.txt");
	
	public static void main(String[] args) {
		Path path = FileUtils.createNewFileAsPath(pathname);
		
		/*Function<String, Customer> func = new Function<String, Customer>() {
			@Override
			public Customer apply(String line) {
				String[] elements = line.split(", ");
				if(elements.length != 4) {
					System.out.println(line + " ... has...wrong format!!!");
					return null;
				}
				return new Customer(
					Integer.parseInt(elements[0]),
					elements[1],
					Integer.parseInt(elements[2]),
					elements[3]
				);
			}
		};
		*/
		
		//c1
		//List<Customer> customer = FileUtils.readFile(path, Customer::transfer);
		
		//c2
		List<Customer> customer = FileUtils.readFile(path, Customer::new);
		customer.forEach(System.out::println);
		
		System.out.println("Finished ...");
		
	}
}
