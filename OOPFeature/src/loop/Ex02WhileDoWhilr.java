package loop;

public class Ex02WhileDoWhilr {
    public static void main(String[] args) {
        //print out number les than N
        int n = 6;
        int i = 0;
        while (i<n){
            System.out.print(i +"\t");
            i +=2;
        }
        System.out.println("\nFinished");
         i =0;
        System.out.println("\n=======================");

        while (true){
            System.out.print( i + "\t");
             i +=2;

             if (i ==n){
                 break;
             }
        }

        System.out.println("\n=======================");

        int m = 8;
        int k = 0;

        do {
            System.out.print(k + "\t");
            k++;
            if (k>=m){
                break;
            }
        }while (true);
    }
}
