package structure;

public class Ex13 {
    public static void main(String[] args) {

        //Heap --> constant pool memory
        String s1 = "hello"; //H1
        String s2 = "welcome";//H2
        String s3 = "hello"; //H1
        System.out.println("s1 hash: " + System.identityHashCode(s1));
        System.out.println("s2 hash: " + System.identityHashCode(s2));
        System.out.println("s3 hash: " + System.identityHashCode(s3));

        //Heap --> normal memory
        String o1 = new String("hello");
        String o2 = new String("welcome");
        String o3 = new String("hello");

        System.out.println("o1 hash: " + System.identityHashCode(o1));
        System.out.println("o2 hash: " + System.identityHashCode(o2));
        System.out.println("o3 hash: " + System.identityHashCode(o3));
    }
}
