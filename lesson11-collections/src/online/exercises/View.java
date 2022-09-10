package online.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class View {
	public static void main(String[] args) {
		Trader raoul = new Trader(" Raoul ", "Cambridge");
		Trader mario = new Trader(" Mario ", "Milan");
		Trader alan = new Trader(" Alan ", "Cambridge");
		Trader brian = new Trader(" Brian ", "Cambridge");
		List<Trader> traders = new ArrayList<>();
		traders.add(raoul);
		traders.add(mario);
		traders.add(alan);
		traders.add(brian);

		List<Transaction> transactions = Arrays.asList(new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000), new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710), new Transaction(mario, 2012, 700), new Transaction(alan, 2012, 950));

		Transaction result = new Transaction();
		System.out.println(result.getValue());
		// cau 1
		System.out.println("1.all transactions in the year 2011 and sort value ASC: " + prob1(transactions, 2011));
		System.out.println("==========================");
		// cau 2
		System.out.println("2.all transactions have value greater than 300 " + prob2(transactions, 300));
		System.out.println("==========================");
		// cau 3
		System.out.println("3.all the unique cities where traders work " + prob3(transactions));
		System.out.println("==========================");
		// cau 4
		System.out.println("4.all traders from Cambridge and sort name DESC " + prob4(traders, "Cambridge"));
		System.out.println("==========================");
		// cau 5
		System.out.println("5.String of all traders’ names sorted alphabetically. " + prob5(traders));
		System.out.println("==========================");
		// cau 6
		System.out.println("6.Are any traders based in Milan? " + ((prob6(traders, "Milan") == true) ? "Yes" : "No"));
		System.out.println("==========================");
		// cau 7
		System.out.println("7.The number of traders in Milan. " + prob7(traders, "Milan") + " Trader");
		System.out.println("==========================");
		// cau 8
		System.out.println("8.Print all transactions’ values from the traders living in Cambridge. "
				+ prob8(transactions, "Cambridge"));
		System.out.println("==========================");
		// cau 9
		System.out.println("9.The highest value of all the transactions  " + prob9(transactions));
		System.out.println("==========================");
		// cau 10
		System.out.println("10.The transaction with the smallest value.  " + prob10(transactions));
		System.out.println("==========================");
	}

	private static List<Transaction> prob1(List<Transaction> elements, int year) {
		List<Transaction> result = new ArrayList<>();
		for (Transaction e : elements) {
			if (e.getYear() == year) {
				result.add(e);
			}
		}
		result.sort(Comparator.comparing(Transaction::getValue));
		return result;
	}

	private static List<Transaction> prob2(List<Transaction> elements, int value) {
		List<Transaction> result = new ArrayList<>();
		for (Transaction e : elements) {
			if (e.getValue() > value) {
				result.add(e);
			}
		}
		result.sort(Comparator.comparing(element -> element.getTrader().getCity()));
		return result;
	}

	private static Set<String> prob3(List<Transaction> elements) {
		Set<String> resultCity = new HashSet<>();
		for (Transaction e : elements) {
			resultCity.add(e.getTrader().getCity());
		}
		return resultCity;
	}

	private static List<Trader> prob4(List<Trader> elements, String city) {
		List<Trader> result = new ArrayList<>();
		for (Trader e : elements) {
			if (e.getCity().equals(city)) {
				result.add(e);
			}
		}
		result.sort(Comparator.comparing(Trader::getName, Comparator.reverseOrder()));
		return result;
	}

	private static String prob5(List<Trader> elements) {
		List<Trader> result = new ArrayList<>();
		result.addAll(elements);
		result.sort(Comparator.comparing(Trader::getName));
		StringBuffer builder = new StringBuffer();
		for (Trader e : result) {
			builder.append(e.getName());
		}
		return builder.toString();
	}

	private static boolean prob6(List<Trader> elements, String city) {
		for (Trader e : elements) {
			if (e.getCity().equals(city)) {
				return true;
			}
		}
		return false;
	}

	private static int prob7(List<Trader> elements, String city) {
		int count = 0;
		for (Trader e : elements) {
			if (e.getCity().equals(city)) {
				count++;
			}
		}
		return count;
	}

	private static List<Double> prob8(List<Transaction> elements, String city) {
		List<Double> result = new ArrayList<>();
		for (Transaction e : elements) {
			if (e.getTrader().getCity().equals(city)) {
				result.add(e.getValue());
			}
		}
		return result;
	}

	private static Double prob9(List<Transaction> elements) {
		Double max = 0d;
		for (Transaction e : elements) {
			max = Math.max(max, e.getValue());
		}
		return max;
	}

	private static Transaction prob10(List<Transaction> elements) {
		Transaction result = new Transaction();
		Double min = prob9(elements);
		for (Transaction e : elements) {
			if (e.getValue() < min) {
				min = e.getValue();
				result = e;
			}
		}
		return result;
	}

}
