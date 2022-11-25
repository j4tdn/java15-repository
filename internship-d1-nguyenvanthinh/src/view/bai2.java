package view;

public class bai2  
{     
    public static int isHappyNumber(int num){  
        int rem = 0, sum = 0;  
        while(num > 0){  
            rem = num%10;  
            sum = sum + (rem*rem);  
            num = num/10;  
        }  
        return sum;  
    }  
      
    public static void main(String[] args) {  
        int num = 82;  
        int result = num;  
          
        while(result != 1 && result != 4){  
            result = isHappyNumber(result);  
        }  
          
        if(result == 1)  
            System.out.println("true");  
        else if(result == 4)  
            System.out.println("false");     
    }  
}
