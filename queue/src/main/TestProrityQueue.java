package main;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestProrityQueue {
	public static void main(String[] args) {
		Queue<String> list = new PriorityQueue<String>();
		list.offer("co dau ben song");
		list.offer("tinhf yeu em so tinh yeu");
		list.offer("mai mai ben em");

		list.offer("nguoi toi yeu");
		while (true) {
			String x = list.poll();
			if (x != null) {

				System.out.println(x);

			}
		}

	}

}
