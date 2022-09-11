package online.exercises;

import java.util.Arrays;
import java.util.Comparator;
import static java.util.Comparator.*;

import java.util.ArrayList;
import java.util.List;

import java.util.function.Function;

public class App {
	public static void main(String[] args) {
		List<Transaction> transactions = getTransactions();
		System.out.println("=======exercise1=======");
		printf(findAll2011(transactions));
		System.out.println("=======exercise2=======");
		printf(findAllThan300(transactions));
		System.out.println("========exercise3======");
		printf(listCity(transactions));
		System.out.println("========exercise4======");
		printf(trader(transactions));
		System.out.println("========exercise5======");
		System.out.println(name(transactions));
		System.out.println("========exercise6======");
		System.out.println(milanHeadquarters(transactions));
		System.out.println("========exercise7======");
		System.out.println(milanMerchants(transactions));
		System.out.println("=======exercise8=======");
		values(transactions);
		System.out.println("=======exercise9=======");
		System.out.println(valuesMax(transactions));
		System.out.println("=======exercise10=======");
		System.out.println(traderMin(transactions));
	}

	public static List<Transaction> getTransactions() {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");
		List<Transaction> transactions = Arrays.asList(new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000), new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710), new Transaction(mario, 2012, 700), new Transaction(alan, 2012, 950));
		return transactions;
	}

	private static List<Transaction> findAll2011(List<Transaction> list) {
		List<Transaction> transactions = new ArrayList<>();
		for (Transaction transaction : list) {
			if (transaction.getYear() == 2011) {
				transactions.add(transaction);
			}
		}

		Comparator<Transaction> comparator = comparing(transaction -> transaction.getValue());
		transactions.sort(comparator);
		return transactions;

	}

	private static List<Transaction> findAllThan300(List<Transaction> list) {
		List<Transaction> transactions = new ArrayList<>();
		for (Transaction transaction : list) {
			if (transaction.getValue() > 300) {
				transactions.add(transaction);
			}
		}
		Comparator<Transaction> comparator = comparing(transaction -> transaction.getTrader().getCity());
		transactions.sort(comparator);
		return transactions;
	}

	private static List<String> listCity(List<Transaction> transactions) {
		List<String> result = new ArrayList<>();
		for (Transaction transaction : transactions) {
			if (!result.contains(transaction.getTrader().getCity())) {
				result.add(transaction.getTrader().getCity());
			}
		}
		return result;

	}

	private static List<Trader> trader(List<Transaction> transactions) {
		List<Trader> result = new ArrayList<>();
		for (Transaction transaction : transactions) {
			if (transaction.getTrader().getCity().equals( "Cambridge")) {
				result.add(transaction.getTrader());
			}
		}
		Comparator<Trader> comparator = comparing(trader -> trader.getName());
		result.sort(comparator.reversed());
		return result;

	}

	private static String name(List<Transaction> transactions) {
		List<String> names = new ArrayList<>();
		String result = " ";
		for (Transaction transaction : transactions) {
			if (!names.contains(transaction.getTrader().getName())) {
				names.add(transaction.getTrader().getName());
			}
		}
		Comparator<String> comparator = comparing(Function.identity());
		names.sort(comparator);
		for(String name : names) {
		result += name + " ";
		}
		return result;

	}

	private static boolean milanHeadquarters(List<Transaction> transactions) {

		for (Transaction transaction : transactions) {
			if (transaction.getTrader().getCity().equals("Milan")) {
				return true;
			}

		}
		return false;

	}

	private static int milanMerchants(List<Transaction> transactions) {
		int count = 0;
		List<String> names = new ArrayList<>();
		for (Transaction transaction : transactions) {
			if (transaction.getTrader().getCity().equals("Milan") && !names.contains(transaction.getTrader().getName())) {
				names.add(transaction.getTrader().getName());
				count++;
			}

		}
		return count;

	}

	private static void values(List<Transaction> transactions) {

		for (Transaction transaction : transactions) {
			if (transaction.getTrader().getCity().equals("Cambridge")) {
				System.out.println(transaction.getValue());
			}

		}

	}

	private static double valuesMax(List<Transaction> transactions) {
		double max = Double.MIN_VALUE;
		for (Transaction transaction : transactions) {
			if (transaction.getValue() > max) {
				max = transaction.getValue();
			}

		}
		return max;

	}

	private static Trader traderMin(List<Transaction> transactions) {
		double min = Double.MAX_VALUE;
		Trader minTrader = new Trader();
		for (Transaction transaction : transactions) {
			if (transaction.getValue() < min) {
				min = transaction.getValue();
				minTrader = transaction.getTrader();
			}

		}
		return minTrader;

	}

	private static <E> void printf(List<E> lists) {
		
		for (E list : lists) {
			System.out.println(list);
			
		}
	}

}
