package online.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AppTrader {
	private static final int ArrayList = 0;

	public static void main(String[] args) {

		System.out.println("===Ex01:Transactions In 2011-Sort by Value===");
		List<Transaction> listTrans2011 = findTrans2011(getTransactions());
		Collections.sort(listTrans2011, Comparator.comparing(Transaction::getValue));
		System.out.println(listTrans2011);

		System.out.println("===Ex02:Transactions's Value 300-Sort by Trader'sCity");
		List<Transaction> listTransGreater = findTransGreater(getTransactions());
		Collections.sort(listTransGreater, Comparator.comparing(t -> t.getTrader().getCountry()));
		System.out.println(listTransGreater);

		System.out.println("===Ex03:All City===");
		List<Trader> traders = getTrader();
		System.out.println(findCountry(traders));

		System.out.println("===Ex04:Cambridge-Sort by Name DEC ");
		List<Trader> tradersCam = findTraderCambridge(traders);
		Collections.sort(tradersCam, Comparator.comparing(Trader::getName, Comparator.reverseOrder()));
		System.out.println(tradersCam);
		System.out.println("===Ex05===");
		System.out.println(findTraderName(getTrader()));
		System.out.println("===Ex06: Trader in Milan===");
		if (haveMilan(getTrader()) == true) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		System.out.println("===Ex07: Count Traders in Milan ");
		System.out.println(countMilan(getTrader()));
		
		System.out.println("===Ex08: Value of Transaction by Cambridge Traders");
		System.out.println(ValueOfCambridge(getTransactions()));
		
		
		System.out.println("===Ex09: Max Value Of Transactions");
		System.out.println(highestValue(getTransactions()));
		
		System.out.println("===Ex10:Transaction with Smallest Value=== ");
		smallestValue(getTransactions());

	}

	public static List<Trader> getTrader() {
		List<Trader> traders = Arrays.asList(
				new Trader("Raoul", "Cambridge"),
				new Trader("Mario", "Milan"),
				new Trader("Alan", "Cambridge"),
				new Trader("Brian", "Cambridge"));
		return traders;

	}

	public static List<Transaction> getTransactions() {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");
		List<Transaction> trans = Arrays.asList(
				new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000),
				new Transaction(raoul, 2011, 400), 
				new Transaction(mario, 2012, 710), 
				new Transaction(mario, 2012, 700),
				new Transaction(alan, 2012, 950));
		return trans;
	}

	private static List<Transaction> findTrans2011(List<Transaction> trans) {
		List<Transaction> list = new ArrayList<>();
		for (Transaction tran : trans) {
			if (tran.getYear() == 2011) {
				list.add(tran);
			}
		}
		return list;

	}

	private static List<Transaction> findTransGreater(List<Transaction> trans) {
		List<Transaction> list = new ArrayList<>();
		for (Transaction tran : trans) {
			if (tran.getValue() > 300) {
				list.add(tran);
			}
		}
		return list;
	}

	private static Set<String> findCountry(List<Trader> traders) {
		Set<String> countries = new HashSet<>();
		for (Trader trader : traders) {
			countries.add(trader.getCountry());
		}
		return countries;
	}

	private static List<Trader> findTraderCambridge(List<Trader> traders) {
		List<Trader> list = new ArrayList<>();
		for (Trader trader : traders) {
			if (trader.getCountry() == "Cambridge") {
				list.add(trader);
			}
		}
		return list;
	}

	private static String findTraderName(List<Trader> traders) {
		List<Trader> list = new ArrayList<>();
		list.addAll(traders);
		list.sort(Comparator.comparing(Trader::getName));
		StringBuffer string = new StringBuffer();

		for (Trader trader : list) {
			string.append(trader.getName());
		}

		return string.toString();
	}

	private static boolean haveMilan(List<Trader> traders) {
		for (Trader trader : traders) {
			if (trader.getCountry() == "Milan") {
				return true;
			}
		}
		return false;

	}
	private static int countMilan(List<Trader> traders) {
		int count=0;
		for(Trader trader:traders) {
			if(trader.getCountry()=="Milan") {
				count++;
			}
				
		}
		return count;
	}
	private static List<Double> ValueOfCambridge(List<Transaction> trans){
		List<Double> values= new ArrayList<>();
		for(Transaction tran:trans) {
			if(tran.getTrader().getCountry()== "Cambridge") {
					values.add(tran.getValue());
			}
		}
		return values;
	}
	private static Double highestValue(List<Transaction> trans) {
		Double highestValue=0d;
		for(Transaction tran:trans) {
			if(tran.getValue()>highestValue) {
				highestValue=tran.getValue();
			}
		}
		return highestValue;
	}
	private static void smallestValue(List<Transaction> trans) {
		Transaction smallestTranbyValue= trans.stream()
											.min(Comparator.comparingDouble(Transaction::getValue))
											.get();
		System.out.println(smallestTranbyValue);
		
	}
	

}
