package immutable;

public class Ex04Coding01 {
	public static void main(String[] args) {
		String s = "JAVA15";
		String s1 = "COURSE";
		
		//1. TINH CHIEU DAI CHUOI S
		System.out.println("length " + s.length());
		
		//2. noi chuoi s1 vao chuoii s		
		System.out.println(s1 + s);
		s = s.concat(s1);
		
		//3.lay 1 ki tu tai vi tri index(3) trong hcuoi s
		System.out.println("index: " + s.charAt(3));
		
		
		//4. duyet tung phan tu trong hcuoi
		for (int i = 0; i < s.length(); i++) {
			System.out.println(	"Text " +s.charAt(i) + " ");
		}
		//5. tim vi tri xuat hien 
		System.out.println("last index of " +s.lastIndexOf("A"));
		
	}
}
