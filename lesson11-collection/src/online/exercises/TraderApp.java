package online.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TraderApp {
	public static void main(String[] args) {
		
	}
	public static List<Transaction> getTransaction(){
		Trader raoul = new Trader("Raoul","Cambridge");
		Trader mario = new Trader("Mario","Milan");
		Trader alan = new Trader("Alan","Cambridge");
		Trader brian = new Trader("Brian","Cambridge");
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
	private static List<Transaction> findAllTransactionin2011(List<Transaction> list){
		List<Transaction> result = new ArrayList<>();
		for(Transaction transaction: list) {
			if(transaction.getYear() == 2011) {
				result.add(transaction);
			}
		}
		
		return result;
	}
	// 2. Find all transactions have value greater than 300 and sort them by trader¡¯s city
	private static List<Transaction> valueGreater(List<Transaction> transaction) {
		List<Transaction> s1 = new ArrayList<>();
		for (Transaction transactions : transaction) {
			if (transactions.getValue() > 300)
				s1.add(transactions);
		}
		s1.sort((o1, o2) -> o1.getTrader().getCity().compareTo(o2.getTrader().getCity()));
		return s1;
	}
	// 3. What are all the unique cities where the traders work?
	private static Set<String> uniqueCity(List<Transaction> transaction) {
		Set<String> name = new HashSet<>();
		for (Transaction transactions : transaction) {
				name.add(transactions.getTrader().getCity());
		}
		return name;
	}
	//4. Find all traders from Cambridge and sort them by name desc.
	private static void traderfromCambridge(List<Transaction> transaction, String text) {
		List<Trader> trader = new ArrayList<>();
		for (Transaction transactions : transaction) {
			{
				if (transactions.getTrader().getCity().compareTo(text) == 0) {
					trader.add(transactions.getTrader());
				}
				trader.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
				System.out.println(trader);
			}
		}
	} 
	//5. Return a string of all traders¡¯ names sorted alphabetically.
	private static Set<String> traderName(List<Transaction> transaction) {
		Set<String> name = new TreeSet<>();
		for (Transaction transactions : transaction) {
					name.add(transactions.getTrader().getName());
				}
				return name;
			}
	//6. Are any traders based in Milan?
	private static boolean fromCity(List<Transaction> transaction, String text) {
		for (Transaction transactions : transaction) {
			if(transactions.getTrader().getCity().compareTo(text) ==0)
				return true;
				}
				return false;
			}
	//7. Count the number of traders in Milan.
	private static int countTraderMilan(List<Transaction> transaction, String text) {
		Set<String> name = new TreeSet<>();
		for(Transaction transactions: transaction) {
			if(transactions.getTrader().getCity().compareTo(text) ==0 ) {
				name.add(transactions.getTrader().getName());
			}
	}
		return name.size();
	}
	//8. Print all transactions¡¯ values from the traders living in Cambridge.
	private static void printCambridge(List<Transaction> transaction, String text) {
		for (Transaction transactions : transaction) {
			if (transactions.getTrader().getCity().compareTo(text) == 0) {
				System.out.println(transactions.getValue());
			}
		}
	}
	//9. What¡¯s the highest value of all the transactions?
	//10. Find the transaction with the smallest value.
	
}
