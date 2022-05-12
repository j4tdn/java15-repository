package view;

import javax.swing.JFrame;

public class MyWindows extends JFrame {
	public MyWindows() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void showIt(String title, int wight, int height) {
		this.setVisible(true);
		this.setTitle(title);
		this.setSize(wight, height);
	}

	public static void main(String[] args) {
		MyWindows mw = new MyWindows();
		mw.showIt("IFAN STORE", 1300, 650);
	}
}
