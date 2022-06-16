package ex01;

public class Manager {
	public static void main(String[] args) {
		Students sv1 = new Students(41,"Tran Sinh",9,9);
		Students sv2 = new Students(42,"Anh",9,7);
		Students sv3 = new Students();
		
		System.out.println(sv1 +" scoreTB="+sv1.scoreTB());
		System.out.println(sv2);
	}
	
}
