package view;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

import bean.Trader;
import model.*;

public class Ex02MethodReference {
	public static void main(String[] args) {
		List<Trader> traders = DataModel.getTraders();
		//Case1
		Set<String> cities1=map(traders, trader->trader.getCity());
		cities1.forEach(System.out::println);
		//Case2
		Set<String> cities2=map(traders, Trader::getCity);
		//Case3
		Set<String> cities3=map(traders, Ex02MethodReference::any);
		
		//T t ->t.getF(); getF return R
		//C1:-->Non-Static:Method reference  ==> T::getF
		//		Require getF is a funtion in class T
		
		
		//C2:--> Static:Method reference  ==>T::any
		//
		//public static R any(){
		//return t.getF():
		//}
		
		
	}
	
	private static String any(Trader trader) {
		return trader.getCity();
	}
	private static <R> Set<R> map(List<Trader> traders, Function<Trader, R> f ){
		Set<R> results= new HashSet<>();
		for(Trader trader:traders) {
			results.add(f.apply(trader));
		}
		
		return results;
		
		
	}
}
