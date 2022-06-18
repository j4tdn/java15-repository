package exam;


import java.util.Scanner;

public class Director extends People {
	private int position;
	@Override
	
	
	public long salary() {
		return (coefficient + position) * 3000000;
	}
	public Director() {
		super();
	}
	public Director(String fullname, String birthday, int coefficient, int position) {
		super(fullname, birthday, coefficient);
		this.position = position;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	@Override
	public void showinfo() {
		System.out.println("Director	:"+"Full name :"+ fullname + "	Birthday :"+ birthday +
				"	Coefficient :" +coefficient + "	Position : "+ getPosition());
	}
	
	public void inputDirector()
	{
		Scanner input = new Scanner(System.in);

		System.out.println("input the full name ");
		fullname = input.nextLine();
		System.out.println("input the birthday ");
		birthday = input.nextLine();
		System.out.println("input the coefficient ");
		coefficient = Integer.parseInt(input.nextLine());
		System.out.println("input the position ");
		position =  Integer.parseInt(input.nextLine());
	}
	
	
}