package view;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import bean.Dish;
import model.DataModel;

public class Ex05StreamPreDemo {
	public static void main(String[] args) {
		List<Dish> menu = DataModel.getDishes();
		
		// stream --> traversable once
		
		System.out.println("1. Get dishes which have calories > 400g");
		List<Dish> weightCalories = menu.stream()
			.filter(d->d.getCalories() > 400)
			.collect(Collectors.toList());
		weightCalories.forEach(System.out::println);
		
		
		System.out.println("2. Get name of dishes");
		Set<String> nameOfDishes = menu.stream() //Stream<Dish>
			.map(Dish::getName) 				 //Stream<String>
			.collect(Collectors.toSet());
		nameOfDishes.forEach(System.out::println);
		
		String names = menu.stream() //Stream<Dish>
				.map(Dish::getName) 				 //Stream<String>
				.collect(Collectors.joining(", "));
		System.out.println(names);
		
		System.out.println("3. Get name of dishes which are vegaterians food");
		
		Set<String> nameOfVegieDishes = menu.stream()
									  .filter(Dish::isVegetarian)
									  .map(Dish::getName)
									  .collect(Collectors.toSet());
		nameOfVegieDishes.forEach(System.out::println);
		
		System.out.println("4. Sort a vehicle model map");
		Map<Integer,String> modelMap = DataModel.getVehicleModelMap();
		Map<Integer, String> sortedModelMmap = modelMap.entrySet()
				.stream()
				.sorted(Comparator.comparing(Entry::getValue))
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue,(e1,e2) -> e1, LinkedHashMap::new));
		// merge function trong toMap --> để lúc convert sang map lỡ có trùng nhau thì sẽ chọn 1 trong 2 thằng
		// để lấy, bản chất tham số thứ 3 là BiFunction(T,T,T)
		
		// Muốn convert sang LinkedHashMap thì phải gọi toMap(4 tham số)
		sortedModelMmap.forEach((k,v) -> System.out.println(k + " " + v));
		
		
	}
}
