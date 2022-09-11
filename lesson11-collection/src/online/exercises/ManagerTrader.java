package online.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ManagerTrader {

	public static void main(String[] args) {
		System.out.println("====================1===================");
		sort1(getInfo());
		System.out.println("====================2===================");
		System.out.println(sort2(getInfo()));
		System.out.println("====================3===================");
		sort3(getInfo());
		System.out.println("====================4===================");
		System.out.println(sort4(getInfo()));
		System.out.println("====================5===================");
		sort5(getInfo());
		System.out.println("====================6===================");
		System.out.println(sort6(getInfo()));
		System.out.println("====================7===================");
		sort7(getInfo());
		System.out.println("====================8===================");
		sort8(getInfo());
		System.out.println("====================9===================");
		sort9(getInfo());
		System.out.println("====================10===================");
		sort10(getInfo());
	}
//10. Find the transaction with the smallest value.
	private static void sort10(List<Transaction> list) {
		List<Double> value = new ArrayList<>();
		for (Transaction transaction : list) {
			value.add(transaction.getValue());
		}
		System.out.println("min: " + Collections.min(value));
	}
//9. What’s the highest value of all the transactions?
	private static void sort9(List<Transaction> list) {
		List<Double> value = new ArrayList<>();
		for (Transaction transaction : list) {
			value.add(transaction.getValue());
		}
		System.out.println("max: " + Collections.max(value));
	}
//8. Print all transactions’ values from the traders living in Cambridge.
	private static void sort8(List<Transaction> list) {
		List<Double> value = new ArrayList<>();
		for (Transaction transaction : list) {
			if (transaction.getTrader().getCity().equals("Cambridge")) {
				value.add(transaction.getValue());
			}
		}
		System.out.println(value);
	}
//7. Count the number of traders in Milan.
	private static void sort7(List<Transaction> list) {
		int count = 0;
		List<String> name = new ArrayList<>();
		for (Transaction transaction : list) {
			if (transaction.getTrader().getCity().equals("Milan") && !name.contains(transaction.getTrader().getName())) {
				name.add(transaction.getTrader().getName());
				count++;
			}
		}
		System.out.println(count);
	}
//6. Are any traders based in Milan?
	private static boolean sort6(List<Transaction> list) {
		for (Transaction transaction : list) {
			if (transaction.getTrader().getCity().equals("Milan")) {
				return true;
			}
		}
		return false;
	}
//5. Return a string of all traders’ names sorted alphabetically.
	private static void sort5(List<Transaction> list) {
		List<String> name = new ArrayList<>();
		for (Transaction transaction : list) {
			if (!name.contains(transaction.getTrader().getName())) {
				name.add(transaction.getTrader().getName());
			}
		}
		System.out.println(name.toString());
	}
//	4. Find all traders from Cambridge and sort them by name desc.
	private static List<Transaction> sort4(List<Transaction> list) {
		List<Transaction> transactions = new ArrayList<>();
		for (Transaction transaction : list) {
			if (transaction.getTrader().getCity().equals("Cambridge")) {
				transactions.add(transaction);
			}
		}
		Comparator<Transaction> comparator = Comparator.comparing(t -> t.getTrader().getName());

		transactions.sort(comparator.reversed());
		return transactions;
	}
//3. What are all the unique cities where the traders work?
	private static void sort3(List<Transaction> list) {
		List<String> city = new ArrayList<>();
		for (Transaction transaction : list) {
			if (!city.contains(transaction.getTrader().getCity())) {
				city.add(transaction.getTrader().getCity());
			}
		}
		System.out.println(city.toString());
	}
//2. Find all transactions have value greater than 300 and sort them by trader’s city
	private static List<Transaction> sort2(List<Transaction> list) {
		List<Transaction> transactions = new ArrayList<>();
		for (Transaction transaction : list) {
			if (transaction.getValue() > 300) {
				transactions.add(transaction);
			}
		}
		Comparator<Transaction> comparator = Comparator.comparing(t -> t.getTrader().getCity());

		transactions.sort(comparator);
		return transactions;
	}
//1. Find all transactions in the year 2011 and sort them by value (small to high).
	private static void sort1(List<Transaction> list) {
		List<Transaction> transactions = new ArrayList<>();
		for (Transaction transaction : list) {
			if (transaction.getYear() == 2011) {
				transactions.add(transaction);
			}
		}
		System.out.println(transactions);

	}

	public static List<Transaction> getInfo() {
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
				new Transaction(alan, 2012, 950));

		return transactions;
	}
}