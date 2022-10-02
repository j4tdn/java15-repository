package file.content;

import java.util.List;
import java.util.stream.Collectors;

import bean.Customer;
import model.DataModel;

public class Ex02FileWriteWithFilesNio {
	public static void main(String[] args) {
		
		List<String> lines = DataModel.getCustomers().stream()
				.map(Customer::toLine)
				.collect(Collectors.toList());
	lines.add(0, "Th�ng tin kh�ch h�ng");
	lines.add(1, "====================");
		
	}
}
