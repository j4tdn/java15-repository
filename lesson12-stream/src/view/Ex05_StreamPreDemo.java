package view;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import static java.util.Comparator.*;

import java.util.Arrays;

import javax.xml.crypto.Data;

import bean.Dish;
import model.DataModel;

public class Ex05_StreamPreDemo {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Essdf","Bgfghjfgf","Cdgdf","Dfsd");

	    Optional<String> result = list.stream().parallel().findAny();
	    Optional<String> result1 = list.stream().reduce((t,u) -> t.length() > u.length() ? t : u);
	    result1.ifPresent(System.out::println);
	    result.ifPresent(v -> System.out.printf(v));
		List<Dish> menu = DataModel.getDishes();
		//stream -> traversable once
		System.out.println("1. Get dishes which have calories > 250g");
		boolean answer = menu.stream().allMatch(d -> d.getCalories() > 500);
		boolean answer1 = menu.stream().anyMatch(d -> d.getCalories() > 500);
		
		System.out.println(answer);
		System.out.println(answer1);
		List<Dish> weightCalories =  menu.stream()
				.filter(d -> d.getCalories() > 450)
				//.limit(3)
				//.skip(2)
				.collect(Collectors.toList());
		//.sorted(Comparator.comparing(Dish::getCalories));
		weightCalories.forEach(System.out::println);
		
		System.out.println("2. Get name of dishes");
		Set<Integer> nameOfDishes =  menu.stream()
				.map(Dish::getName)
				.map(String::length)
				.collect(Collectors.toSet());
		nameOfDishes.forEach(System.out::println);
		
		String names = menu.stream().map(Dish::getName).collect(Collectors.joining(", "));
		System.out.println(names);
		
		System.out.println("3. Get name of dishes which is vgetarian food");
		Set<String> nameOfDishesIsVegetarian =  menu.stream() //Stream<Dish>
				.filter(Dish::isVegetarian) //Stream<String>
				.map(Dish::getName)
				.collect(Collectors.toSet());
		nameOfDishesIsVegetarian.forEach(System.out::println);
		System.out.println("4.Sort a vehicle model map");
		Map<Integer, String> modelMap = DataModel.getVehicleModelMap();
		Map<Integer, String> sortedMap = modelMap.entrySet() //Set<Entry<K, V>>
		.stream()	//Stream<Entry<K, V>>
		.sorted(comparing(Entry::getValue)) //Stream<Entry<K, V>>
		.collect(Collectors.toMap(Entry::getKey, Entry::getValue,(e1, e2) -> e1, LinkedHashMap::new));
		sortedMap.forEach((k, v) -> System.out.println(k + "-->" + v));
		

	}
}
