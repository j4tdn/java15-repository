package view;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import  java.util.Comparator;
import static java.util.Comparator.*;

import com.sun.javafx.scene.traversal.WeightedClosestCorner;

import bean.Dish;
import model.DataModel;
import bean.Apple;
public class Ex05StreamPreDemo {

	public static void main(String[] args) {
		 List<Dish> menu = DataModel.getDishes();
		 //
		 System.out.println("1. Get dishes which have calories >250g");
		List<Dish> weightCalories = menu.stream()
		.filter(d->d.getCalories()>400)
		.collect(Collectors.toList());
		weightCalories.forEach(System.out:: println);
		
		
//		List<Apple> veget = DataModel.getApples();
//		System.out.println("2. Get weigh apple < 300");
//		
//		List<Apple> weightApple = veget.stream()
//		.filter(a->a.getWeight()<300)
//		.collect(Collectors.toList());
//		weightApple.forEach(System.out:: println);
		
		System.out.println("2. Get name of Dish");
		Set<String> nameOfDish = menu.stream()
		.map(Dish:: getName)
		.collect(Collectors.toSet());
		nameOfDish.forEach(System.out::println);
		
		String names = menu.stream()
				.map(Dish::getName) // Stream<String>
				.collect(Collectors.joining(", "));
		System.out.println(names);
		
		System.out.println("3. Get name of dishes which are vegie food");
		Set<String> nameOfVegieDishes = menu.stream() // Stream<Dish>   
				.filter(Dish::isVegetarian) // Stream<Dish>
				.map(Dish::getName) // Stream<String>
				.collect(Collectors.toSet());
		nameOfVegieDishes.forEach(System.out::println);
		
		System.out.println("4. Sort a vehicle model map");
		// map --> set --> list   -sortbyKV- --> linkedhashmap
		// map --> set --> stream - sortbyKV --> linkedhashmap
		Map<Integer, String> modelMap = DataModel.getVehicleModelMap();
		Map<Integer, String> sortedMap = modelMap.entrySet() // Set<Entry<K, V>>
		        .stream()  // Stream<Entry<K, V>>
		        .sorted(comparing(Entry::getValue)) // Stream<Entry<K, V>> Stream<T>
	//	        .collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		System.out.println("instance: " + sortedMap.getClass());
		sortedMap.forEach((k, v) -> System.out.println(k + " --> " + v));
		
	}

}
