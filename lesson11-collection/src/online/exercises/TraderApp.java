package online.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TraderApp {
	public static void main(String[] args) {
		List<Transaction> list = getTransactions();
		
		
		//1 Find all transactions in the year 2011 and sort them by value (small to high).
		List<Transaction> transactionIn2011 = findTransactionsin2011(list);
		
		transactionIn2011.sort(Comparator.comparing(Transaction::getValue));
		//2 Find all transactions have value greater than 300 and sort them by trader’s city
		List<Transaction> greaterThan300 = findTransactionGreaterThan300(list);
		Collections.sort(greaterThan300, Comparator.comparing(t -> t.getTrader().getCity()));
		//3 What are all the unique cities where the traders work?
		Set<String> cities = findTradersCity(list);
		
		//4 Find all traders from Cambridge and sort them by name desc.
		List<Trader> tradersFromCambridge = finTraderFromCambridge(list, "Cambridge");
		
		//5. Return a string of all traders’ names sorted alphabetically.
		Set<String> traders = findTradersName(list);
		System.out.println(traders);
		
		//6.Are any traders based in Milan?
		System.out.println(traderInMilan(list, "Milan"));
		
		//7. Count the number of traders in Milan.
		int numberOfTradersInMilan = numberOfTradersInMilan(list, "Milan");
		
		//8. Print all transactions’ values from the traders living in Cambridge.
		printTransactionValue(list, "Cambridge");
		
		//9. What’s the highest value of all the transactions?
		System.out.println("highest value: " + highestTransaction(list));
		
		//10. Find the transaction with the smallest value.
		System.out.println("smallest value: " + smallestTransaction(list));
		System.out.println("==================");
		System.out.println(smallestTransactions(list));
		System.out.println(highestTransactions(list));
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
	//1 Find all transactions in the year 2011 and sort them by value (small to high)
	private static List<Transaction> findTransactionsin2011(List<Transaction> list){
		List<Transaction> result = new ArrayList<>();
		for(Transaction transaction : list) {
			if(transaction.getYear() == 2011) {
				result.add(transaction);
			}
		}
		return result;
	}
	//2 Find all transactions have value greater than 300 and sort them by trader’s city
	private static List<Transaction> findTransactionGreaterThan300(List<Transaction> list){
		List<Transaction> result = new ArrayList<>();
		for(Transaction transaction : list) {
			if(transaction.getValue() > 300) {
				result.add(transaction);
			}
		}
		return result;
	}
	//3 What are all the unique cities where the traders work?
	private static Set<String> findTradersCity(List<Transaction> list){
		Set<String> cities = new HashSet<>();
		for(Transaction transaction : list) {
			cities.add(transaction.getTrader().getCity());
		}
		return cities;
	}
	//4 Find all traders from Cambridge and sort them by name desc.
	private static List<Trader> finTraderFromCambridge(List<Transaction> list, String city){
		List<Trader> traders = new ArrayList<>();
		for(Transaction transaction : list) {
			if(transaction.getTrader().getCity().equals(city)) {
				traders.add(transaction.getTrader());
			}
		}
		return traders;
	}
	//5. Return a string of all traders’ names sorted alphabetically.
	private static Set<String> findTradersName(List<Transaction> list){
		Set<String> traders = new TreeSet<>();
		for(Transaction transaction : list) {
			traders.add(transaction.getTrader().getName());
		}
		return traders;
	}
	//6.Are any traders based in Milan?
	private static boolean traderInMilan(List<Transaction> list, String city) {
		for(Transaction transaction : list) {
			if(transaction.getTrader().getCity().equals(city)) {
				return true;
			}
		}
		return false;
	}
	//7. Count the number of traders in Milan.
	private static int numberOfTradersInMilan(List<Transaction> list, String city) {
		int count = 0;
		for(Transaction transaction : list) {
			if(transaction.getTrader().getCity().equals(city)) {
				count++;
			}
		}
		return count;
	}
	//8. Print all transactions’ values from the traders living in Cambridge.
	private static void printTransactionValue(List<Transaction> list, String city) {
		for(Transaction transaction : list) {
			if(transaction.getTrader().getCity().equals(city)) {
				System.out.println(transaction.getValue());
			}
		}
	}
	//9. What’s the highest value of all the transactions?(1)
	private static Transaction highestTransaction(List<Transaction> list) {
		TreeSet<Transaction> set = new TreeSet<>();
		set.addAll(list);
		return set.last();
	}
	//9. What’s the highest value of all the transactions?(2)
	private static Transaction highestTransactions(List<Transaction> list){
		Transaction highest = new Transaction(null, 0, Double.MIN_VALUE);
		for(Transaction transaction : list) {
			if(transaction.getValue() > highest.getValue()) {
				highest = transaction;
			}
		}
		return highest;
	}
	//10. Find the transaction with the smallest value.(1)
	private static Transaction smallestTransaction(List<Transaction> list) {
		TreeSet<Transaction> set = new TreeSet<>();
		set.addAll(list);
		return set.first();
	}
	//10. Find the transaction with the smallest value.(2)
	private static Transaction smallestTransactions(List<Transaction> list){
		Transaction smallest = new Transaction(null, 0, Double.MAX_VALUE);
		for(Transaction transaction : list) {
			if(transaction.getValue() < smallest.getValue()) {
				smallest = transaction;
			}
		}
		return smallest;
	}
	
}
