package workingwithstreams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import bean.Dish;
import model.DataModel;

public class Exercises {
	public static void main(String[] args) {
		List<Dish> menu = DataModel.getDishes();

		
		// Exercise: create a MEAT menu be filtering all MEAT dishes from menu
		System.out.println("\nmenuMeat");
		List<Dish> menuMeat	= menu.stream()
								.filter(Dish::isMeat)
								.collect(Collectors.toList());
		menuMeat.forEach(System.out::println);
		
		//  create a MEAT menu from initial menu and makes sure that there are no duplicates of
		//  calories

		System.out.println("\nmenuMeatDistincLimitAndSkips");
		List<Dish> menuMeatDistinct	= menu.stream()
				.filter(Dish::isMeat)
				.distinct()
				.limit(2) // 3 -> 2 
				.skip(1) // bỏ qua 1 phần tử đầu tiên
				.collect(Collectors.toList());
		menuMeatDistinct.forEach(System.out::println);
		
		System.out.println("\ndishNameLengths");
		List<Integer> dishNames = menu.stream()
				.map(Dish::getName) // lấy ra tên dish
				.map(String::length) // hiển thị chiều dài của tên
				.collect(Collectors.toList());
		dishNames.forEach(System.out::print);

		List<Integer> list1 = Arrays.asList(1 , 2, 3);
		List<Integer> list2 = Arrays.asList(4 , 5, 6);
		List<Integer> list3 = Arrays.asList(7 , 8, 9);
		
		System.out.println("\n\nFlatmap");
		// Collection<Collection<T>> to Stream<Collection<T>> Stream<T> to Collection<T>
		List<List<Integer>> listOfLists = Arrays.asList(list1 , list2, list3);
		List<Integer> listAll = listOfLists.stream()
				.flatMap(i -> i.stream())
				.collect(Collectors.toList());
		listAll.forEach(System.out::print);
		
		String[][] dataArrays = new String[][] {
			{"a", "b"},
			{"c", "d"},
			{"e", "f"},
			{"g", "h"}
		};
		
		System.out.println("\n\nlistOfChars");

		String[] listOfChars = Arrays.stream(dataArrays)
								.flatMap(d -> Arrays.stream(d))
								.toArray(String[]::new);
		for(String c: listOfChars) {
			System.out.print(c);
		}
		
		System.out.println("\n\nFinding and matching:");
		/*
		 *Example: Give a list of numbers: 1, 2, 1, 4, 5, 8, 10, 4, 12
			1st: is there any element that is divisible by 10
			2nd: find the first element that is divisible by 4
			3nd: find the element that is divisible by 5 in the list
			4th: does all elements less than 100
			5th: does no elements greater than 0 
		*/
		
		List<Integer> numbers = Arrays.asList(1, 2, 1, 4, 5, 8, 10, 4, 12);
		System.out.print("ex01: ");
		boolean ex01 = numbers.stream()
				.filter(d -> d%10 == 0)
				.findAny() != null;
		System.out.println(ex01);
		
		System.out.print("ex02: ");
		Optional<Integer> ex02 = numbers.stream()
				.filter(d -> d%4 == 0)
				.findFirst();
		System.out.println(ex02);
		
		System.out.print("ex03: ");
		List<Integer> ex03 = numbers.stream()
				.filter(d -> d%5 == 0)
				.collect(Collectors.toList());
		System.out.println(ex03);
		
		System.out.print("ex04: ");
		boolean ex04 = numbers.stream()
				.allMatch(d -> d < 100);
		System.out.println(ex04);
		
		System.out.print("ex05: ");
		boolean ex05 = numbers.stream()
				.noneMatch(d -> d > 0);
		System.out.println(ex05);
		
		// sum
		System.out.print("sum: ");
		Optional<Integer> sum = numbers.stream().reduce((a,b) -> a + b);
		// (a,b) -> a + b == Integer::sum
		System.out.println(sum);
		
		System.out.print("max: ");
		Optional<Integer> max = numbers.stream().reduce((a, b) -> a > b ? a : b);
		System.out.println(max);
		
		System.out.print("min: ");
		Optional<Integer> min = numbers.stream().reduce(Integer::min);
		System.out.println(min);
		
		System.out.println("\nNumeric stream");
		Optional<Double> sumCalories = menu.stream()
				.map(Dish::getCalories)
				.reduce(Double::sum);
//		double sumCalories = menu.stream()
//				.mapToDouble(Dish::getCalories)
//				.sum();
		System.out.println(sumCalories);
		
		System.out.println("\nConverting back to stream of objects");
		DoubleStream doubleStream = menu.stream().mapToDouble(Dish::getCalories);
		Stream<Double> calories = doubleStream.boxed();
		System.out.println(calories);
		
		System.out.println("\ngenerate all numbers between 1 and 100.");
		IntStream evenNumbers = IntStream.rangeClosed(0, 100)
				.filter(n -> n%2 ==0);
		System.out.println(evenNumbers.sum());
		
		System.out.println("\nArithmetic Operations");
		int[] integers = new int[] {1, 2, 3, 4, 5};
		int minIntegers = Arrays.stream(integers)
				.min()
				.getAsInt();
		System.out.println("minIntegers: " + minIntegers);
		
		double avg = IntStream.of(1, 2 ,3, 4, 5)
				.average()
				.getAsDouble();
		System.out.println("avg: " + avg);
		
		System.out.println("Building streams:");
		Stream.iterate(0, n -> n + 2)
			.limit(10)
			.forEach(System.out::print);
		System.out.println();
		Stream.generate(Math::random)
			.limit(5)
			.forEach(System.out::println);
	}
}
