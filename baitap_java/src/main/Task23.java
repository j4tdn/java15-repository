package main;

public class Task23 {
	private int sum = 0;
	private double ave = 0;

	public double average() {
		int[] arr = new int[] { 2, 43, 14, 46, 57, 19 };
		for (int i = 0; i < arr.length; i++) {

			sum += arr[i];

		}
		ave = sum / arr.length;
		return ave;
	}

	public static void main(String[] args) {
		Task23 ave = new Task23();
		System.out.println("Trung bình mảng: " + ave.average());
	}

}
