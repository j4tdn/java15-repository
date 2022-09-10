package online.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class App {
	public static void main(String[] args) {
		List <Transaction> list = getTransactions();
		System.out.println(List2011(list));//1
		System.out.println("=======================================");
		System.out.println(valuegreaterX(list,300));//2
		System.out.println("=======================================");
		System.out.println(TheUniqueCities(list));//3
		System.out.println("=======================================");
		TradersCam(list, "Cambridge");//4
		System.out.println("=======================================");
		System.out.println(TraderName(list)); //5
		System.out.println("=======================================");
		System.out.println(ComeFromCityX(list, "Milan")); //6
		System.out.println("=======================================");
		System.out.println(CountTrader(list, "Milan"));//7
		System.out.println("=======================================");
		PrintValueFromX(list, "Cambridge");//8
		System.out.println("=======================================");
		System.out.println(FindValue(list, "max"));//9
		System.out.println("=======================================");
		System.out.println(FindValue(list, "min"));//10
				
		
		

			
		
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
	
	public static List<Transaction> List2011(List<Transaction> transactions){ //1
		
		List<Transaction> temp = new ArrayList<>();
		for(Transaction trans : transactions) {
			if(trans.getYear() == 2011) {
				temp.add(trans);
			}
		}
		temp.sort((o1,o2) -> o1.getValue() - o2.getValue());
		return temp;
	}
	
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
	
	public static Set<String> TheUniqueCities(List<Transaction> transactions) { //3
		Set<String> Name = new HashSet<>();
		for(Transaction t: transactions) {
			Name.add(t.getTraders().getCity());
		}
		return Name;
		
	}
	
	public static void TradersCam(List<Transaction> transactions, String text){ //4
		List<Trader> trader = new ArrayList<>();
		for(Transaction trans : transactions) {
			if(trans.getTraders().getCity().compareTo(text) == 0) {
				trader.add(trans.getTraders());
			}
		}
		
		trader.sort((o1,o2) -> o1.getName().compareTo(o2.getName()));
		System.out.println(trader);
		
	}
	
	public static Set<String> TraderName(List<Transaction> transactions){ //5
		Set<String> Name = new TreeSet<>();
		for(Transaction trans : transactions) {
			Name.add(trans.getTraders().getName());
		}
		return Name;
	}
	
	public static boolean ComeFromCityX(List<Transaction> transactions, String text) { //6
		for(Transaction trans : transactions) {
			if(trans.getTraders().getCity().compareTo(text) == 0) return true;
		}
		return false;
	}
	
	public static int CountTrader(List<Transaction> transactions, String text) { //7
		Set<String> Name = new TreeSet<>();
		for(Transaction trans : transactions) {
			if(trans.getTraders().getCity().compareTo(text) == 0) {
				Name.add(trans.getTraders().getName());
			}
		}
		return Name.size();
	}
	
	public static void PrintValueFromX(List<Transaction> transactions, String text) { //8
		for(Transaction trans : transactions) {
			if(trans.getTraders().getCity().compareTo(text) == 0) {
				System.out.println(trans.getValue());
			}
		}
	}
	public static int FindValue(List<Transaction> transactions, String X) { //9
		if(X.compareTo("max")==0) {
			int max = Integer.MIN_VALUE;
			for(Transaction trans : transactions) {
				if(trans.getValue() > max) {
					max = trans.getValue();
				}
			}
			return max;
		}
		if(X.compareTo("min")==0) {
			int min = Integer.MAX_VALUE;
			for(Transaction trans : transactions) {
				if(trans.getValue() < min) {
					min = trans.getValue();
				}
			}
			return min;
		}
		System.out.println("Không tìm được");
		return Integer.MIN_VALUE;
		
	}
}
