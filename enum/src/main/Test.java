package main;

public class Test {
	public static void main(String[] args) {
		TimeTable tt =new TimeTable(Day.monday, ": Toán Lý Hóa Sinh");
		TimeTable tt1 =new TimeTable(Day.tuesday, ": Văn Văn Sử Địa");
		TimeTable tt2=new TimeTable(Day.wenesday, ": GDCD Tin Toán Toán");
		TimeTable tt3 =new TimeTable(Day.thursday, ": Lý Văn Hóa Sử");
		TimeTable tt4 =new TimeTable(Day.friday, ": Địa Sinh Hóa Thể");
		System.out.println(tt4);
		System.out.println(tt);
	}

}
