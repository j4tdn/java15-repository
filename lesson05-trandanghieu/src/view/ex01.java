package view;
import java.lang.Math;
import java.util.Scanner;
public class ex01
{
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int a = ip.nextInt();
        int i=0;
        while (Math.pow(a,i)<n){
            i++;
        }
        if (Math.pow(a,i)==n){
            System.out.println("True");
        } else {
            System.out.println("FAlSe");
        }
    }
}