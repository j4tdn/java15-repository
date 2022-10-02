package ex01;


public class Ex01 {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5, 6, 5, 5, 3, 1}; 
		int[] b = {5, 7, 9, 10, 20, 9, 7, 7, 11};
		
		System.out.println("Câu 1:");
		Handle(a, (v1, v2) -> v1 == v2 , 1);
		System.out.println("Câu 2:");
		Handle(b, (v1, v2) -> v1 > v2 , 1);

	}
	
	public static void Handle(int a[], Compare helper, int value) 
	{	
		int[] Tick = new int[21]; // tạo mảng đánh dấu, vì input cho 1<=n[i]<=20 nên tạo mảng đánh dấu có độ dài 21
		for(int i = 0; i< a.length;i++) Tick[a[i]]++;
		for(int i = 1; i<= 20;i++) if(helper.compare(Tick[i], value)) System.out.print(i + " ");
		System.out.println();
	}
	
}
