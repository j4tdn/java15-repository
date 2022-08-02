package view;
//cho vòng lặp chạy hết độ dài chuỗi, so sánh kí tự thứ i và i-1, nếu bằng nhau thì tăng count
//so sánh count với độ dài nhất của chuỗi giống nhau, lơn hơn thỳ gán count cho độ dài và
//gán vị trí độ dài bằng i-count
//làm ngược lại với chuỗi ngắn
//nếu i và i-1 ko giống nhau thỳ reset lại count
public class Ex07 {
	public static void main(String[] args) {
		String text = "aaaaaabbbcdddd";
		int count = 1;
		int longest = Integer.MIN_VALUE;
		int shortest  = Integer.MAX_VALUE;
		int longestInd = 0;
		int shortestInd = 0;
		
		
		for (int i = 1; i < text.length(); i++) {
			
			if (text.charAt(i) == text.charAt(i - 1)) {
				count++;
							
				
			}else {
				if(count > longest) {
					longest = count;
					longestInd = i - count;
				}	
				if(count < shortest) {
					shortest = count;
					shortestInd = i - count;
				}
				count = 1;
			}			

		}
		System.out.println(longest);
		System.out.println(shortest);
		System.out.println(longestInd);
		System.out.println(shortestInd);
		
	}

}
