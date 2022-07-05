package viewr;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
        while (true){
            System.out.printf("Input your number:");
            Scanner scanner= new Scanner(System.in);
            int number= scanner.nextInt();
            if(number>= 0 && number <=10){
                System.out.println(oneDigit(number));
            }
            else if(number< 100){
                System.out.println(twoDigit(number));
            }
            else {
                System.out.println(threeDigit(number));
            }
        }
    }

    private static String oneDigit(int number){
        switch (number){
            case 1:
                return "một";
            case 2:
                return "hai";
            case 3:
                return "ba";
            case 4:
                return "bốn";
            case 5:
                return "năm";
            case 6:
                return "sáu";
            case 7:
                return "bảy";
            case 8:
                return "tám";
            case 9:
                return "chín";
            case 10:
                return "mười";
        }

        return "linh";
    }

    private static String twoDigit(int number){
        String res;
        int teens= number/ 10;
        int ones= number % 10;
        if(teens== 1){
            res= "mười " + oneDigit(ones);
        }
        else {
            res= oneDigit(teens)+ " "+ oneDigit(ones);
        }

        return res.replace("một", "mốt");
    }

    private static String threeDigit(int number){
        int hundreds= number / 100;
        int others= number - (hundreds * 100);

        return oneDigit(hundreds) + " trăm " + twoDigit(others);
    }
}