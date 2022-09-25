package view;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import bean.Apple;
import model.DataModel;

public class Ex01StrategyPattern {
	public static void main(String[] args) {
		List<Apple> inventory = DataModel.getApples();
		List<Apple> redApples = findApples(inventory, (Apple apple) -> {
			return "red".equals(apple.getColor());
		});
		redApples.forEach(System.out::println);
		
		System.out.println("==================");
		
		List<Apple> heavyApples = findApples(inventory, apple -> apple.getWeight() > 300);
		heavyApples.forEach(System.out::println);
	}
	
	//tìm apple theo color
	private static List<Apple> findApples(List<Apple> inventory, Predicate<Apple> predicate){
		List<Apple> result = new ArrayList<>();
		for(Apple apple: inventory) {
			if(predicate.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}
}
