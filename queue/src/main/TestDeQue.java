package main;

import java.util.ArrayDeque;
import java.util.Deque;

public class TestDeQue {
	public static void main(String[] args) {
		Deque<String> list = new ArrayDeque<String>();
		list.offer("tinh em");
		list.offer("nguoi em yeu");
		list.offer("ko gi la ko the");
		list.offerFirst("ngay em di");
		list.offerLast("em ve keo troi mua");
		while(true) {
			String x = list.poll();
			if (x!= null) {
				System.out.println(x);
			}
			
		}
	}

}
