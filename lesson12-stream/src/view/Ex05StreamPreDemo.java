package view;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.print.attribute.standard.MediaSize.Other;

import bean.Dish;
import model.DataModel;

public class Ex05StreamPreDemo {
	public static void main(String[] args) {
		List<Dish> menu = DataModel.getDishes();
		
		System.out.println("1. Get Dishes which have calories > 250g");
		List<Dish> weightCalories =   menu.stream()
				.filter(d -> d.getCalories() > 400)
				.collect(Collectors.toList());
		weightCalories.forEach(System.out::println);
		
		System.out.println("2. Get Names of dishes");
		Set<String> nameofDishes =  menu.stream()
			.map(Dish::getName)
			.collect(Collectors.toSet());
		
		nameofDishes.forEach(System.out::println);
		
		String names = menu.stream()
				.map(Dish::getName)
				.collect(Collectors.joining(", "));
		System.out.println(names);
		
		Set<String> vegetarianDishes = menu.stream()
				.filter(Dish::isVegetarian)
				.map(Dish::getName)
				.collect(Collectors.toSet());
		vegetarianDishes.forEach(System.out::println);
		
		System.out.println("4. Sort a vehicle model map");
		Map<Integer, String> modelMap = DataModel.getVehicleModelMap();
		Map<Integer, String> sortedMap =  modelMap.entrySet()
				.stream()
				.sorted(Comparator.comparing(Entry::getValue, Comparator.reverseOrder()))
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1,e2) -> e1, LinkedHashMap::new));
		sortedMap.forEach((k, v) -> System.out.println(k+ " -- >" +v));;
	}
}
