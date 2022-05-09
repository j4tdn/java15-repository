package view;

import java.util.Scanner;

public class Ex03SoDx {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = ip.nextInt();
		ip.close();
		int array[] = new int[1000]; int i=1;
		while (n>0) {
			array[i] = n%10;
			i++; n/=10;
		}
		/*for (int j = 1; j<i; j++) {
			if (array[j]>0) {
			System.out.print(array[j]+" ");
			} 
		}*/
		int a=0; int tam=i;
		for (int j=0; j<i; j++) {
			if (array[j] != array[i]) {
				System.out.println("FALSE");
				break;
			} else {
				i--;
				a++;
			}
		}
		if (tam%2 != 0) { 
			--tam;
			a--;
		}
		if (a == tam/2) {
		System.out.println("TRUE");}
	}
}