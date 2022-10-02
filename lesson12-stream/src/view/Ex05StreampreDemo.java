
package view;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import bean.Dish;
import model.DataModel;

public class Ex05StreampreDemo {
	public static void main(String[] args) {
		List<Dish> menu =  DataModel.getDishes();
		// live Stream  
		//Stream co 1 tu khoa la traversable once : các phần tử trong steam chỉ đước phép duyệt qua một lần
		System.out.println("==========1. Get dishes which have calories > 250g===============");
		// Stream Dish
		List<Dish> weigthCalories =  menu.stream() 
			.filter(d -> d.getCalories() > 250)
			.collect(Collectors.toList());
		weigthCalories.forEach(System.out::println);
		
		System.out.println("============2. Get name of dishes=============");
		Set<String> nameOfDish = menu.stream()
			.map(Dish::getName)//(d ->d.getName)
			.collect(Collectors.toSet());
		nameOfDish.forEach(System.out::println);
		
		
		String names = menu.stream().map(Dish::getName)
				.collect(Collectors.joining(", "));
		System.out.println(names);
							
//		System.out.println("============3. Get name of dishes which do chay =============");
//		List<Dish> dochay =  menu.stream() 
//				.filter(d -> d.isVegetarian() == true)
//				.collect(Collectors.toList());
//		dochay.forEach(System.out::println);
		System.out.println("============3. Get name of dishes which do chay =============");
		Set<String> nameOfDochay = menu.stream()
				.filter(Dish::isVegetarian)
				.map(Dish::getName)//(d ->d.getName)
				.collect(Collectors.toSet());
		nameOfDochay.forEach(System.out::println);
		
		System.out.println("============4. Sort a vehicle model map =============");
		Map<Integer, String> modelMap = DataModel.getVehicleModelMap();
		Map<Integer, String> sortedMap = modelMap.entrySet() //Set<Entry<K, V>>
				.stream()  //Stream<Entry<K, V>>
				.sorted(Comparator.comparing(Entry::getValue))
				.collect(Collectors.toMap(e -> e.getKey(), Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		sortedMap.forEach((k,v) -> System.out.println(k + " --> " + v));	
		
				
		
		
	}	
		
}








