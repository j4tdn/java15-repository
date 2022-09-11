package online.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TraderExecutingTransactionsApplication {
	public static void main(String[] args) {
		List<Transaction> list = getTransactions();
		System.out.println(list);
		
		System.out.println("========================");
		
		//findAllTransactionIn2011(list);
		//findAllTransactionValueGreaterThan300(list);
		//findAllUniqueCities(list);
		//findAllTradersFromCambridge(list);
		//findAllTradersName(list);
		//findNameInMilan(list);
		//countNumberOfTradersInMilan(list);
		//findAllTransactionValuesFromCambridge(list);
		//highestValueOfTransaction(list);
		smallestValueOfTransaction(list);
		
	}
	
	public static List<Transaction> getTransactions(){
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
	
	//1. Find all transactions in the year 2011 and sort them by value (small to high).
	private static void findAllTransactionIn2011(List<Transaction> list){
		List<Transaction> result = new ArrayList<Transaction>();
		
		for(Transaction transaction: list) {
			if(transaction.getYear() == 2011) {
				result.add(transaction);
			}
		}

		Collections.sort(result, new Comparator<Transaction>() {
			@Override
			public int compare(Transaction o1, Transaction o2) {
				return Double.compare(o1.getValue(), o2.getValue());
			}
		});
		System.out.println(Arrays.toString(result.toArray()));
	}
	
	//2. Find all transactions have value greater than 300 and sort them by trader’s city
	private static void findAllTransactionValueGreaterThan300(List<Transaction> list){
		List<Transaction> result = new ArrayList<Transaction>();
		
		for(Transaction transaction: list) {
			if(transaction.getValue() > 300.0) {
				result.add(transaction);
			}
		}
		
		Collections.sort(result, new Comparator<Transaction>() {
			@Override
			public int compare(Transaction o1, Transaction o2) {
				return o1.getTrader().getCity().compareTo(o2.getTrader().getCity());
			}
		});
		System.out.println(Arrays.toString(result.toArray()));
	}
	
	//3. What are all the unique cities where the traders work?
	private static void findAllUniqueCities(List<Transaction> list){
		Set<String> result = new HashSet<String>();
		
		for(Transaction transaction: list) {
			result.add(transaction.getTrader().getCity());
		}
		System.out.println(Arrays.toString(result.toArray()));
	}
	
	//4. Find all traders from Cambridge and sort them by name desc.
	private static void findAllTradersFromCambridge(List<Transaction> list){
		List<Transaction> result = new ArrayList<Transaction>();
		
		for(Transaction transaction: list) {
			if(transaction.getTrader().getCity().equals("Cambridge")) {
				result.add(transaction);
			}
		}
		
		Collections.sort(result, Comparator.comparing(name -> name.getTrader().getName(), Collections.reverseOrder()));
		System.out.println(Arrays.toString(result.toArray()));
	}
	
	//5. Return a string of all traders’ names sorted alphabetically.
	private static void findAllTradersName(List<Transaction> list){
		Set<String> result = new TreeSet<String>();
		
		for(Transaction transaction: list) {
			result.add(transaction.getTrader().getName());
		}
		System.out.println(Arrays.toString(result.toArray()));
	}
	
	//6. Are any traders based in Milan?
	private static void findNameInMilan(List<Transaction> list){
		List<Transaction> result = new ArrayList<Transaction>();
		
		for(Transaction transaction: list) {
			if(transaction.getTrader().getCity().equals("Milan")) {
				result.add(transaction);
			}
		}
		System.out.println(Arrays.toString(result.toArray()));
	}
	
	//7. Count the number of traders in Milan.
	private static void countNumberOfTradersInMilan(List<Transaction> list){
		//List<Transaction> result = new ArrayList<Transaction>();
		Set<String> result = new HashSet<String>();
		
		for(Transaction transaction: list) {
			if(transaction.getTrader().getCity().equals("Milan")) {
				result.add(transaction.getTrader().getCity());
			}
		}
		
		System.out.println(result.size());
	}
	
	//8. Print all transactions’ values from the traders living in Cambridge.
	private static void findAllTransactionValuesFromCambridge(List<Transaction> list){
		List<Transaction> result = new ArrayList<Transaction>();
		
		for(Transaction transaction: list) {
			if(transaction.getTrader().getCity().equals("Cambridge")) {
				result.add(transaction);
			}
		}
		System.out.println(Arrays.toString(result.toArray()));
	}
	
	//9. What’s the highest value of all the transactions?
	private static void highestValueOfTransaction(List<Transaction> list){
		double value = Integer.MIN_VALUE;
		
		for(Transaction transaction: list) {
			if(transaction.getValue() > value) {
				value = transaction.getValue();
			}
		}
		
		System.out.println("The highest value of all the transactions is " + value);
	}
	
	//10. Find the transaction with the smallest value.
	private static void smallestValueOfTransaction(List<Transaction> list){
		double value = Integer.MAX_VALUE;
		
		for(Transaction transaction: list) {
			if(transaction.getValue() < value) {
				value = transaction.getValue();
				System.out.println("The smallest value f all the transactions is " + value);
				System.out.println(transaction);
			}
		}
	}
	
}
