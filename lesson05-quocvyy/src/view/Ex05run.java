package view;

public class Ex05run {
	public static void add() {
		Book s1 = new Sgk("SGK 01", 10000, "Kim Dong", "moi");
		Book s2 = new Sgk("SGK02", 12673, "Duc Quoc", "cu");
		Book s3 = new Sgk("SGk03", 32736, "Messi", "moi");

		Book tk1 = new Stk("STK01", 1263762, "Messi", 20);
		Book tk2 = new Stk("STK02", 73663, "Kim Dong", 10);

		Book[] arr = new Book[4];
		arr[0] = s1;
		arr[1] = s2;
		arr[2] = s3;
		arr[3] = tk1;
		arr[4] = tk2;

	}

	public static void seach(Book[] arr) {
		System.out.println("Tac Gia: Kim Dong");
		for (int i = 0; i < arr.length; i++) {

		}
	}
}
