package ex01;

import java.util.Scanner;

public class Student {
	
	private int id;
	private String name;
	private float score1, score2;
	
	
	public Student() {
		}
	public Student(int id, String name, float score1, float score2) {
		this.id = id;
		this.name = name;
		this.score1 = score1;
		this.score2 = score2;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getScore1() {
		return score1;
	}
	public void setScore1(float score1) {
		this.score1 = score1;
	}
	public float getScore2() {
		return score2;
	}
	public void setScore2(float score2) {
		this.score2 = score2;
	}
	
	public float average() {
		return (score1+score2)/2;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", score1=" + score1 + ", score2=" + score2 + ", score average=" + average() + "]";
	}
	
	public void input() {
		System.out.println("Nhập thông tin cho học sinh thứ 3:");
		Scanner ip = new Scanner(System.in);
		System.out.println("Mời nhập ID:");setId(ip.nextInt());
		ip.nextLine();
		System.out.println("Mời nhập tên:");setName(ip.nextLine());
		System.out.println("Mời nhập điểm thứ 1:");setScore1(ip.nextFloat());
		System.out.println("Mời nhập điểm thứ 2:");setScore2(ip.nextFloat());
	}
		
}
