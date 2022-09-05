package view;

import java.util.ArrayList;
import java.util.List;

import bean.CDDetail;

public class Ex02ManagementApp {
	public static void main(String[] args) {
		List<CDDetail> CDs = new ArrayList<>();
		CDs.add(new CDDetail(001,"Lofi", "Bùi Linh Trương",15,500000));
		CDs.add(new CDDetail(002,"Borelo", "Lệ Quyên",20,1000000));
		CDs.add(new CDDetail(003,"Rap", "Đen Vâu",22,800000));
		CDs.add(new CDDetail(004,"Pop", "Soobin Hoàng Sơn",30,2200000));
		CDs.add(new CDDetail(005,"Ballad", " Thùy Chi",30,600000));
		
		System.out.println("==========");
		System.out.println(addCD(CDs, new CDDetail(005, "Vpop", "Mỹ Tâm", 16, 520000)));
		
		System.out.println("===============");
		System.out.println("Number of CD :  " + CDs.size());
		
		System.out.println("=============");
		
		System.out.println("Total price CD : " + sumPrice(CDs));
		
		System.out.println("============");
	}
	
	private static boolean addCD(List<CDDetail> listCD, CDDetail cd) {
		if (listCD.contains(cd)) {
			return false;
		}
		listCD.add(cd);
		return true;
}
	private static double sumPrice(List<CDDetail> listCDs) {
		double result = 0;
		for (CDDetail cd : listCDs) {
			result += cd.getPrice();
		}
		return result;
	}
	
}
