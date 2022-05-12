package main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class StudentList {
	private ArrayList<Students> list;

	public StudentList() {

		this.list = new ArrayList<Students>();
	}

	public StudentList(ArrayList<Students> list) {

		this.list = list;
	}

	public ArrayList<Students> getList() {
		return list;
	}

	public void setList(ArrayList<Students> list) {
		this.list = list;
	}

	public void addStudent(Students st) {
		this.list.add(st);
	}

	public void getStudentName() {
		for (Students students : list) {
			System.out.println(students);
		}
	}

	public boolean testEmtry() {
		return this.list.isEmpty();
	}

	public int getQuantity() {
		return this.list.size();
	}

	public void removeAllList() {
		this.list.removeAll(list);
	}

	public boolean testContains(Students st) {
		return this.list.contains(st);
	}

	public boolean removeStudent(Students st) {
		return this.list.remove(st);
	}

	public void findStudent(String name) {
		for (Students students : list) {
			if (students.getName().indexOf(name) >= 0) {
				System.out.println(students);
			}

		}
	}
	public void arrangement() {
		Collections.sort(this.list, new Comparator<Students>() {

			@Override
			public int compare(Students st1, Students st2) {
				if(st1.getPointAverage()>st2.getPointAverage()) {
					return -1;
				}else if(st1.getPointAverage()<st2.getPointAverage()) {
					return 1;
				}else {
				
				return 0;
				}
			}
			
		});
	}

}
