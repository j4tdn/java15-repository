package ex01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
			Students sv1 = new Students(102180080, "vuong van luu", 3f, 4f);
			Students sv2 = new Students(102180088, "hoang minh thang", 9f, 9f);
			Students sv3 = new Students();			
			Scanner ip = new Scanner(System.in);
			System.out.println("nhap mssv: ");
			sv3.setId(Integer.parseInt(ip.nextLine()));
			System.out.println("nhap ten: ");
			sv3.setName(ip.nextLine());
			System.out.println("nhap diem lt: ");
			sv3.setLt(ip.nextFloat());
			System.out.println("nhap diem th: ");
			sv3.setTh(ip.nextFloat());
			System.out.println("====thong tin sinh vien====");
			System.out.println(sv1);
			System.out.println(sv2);
			System.out.println(sv3);
			Students[] svs = {sv1,sv2,sv3};
			System.out.println("====sinh vien co diem trung binh > 8.5====");
			Utils.findDtb(svs);
			System.out.println("====sinh vien co diem lt > th====");
			Utils.finfSv(svs);
	}
	
}
