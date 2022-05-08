package structure;

public class Ex05 {

    public static void main(String[] args) {
        // KDL nguyên thủy
        // + int,float,double,char -->gtri/stack --
        //+ lưu trữ được single value, giá trị đơn

        //KDL đối tượng
        //+ KDL đối tượng có sẵn của java: String, Integer,Float
        // + KDL do mình tạo ra: Item,Employee, Student

        //int vs Integer
        // int --> STACK, luôn luôn có giá trị


        //Integer --> Heap, có thể có gtri hoặc null
        //              lưu trữ , hõ trợ các phương thức hữu ích

        Integer integer = new Integer(null);

        char letter = 'A';
        Character character = new Character('B');

        System.out.println("checking:" + Character.isAlphabetic(letter));
        int number = 10;
        Integer digit = Integer.valueOf(123);
        System.out.println("digit:" + digit);
    }
}
