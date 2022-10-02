package view;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import java.util.stream.Collectors;
import static java.util.Comparator.*;

import bean.Dish;
import model.DataModel;

public class Ex05StreamPreDemo {
	public static void main(String[] args) {
		List<Dish> menu = DataModel.getDishes();
		
		System.out.println("1. Get dishes which have calories >250");
		List<Dish> weightcaloties = menu.stream().filter(d -> d.getCalories()>400).collect(Collectors.toList());
		  weightcaloties.forEach(System.out::println);
		System.out.println("2.Get name of dish");
		Set<String>  nameOfDishes =   menu.stream().map(Dish::getName).collect(Collectors.toSet());
		nameOfDishes.forEach(System.out::println);
		String names = menu.stream().map(Dish::getName).collect(Collectors.joining(","));
		System.out.println(names);
		System.out.println("3.get name of dish which are vegie food");
		Set<String>  nameOfVegieDishes =  menu.stream()
				.filter(Dish::isVegetarian  )
				.map(Dish::getName).
				collect(Collectors.toSet());
		nameOfVegieDishes.forEach(System.out::println);
		Map<Integer, String> modelMap = DataModel.getVehicleModelMap();
		Map<Integer, String> sortedMap = modelMap.entrySet().stream().
				sorted(comparing(Entry::getValue))
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
		
		sortedMap.forEach((k,v)->System.out.println(k +"-->" +v));
		
		
	}

}
