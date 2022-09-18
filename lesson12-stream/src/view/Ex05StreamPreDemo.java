package view;

import static java.util.Comparator.comparing;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import bean.Dish;
import model.DataModel;

public class Ex05StreamPreDemo {
	public static void main(String[] args) {
		List<Dish> menu = DataModel.getDishes();
		
		System.out.println("1. Get dishes which have calories > 400g");
		List<Dish> weightCalories = menu.stream() // stream<Dish>
			.filter(d -> d.getCalories() > 400) //stream<Dish>
			.collect((Collectors.toList()));
		weightCalories.forEach(System.out::println);
		
		System.out.println("2. Get name of dishes");
		Set<String> nameOfDishes = menu.stream() // stream<Dish>
			.map(Dish::getName)
			.collect(Collectors.toSet());
		nameOfDishes.forEach(System.out::println);
		
		String names = menu.stream()
				.map(Dish::getName)
				.collect(Collectors.joining(", "));
		System.out.println(names);
		
		System.out.println("3. Get name of dishes which are vegearian food");
		Set<String> nameOfDishVegetarian = menu.stream() // stream<Dish>
				.filter(d -> d.isVegetarian())
				.map(Dish::getName)
				.collect(Collectors.toSet());
		nameOfDishVegetarian.forEach(System.out::println);	
		
		System.out.println("4. Sort a vehicle motobike model map");
		// map --> set --> stream - sortbyKV --> linkedhashmap
		Map<Integer, String> modelMap = DataModel.getVehicleModelMap();
		Set<Entry<Integer, String>> modelSet = modelMap.entrySet();
		Map<Integer, String> sortedMap = modelSet // Set<Entry<K, V>
				.stream()	// Stream<Entry<K, V>>
				.sorted(comparing(Entry::getValue)) // Stream<Entry<K, V>>
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue,(e1, e2) -> e1,LinkedHashMap::new));
		
		System.out.println("instance: " + sortedMap.getClass());
		sortedMap.forEach((k, v) -> System.out.println(k + " --> " + v));
		
	}
}
