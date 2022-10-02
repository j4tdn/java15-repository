package view;

import static java.util.Comparator.*;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import bean.Dish;
import bean.Dish.Kind;
import model.DataModel;

import static java.util.Comparator.*;

public class Ex05StreamPreDemo {
	public static void main(String[] args) {
		List<Dish> menu = DataModel.getDishes();
		
		
		// --> phát trực tiếp
		// stream --> traversable once
		
		System.out.println("1. Get dishes which have calories > 400g");
		List<Dish> e1 = menu.stream() // Stream<Dish>
			.filter(d -> d.getCalories() > 400)
			.collect(Collectors.toList());
		e1.forEach(System.out::println);
		
		System.out.println("2. Get name of dishes");
		Set<String> e2 = menu.stream()
						.map(Dish::getName)
						.collect(Collectors.toSet());
		
		 String names = menu.stream()
				   .map(Dish::getName) 
				   .collect(Collectors.joining("|"));
		e2.forEach(System.out::println);
		System.out.println(names);
		
		System.out.println("3. Get name of dishes which are vegie food");
		Set<String> e3 = menu.stream()
				.filter(Dish::isVegetarian)
				.map(Dish::getName)
				.collect(Collectors.toSet());
        e3.forEach(System.out::println);
		
       
		System.out.println("4. Sort a vehicle model map");
		// map --> set --> list - sort --> linkedhashmap
		// map --> set --> strea - sort --> linkedhashmap
		Map<Integer, String> modelMap = DataModel.getVehicleModelMap();
		Map<Integer, String> sortedMap = modelMap.entrySet()//Set<entry<k,v>
				.stream()//Stream<entry<k,v>
				.sorted(comparing(Entry::getValue))//Stream<entry<k,v>
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (a1, a2) -> a1, LinkedHashMap::new));
		System.out.println(sortedMap.getClass());		
		sortedMap.forEach((k,v) -> System.out.println(k + "---" + v));
		
		// Stream<Item(itemId, storeId, name)>
		// 1, S1, Item 1 --> (e1, e2) -> e1
		// 2, S2, Item 2
		// 3  S1, Item 3
		// 1  S2, Item 1 --> --> (e1, e2) -> e1
		// 1  S3, Item 1
		// 2, S2, Item 2
		
		
		// stream.collect(Collectors.toMap(Item::getItemId, Item::getStoreId));
	}
}