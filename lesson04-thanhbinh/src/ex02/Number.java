package ex02;

public class Number {

    public static void main(String[] args) {
        int [] number = {12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18};
        int [] result = new int [number.length];
        sortNumber(number, result);

        for (int i = 0 ; i<result.length; i++){
            System.out.print( " " + result[i]);
        }
    }

    private static void sortNumber(int[] numbers, int[] result) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 7 == 0 && numbers[i] % 5 != 0) {
                result[count] = numbers[i];
                count ++;
            }

        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 7 == 0 && numbers[i] % 5 == 0 || numbers[i] % 7 != 0 && numbers[i] % 5 != 0) {
                result[count] = numbers[i];
                count ++;
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 5 == 0 && numbers[i] % 7 != 0) {
                result[count] = numbers[i];
                count ++;
            }
        }

    }
}
