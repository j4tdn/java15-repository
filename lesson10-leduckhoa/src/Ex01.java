import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int[] a = {7, 8 ,8, 8, 6 ,2, 5 ,1};
		int b[] = RemoveDuplicate(a);
		System.out.println(Arrays.toString(b));
		System.out.println("======================");
		System.out.println("Tổng n/2 phần tử đầu tiên lớn hơn tổng n/2 phần tử tiếp theo:" + Compare(a));
		Handle(a);
	}
	

	private static int[] RemoveDuplicate(int[] a) {
		
		for(int i = 0; i < a.length;i++) {
			for(int j = 0; j < a.length-i-1;j++) {
				if(a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
		int[] b = new int[a.length];
		int count1 = 0;
		int count = 0;
		for(int i = 0; i<a.length-1;i++) {
			if(a[i] == a[i+1]) count1++;
			if(a[i] != a[i+1] ) {
				if(count1 ==0) b[count++] = a[i];
				count1 = 0;
			}
		}
		if(a[a.length-1] != a[a.length-2]) b[count++] = a[a.length-1];
		return Arrays.copyOfRange(b, 0, count);
	}
	
	private static boolean Compare(int[] a) {
		float s=0,s1=0;
		for(int i = 0; i<a.length/2;i++) s+=a[i];
		for(int i = a.length/2; i<a.length;i++) s1+=a[i];
		return s > s1;
	}
	
	private static void Handle(int[] a) {
		for(int i = 0; i < a.length;i++) {
			for(int j = 0; j < a.length-i-1;j++) {
				if(a[j]< a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
		int count = 0;
		for(int i = 0; i< a.length - 1;i++) {
			if(a[i] != a[i+1]) count++;
			if(count == 3) {
				System.out.println("Phần tử lớn thứ 3: " + a[i]);
				break;
			}
		}
		
		
		
	}
}
