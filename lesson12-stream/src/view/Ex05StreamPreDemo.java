import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import bean.Dish;
import model.DataModel;

import static java.util.Comparator.*;

public class Ex05StreamPreDemo {
	public static void main(String[] args) {
		List<Dish> menu = DataModel.getDishes();

		// --> phát trực tiếp
		// stream --> traversable once

		System.out.println("1. Get dishes which have calories > 400g");
		List<Dish> weightCalories = menu.stream() // Stream<Dish>
				.filter(d -> d.getCalories() > 400) // Stream<Dish>
				.collect(Collectors.toList());
		weightCalories.forEach(System.out::println);

		System.out.println("2. Get name of dishes");
		Set<String> nameOfDishes = menu.stream() // Stream<Dish>
				.map(Dish::getName) // Stream<String>
				.collect(Collectors.toSet());
		nameOfDishes.forEach(System.out::println);

		String names = menu.stream().map(Dish::getName) // Stream<String>
				.collect(Collectors.joining(", "));
		System.out.println(names);

		System.out.println("3. Get name of dishes which are vegie food");
		Set<String> nameOfVegieDishes = menu.stream() // Stream<Dish>
				.filter(Dish::isVegetarian) // Stream<Dish>
				.map(Dish::getName) // Stream<String>
				.collect(Collectors.toSet());
		nameOfVegieDishes.forEach(System.out::println);

		System.out.println("4. Sort a vehicle model map");
		// map --> set --> list -sortbyKV- --> linkedhashmap
		// map --> set --> stream - sortbyKV --> linkedhashmap
		Map<Integer, String> modelMap = DataModel.getVehicleModelMap();
		Map<Integer, String> sortedMap = modelMap.entrySet() // Set<Entry<K, V>>
				.stream() // Stream<Entry<K, V>>
				.sorted(comparing(Entry::getValue)) // Stream<Entry<K, V>> Stream<T>
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		System.out.println("instance: " + sortedMap.getClass());
		sortedMap.forEach((k, v) -> System.out.println(k + " --> " + v));

		// Stream<Item(itemId, storeId, name)>
		// 1, S1, Item 1 --> (e1, e2) -> e1
		// 2, S2, Item 2
		// 3 S1, Item 3
		// 1 S2, Item 1 --> --> (e1, e2) -> e1
		// 1 S3, Item 1
		// 2, S2, Item 2

		// stream.collect(Collectors.toMap(Item::getItemId, Item::getStoreId));
	}
}