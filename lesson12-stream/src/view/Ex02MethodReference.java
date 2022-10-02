package view;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

import bean.Trader;
import model.DataModel;

public class Ex02MethodReference {
	public static void main(String[] args) {
		List<Trader> traders = DataModel.getTraders();
		//Set<String> cities = map(traders, trader -> trader.getCity());
		Set<String> cities = map(traders, trader -> trader.getCity());
		//Set<String> cities = map(traders, Ex02MethodReference::any);
		cities.forEach(System.out::println);
		
		//(T t) -> t.getF(); getF return R
		//--> Non- static: Method reference ==> T::getF
		//	  Require getF is a function in class T
		//	  
		//--> Static: Method reference ==> T::any
		// public static R any(T t) {
		//		return t.getF();
		// }
	} 	
	private static String any(Trader trader) {
		return trader.getCity();
	}
	// Trder -> R
	private static <R> Set<R> map(List<Trader> traders, Function<Trader, R> f) {
		Set<R> cities = new HashSet<>();
		for(Trader trader: traders)  {
			cities.add(f.apply(trader));
		}
		return cities;
	}
}

