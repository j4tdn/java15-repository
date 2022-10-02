package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

import bean.Trader;

public class Ex03ConstructorReference {
	public static void main(String[] args) {
		List<String> names=Arrays.asList("Terry","Ricardo","Toure");
		List<String> cities=Arrays.asList("Milan","London","NewYork");
		//convert names,cities --> traders
		//List<Trader> traders=map(names,cities,Trader::new);
		//List<Trader> traders= map(names, cities, Trader::new);
		//traders.forEach(System.out::println);
		
		List<Trader> traders2=map2(names, cities, Trader::new);
		traders2.forEach(System.out::println);
		
		
		
	}
	private static <T,U> List<Trader>  map(List<T> ts, List<U> us, BiFunction<T, U, Trader> bf){
		
		List<Trader> traders= new ArrayList<>();
		for(int i=0; i<ts.size(); i++) {
			Trader trader= bf.apply(ts.get(i),us.get(i));
			traders.add(trader);
		}
		return traders;
	}
	private static <T,U,R> List<R>  map2(List<T> ts, List<U> us, BiFunction<T, U, R> bf){
		
		List<R> traders= new ArrayList<>();
		for(int i=0; i<ts.size(); i++) {
			R rs= bf.apply(ts.get(i),us.get(i));
			traders.add(rs);
		}
		return traders;
	}
	
}
