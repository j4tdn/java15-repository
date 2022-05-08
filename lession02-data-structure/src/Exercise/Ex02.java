package Exercise;
/**
 * Tinh tổng 4! +7! + 12! + 18!
 * @author Admin
 *
 */
public class Ex02 {
	public static void main(String[] args) {
		System.out.println("Tong la: " + factorial());
	}
	private static int factorial() {
		System.out.println("ahihi");
		int count= 0;
		long count1 = 1;
		int total = 0;
		while(true) {
		//	if(count == 4 || count == 7 || count == 12 || count == 18) {
			if(count == 18) {
				for(int i = 1; i <= count; i++) {
					count1 = count1 * i;
				}
				total += count1;
			}
			count ++;
			if(count == 19) {
				break;
			}
		}
		return total;
		
	}
}
