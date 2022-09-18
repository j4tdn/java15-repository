package model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Apple;
import bean.Dish;
import bean.Dish.Kind;
import bean.Store;
import bean.Trader;
import bean.Transaction;

public class DataModel {
	private DataModel() {
		
	}
	
	public static BigDecimal bd(long value) {
        return BigDecimal.valueOf(value);
    }
	
	public static List<Store> getStores() {
        return Arrays.asList(
            new Store(1L, null, bd(18), bd(40), Boolean.TRUE),
                new Store(2L, null, bd(19), bd(20), Boolean.TRUE),
                new Store(3L, null, bd(21), bd(17), Boolean.TRUE),
                new Store(4L, null, bd(14), bd(31), Boolean.TRUE),
                new Store(5L, null, bd(14), bd(10), Boolean.TRUE),
                new Store(6L, null, bd(15), bd(30), Boolean.TRUE),
                new Store(7L, 2L, bd(15), null, Boolean.TRUE),
                new Store(8L, null, bd(12), bd(19), Boolean.TRUE),
                new Store(9L, null, bd(17), bd(26), Boolean.TRUE),
                new Store(10L, 7L, bd(18), null, Boolean.TRUE),
                new Store(11L, null, bd(22), null, Boolean.FALSE)
        );
    }
	public static List<Apple> getApples() {
		return Arrays.asList(
				new Apple(1, "green", 200, "Vietnam"),	
				new Apple(16, "green", 300, "Vietnam"),	
				new Apple(22, "red", 300, "Lao"),	
				new Apple(4, "yellow", 400, "Thailand"),	
				new Apple(17, "red", 600, "Vietnam"),	
				new Apple(6, "green", 100, "Thailand")	
		);
	}
	
	public static List<Trader> getTraders(){
		List<Trader> traders = new ArrayList<Trader>();
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");
		
		traders.add(raoul);
		traders.add(brian);
		traders.add(alan);
		traders.add(mario);
		
		return traders;
	}
	
	public static List<Dish> getDishes() {
		return Arrays.asList(
				new Dish("1", "D1", 308, Kind.FISH, false),
				new Dish("2", "D2", 620, Kind.OTHER, true),
				new Dish("3", "D3", 329, Kind.OTHER, true),
				new Dish("4", "D4", 308, Kind.MEAT, false),
				new Dish("5", "D5", 480, Kind.MEAT, false),
				new Dish("6", "D6", 480, Kind.MEAT, false),
				new Dish("7", "D7", 818, Kind.MEAT, false));
	}
	
	public static List<Transaction> getTransactions() {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");
		List<Transaction> transactions = Arrays.asList(
			new Transaction(brian, 2011, 300),
			new Transaction(raoul, 2012, 1000), 
			new Transaction(raoul, 2011, 400),
			new Transaction(mario, 2012, 710), 
			new Transaction(mario, 2012, 700), 
			new Transaction(alan, 2012, 950)
		);
		return transactions;
	}
	
	public static Map<Integer, String> getVehicleModelMap(){
		Map<Integer, String> vnVehicleModel = new HashMap<>();
		vnVehicleModel.put(43, "Đà Nẵng");
		vnVehicleModel.put(73, "Quảng Bình");
		vnVehicleModel.put(74, "Quảng Trị");
		vnVehicleModel.put(75, "Thừa Thiên Huế");
		vnVehicleModel.put(92, "Quảng Nam");
		
		return vnVehicleModel;
	}
}
