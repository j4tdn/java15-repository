package utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

import static java.util.Comparator.*;
import java.util.List;
import java.util.Scanner;

import bean.Cat;

public class ManageCat {
	
	private static Scanner ip = new Scanner(System.in);
	public ManageCat() {
		
	}
	
	List<Cat> catList = new ArrayList<Cat>();
	
	
	
	public void input() {
		System.out.println("enter cat quantity");
		int n = Integer.parseInt(ip.nextLine());
		
		for (int i = 0; i < n; i++) {
			Cat cat = new Cat();
			cat.input();
			
			catList.add(cat);
		}
	}
	public void display() {
		for (int i = 0; i < catList.size(); i++) {
			catList.get(i).show();
		}
	}
	public void sort() {
		
		Collections.sort(catList, comparing(Cat::getId, reverseOrder())
				.thenComparing(Cat::getId));
		
		display();
	}
	
	public void find() {
		System.out.println("Enter name want to find");
		
		String name = ip .nextLine();
		int count = 0;
		for (Cat cat : catList) {
			if(cat.getName().equalsIgnoreCase(name)) {
				count++;
				cat.show();
			}
		}
		if(count == 0) {
			System.out.println(name + " don't exists");
		}
	}
	
}
