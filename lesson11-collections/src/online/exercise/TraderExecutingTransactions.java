package online.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class TraderExecutingTransactions {
	public static void main(String[] args) {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");

		List<Transaction> transactions = Arrays.asList(new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000), new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710), new Transaction(mario, 2012, 700), new Transaction(alan, 2012, 950));
//		List<Transaction> prob1 = problem1(transactions, 2011);
//		print(prob1);

//		List<Transaction> prob2 = problem2(transactions, 300);
//		print(prob2);

//		List<String> prob3 = problem3(transactions);
//		print(prob3);
		
//		List<Trader> prob4 = problem4(transactions, "Cambridge");
//		print(prob4);
		
//		List<String> prob5 = problem5(transactions);
//		print(prob5);

//		System.out.println(problem6(transactions, "Milan"));
		
//		System.out.println(problem7(transactions, "Milan"));
		
//		List<Double> prob8 = problem8(transactions, "Cambridge");
//		print(prob8);
		
//		System.out.println(problem9(transactions));
		
//		System.out.println(problem10(transactions));
	}

	private static <E> void print(List<E> elements) {
		for (E element : elements) {
			System.out.println(element);
		}
	}

	private static List<Transaction> problem1(List<Transaction> transactions, int year) {
		List<Transaction> transaction2011 = new ArrayList<>();
		for (Transaction transaction : transactions) {
			if (transaction.getYear() == year) {
				transaction2011.add(transaction);
			}
		}
		transaction2011.sort(Comparator.comparing(Transaction::getValue));
		return transaction2011;
	}

	private static List<Transaction> problem2(List<Transaction> transactions, int value) {
		List<Transaction> transactionValueOver300 = new ArrayList<>();
		for (Transaction transaction : transactions) {
			if (transaction.getValue() > value) {
				transactionValueOver300.add(transaction);
			}
		}
		transactionValueOver300.sort(Comparator.comparing(t1 -> t1.getTrader().getCity()));
		return transactionValueOver300;
	}

	private static List<String> problem3(List<Transaction> transactions) {
		Set<String> cities = new HashSet<>();
		for (Transaction transaction : transactions) {
			cities.add(transaction.getTrader().getCity());
		}
		List<String> result = new ArrayList<>(cities);
		return result;
	}

	private static List<Trader> problem4(List<Transaction> transactions, String city) {
		List<Trader> traderFromCambridge = new ArrayList<>();
		for (Transaction transaction : transactions) {
			if (transaction.getTrader().getCity() == city) {
				traderFromCambridge.add(transaction.getTrader());
			}
		}
		traderFromCambridge.sort(Comparator.comparing(Trader::getName).reversed());
		return traderFromCambridge;
	}
	
	private static List<String> problem5(List<Transaction> transactions){
		Set<String> nameTraderBySet = new HashSet<>();
		for(Transaction transaction : transactions) {
			nameTraderBySet.add(transaction.getTrader().getName());
		}
		List<String> nameTraderByList = new ArrayList<>(nameTraderBySet);
		nameTraderByList.sort(Comparator.comparing(o1 -> o1));
		return nameTraderByList;
	}
	
	private static boolean problem6(List<Transaction> transactions, String city) {
		for(Transaction transaction : transactions) {
			if(transaction.getTrader().getCity() == city) {
				return true;
			}
		}
		return false;
	}
	
	private static int problem7(List<Transaction> transactions, String city) {
		Set<String> traderFromCity = new HashSet<>();
		for(Transaction transaction : transactions) {
			if(transaction.getTrader().getCity() == city) {
				traderFromCity.add(transaction.getTrader().getName());
			}
		}
		return traderFromCity.size();
	}
	
	private static List<Double> problem8(List<Transaction> transactions, String city){
		List<Double> traderFromCity = new ArrayList<>();
		for(Transaction transaction : transactions) {
			if(transaction.getTrader().getCity() == city) {
				traderFromCity.add(transaction.getValue());
			}
		}
		return traderFromCity;
	}
	
	private static double problem9(List<Transaction> transactions) {
		List<Double> values = new ArrayList<>();
		for(Transaction transaction : transactions) {
			values.add(transaction.getValue());
		}
		values.sort(Comparator.comparing(o1 -> -1 * o1));
		return values.get(0);
	}
	
	private static double problem10(List<Transaction> transactions) {
		List<Transaction> sorted = transactions;
		sorted.sort(Comparator.comparingDouble(Transaction::getValue));
		return sorted.get(0).getValue();
	}
	
}
