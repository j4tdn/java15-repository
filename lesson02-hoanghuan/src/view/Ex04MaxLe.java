package view;

import java.util.Scanner;

public class Ex04MaxLe {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = ip.nextInt();
		int array[] = new int[n+1];
		for (int i = 1; i<=n; i++) {
			System.out.print("Number "+i+": ");
			array[i] = ip.nextInt();
		}
		sort(array);
		ip.close();
		/*for (int i=1; i<=n; i++) {
			System.out.print(array[i]+" ");
		}*/
		int dem=0;
		for (int i= n; i>0; i--) {
			if (array[i]%2 != 0) {
				System.out.println("Max le: "+array[i]);
				break;
			} else {dem++;}
		}
		if (dem==n) { System.out.println("Khong co so le");}
	}

		private static void sort(int [] arr) {
			int tam = arr[1];
			for (int i = 1; i<arr.length-1; i++) {
				for (int j = i+1; j<arr.length; j++) {
					if (arr[i]>arr[j]) {
						tam = arr[i];
						arr[i]=arr[j];
						arr[j]=tam;
					}
				}
			}
		}
}
