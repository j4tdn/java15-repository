package online.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;

public class TraderApp {
	public static void main(String[] args) {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");
		List<Trader> traders = Arrays.asList(raoul, mario, alan, brian);
		List<Transaction> transactions = Arrays.asList(new Transaction(brian, 2011, 300.0),
				new Transaction(raoul, 2012, 1000.0), new Transaction(raoul, 2011, 400.0),
				new Transaction(mario, 2012, 710.0), new Transaction(mario, 2012, 700.0),
				new Transaction(alan, 2015, 950.0));
		// function1(transactions);
		// function2(transactions);
		// function3(transactions);
		// function4(transactions);
		// function5(transactions);
		// System.out.println(function6(transactions));
		// function7(traders);
		// function8(transactions);
		 function9(transactions);
		// function10(transactions);
	}

	public static void function1(List<Transaction> transactions) {
		List<Transaction> sortedTransactions = new ArrayList<Transaction>();
		for (Transaction transaction : transactions) {
			if (transaction.getYear() == 2011) {
				sortedTransactions.add(transaction);

			}
		}
		Collections.sort(sortedTransactions, new Comparator<Transaction>() {

			@Override
			public int compare(Transaction o1, Transaction o2) {
				// TODO Auto-generated method stub
				return Double.compare(o1.getPrice(), o2.getPrice());
			}
		});
		System.out.println(Arrays.toString(sortedTransactions.toArray()));
	}

	public static void function2(List<Transaction> transactions) {
		List<Transaction> sortedTransactions = new ArrayList<Transaction>();
		for (Transaction transaction : transactions) {
			if (transaction.getPrice() > 300.0) {
				sortedTransactions.add(transaction);
			}
		}
		Collections.sort(sortedTransactions, new Comparator<Transaction>() {

			@Override
			public int compare(Transaction o1, Transaction o2) {
				// TODO Auto-generated method stub
				return o1.getTrader().getCity().compareTo(o2.getTrader().getCity());
			}
		});
		System.out.println(Arrays.toString(sortedTransactions.toArray()));
	}

	public static void function3(List<Transaction> transactions) {
		Set<String> setCities = new HashSet<String>();
		for (Transaction transaction : transactions) {
			setCities.add(transaction.getTrader().getCity());
		}
		System.out.println(Arrays.toString(setCities.toArray()));
	}

	public static void function4(List<Transaction> transactions) {
		List<Transaction> sortedList = new ArrayList<Transaction>();
		for (Transaction transaction : transactions) {
			if (transaction.getTrader().getCity().equals("Cambridge")) {
				sortedList.add(transaction);
			}
		}
		Collections.sort(sortedList,
				Comparator.comparing(holder -> holder.getTrader().getName(), Collections.reverseOrder()));
		System.out.println(Arrays.toString(sortedList.toArray()));
	}

	public static void function5(List<Transaction> transactions) {
		Set<String> sortedName = new TreeSet<String>();

		for (Transaction transaction : transactions) {
			sortedName.add(transaction.getTrader().getName());
		}
		System.out.println(Arrays.toString(sortedName.toArray()));
	}

	public static boolean function6(List<Transaction> transactions) {
		for (Transaction transaction : transactions) {
			if (transaction.getTrader().getCity().equals("Milan")) {
				return true;
			}
		}
		return false;
	}

	public static void function7(List<Trader> traders) {
		List<Trader> counTraders = new ArrayList<Trader>();
		for (Trader trader : traders) {
			if (trader.getCity().equals("Milan")) {
				counTraders.add(trader);
			}
		}
		System.out.println(counTraders.size());
	}

	public static void function8(List<Transaction> transactions) {
		List<Double> sortedTransactions = transactions.stream()
				.filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
				.map(transaction -> transaction.getPrice()).toList();
		sortedTransactions.forEach(v -> System.out.println(v));

	}

	public static void function9(List<Transaction> transactions) {
		double value = Integer.MIN_VALUE;
		for (Transaction transaction : transactions) {
			if (transaction.getPrice() > value) {
				value = transaction.getPrice();
				System.out.println(transaction);
			}
		}
		Optional<Double> highestValue = transactions.stream().map(Transaction::getPrice).reduce(Double::max);
        System.out.println(highestValue);
		System.out.println("The highest value of all transactions :" + value);
	}

	public static void function10(List<Transaction> transactions) {
		double value = Integer.MAX_VALUE;

		for (Transaction transaction : transactions) {
			if (transaction.getPrice() < value) {
				value = transaction.getPrice();
				System.out.println(transaction);
			}
		}

	}

}
