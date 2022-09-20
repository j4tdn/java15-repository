//package view;
//
//import java.util.Arrays;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Map;
//import java.util.Set;
//import java.util.function.Function;
//import java.util.function.Predicate;
//import java.util.stream.Collectors;
//
//import bean.Dish;
//import model.DataModel;
//
//public class Ex08TestStream {
//	public static void main(String[] args) {
//		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 3, 1, 4);
//		List<Dish> menu = DataModel.getDishes();
////		menu.stream()
////			   .filter(distinctByKey(dish -> dish.getCalories()))
////			   .forEach(System.out::println);
//		
////		int sum = numbers.stream().reduce(0, (a,b) -> a+b);
//		
//		Map<String,String> map = menu.stream()
//									 .collect(Collectors.toMap(Dish::getId, Dish::getName, (e1,e2) -> e1));
////		int sum = numbers.stream().collect(Collectors.to)
//		System.out.println(temp);
//		System.out.println(map);
//	}
//
//	public static <T,R> Predicate<T> distinctByKey(Function<T, R> function) {
//	    Set<R> seen = new HashSet<>();
//	    return t -> seen.add(function.apply(t));
//	}
//}
