package homework;

public class Ex02 {

	public static void main(String[] args) {
		int arr1[] = {12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18};
		int arr2[] = new int[arr1.length];
		Sort(arr1, arr2);
		for(int a: arr2) {
			System.out.print(a + " ");
		}
		
	}
	public static void Sort(int arr1[],int arr2[]) {
		int count = 0;
		for(int i = 0;i < arr1.length;i++) {
			if(arr1[i] % 7 ==0 && arr1[i] % 5 != 0 ) {
			
				arr2[count] = arr1[i];
				count++;
			}
		}
		for(int i = 0;i < arr1.length;i++) {
			if((arr1[i] % 7 !=0 && arr1[i] % 5 !=0) || (arr1[i] % 7 ==0 && arr1[i] % 5 ==0)){
				arr2[count] = arr1[i];
				count++;
			}	
		}
		for (int i =0; i< arr1.length; i++) {
			if(arr1[i] % 7!=0&& arr1[i] % 5 == 0) {
				arr2[count] = arr1[i];
				count++;
			}
		}
	}
	
}
