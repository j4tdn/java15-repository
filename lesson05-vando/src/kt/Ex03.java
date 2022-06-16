package kt;

import java.util.Arrays;
import java.util.List;

public class Ex03 {
	public static void main(String[] args) {
//			int a[] = { 2, 5, 3, 6, 5, 1 };
//			System.out.println(getUniqueNumbers(a));
//		}
//
//		public static String getUniqueNumbers(int a[]) {
//			String result = "";
//			for (int i = 0; i < a.length; i++) {
//				int count = 0;
//				for (int j = 0; j < a.length; j++)
//					if (a[i] == a[j])
//						count++;
//				if (count == 1)
//					result += a[i] + " ";
//			}
//			return result;
	    //create an integer array having some duplicate elements   
        int arrayWithDuplicates[] = {3, 15, 21, 0, 15 ,17, 21};  
        
        List<int> arrayWithDuplicates = new ArrayList<>(Arrays.asList(arrayWithDuplicates));
          
        //calculate length of the arrayWithDuplicates array   
        int len = arrayWithDuplicates.length;   
          
        //create an integer array to store distinct elements   
        int[] distinctArray = new int[20];  
          
        //integer variable to increment array index  
        int index = 0;  
          
        // outermost loop to take element one by one from the leftmost side  
        for (int i = 0; i < len; i++)   
        {   
            int flag = 0;  
            //innermost loop to make comparision between elemnts and skip duplicate elements  
            for (int j = i + 1; j < len; j++){  
                if (arrayWithDuplicates[i] == arrayWithDuplicates[j]){   
                	arrayWithDuplicates.remove(arrayWithDuplicates[i]);
                    flag = 1;  
                    break;   
                }  
            }  
            //store or print the element if it is not present in the distinctArray  
            if (flag == 0){   
                distinctArray[index] = arrayWithDuplicates[i];  
                index++;    //increment index value  
            }  
        }  
        //print distinctArray   
        for(int i = 0; i < index; i++)  
            System.out.print( distinctArray[i] + " ");   
    }         
}
