package view;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

import bean.Trader;
import bean.Transaction;
import model.DataModel;

public class Ex02MethodReference {
	public static void main(String[] args) {
		List<Trader> traders = DataModel.getTrader();
		//Set<String> cities = map(traders, trader -> trader.getCity());
		Set<String> cities = map(traders, Trader::getCity);
		cities.forEach(System.out::println);
		
	}
	
	private static <R> Set<R> map	(List<Trader> traders, Function<Trader, R> f){
		Set<R> result = new HashSet<>();
		for(Trader trader: traders) {
			result.add(f.apply(trader));
		}
		return result;
	}
	
	private static String any(Trader traders) {
		return traders.getCity();
	}
	
}
