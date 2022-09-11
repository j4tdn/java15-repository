package online.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;

public class App {
	public static void main(String[] args) {
		List<Transaction> transactions = getTransactions();
		
		System.out.println("\n1. transactionIn2021 sort by value: " + 
							getTransactionIn2021(transactions));
		
		System.out.println("\n2. transactionInValue sort by city: " +
							getTransactionInValue(transactions));
		
		System.out.println("\n3. getCitiesTraderWork: " + getCitiesTraderWork(transactions));
		
		System.out.println("\n4. transactionInCambridge sort by name desc: " +
							getTransactionInCambridge(transactions));
		
		System.out.println("\n5. allTradesName: " + getAllTradersName(transactions));
		
		System.out.println("\n6. testCityOfTraders: " + testCityOfTraders(transactions, "Milan"));
		
		System.out.println("\n7. countNumberOfTradersInCity: " + 
							countNumberOfTradersInCity(transactions, "Milan"));
		
		System.out.println("\n8. sumValueOfTradersInCity: " +
							sumValueOfTradersInCity(transactions, "Cambridge"));
		
		System.out.println("\n9. getHighestValueTranSactions: " + 
							getHighestValueTranSactions(transactions));
		
		System.out.println("\n10. getSmallestValueTranSactions: " + 
				getSmallestValueTranSactions(transactions));
	}
	
	public static List<Transaction> getTransactions() {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");
		List<Transaction> transactions = Arrays.asList(
			new Transaction(brian, 2011, 300d),
			new Transaction(raoul, 2012, 1000d), 
			new Transaction(raoul, 2011, 400d),
			new Transaction(mario, 2012, 710d), 
			new Transaction(mario, 2012, 700d), 
			new Transaction(alan, 2012, 950d)
		);
		
		return transactions;
	}
	
	// 1. Find all transactions in the year 2011 and sort them by value (small to high).
	public static List<Transaction> getTransactionIn2021(List<Transaction> transactions){	
		List<Transaction> result = new ArrayList<>();
		for(Transaction transaction : transactions) {
			if(transaction.getYear() == 2011) {
				result.add(transaction);
			}
		}
		
		Collections.sort(result, (o1, o2) ->  Double.compare(o1.getValue(), o2.getValue()));
		
		return result;
	}
	
	// 2. Find all transactions have value greater than 300 and sort them by trader’s city
	public static List<Transaction> getTransactionInValue(List<Transaction> transactions){
		List<Transaction> result = new ArrayList<>();
		for(Transaction transaction : transactions) {
			if(transaction.getValue() > 300) {
				result.add(transaction);
			}
		}
		
		Collections.sort(result,(o1, o2) ->
					(o1.getTrader().getCity()).compareTo(o2.getTrader().getCity()));
	
		return result;
	}
	
	// 3. What are all the unique cities where the traders work?
	public static List<String> getCitiesTraderWork(List<Transaction> transactions){	
		List<String> result = new ArrayList<>();
		for(Transaction transaction : transactions) {
			if(!result.contains(transaction.getTrader().getCity())) {
				result.add(transaction.getTrader().getCity());
			}
		}
		
		return result;
	}
	// 4. Find all traders from Cambridge and sort them by name desc.
	public static List<Transaction> getTransactionInCambridge(List<Transaction> transactions){
		List<Transaction> result = new ArrayList<>();
		for(Transaction transaction : transactions) {
			if(transaction.getTrader().getCity().equals("Cambridge")) {
				result.add(transaction);
			}
		}			
//		Collections.sort(result,(o1, o2) -> 
//					(o2.getTrader().getName()).compareTo(o1.getTrader().getName()));

		result.sort(Comparator.comparing(o1 ->(o1.getTrader().getName()), Collections.reverseOrder()));
		return result;
	}
	
	// 5. Return a string of all traders’ names sorted alphabetically.
	public static Set<String> getAllTradersName(List<Transaction> transactions){
		Set<String> result = new TreeSet<>();
		for(Transaction transaction : transactions) {
			result.add(transaction.getTrader().getName());
		}
				
		return result;
	}
	
	// 6. Are any traders based in Milan?
	public static boolean testCityOfTraders(List<Transaction> transactions, String city){	
		for(Transaction transaction : transactions) {
			if (transaction.getTrader().getCity().equals(city)) {
				return true;
			}
		}	
		return false;
	}
	
	// 7. Count the number of traders in Milan.
	public static int countNumberOfTradersInCity(List<Transaction> transactions, String city){	
		List<String> result = new ArrayList<>();
		int count = 0;
		for(Transaction transaction : transactions) {
			if (transaction.getTrader().getCity().equals(city) 
					&& !result.contains(transaction.getTrader().getCity())) {
				result.add(transaction.getTrader().getCity());
				count++;
			}
		}	
		return count;
	}
	
	// 8. Print all transactions’ values from the traders living in Cambridge.
	public static double sumValueOfTradersInCity(List<Transaction> transactions, String city){	
		double sum = 0;
		for(Transaction transaction : transactions) {
			if (transaction.getTrader().getCity().equals(city)) {
				sum += transaction.getValue();
			}
		}	
		return sum;
	}
	
	// 9. What’s the highest value of all the transactions?
	public static double getHighestValueTranSactions(List<Transaction> transactions){
		List<Double> result = new ArrayList<>();
		double max = Double.MIN_VALUE;
		for(Transaction transaction: transactions) {
			result.add(transaction.getValue());
		}
		for (Double value: result) {
			if(max < value) {
				max = value;
			}
		}
		return max;
	}
	
	// 10. Find the transaction with the smallest value.
	public static double getSmallestValueTranSactions(List<Transaction> transactions){
		List<Double> result = new ArrayList<>();
		double min = Double.MAX_VALUE;
		for(Transaction transaction: transactions) {
			result.add(transaction.getValue());
		}
		for (Double value: result) {
			if(min > value) {
				min = value;
			}
		}
		return min;
	}
}