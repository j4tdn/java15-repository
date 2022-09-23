package view;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

import bean.Trader;
import model.DataModel;

public class Ex02MethodReference {
	public static void main(String[] args) {
		List<Trader> traders = DataModel.geTraders();
		Set<String> cities = map(traders, trader -> trader.getCity());
		cities.forEach(System.out::println);

		// (T t) -> t.getF(); getF return T
		// --> Non-static : Method reference ==> T::getF
		// require getF is a function in class

		// --> Static : method reference ==> T::any
		// T
		// public static R any(T t){
		// return t.getF();

	}

	private static String any(Trader trader) {
		return trader.getCity();
	}

	private static <R> Set<R> map(List<Trader> traders, Function<Trader, R> function) {
		Set<R> cities = new HashSet<R>();
		for (Trader trader : traders) {
			cities.add(function.apply(trader));
		}

		return cities;
	}
}
