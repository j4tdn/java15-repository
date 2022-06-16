package cityA;

public class Work {
	public static void main(String[] args) {
		Director d1 = new Director("Nguyen Van A", "1/1", 5, 2);
		Manager m1 = new Manager("Tran Van B", "2/2", 4, 20);
		Staff s1 = new Staff("Mai Thi C","3/3", 3, "PR01");
		Staff s2 = new Staff("Dinh Van D","4/4", 3, "PR02");
		
		System.out.println(d1);
		System.out.println(m1);
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println("Giam doc : "+d1.salary());
		System.out.println("Truong phong : "+m1.salary());
		System.out.println("Nhan vien : "+s1.salary());
	}
}
