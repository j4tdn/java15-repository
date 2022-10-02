package view;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import bean.Dish;
import model.DataModel;
import static java.util.Comparator.*;

public class Ex05StreamPreDemo {
	public static void main(String[] args) {
		List<Dish> menu = DataModel.getDishes();
		
		System.out.println("1. Get dishes which have calories > 250");
		List<Dish> weghtColories = menu.stream()
			.filter(d -> d.getCalories() > 250)
			.collect(Collectors.toList());
		weghtColories.forEach(System.out::println);
	
		System.out.println("2. Get name of dishes");
		Set<String> nameOfDishes = menu.stream()
			.map(Dish::getName)
			.collect(Collectors.toSet());
		nameOfDishes.forEach(System.out::println);
		
		
		String names = menu.stream()
							.map(Dish::getName)
							.collect(Collectors.joining(", "));
		System.out.println(names);
		
		Set<String> nameOVegie = menu.stream()
			.filter(Dish::isVegetarian)
			.map(Dish::getName)
			.collect(Collectors.toSet());
		nameOVegie.forEach(System.out::println);
		
		System.out.println("4. Sort a vehicle model map");
		Map<Integer, String> modelMap = DataModel.getVehicleModeMap();
		Map<Integer, String> sortedMap = modelMap.entrySet()
				.stream()
				.sorted(comparing(Entry::getValue))
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1,e2) -> e1, LinkedHashMap::new)); 
		sortedMap.forEach((k,v) -> System.out.println(k + "-->" + v));
	}

}
