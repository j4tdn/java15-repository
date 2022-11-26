package ex01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner input = new  Scanner(System.in);
		int judge = 2;
		int [][] Array = new int[judge][];
		//4
		//3 5 2 1
		//3 12 5 2
		//2 1 2
		//3 2 1 5
		for(int i = 0 ; i < judge ; i++)
		{
			int quest = input.nextInt(); // 2
			for(int j = 0 ; j < quest; j++) // 0 - 2
			{
				Array[i][j] = input.nextInt(); // a[0] = 5 2 1 
				System.out.println(Array[i][j]);
			}
		}
		int choose = 2;
		Map<Integer, Integer> Arrays = new HashMap();
	
		
	
	}
}
