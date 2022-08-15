package bai2.view;

import java.util.Arrays;

import bai2.bean.ZeroPosition;

public class Ex01 {
	public static void generateZeroMatrix(int[][] source)
	{
		ZeroPosition[] listPos = new ZeroPosition[source.length];
		int count = 0;
		for(int row = 0; row < source.length;row++)
		{
			for(int col = 0 ; col < source[row].length ; col++)
			{
				if(source[row][col] == 0 )
				{
					listPos[count++] = new ZeroPosition(row, col);
				}
			}
		}
		listPos = Arrays.copyOfRange(listPos, 0, count);
		for(ZeroPosition i : listPos)
		{
			changeRowColToZero(source, i.getIndexRow(), i.getIndexCol());
		}
	}
	public static void changeRowColToZero(int[][] source, int iRow, int iCol)
	{
		for(int i=0 ;i<source.length;i++)
		{
			source[i][iCol] = 0;
		}
		for(int i=0 ;i<source[iRow].length;i++)
		{
			source[iRow][i] = 0;
		}
	}
	public static void main(String[] args) {
		int[][] source = {{1,2,3,4},
						  {5,0,8,7},
						  {1,9,0,9},
						  {2,0,6,5},
						  {1,2,4,5}};
		generateZeroMatrix(source);
		for(int[] row : source)
		{
			for(int col : row)
			{
				System.out.print(col);
			}
			System.out.println();
		}
	}
}
