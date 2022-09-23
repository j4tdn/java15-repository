package view;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import static java.util.Comparator.*;
import bean.Dish;
import model.DataModel;

public class Ex05StreamDemo {
	public static void main(String[] args) {
		List<Dish> menu = DataModel.getDishes();
		// --> phat truc tiep
		// stream --> traversable once
		System.out.println("1.Get dishes which have calories > 400g");
		// menu.stream().filter(d -> d.getCalories() >
		// 400).collect(Collectors.toList()).forEach(System.out::println);
		// ; // Stream<Dish>
		System.out.println("2.Get name of dishes");
		menu.stream().map(v -> v.getName()).collect(Collectors.toSet()).forEach(System.out::println);
		String names = menu.stream().map(Dish::getName).collect(Collectors.joining(","));
		System.out.println(names);
		System.out.println("3.Get name of dishes which is vegie food");
		menu.stream()
		     .filter(Dish::isVegetarian)
		     .map(v -> v.getName())
		     .collect(Collectors.toSet())
			 .forEach(System.out::println);
		System.out.println("4.Sort a budget map");
		// Map --> set --> list --> sorted --> linkedHashMap
		// map --> set --> stream --> sorted --> linkedHashMap
       Map<Integer, String> modelMap = DataModel.getVehicleModelMap();
  Map<Integer, String> sortedMap =    modelMap.entrySet() // Set<Entry<K,V>>
               .stream()  //  Stream<Entry<K,V>>
               .sorted(comparing(Entry::getValue)) 
               .collect(Collectors.toMap(Entry::getKey, Entry::getValue , (e1,e2)-> e1,LinkedHashMap::new));
     System.out.println("instance" + sortedMap.getClass());
     sortedMap.forEach((k,v) -> System.out.println(k +" -->" + v));
     // Stream<Item(itemId , storeId , name )>
     // 1,S1, Item 1 --> (e1,e2) ---> e1
     // 2,S2 , Item 2 
     // 3,S3, Item 3
     // 1,S3,Item1 --> (e1,e2) ---> e1
     // 1,S2, Item1 --> (e1,e2) ---> e1
     
	}
}
