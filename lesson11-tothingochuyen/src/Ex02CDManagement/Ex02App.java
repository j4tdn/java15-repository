package Ex02CDManagement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Viết ứng dụng quản lý cửa hàng băng đĩa CD. Mỗi đĩa CD chứa các thông tin sau
Mã CD : số nguyên
Loại CD : chuỗi ký tự
Ca sỹ : chuỗi ký tự
Số bài hát : số nguyên dương
Giá thành : số thực dương
Tạo danh sách các đĩa CD và thực hiện các yêu cầu sau đây:
- Viết phương thức thêm 1 CD vào danh sách, thêm thành công nếu không trùng mã CD.
- Tìm số lượng CD có trong danh sách.
- Tình tổng giá thành của các CD.
- Viết phương thức sắp xếp danh sách giảm dần theo giá thành.
- Viết phương thức sắp xếp danh sách tĕng dần theo mã CD.
 * */
public class Ex02App {
	public static void main(String[] args) {
		List<CD> myCDs = new ArrayList<>();
		myCDs.add(new CD(100,"Bolero", "Cẩm Ly",20,500000));
		myCDs.add(new CD(101,"KPOP", "Jessica",30,1000000));
		myCDs.add(new CD(111,"VPOP", "Mỹ Tâm",25,700000));
		myCDs.add(new CD(122,"US-UK", "One Direction",50,2000000));
		myCDs.add(new CD(125,"Bolero", "Đan Trường",30,600000));
		
		printf(myCDs);
		
		System.out.println("======================");
		//addCD(myCDs, new CD(100, "KPOP", "SNSD", 25, 1250000));
		addCD(myCDs, new CD(110, "KPOP", "SNSD", 25, 1250000));
		
		System.out.println("======================");
		System.out.println("Number of CDs in the list: " + myCDs.size());
		
		System.out.println("======================");
		System.out.println("Total Price: " + sumPrice(myCDs));
		
		System.out.println("======================");
		System.out.println("Sort by Price >> Descending: ");
		printf(sortByPrice(myCDs));
		
		System.out.println("======================");
		System.out.println("Sort by ID >> Ascending: ");
		printf(sortByID(myCDs));
	}
	
	private static void printf(List<CD> myCDs) {
		for(CD myCD: myCDs) {
			System.out.println(myCD);
		}
	}
	
	private static void addCD(List<CD> myCDs, CD newCD) {
		boolean checkDuplicateID = false;
		for(CD myCD: myCDs) {
			if(myCD.getIdCD() == newCD.getIdCD()) {
				checkDuplicateID = true;;
				System.out.println("Same ID");
			}
		}
		if(checkDuplicateID == false) {
			myCDs.add(newCD);
			printf(myCDs);
		}
	}
	
	private static double sumPrice(List<CD> myCDs) {
		double sumPrice = 0;
		for(CD myCD: myCDs) {
			sumPrice += myCD.getPrice();
		}
		return sumPrice;
	}
	
	private static List<CD> sortByPrice(List<CD> myCDs){
		List<CD> result = myCDs;
		Collections.sort(result, Comparator.comparing(CD::getPrice, Comparator.reverseOrder()));
		return result;
	}
	
	private static List<CD> sortByID(List<CD> myCDs){
		List<CD> result = myCDs;
		Collections.sort(result, Comparator.comparing(CD::getIdCD));
		return result;
	}
}
