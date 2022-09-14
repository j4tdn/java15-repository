package view;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

import bean.Trader;
import model.DataModel;

public class Ex02_MethodReference {
	public static void main(String[] args) {
		List<Trader> traders = DataModel.getTraders();
		//Set<String> cities = map(traders, trader -> trader.getCity());
		Set<String> cities = map(traders, Ex02_MethodReference::any);
	//	Set<String> cities = map(traders, Trader::getCity);
		cities.forEach(System.out::println);
	}
	
	private static<R> Set<R> map(List<Trader> traders, Function<Trader, R> f){
		Set<R> result = new HashSet<>();
		for(Trader trader : traders) {
			result.add(f.apply(trader));
		}
		return result;
	}
	//(T t) -> t.getF(); getF reeturn R
	//--> Non static Method reference -->T::getF
	//Require getF is a function in class T
	//--> Static : Method
	private static String any(Trader trader) {
		return trader.getCity();
	}
}
