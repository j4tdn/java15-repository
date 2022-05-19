package view;

import java.util.Scanner;

public class HorseSaddle {
	private static int nRow;
	private static int nCol;
	private int[][] A ;
	
	public int CountSaddlelInArray(int A[][], int nRow, int nCol) {
		int iRow, iCol;
		int countsaddle = 0;
		int vitriminrow;
		int max = 0, min = 0;
		
		for (iRow = 0; iRow < nRow; iRow++) {
			min = A[iRow][0];
			vitriminrow = 0;
			for (iCol = 1; iCol < nCol; iCol++) {
				if (min > A[iRow][iCol]) {
					min = A[iRow][iCol];
					vitriminrow = iCol;
				}
			}

			max = min;
			for (int i = 1; i < nRow; i++) {
				if (max < A[i][vitriminrow]) {
					max = A[i][vitriminrow];				
				}
			}

			if (min == max) {
				countsaddle++;
			}
		}

		return countsaddle;
	}

	public static void main(String[] args) {
		HorseSaddle s1 = new HorseSaddle();
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("Nhập vào số dòng của mảng: ");
			nRow = sc.nextInt();
			System.out.print("Nhập vào số cột của mảng: ");
			nCol = sc.nextInt();
		}while(nRow <= 1 || nCol <= 1 );
		
		int[][] A = new int[nRow][nCol];
		
		System.out.println("Nhập giá trị vào cho mảng:");
		for (int i = 0; i < nRow; i++) {
			for (int j = 0; j < nCol; j++) {
				System.out.print("\tNhập phần tử thứ [" + i + ", " + j + "]:  ");
				A[i][j] = sc.nextInt();
			}
		}
	

	
		System.out.println("Mảng vừa nhập: ");
		for (int i = 0; i < nRow; i++) {
			for (int j = 0; j < nCol; j++) {
				System.out.print("\t" + A[i][j] + "\t");
			}
			System.out.println();
		}
	
		System.out.print("Ma trận có " + s1.CountSaddlelInArray(A,nRow, nCol) + " điểm yên ngựa");

	}
}