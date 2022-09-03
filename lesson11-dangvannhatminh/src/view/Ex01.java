package view;

public class Ex01 {
	public static void writeValueColumnInTwoDimensionArray(int source[][], int leftColIndex, int rightColIndex
															, int leftValue, int rightValue, int count)
	{
		int startRowIndex = leftColIndex;
		for(int round = 0; round < count; round++)
		{
			source[startRowIndex][leftColIndex] = leftValue;
			source[startRowIndex][rightColIndex] = rightValue;
			startRowIndex++;
		}
	}
	public static void printTwoDimensionArray(int[][] source)
	{
		for(int row=0 ; row < source.length;row++)
		{
			for(int col=0 ; col < source[row].length;col++)
			{
				if(source[row][col] == 0) 
				{
					System.out.print("  ");
					continue;
				}
				System.out.print(source[row][col] + " ");
			}
			System.out.println();
		}
	}
	public static void printAgainstTriangle(int n)
	{
		if(n % 2 == 0) 
		{
			System.out.println(n + " Khong the tao ra hai tam giac doi dinh");
			return;
		}
		
		int[][] arr = new int[n][n];
		int valueLeftCol = 1;
		int valueRightCol = n;
		int round = n; 
		int leftColIndex =0 , rightColIndex = n-1;
		
		while(true)
		{
			writeValueColumnInTwoDimensionArray(arr, leftColIndex, rightColIndex, valueLeftCol, valueRightCol, round);
			if(leftColIndex == rightColIndex) break;
			round-=2;
			valueLeftCol++; leftColIndex++;
			valueRightCol--; rightColIndex--;
		}
		printTwoDimensionArray(arr);
		
		
	}
	public static void main(String[] args) {
		printAgainstTriangle(9);
	}
}
