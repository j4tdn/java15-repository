package view;
import view.Book;
import java.util.Scanner;

public class Ex05run {
	public static void add() {
		Book s1 = new Sgk("SGK 01", 10000, "Kim Dong", "moi");
		Book s2 = new Sgk("SGK02", 12673, "Duc Quoc", "cu");
		Book s3 = new Sgk("SGk03", 32736, "Messi", "moi");
		Book tk1 = new Stk("STK01", 1263762, "Messi", 20);
		Book tk2 = new Stk("STK02", 73663, "Kim Dong", 10);
		Book arr[] = new Book[4];
		arr[0] = s1;
		arr[1] = s2;
		arr[2] = s3;
		arr[3] = tk1;
		arr[4] = tk2;

	}

	public static void seach(Book[] arr) {
		System.out.println("Nhap Tac Gia : ");
		String name ;
		  Scanner ip = new Scanner(System.in);
		  name = ip.nextLine();
		
		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr.equals(name));
			if(arr.equals(name)) {
				System.out.println(" " + arr[i]);
			}
		}
	}
 public   static void seach02 (Book arr[], double price) {
	 System.out.println("Nhap So Tien : ");
	 int a = 50000;
	 for (int i = 0; i < arr.length; i++) {
		 if (price< 50000) {
			 System.out.println(" " + arr[i]);
		 }
		 
		 
			 
		 
	 }
	
}
 public static void seach03(Book arr[], double price) {
	 System.out.println("Nhap So Tien : ");
	 int a = 50000;
	 for (int i = 0; i < arr.length; i++) {
		 if (price< 50000) {
			 System.out.println(" " + arr[i]);
		 }
		 
	 }
	
	 }
 
 public static void main(String[] args) {
	
	
	
}
		
}
