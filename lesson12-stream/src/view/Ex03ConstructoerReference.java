package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

import bean.Trader;

public class Ex03ConstructoerReference {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Terry", "Ricado" ,"Toure" );
		List<String> cities = Arrays.asList("Milan", "London" ,"NewYork" );
		//Convert names, cities --> traders
		// ( t,u) -> new trader (t,u) = Trader::new
		List<Trader> traders = map(names, cities, Trader::new);
		traders.forEach(System.out::println);
		
	}
	// Trader:: new 2 parameters --> BiFunction
	// Trader:: new 1 parameter  --> Function
	// Trader:: new 0 parameter  --> Supplier
	private static <T,U> List<Trader> map(List<T> ts, List<U> us, BiFunction<T, U, Trader> bf){
		List<Trader> traders = new ArrayList<>();
		for( int i = 0 ; i < ts.size(); i++) {
			//Trader trader = new Trader(name.get(i), cities.get(i));
			Trader trader = bf.apply(ts.get(i), us.get(i));
			
			traders.add(trader);
		}
		return traders;
	}

}
