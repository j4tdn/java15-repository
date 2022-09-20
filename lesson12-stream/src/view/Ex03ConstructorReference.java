package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

import bean.Trader;

public class Ex03ConstructorReference {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Terry", "Ricardo", "Toure");
		List<String> cities = Arrays.asList("Milan", "London", "NewYork");
		//convert names, cities --> traders
		//(t,u) -> new Trader(t,u) = Trader::new
		List<Trader> traders = map(names, cities, Trader::new);
		traders.forEach(System.out::println);
		
	}
	//Trader: new 2 parameters -> BiFunction
	//Trader: new 1 parameters -> Function
	//Trader: new 3 parameters -> Supplier 
	private static <T, U> List<Trader> map(List<T> names, List<U> cities, BiFunction<T, U, Trader> bf){
		List<Trader> traders = new ArrayList<>();
		for(int i = 0; i< names.size(); i++) {
			//strategy: (E, T) -> Trader
			//Trader trader = new Trader(names.get(i),cities.get(i))
			Trader trader = bf.apply(names.get(i),cities.get(i));
			traders.add(trader);
		}
		return traders;
	}
}	
