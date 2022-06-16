package kt.ex03;

public class Ex03 {
    public static void main(String[] args) {
        //problem 01: get LCM of 2 elements

        //step 1 : get GCD of 2 elements

        //step2 : formula --> LCM = (a*b) / GCD(a,b)
        System.out.println("LCM 4,6 = " + lcm(4,6));
        //problem02: get LCM of n elements
        int [] elemts = {2,3,4};
        System.out.println("LCM :" + lcm(elemts));
    }

    private static int lcm(int [] elements){
        int length = elements.length;
        if (length == 0){
            System.out.println("Require --> At least 1 elements");
            return Integer.MIN_VALUE;
        }
        if (length ==1 ) {
            System.out.println("Require --> Array only has 1 elements");
            return elements[0];
        }
        int result =  lcm(elements[0],elements[1]);
        for (int i = 2; i< length; i ++){
            result = lcm(result,elements[i]);
        }
        return result;

    }

    /**
     * Least common multiple == bọi chung nhỏ nhất
     * Greatesr common divíỏ = UCLN
     */

    private static int lcm(int a, int b){
        return (a * b ) / gcd(a, b);
    }

    private static int gcd (int a, int b){
        while (a!=b){
            if (a>b){
                a = a -b;
            }else {
                b = b - a;
            }
        }
        return a;
    }
}
