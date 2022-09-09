package view;

import java.util.ArrayList;
import java.util.Comparator;
import static java.util.Comparator.*;
import java.util.List;

import bean.CDInformation;

public class Ex02CDManagement {
	public static void main(String[] args) {

		List<CDInformation> cdInformations = getInformation();
		CDInformation information1 = new CDInformation(103, "nhac tre", "lou hoang", 7, 120000.9f);
		CDInformation information2 = new CDInformation(108, "nhac tre", "hoang dung", 17, 140000.9f);
		cdInformations = add(cdInformations, information1);
		cdInformations = add(cdInformations, information2);
		printf(cdInformations);
		System.out.println("==============");
		System.out.println("so luong cd :" + cdInformations.size());
		System.out.println("tong tien :" + totalMoney(cdInformations));
		
		
		
		
		System.out.println("=====sap xep theo gia=====");
		Comparator<CDInformation> comparatorPrice = comparing(cdInformation -> cdInformation.getPrice());
		cdInformations.sort(comparatorPrice);
		printf(cdInformations);
		
		
		
		
		System.out.println("======== sap xep theo Id========");
		Comparator<CDInformation> comparatorId = comparing(cdInformation -> cdInformation.getId());
		cdInformations.sort(comparatorId);
		printf(cdInformations);
	}

	private static List<CDInformation> getInformation() {
		List<CDInformation> cdInformations = new ArrayList<>();

		CDInformation CDInformation1 = new CDInformation(101, "nhac tre", "onlyC", 7, 100000.5f);
		CDInformation CDInformation2 = new CDInformation(102, "nhac thieu nhi", "xuan mai", 8, 150000.9f);
		CDInformation CDInformation3 = new CDInformation(103, "nhac cach mang", "trong tan", 12, 300000.8f);
		CDInformation CDInformation4 = new CDInformation(104, "nhac tre", "son tung", 9, 60000.7f);
		CDInformation CDInformation5 = new CDInformation(105, "cai luong", "phi nhung", 10, 250000.7f);
		cdInformations.add(CDInformation1);
		cdInformations.add(CDInformation2);
		cdInformations.add(CDInformation3);
		cdInformations.add(CDInformation4);
		cdInformations.add(CDInformation5);
		return cdInformations;
	}

	private static List<CDInformation> add(List<CDInformation> cdInformations, CDInformation cdInformation) {
		if (!cdInformations.contains(cdInformation)) {
			cdInformations.add(cdInformation);
		}
		return cdInformations;
	}

	private static float totalMoney(List<CDInformation> cdInformations) {
		float sum = 0.0f;
		for (CDInformation cdInformation : cdInformations) {
			sum += cdInformation.getPrice();

		}
		return sum;

	}

	private static void printf(List<CDInformation> cdInformations) {
		for (CDInformation cdInformation : cdInformations) {

			System.out.println(cdInformation);
		}
	}
}