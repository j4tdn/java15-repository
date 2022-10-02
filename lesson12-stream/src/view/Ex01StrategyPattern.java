package view;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import bean.Apple;
import model.DataModel;

public class Ex01StrategyPattern {
	public static void main(String[] args) {
		List<Apple> inventory = DataModel.getApples();
		List<Apple> redApple=findApple(inventory,  (Apple apple)->{
			return "red".equals(apple.getColor());
		});
		List<Apple> heavyApple= findApple(inventory, apple->apple.getWeight()>300);
		heavyApple.forEach(System.out::println);
	}
	private static List<Apple> findApple(List<Apple> inventory, Predicate<Apple> predicate){
		List<Apple> results= new ArrayList<>();
		for(Apple apple:inventory) {
			predicate.test(apple);
		}
		return results;
	}
}
