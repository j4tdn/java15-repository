package view;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.*;

import bean.CDDetail;
import model.DataModel;

public class Ex02ManagementApp {
	public static void main(String[] args) {
       ArrayList<CDDetail> data = DataModel.getCD();
       System.out.println(add(data));
       System.out.println("Total CDs in List :"  + totalCDs(data));
       System.out.println("Total Price of CDs in List :" + totalPrice(data));
	}
	private static ArrayList<CDDetail> add(ArrayList<CDDetail> result) {
		CDDetail otherSample = new CDDetail(7, "CD7", "Leonard", 12, 120.0f);
		for (CDDetail sequence : result) {
			if (otherSample.getId()==(sequence.getId())) {
				System.out.println("Invalid Id !! Please Try Again");
			}
		}
		result.add(otherSample);
		return result;
	}
	private static int totalCDs(ArrayList<CDDetail> result) {
		int Sum = 0;
		for (int i = 0; i < result.size(); i++) {
			Sum+= result.get(i).getMusicNumbers();
		}
		return Sum;
	}
	private static float totalPrice(ArrayList<CDDetail> result) {
		 float Total = 0;
		for (int i = 0; i < result.size(); i++) {
			Total+= result.get(i).getPrice();
		}
		return Total;
	}
	private static void SortBasedOnPrice(ArrayList<CDDetail> result) {
		Collections.sort(result , new Comparator<CDDetail>() {

			@Override
			public int compare(CDDetail o1, CDDetail o2) {
				// TODO Auto-generated method stub
				return Double.compare(o2.getPrice(), o1.getPrice());
			}
		});
	}
	private static void SortBasedOnId(ArrayList<CDDetail> result) {
		Collections.sort(result , comparing(CDDetail :: getId));
	}
}
