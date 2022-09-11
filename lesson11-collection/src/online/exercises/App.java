package online.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class App {
	public static void main(String[] args) {
		List <Transaction> list = getTransactions();
		System.out.println("1. "+ list2011(list));//1
		System.out.println("=======================================");
		System.out.println("2. "+ valuegreaterX(list,300));//2
		System.out.println("=======================================");
		System.out.println("3. "+ theUniqueCities(list));//3
		System.out.println("=======================================");
		System.out.println("4. "+ tradersCam(list, "Cambridge"));//4
		System.out.println("=======================================");
		System.out.println("5. "+ traderName(list)); //5
		System.out.println("=======================================");
		System.out.println("6. "+ comeFromCityX(list, "Milan")); //6
		System.out.println("=======================================");
		System.out.println("7. "+ countTrader(list, "Milan"));//7
		System.out.println("=======================================");
		printValueFromX(list, "Cambridge");//8
		System.out.println("=======================================");
		System.out.println("9. Max = "+ findValue(list, "max"));//9
		System.out.println("=======================================");
		System.out.println("10.Min =  "+ findValue(list, "min"));//10
					
	}
	
	public static List<Transaction> getTransactions() {
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
	
	//Find all transactions in the year 2011  and sort them by value (small to high)
	public static List<Transaction> list2011(List<Transaction> transactions){ //1
		
		List<Transaction> temp = new ArrayList<>();
		for(Transaction trans : transactions) {
			if(trans.getYear() == 2011) {
				temp.add(trans);
			}
		}
		
		temp.sort((o1,o2) -> Double.compare(o1.getValue(), o2.getValue()));
		return temp;
	}
	//Find all transactions have value greater than 300 and sort them by trader’s city
	public static List<Transaction> valuegreaterX(List<Transaction> transactions, int n){ //2
		List<Transaction> temp = new ArrayList<>();
		for(Transaction trans : transactions) {
			if(trans.getValue() > n) {
				temp.add(trans);
			}
		}
		
		temp.sort((o1,o2) -> o1.getTraders().getCity().compareTo(o2.getTraders().getCity()));
		return temp;
	}
	//What are all the unique cities where the traders work?
	public static Set<String> theUniqueCities(List<Transaction> transactions) { //3
		Set<String> name = new HashSet<>();
		for(Transaction t: transactions) {
			name.add(t.getTraders().getCity());
		}
		return name;
		
	}
	//Find all traders from Cambridge and sort them by name desc.
	public static List<String> tradersCam(List<Transaction> transactions, String text){ //4
		Set<String> traders = new HashSet<>();
		for(Transaction trans : transactions) {
			if(trans.getTraders().getCity().compareTo(text) == 0) {
				traders.add(trans.getTraders().getName());
			}
		}
		List<String> trader = new ArrayList<>();
		trader.addAll(traders);
		trader.sort((o1,o2) -> o2.compareTo(o1));
		
		return trader;
		
	}
	//Return a string of all traders’ names sorted alphabetically.
	public static Set<String> traderName(List<Transaction> transactions){ //5
		Set<String> Name = new TreeSet<>();
		for(Transaction trans : transactions) {
			Name.add(trans.getTraders().getName());
		}
		return Name;
	}
	//Are any traders based in Milan?
	public static boolean comeFromCityX(List<Transaction> transactions, String text) { //6
		for(Transaction trans : transactions) {
			if(trans.getTraders().getCity().compareTo(text) == 0) return true;
		}
		return false;
	}
	//Count the number of traders in Milan.
	public static int countTrader(List<Transaction> transactions, String text) { //7
		Set<String> Name = new TreeSet<>();
		for(Transaction trans : transactions) {
			if(trans.getTraders().getCity().compareTo(text) == 0) {
				Name.add(trans.getTraders().getName());
			}
		}
		return Name.size();
	}
	//Print all transactions’ values from the traders living in Cambridge.
	public static void printValueFromX(List<Transaction> transactions, String text) { //8
		System.out.println("8. ");
		for(Transaction trans : transactions) {
			if(trans.getTraders().getCity().compareTo(text) == 0) {
				System.out.println(trans.getValue());
			}
		}
	}
	// find smallest or biggest value
	public static double findValue(List<Transaction> transactions, String X) { //9
		if(X.compareTo("max")==0) {
			double max = Integer.MIN_VALUE;
			for(Transaction trans : transactions) {
				if(trans.getValue() > max) {
					max = trans.getValue();
				}
			}
			return max;
		}
		if(X.compareTo("min")==0) {
			double min = Integer.MAX_VALUE;
			for(Transaction trans : transactions) {
				if(trans.getValue() < min) {
					min = trans.getValue();
				}
			}
			return min;
		}
		System.out.println("Chỉ có thể truyền vào max hoặc min mời nhập lại");
		return Integer.MIN_VALUE;
	}
}
