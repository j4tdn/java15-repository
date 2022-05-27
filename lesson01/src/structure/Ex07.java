package structure;

import bean.CustomInterger;

public class Ex07 {
    public static void main(String[] args) {
        CustomInterger a = new CustomInterger(3);
        CustomInterger b= new CustomInterger(4);

        System.out.println("a: " +a);
        System.out.println("b: " +b);

        swap(a,b);

    }

    private static void swap(CustomInterger a, CustomInterger b) {
        int tmp = a.value;
        a.value = b.value;
        b.value = tmp;
        System.out.println("a:" + a);
        System.out.println("b:" + b);
    }


}
