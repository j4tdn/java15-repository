package view;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import bean.Dish;
import bean.Dish.Kind;
import model.DataModel;

public class Ex07StreamOperations {
	public static void main(String[] args) {
      List<String> students = Arrays.asList("Smith","Terry","Adam");
        // collector(Collectors.toList , Map , Set , joining
       // distinct :: loai bo cac phan tu trung nhau
      students.stream().filter(student -> {
    	  System.out.println("Handling student  " + student);
    	  return student.length() == 5;})
          .toArray(String[]::new);
     
      List<Dish> dishes = DataModel.getDishes();
      Map<String, String> mapDishes = dishes.stream().sorted(Comparator.comparing(Dish::getId))
    		                                .collect(Collectors.toMap(Dish::getId, Dish::getName, (e1 , e2) -> e1, LinkedHashMap::new));
      mapDishes.forEach((k,v) -> System.out.println(k + "---->" + v));
      System.out.println("====================================================");
      dishes.stream().filter(dish -> dish.getKind().equals(Kind.MEAT)).map(Dish::getCalories).distinct().collect(Collectors.toList()).forEach(System.out::println);
	}
}
