package structure;

public class Ex11 {
    //1 .kiểm tra kí nhập vào có phải là số hay không
    //2. kiểm tra chuỗi nhập vào có phải là số hay không
    //TH1 : tự code
    //TH2 : dùng hàm
    public static void main(String[] args) {
        char letter = 'x';
        System.out.println(letter + " isDigit? -->" + isDigit(letter));
        System.out.println(letter + " isDigit? -->" +Character.isDigit(letter));
        System.out.println("\n===================================================================\n");

        String s = "12x6a";

        System.out.println(letter + " isDigit? -->" + isDigitArray(s));
        System.out.println(letter + " isDigit? -->" + s.matches("[0-9],{1,}"));

        // [0-9]: thõa mãn 1 kí tự là số từ 0-9
        // {1,} : 1 hoặc nhiều kí tự
        // {1,} <=> +
        // kết hợp : [0-9]{1,} hoặc \\d+


        // regex stands for stands for regular expression

    }

    //expression, condition --> boolean
    private static boolean isDigit(char input){
        return (input >= '0' && input <= '9');
    }

    private static boolean isDigitArray(String input2){
        for (int i =0; i < input2.length() ; i++){
            char tmp = input2.charAt(i);
           if (!isDigit(tmp)){
               return false;
           }
        }
        return true;
    }
}
