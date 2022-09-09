package online.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
	public static void main(String[] args) {
		List<Transaction> transactions = getTransactions();
		System.out.println(transactions);
		System.out.println("=======================");
		List<Transaction> transactionIn2021 = getTransactionIn2021(transactions);
		System.out.println(transactionIn2021);
		Arrays.sort(transactions, new Comparator<Tra>() {
			@Override
			public int compare(ItemDetail i1, ItemDetail i2) {
				return Double.compare(i2.getItemId(), i1.getItemId());
			}
		});
		System.out.println("2nd sorted items: " + Arrays.toString(items));
	}
	
	public static List<Transaction> getTransactions() {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");
		List<Transaction> transactions = Arrays.asList(
			new Transaction(brian, 2011, 300d),
			new Transaction(raoul, 2012, 1000d), 
			new Transaction(raoul, 2011, 400d),
			new Transaction(mario, 2012, 710d), 
			new Transaction(mario, 2012, 700d), 
			new Transaction(alan, 2012, 950d)
		);
		return transactions;
	}
	
	public static List<Transaction> getTransactionIn2021(List<Transaction> transactions){
		
		List<Transaction> result = new ArrayList<>();
		for(Transaction transaction : transactions) {
			if(transaction.getYear() == 2011) {
				result.add(transaction);
			}
		}
		
		return result;
	}
}
