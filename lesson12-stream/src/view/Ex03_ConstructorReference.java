package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

import bean.Trader;

public class Ex03_ConstructorReference {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Terry", "Ricardo", "Toure");
		List<String> cities = Arrays.asList("Milan", "LonDon", "NewYork");
	//	List<Trader> traders = map1(name, cities,(t,u) -> new Trader(t,u));
		List<Trader> traders = map1(names, cities,Ex03_ConstructorReference::any);
		//List<Trader> traders = map1(name, cities,Trader::new);//method reference
		traders.forEach(System.out::println);
	}

	private static List<Trader> map(List<String> names, List<String> cities) {
		List<Trader> traders = new ArrayList<>();
		for (int i = 0; i < names.size(); i++) {
			Trader trader = new Trader(names.get(i), cities.get(i));
			traders.add(trader);
		}
		return traders;
	}
	private static <T,U> List<Trader> map1(List<T> ts, List<U> us, BiFunction<T, U, Trader> bf){
		List<Trader> traders = new ArrayList<>();
		for (int i = 0; i < ts.size(); i++) {
			Trader trader = bf.apply(ts.get(i), us.get(i));
			traders.add(trader);
		}
		return traders;
	}
	private static Trader any(String name, String city) {
		return new Trader(name, city);
	}
}
