package main;

import java.util.Random;
import java.util.Scanner;

public class TestRandom {
	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhập a");
		a = sc.nextInt();
		System.out.println("nhập b");
		b = sc.nextInt();
		System.out.println("nhập c");
		c = sc.nextInt();
		if (a > b && a < c) {
			System.out.println("a là số lơn nhất");
			if (b > c) {
				System.out.println("c là số bé nhất và b là sô còn lại");
			} else {
				System.out.println("b là số bé nhất và c là số còn lại");
			}
		} else if (b > c && b > a) {
			System.out.println("b là số lơn nhất");
			if (a > c) {
				System.out.println("c là số bé nhất và a là sô còn lại");
			} else {
				System.out.println("a là số bé nhất và c là số còn lại");
			}
		} else if (c > a && c > b) {
			System.out.println("c là số lơn nhất");
			if (b > a) {
				System.out.println("a là số bé nhất và b là sô còn lại");
			} else {
				System.out.println("b là số bé nhất và a là số còn lại");
			}
		}
	}
}
