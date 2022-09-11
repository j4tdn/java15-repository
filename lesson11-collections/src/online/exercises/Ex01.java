package online.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Ex01 {
	public static void main(String[] args) {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");
		List<Transaction> transactions = Arrays.asList(new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000), new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710), new Transaction(mario, 2012, 700), new Transaction(alan, 2012, 950));
		System.out.println(function1(transactions));
		System.out.println("================");
		System.out.println(function2(transactions));
		System.out.println("================");
		System.out.println(f3(transactions));
		System.out.println("================");
		System.out.println(function4(transactions, raoul.getCity()));
		System.out.println("================");
		System.out.println(function5(transactions));
		System.out.println("================");				
		System.out.println(function6(transactions,mario.getCity()));
		System.out.println("================");							
		System.out.println(function8(transactions,raoul.getCity()));
		System.out.println("================");
		System.out.println(function9(transactions));
		System.out.println("================");
		System.out.println(function10(transactions));





	}

	private static List<Transaction> function1(List<Transaction> transaction) {
		List<Transaction> transactions = new ArrayList<>();
		for (Transaction transaction1 : transaction) {
			if (transaction1.getYear() == 2011) {
				transactions.add(transaction1);
			}
		}
		transactions.sort(Comparator.comparing(Transaction::getValue));
		return transactions;

	}

	private static List<Transaction> function2(List<Transaction> transaction) {
		List<Transaction> transactions = new ArrayList<>();
		for (Transaction transaction1 : transaction) {
			if (transaction1.getValue() > 300) {
				transactions.add(transaction1);
			}
		}
	//	transactions.sort((o1, o2) -> o1.getTrader().getCity().compareTo(o2.getTrader().getCity()));
		transactions.sort(Comparator.comparing(t1 -> t1.getTrader().getCity()));
		return transactions;

	}

	private static Set<String> f3(List<Transaction> transaction) {
		Set<String> city = new TreeSet<>();
		for (Transaction transaction1 : transaction) {
			city.add(transaction1.getTrader().getCity());
		}
		return city;

	}

	private static Set<String> function4(List<Transaction> transaction, String a) {
		Set<String> names = new TreeSet<>();
		for (Transaction transaction1 : transaction) {
			if (transaction1.getTrader().getCity().equals(a)) {
				names.add(transaction1.getTrader().getName());
			}
		}
		return names;

	}
	private static Set<String> function5(List<Transaction> transaction) {
		Set<String> names = new TreeSet<>();
		for (Transaction transaction1 : transaction) {
				names.add(transaction1.getTrader().getName());
			
		}
		return names;

	}
	private static Set<String> function6(List<Transaction> transaction, String a) {
		Set<String> names = new TreeSet<>();
		for (Transaction transaction1 : transaction) {
			if (transaction1.getTrader().getCity().equals(a)) {
				names.add(transaction1.getTrader().getName());
			}
			
		}
		return names;

	}
	private static List<Transaction> function8(List<Transaction> transaction, String a) {
		List<Transaction> transactions = new ArrayList<>();
		for (Transaction transaction1 : transaction) {
			if (transaction1.getTrader().getCity().equals(a)) {
				transactions.add(transaction1);
			}
		}
		return transactions;

	}
	private static Transaction function9(List<Transaction> transaction) {
		List<Transaction> transactions = new ArrayList<>();
		for (Transaction transaction1 : transaction) {
				transactions.add(transaction1);
		}
		transactions.sort(Comparator.comparing(Transaction::getValue));
		return transactions.get(transactions.size() -1);
	}
	private static Transaction function10(List<Transaction> transaction) {
		List<Transaction> transactions = new ArrayList<>();
		for (Transaction transaction1 : transaction) {
				transactions.add(transaction1);
		}
		transactions.sort(Comparator.comparing(Transaction::getValue));
		return transactions.get(0);
	}

}
