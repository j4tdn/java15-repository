package view;


import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

import bean.Trader;

import model.DataModel;

public class Ex02MethodReference {
	public static void main(String[] args) {
		List<Trader> traders = DataModel.getTraders();
		//Set<String> cities = map(traders, trader -> trader.getCity());
		Set<String> cities = map(traders, Ex02MethodReference :: any);
		//public static R any(T t){
		// return T=t.getF
		//}
		cities.forEach(System.out::println);
		
		
		
		//(T t) -> t.getF(); 
		//-->Method reference => T::getF (non-static)
		//		Require getF is a function in class T
		//-->Static:Method reference ==>T::any
		//public static R any(T t){
		// return T=t.getF
		//}
	}
	
	private static <R> Set<R> map(List<Trader> traders, Function<Trader, R > f){
		Set<R> result = new HashSet<>();
		for(Trader trader : traders) {
			result.add(f.apply(trader));
		}
		return result;
	}
	
	private static String any(Trader traders) {
		return traders.getCity();
	}
	
}
