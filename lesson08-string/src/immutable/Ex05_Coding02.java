package immutable;

public class Ex05_Coding02 {
	public static void main(String[] args) {
		String s = "today is a good good day";
		String s1 = "day";
		//1. Kiem tra chuoi s1 co phai la chuoi bat dau || ket thuc cu chuoi s hay khong?
		System.out.println("startWith: " + s.startsWith(s1));
		System.out.println("endWith: " + s.endsWith(s1));
		// 2.Chuoi thay the
		s1 = " ";
		String s2 = "";
		s = s.replace(s1, s2);
		System.out.println("s replace: " + s);
		
		//3. Loai bo khoang trang thua
		//regex --> regular expression
		String s4 = " ";
		String s3 = "hope  you   have a great working   day";
		s3 = s3.replaceAll("\\s+", s4);
		System.out.println("s3: " + s3);
		
		//4 Lay tu vi tri a tu vi tri b
		s2 = s.substring(0, 7);
		System.out.println("s2: "+s2);
		//5. kiem tra s22 co ton tai trong s1 hay khong
		System.out.println("contains: " + s.contains(s2));
	}
}
