package exercises;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import bean.Trader;
import bean.Transaction;
import model.DataModel;


public class App {
	public static void main(String[] args) {
		List<Transaction> transactions = DataModel.getTransactions();
		// 1. Find all transactions in the year 2011 and sort them by value (small to high).
		func1(transactions);
		// 2 Find all transactions have value greater than 300 and sort them by trader’s city
		System.out.println("======================");
		func2(transactions);
		//3 What are all the unique cities where the traders work?
		System.out.println("======================");
		func3(transactions);
		//4 Find all traders from Cambridge and sort them by name desc.
		System.out.println("======================");
		func4(transactions, "Cambridge");
		//5 Return a string of all traders’ names sorted alphabetically.
		System.out.println("======================");
		func5(transactions);
		//6 Are any traders based in MiLan?
		System.out.println("======================");
		func6(transactions, "Milan");
		//7 Count the number of traders in Milan
		System.out.println("======================");
		func7(transactions, "Milan");
		//8 Print all transactions’ values from the traders living in Cambridge.
		System.out.println("======================");
		func8(transactions, "Milan");
		//9 What’s the highest value of all the transactions?
		System.out.println("======================");
		func9(transactions);
		//10 Find the transaction with the smallest value.
		System.out.println("======================");
		func10(transactions);
	}
	private static void func1(List<Transaction> transactions) {
		List<Transaction> transaction = transactions.stream()
		.filter(d -> d.getYear() == 2011)
		.sorted(Comparator.comparing(Transaction::getValue))
		.collect(Collectors.toList());
		transaction.forEach(System.out::println);
		
	}
	private static void func2(List<Transaction> transactions) {
		List<Transaction> transaction = transactions.stream()
		.filter(d -> d.getValue() > 300)
		.sorted((o1, o2) -> o1.getTrader().getCity().compareTo(o2.getTrader().getCity()))
		.collect(Collectors.toList());
		transaction.forEach(System.out::println);
		
	}
	private static void func3(List<Transaction> transactions) {
		List<String> citys = transactions.stream()
		.map(t -> t.getTrader().getCity())
		.distinct()
		.collect(Collectors.toList());
		citys.forEach(System.out::println);
		
	}
	private static void func4(List<Transaction> transactions, String city) {
		List<String> names = transactions.stream()
		.filter(d -> d.getTrader().getCity().equals(city))
		.map(t -> t.getTrader().getName())
		.sorted(Comparator.reverseOrder())
		.distinct()
		.collect(Collectors.toList());
		names.forEach(System.out::println);
		
	}
	private static void func5(List<Transaction> transactions) {
		List<String> names = transactions.stream()
		.sorted((o1,o2) -> o1.getTrader().getName().compareTo(o2.getTrader().getName()))
		.map(d ->d.getTrader().getName())
		.distinct()
		.collect(Collectors.toList());
		names.forEach(System.out::println);
//c2
//		List<String> names = transactions.stream()
//				.map(d -> d.getTrader().getName())
//				.sorted()
//		.distinct()
//		.collect(Collectors.toList());
//		names.forEach(System.out::println);
		
	}
	private static void func6(List<Transaction> transactions, String city) {
		boolean names = transactions.stream()
				.anyMatch(d -> d.getTrader().getCity().equals(city));
				System.out.println(names);
		
	}
	private static void func7(List<Transaction> transactions, String city) {
		long countTraderMilan = transactions.stream()
				 .filter(d -> d.getTrader().getCity().equals("Milan"))
				 .count();
		System.out.println(countTraderMilan);
		
	}
	
	private static void func8(List<Transaction> transactions, String city) {
		List<Integer> transaction = transactions.stream()
				.filter(d -> d.getTrader().getCity().equals(city))
				.map(d -> d.getValue())
				.collect(Collectors.toList());
				transaction.forEach(System.out::println);
						
	}
	private static void func9(List<Transaction> transactions) {
		Optional<Integer> value = transactions.stream()
				.map(d -> d.getValue())
				.reduce((o1, o2) -> o1> o2 ? o1 : o2);
				
		value.ifPresent(System.out::println);
						
	}

	private static void func10(List<Transaction> transactions) {
		Optional<Transaction> transaction = transactions.stream()
				.sorted(Comparator.comparing(Transaction::getValue))
				.findFirst();
		transaction.ifPresent(System.out::println);

						
	}
	
}
