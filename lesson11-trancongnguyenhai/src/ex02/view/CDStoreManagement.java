package ex02.view;

import java.util.Comparator;
import java.util.List;

import ex02.bean.CD;
import ex02.model.CDModel;
import ex02.utils.CDStoreUtils;

public class CDStoreManagement {
	public static void main(String[] args) {
		List<CD> cds = CDModel.getAllCDs();
		cds = CDStoreUtils.addIf(cds, new CD(104, "Rock", "Imagine Dragons", 10, 2000000));
		cds = CDStoreUtils.addIf(cds, new CD(105, "EDM", "Wukong", 10, 1000000));
		for(CD cd : cds) {
			System.out.println(cd.toString());
		}
		System.out.println(CDStoreUtils.getNumList(cds));
		System.out.println(CDStoreUtils.sumCDs(cds));
		
		
		System.out.println("========Sort By descending Price==========");
		cds.sort(new Comparator<CD>() {
			@Override
			public int compare(CD o1, CD o2) {
				if(o1.getPrice() > o2.getPrice()) {
					return -1;
				}
				return 1;
			}
		});
		for(CD cd : cds) {
			System.out.println(cd.toString());
		}
		
		System.out.println("==========Sort By ascending Id============");
		cds.sort(new Comparator<CD>() {
			@Override
			public int compare(CD o1, CD o2) {
				return o1.getId() - o2.getId();
			}
			
		});
		for(CD cd : cds) {
			System.out.println(cd.toString());
		}
	}
}
