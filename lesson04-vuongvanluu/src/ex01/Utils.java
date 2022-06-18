package ex01;

public class Utils {
	public static float dtb(float lt, float th) {
		return (lt+th)/2;		
	}
	public static void findDtb(Students[] svs) {
		for(Students sv:svs) {
			if(dtb(sv.getLt(),sv.getTh())>8.5) {
				System.out.println(sv);
			}
			else {
				System.out.println("khong co");
			}
		}
	}
	public static void finfSv(Students[] svs) {
		for(Students sv:svs) {
			if(sv.getLt()>sv.getTh()) {
				System.out.println(sv);
			}
			else {
				System.out.println("khong co");
			}
		}
		
	}
}
