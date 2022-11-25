package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import bean.Examiner;

public class SeniorCitizen {
public static void main(String[] args) {
//	List<Examiner> examiners = new ArrayList();
//	int index;
//	int index1;
//	int index2;
//	 int index3;
//	 Scanner sc = new Scanner(System.in);
//	 int count = sc.nextInt();
//     for(int i = 0; i<count;i++) {
//    	  index = sc.nextInt();
//    	  index1 = sc.nextInt();
//    	  index2 =sc.nextInt();
//    	 index3 = sc.nextInt();
//    	 
//    	 Examiner examiner = new Examiner();
//    	// examiner.setIndex(index);
//         examiner.setIndex1(index1);
//         examiner.setIndex2(index2);
//         examiner.setIndex3(index3);
//    	examiners.add(examiner);
//    	 
//    	 
//     }
	
	//System.out.println(examiners.get(1).getIndex2()); 
	 Scanner sc = new Scanner(System.in);
	 int a = sc.nextInt();
	 int n[][] = new int [a][4]; 
		int j = 0;
		for(int i = 0; i< a;i++) {
			int b = sc.nextInt();
			n[i][0] =b;
			for( j=1;j<b;j++) {
				n[i][j+1] =sc.nextInt();
			}
		}
		
		
	for(int i = 0;i<a;i++) {
		for(int k =0;k<4;k++) {
			System.out.println(n[i][k]);
			System.out.println("\n");
		}
	}
		
}

}
