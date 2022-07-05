import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex01 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double a ,b;
        do {
            try {
                System.out.println("Enter number a :");
                a = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter number b :");
                b = Integer.parseInt(scanner.nextLine());
                break;
            }catch (NumberFormatException e){
                System.out.println("invalid number");

            }
        }while (true);

        System.out.println(result(a,b));
    }
    private static double result(double a, double b){
     if (a == 0){
         System.out.println("error");
     }
     return -b/a;
    }
}
