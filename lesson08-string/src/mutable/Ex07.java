package mutable;
/*
 * Idea của bài này là chuyển từ String sang char để dễ thao tác hoặc có thể dùng hàm...
 * B1:Khai báo biến chỉ vị trí post=0, vị trí đầu của chuỗi dài nhất mainpost=0,
 * ...ngắn nhất mainpostmin=0.
 * B2: Duyệt vòng lặp từ 1->> length-1
 * B2.1: nếu a[i] != a[i-1] thì số kí tự của chuỗi là count=(i-1)-pos+1 //không tính kí tự ở vị trí i
 * 	   .Nếu count > max thì max = count, kí tự = a[post], mainpost = post
 *     .Nếu count < min thì min = count, kí tự = a[post], mainpostmin = post
 *     .gán post = i
 * B2.2: Nếu i ở vị trí cuối cùng thì ta đếm từ vị trí post tới i => count = i-post+1
 *     .Nếu count > max thì max = count, kí tự = a[post], mainpost = post
 *     .Nếu count < min thì min = count, kí tự = a[post], mainpostmin = post
 * B3:xuất ra output theo yêu cầu 
 * */
public class Ex07 {
	public static void main(String[] args) {
		String string = "aabbgggggccdda";
		char[] arr = string.toCharArray();
		Treatment(arr);
	}
	
	
	private static void Treatment(char[] arr) {
		int max = Integer.MIN_VALUE,min = Integer.MAX_VALUE;
		int post=0,mainpost=0,mainpostmin=0;
		char kt = ' ',ktmin=' ';
		
		for(int i = 1; i < arr.length;i++) {
			if(arr[i] != arr[i-1]) {
				int count = (i-1)-post+1;
				if(count > max) {
					max = count;
					mainpost = post;
					kt = arr[post];
					
				}
				
				if(count < min) {
					min = count;
					mainpostmin = post;
					ktmin = arr[post];
					
				}
				
				post = i;
				
			}
			if(i==arr.length-1) {
				int count =i-post+1; 
				if(count > max) {
					max = count;
					mainpost = post;
					kt = arr[post];
				}
				if(count < min) {
					min = count;
					mainpostmin = post;
					ktmin = arr[post];
					
				}
			}
		}
		System.out.print("kí tự xuất hiện nhiều nhất: "+max+ " "); pri(kt, max) ;
		System.out.println(" [" + mainpost +"]"); 
		System.out.print("kí tự xuất hiện ít nhất: "+min+ " "); pri(ktmin, min);
		System.out.println(" [" + mainpostmin+"]");
		
	}
	
	private static void pri(char a, int n) {
		for(int i =1;i<=n;i++) System.out.print(a);
	}
	
	
	
}
