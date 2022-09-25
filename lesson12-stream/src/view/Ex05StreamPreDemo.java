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

public class Ex05StreamPreDemo {
	public static void main(String[] args) {
		List<Dish> menu = DataModel.getDishes();
		
		System.out.println("1. Get dishes which have calories > 400g");
		
		List<Dish> weightCalories = menu.stream()
										.filter(d -> d.getCalories() > 400)
										.collect(Collectors.toList());
		weightCalories.forEach(System.out::println);
		
		System.out.println("2. Get name of dishes");
		//c1
		Set<String> nameOfDishes = menu.stream()
										.map(Dish::getName)
										.collect(Collectors.toSet());
		nameOfDishes.forEach(System.out::println);
		
		//c2
		String names = menu.stream()
						   .map(Dish::getName)
						   .collect(Collectors.joining(", "));
		System.out.println(names);
						
		System.out.println("3. Get name of dishes which is vegetarian food");
		Set<String> nameOfVegieDishes = menu.stream()					//Stream<Dish>
											.filter(Dish::isVegetarian) //Stream<Dish>
											.map(Dish::getName)			//Stream<String>
											.collect(Collectors.toSet());
		nameOfVegieDishes.forEach(System.out::println);
		
		System.out.println("4. Sort a vehicle model map");
		
		//map --> set --> list   --sortByKV --> linkedhashmap
		//map --> set --> stream --sortbyKV --> linkedhashmap
		Map<Integer, String> modelMap = DataModel.getVehicleModelMap();
		Map<Integer, String> sortedMap = modelMap.entrySet()			//Set<Entry<K,V>>
				.stream()			//Stream<Entry<K,V>>
				.sorted(Comparator.comparing(Entry::getValue))
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));//Stream<Entry<K,V>>
		sortedMap.forEach((k, v) -> System.out.println(k + " --> " + v));
	}
}
