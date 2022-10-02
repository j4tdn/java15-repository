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
		List<Trader> traders = DataModel.getTraders();
		Set<String> cities = map(traders, trader -> trader.getCity());
		cities = map(traders, Trader::getCity);
		cities = map(traders, Ex02MethodReference::any);
		cities.forEach(System.out::println);
		
		// (T t) -> t.getF()      // getF return R
		// --> Non-static: Method reference ==> T::getF
		// BắT buộc getF là function trong class T
		// -- Static : Method reference ==> X|T::any
		// X|T
		// public static R anymethod(){
		// return t.getF();
		// {
	}
// Dùng khi có nhiều điều kiện 
	private static String any (Trader trader) {
		return trader.getCity();
	}
	
// InputL Trader --> tra ve T
	private static <R> Set<R> map(List<Trader> traders, Function<Trader, R> f){
		Set<R> result = new HashSet<>();
		for(Trader trader : traders) {
			result.add(f.apply(trader));
		}
		return result;
	}
}
