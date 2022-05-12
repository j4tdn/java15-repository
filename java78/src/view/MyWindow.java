package view;

import javax.swing.JFrame;

public class MyWindow extends JFrame{
	public MyWindow() {
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void showIt(String title,int wight, int height, int x, int y) {
		this.setVisible(true);
		this.setTitle(title);
		this.setSize(wight, height);
		this.setLocation(x, y);
		
	}
	public static void main(String[] args) {
		MyWindow mw = new MyWindow();
		
		mw.showIt("IFAN STORE", 1300, 680, 0, 0);
	}
}
