package online.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {
	public static void main(String[] args) {
		List<Transaction> transactions = getTransactions();
		
		// 1. Find all transactions in the year 2011 and sort them by value (small to high).
		List<Transaction> transactionIn2021 = getTransactionIn2021(transactions);
		Collections.sort(transactionIn2021, new Comparator<Transaction>() {
			@Override
			public int compare(Transaction o1, Transaction o2) {
				return Double.compare(o1.getValue(), o2.getValue());
			}
		});
		System.out.println("\n1. transactionIn2021 sort by value: " + transactionIn2021);
		
		// 2. Find all transactions have value greater than 300 and sort them by trader’s city
		List<Transaction> transactionInValue = getTransactionInValue(transactions);
		Collections.sort(transactionInValue, new Comparator<Transaction>() {
			@Override
			public int compare(Transaction o1, Transaction o2) {
				return (o1.getTrader().getCity()).compareTo(o2.getTrader().getCity());
			}
		});
		System.out.println("\n2. transactionInValue sort by city: " + transactionInValue);
		
		// 3. What are all the unique cities where the traders work?
		System.out.println("\n3. getCitiesTraderWork: " + getCitiesTraderWork(transactions));
		// 4. Find all traders from Cambridge and sort them by name desc.
		List<Transaction> transactionInCambridge = getTransactionInCambridge(transactions);
		Collections.sort(transactionInCambridge, new Comparator<Transaction>() {
			@Override
			public int compare(Transaction o1, Transaction o2) {
				return (o2.getTrader().getName()).compareTo(o1.getTrader().getName());
			}
		});
		System.out.println("\n4. transactionInCambridge sort by name desc: " + transactionInCambridge);
		
		// 5. Return a string of all traders’ names sorted alphabetically.
		List<String> allTradesName = getAllTradersName(transactions);
		Collections.sort(allTradesName, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		System.out.println("\n5. allTradesName: " + allTradesName);
		
		// 6. Are any traders based in Milan?
		System.out.println("\n6. testCityOfTraders: " + testCityOfTraders(transactions, "Milan"));
		
		// 7. Count the number of traders in Milan.
		System.out.println("\n7. countNumberOfTradersInCity: " + 
							countNumberOfTradersInCity(transactions, "Milan"));
		
		// 8. Print all transactions’ values from the traders living in Cambridge.
		System.out.println("\n8. sumValueOfTradersInCity: " +
							sumValueOfTradersInCity(transactions, "Cambridge"));
		
		// 9. What’s the highest value of all the transactions?
		System.out.println("\n9. getHighestValueTranSactions: " + 
							getHighestValueTranSactions(transactions));
		
		// 10. Find the transaction with the smallest value.
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
	
	// 1
	public static List<Transaction> getTransactionIn2021(List<Transaction> transactions){
		
		List<Transaction> result = new ArrayList<>();
		for(Transaction transaction : transactions) {
			if(transaction.getYear() == 2011) {
				result.add(transaction);
			}
		}
		
		return result;
	}
	
	// 2
	public static List<Transaction> getTransactionInValue(List<Transaction> transactions){
		
		List<Transaction> result = new ArrayList<>();
		for(Transaction transaction : transactions) {
			if(transaction.getValue() > 300) {
				result.add(transaction);
			}
		}
		
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
	// 4
	public static List<Transaction> getTransactionInCambridge(List<Transaction> transactions){
		
		List<Transaction> result = new ArrayList<>();
		for(Transaction transaction : transactions) {
			if(transaction.getTrader().getCity().equals("Cambridge")) {
				result.add(transaction);
			}
		}
		
		return result;
	}
	
	// 5
	public static List<String> getAllTradersName(List<Transaction> transactions){
		
		List<String> result = new ArrayList<>();
		for(Transaction transaction : transactions) {
			result.add(transaction.getTrader().getName());
		}
		
		return result;
	}
	
	// 6
	public static boolean testCityOfTraders(List<Transaction> transactions, String city){	
		for(Transaction transaction : transactions) {
			if (transaction.getTrader().getCity().equals(city)) {
				return true;
			}
		}	
		return false;
	}
	
	// 7
	public static int countNumberOfTradersInCity(List<Transaction> transactions, String city){	
		List<String> result = new ArrayList<>();
		int count = 0;
		for(Transaction transaction : transactions) {
			if (transaction.getTrader().getCity().equals(city) && !result.contains(transaction.getTrader().getCity())) {
				result.add(transaction.getTrader().getCity());
				count++;
			}
		}	
		return count;
	}
	
	// 8
	public static double sumValueOfTradersInCity(List<Transaction> transactions, String city){	
		double sum = 0;
		for(Transaction transaction : transactions) {
			if (transaction.getTrader().getCity().equals(city)) {
				sum += transaction.getValue();
			}
		}	
		return sum;
	}
	
	// 9
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
	
	// 10
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