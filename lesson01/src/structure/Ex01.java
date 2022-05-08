package structure;

public class Ex01 {
    // global variable - attribute
    public static int year = 2003;
    public static void main(String[] args) {
        // local variable
        int year = 1999;

        System.out.println("year :" + year);

        demo();
    }

    public static void demo(){
        System.out.println("age:" + Ex01.year);
    }


}
