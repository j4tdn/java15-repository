package bkdnoj;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ChangeMoney {
	 static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		Map<Integer, Integer> moneys = new HashMap<>();
		int n = ip.nextInt();
		moneys.put(1, n);
		n = ip.nextInt();
		moneys.put(5, n);
		n = ip.nextInt();
		moneys.put(10, n);
		n = ip.nextInt();
		moneys.put(50, n);
		n = ip.nextInt();
		moneys.put(100, n);
		n = ip.nextInt();
		moneys.put(500, n);
		int x = ip.nextInt();
		System.out.println(check(moneys, x));
	}
	public static boolean check(Map<Integer, Integer> moneys, int x) {
		List<Integer> l = new ArrayList<>(); l.addAll(moneys.keySet());
		if(l.size() <= 1) return false;
		int i = l.size()-1;
		while(x>=0) {
			int n = moneys.get(l.get(i));
			if(x > l.get(i) && n!=0) {
				x-=l.get(i);
				moneys.put(l.get(i), n--);
			}
			else if( n==0 || x < l.get(i)) {
				i--;
			}
		}
		if(x==0) return true;
		return false;
	}
	
}
