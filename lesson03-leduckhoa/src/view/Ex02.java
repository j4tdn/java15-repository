package view;

import java.util.Scanner;

import bean.vihicle;

public class Ex02 {
		private static int n;
		
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		vihicle[] o1 = null;
		int b;
		System.out.print("Chương trình tính thuế xe!\n");
		do {
			System.out.println("1.Nhập danh sách    2.Xuất danh sách     3.Thoát");
			System.out.println("=================================================");
			b = ip.nextInt();
			
			switch(b) {
			case 1:{ System.out.print("Mời nhập số lượng xe:");
					n = ip.nextInt();
					o1 = new vihicle[n];
					inputs(o1);
					};break;
			case 2: display(o1);break;
			}
			
		}
		while(b!=3);
		System.out.println("Tạm biệt!");
		}
	
	
		private static void inputs(vihicle[] o1) {
			Scanner ip = new Scanner(System.in);
		
			for(int i = 0 ; i < n; i++) {
				
				o1[i] = new vihicle();
				System.out.println("Mời bạn nhập thông tin xe thứ "+ (i+1));
				System.out.print("Tên chủ sở hữu:");
				o1[i].setName(ip.nextLine());
				System.out.print("Loại xe:");
				o1[i].setModel(ip.nextLine());
				System.out.print("Dung tích:");
				o1[i].setCapacity(ip.nextInt());
				System.out.print("Trị giá:");
				o1[i].setPrice(ip.nextInt());
				o1[i].Tax();
				ip.nextLine();
				System.out.println("=================================================");
		}
	}
		private static void display(vihicle[] o1) {
			if(n==0) {
				System.out.println("Danh sách rỗng!");
			}
			else {
				System.out.println("Tên chủ xe   Loại xe	Dung tích	Trị giá		Thuế phải nộp\n");
				for(int i = 0; i< n;i++) System.out.println(o1[i] + "\n");
				System.out.println("==================================================");
			}
			
		}
	
}
