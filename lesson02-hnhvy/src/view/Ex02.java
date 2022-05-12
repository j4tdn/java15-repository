package view;

/*
 * Viết chương trình tính tổng S= 4! + 7! + 12! + 18!
 * Người tạo : hnhvy
 * Ngày tạo : 11/5/22
 * **/
//Input 4! + 7! + 12! + 18!
/*
 * B1 tạo biến gán giá trị cho a b c d lần lượt 4 7 12 18
 * B2 : dùng vòng lặp for để tính giai thừa
 * B3 : tính tổng in ra kq 
 * **/
//	Output In ra S
public class Ex02 {
	
		public static void main(String[] args) {
			int a = 4;
			int b = 7;
			int c = 12;
			int d = 18;
			long S = factorial(a) + factorial(b) + factorial(c) + factorial(d);
		    System.out.println("S = 4! + 7! + 12! + 18! = " + S);
		
		}
		private static long factorial (int n) {
			long factorial = 1;
	        for(int i = 2; i <= n;i++) {
	        	factorial *= i;
	        }
	        return factorial;
	      }
	}