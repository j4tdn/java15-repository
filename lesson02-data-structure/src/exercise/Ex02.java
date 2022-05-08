package exercise;

public class Ex02 {
public static void main(String[] args) {
	long sum =0, sum1 = 1, sum2 = 1, sum3 = 1, sum4 = 1;
	for(int i= 1; i <= 4; i++ ) {
		sum1 *=i;
	}
	for(int i= 1; i <= 7; i++ ) {
		sum2 *=i;
	}
	for(int i= 1; i <= 12; i++ ) {
		sum3 *=i;
	}
	for(int i= 1; i <= 18; i++ ) {
		sum4 *=i;
	}
	sum = sum1 + sum2 + sum3 + sum4;
	System.out.println("value = " + sum );
}
}
