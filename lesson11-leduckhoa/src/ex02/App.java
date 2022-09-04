package ex02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class App {
	public static void main(String[] args) {
		List<Cd> Cds = getCds();
		Cd cd1 = new Cd(5, "music", "Mono", 1,1000);
		add(Cds, cd1);
		System.out.println("Số lượng CD: " + find(Cds));
		System.out.println("sum = " + Sum(Cds) );
		SortASD(Cds);
		System.out.println("==========================");
		System.out.println(Cds);
		System.out.println("==========================");
		SortDSC(Cds);
		System.out.println(Cds);
	}
	
	private static List<Cd> getCds(){
		Cd cd1 = new Cd(1, "music", "Mono", 1,1000);
		Cd cd2 = new Cd(2, "music", "Meme", 1,4000);
		Cd cd3 = new Cd(3, "music", "Mtp", 1,3000);
		
		List<Cd> cds = new ArrayList<>();
		cds.add(cd1);
		cds.add(cd3);
		cds.add(cd2);
		return cds;
	}
	
	public static void add(List<Cd> cds, Cd cd1) {
		if(cds.contains(cd1) == true) {
			System.out.println("ID trùng! Mời bạn thêm lại");
		}
		else {
			System.out.println("Thêm thành công");
			cds.add(cd1);
		}
	}
	public static int find(List<Cd> cds) {
		return cds.size();
	}
	public static float Sum(List<Cd> cds) {
		float sum = 0f;
		
			Iterator<Cd> each = cds.iterator();
			while(each.hasNext()) {
				Cd element = each.next();
				sum+=element.getPrice();
			}
		return sum;	
	}
	
	public static void SortASD(List<Cd> cds) {
		 cds.sort(new Comparator<Cd>() {

			@Override
			public int compare(Cd o1, Cd o2) {
				float x = o2.getPrice() - o1.getPrice();
				if(x>0) return 1;
				else if(x<0) return -1;
				return 0;
			}
		});
	}
	
	public static void SortDSC(List<Cd> cds) {
		 cds.sort(new Comparator<Cd>() {

			@Override
			public int compare(Cd o1, Cd o2) {
				float x = o1.getId() - o2.getId();
				if(x>0) return 1;
				else if(x<0) return -1;
				return 0;
			}
		});
	}
	
}
