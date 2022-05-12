package main;

import java.util.LinkedList;
import java.util.Queue;

public class TesstQueue {
	public static void main(String[] args) {
		Queue<String> list = new LinkedList<String>();

		list.offer("NGUOI TINH MUA DONG");
		list.offer("BAN TINH CA DAU TIEN");
		list.offer("KHONG YEU AI NGOAI EM");
		list.offer("HONG NHAN BAC PHAN");
		while (true) {
			String x = list.poll();
			if (x != null) {
				System.out.println(x);
			
			}
			
		}

	}
}
