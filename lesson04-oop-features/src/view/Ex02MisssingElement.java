package view;

/*Cho mảng A gồm n-1 phần tử, giá trị của phần tử thứ k, Ak = [1, n].
Tìm số nguyên còn lại trong khoảng [1, n] không tồn tại trong mảng A.*/

/*
 *  VD1: n = 6, Ak = [3, 2, 1, 6, 5]
 Phần tử cần tìm có giá trị: 4
 VD2: n = 10, Ak = [3, 7, 9, 2, 1, 6, 5, 4, 10]
 Phần tử cần tìm có giá trị: 8
 * */
public class Ex02MisssingElement {
	public static void main(String[] args) {
		// General: Random n-1 elements which is from [1-n]
		// Finding missing number
		int[] numbers = { 3, 2, 1, 6, 5 };
		
		// Step 1: Sort array of number ascending, descending
		// Step 2: Iterate elements in array
		// If elements[i] != elements[i-1] + 1 ==> found = elements[i-1] + 1;
		
		
	}
}
