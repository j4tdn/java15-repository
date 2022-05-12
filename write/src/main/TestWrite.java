package main;

import java.io.PrintWriter;

public class TestWrite {
	public static void main(String[] args) {

		try {
			PrintWriter pw = new PrintWriter("D:\\JAVA15\\2.JAVA\\write\\task.txt", "UTF-8");
			pw.println("toi la de nhat kiem khach");
			pw.print("so dien thoai cua toi: ");
			pw.println(0.0999);
			pw.println("luu vao di");
			
			FootBall fb = new FootBall("David Degea", "Micheal Carrick");
			pw.println(fb);
			pw.flush();
			pw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}