package exam;


public class Ex02 {

	public static void main(String[] args) {

		int a[]={12,25,55,350,70,19,35,49,10,14};
		
		
		
		  for(int i = 0,k = 0;k < a.length; k++){
				
				if(a[k]%7==0 && a[k]%5!=0)
				{
					swapArray(a, i, k);
					i++;
				}
				
			}
		  
		  
		  for(int i=a.length-1,k=a.length-1;k>=0;k--){
				
				if(a[k]%7!=0 && a[k]%5==0)
				{
					swapArray(a, i, k);
					i--;
				}
				
			}
			
			
		
			
			for(int i=0;i<a.length;i++){
				System.out.print(a[i]+ " ");
			}
		
	}
	  private static void swapArray (int arr[], int i, int j)
	  {
	        int temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	    }


	
	

	   
		
}