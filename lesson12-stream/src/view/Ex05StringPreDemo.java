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
import static java.util.Comparator.*;
public class Ex05StringPreDemo {
	public static void main(String[] args) {
		List<Dish> menu = DataModel.getDishes();
		// live-stream
		// stream -->traversable once(các phần tử stream chỉ dc duyệt 1 lần.
		System.out.println("1.Get Dishes which have calories>250g");
		List<Dish> weightcalories = menu.stream() // Stream<Dish>
										.filter(d -> d.getCalories() > 400) // Stream<Dish>
										.collect(Collectors.toList());
		weightcalories.forEach(System.out::println);
		
		System.out.println("2.Get name of dishes");
		Set<String> nameOfDish= menu.stream()				//Stream<Dish>
									.map(Dish::getName)		//Stream<String>
									.collect(Collectors.toSet());
		nameOfDish.forEach(System.out::println);
			
		String name= menu.stream()
						 .map(Dish::getName)
						 .collect(Collectors.joining(","));
		System.out.println(name);
		System.out.println("3.Get Dish is Vegetarian");
		Set<String> names=menu.stream()
			.filter(Dish::isVegetarian)
			.map(Dish::getName)
			.collect(Collectors.toSet());
		names.forEach(System.out::println);
		//map->set->list -sortbyKV -->linkedhashmap
		//map->set->stream-sortbyKV ->linkedhashmap
		System.out.println("4. Sort a vehicle model map");
		Map<Integer, String> 	modelMap = DataModel.getVehicleModelMap();
		Map<Integer, String>  sortedMap=modelMap.entrySet()				// Set<Entry<<K,V>>
												.stream()			//Stream <Entry<<K,V>>
												.sorted(comparing(Entry::getValue))//Stream <Entry<<K,V>>
												.collect(Collectors.toMap(Entry::getKey, Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
		
		//Stream<Item(itemID,StoreId,name)>
		//(e1,e2)->e1
		//(e1,e2)->e2
		
		System.out.println(sortedMap.getClass());
		sortedMap.forEach((k,v)->System.out.println(k+"->"+v));
		
		
		
	}
}
