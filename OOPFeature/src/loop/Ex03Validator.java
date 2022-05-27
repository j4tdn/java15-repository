package loop;

import java.util.Scanner;

public class Ex03Validator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
//        int number = sc.nextInt();
        String numberAsText = "";

        int k = 0;
        do {
            System.out.print("Value:");
            numberAsText = sc.nextLine();

            if (numberAsText.matches("\\d+")) {
                break;
            }
            k++;
            if (k == 3) {
                System.out.println("wrong value");
                System.exit(0);
            }
        } while (true);
    }
}

