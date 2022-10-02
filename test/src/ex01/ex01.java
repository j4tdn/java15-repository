package ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Cho dãy N (0 <= N < 100) phần tử. Mỗi phần tử N[i] (1 <= N[i] <= 20) là một số nguyên
 * Yêu cầu: Mỗi câu không được quá 10 dòng code
 * Liệt kê các phần tử chỉ xuất hiện một lần duy nhất trong dãy N
 * Example: input: 1 2 3 4 5 6 5 5 3 1
 * output: 2 4 6
 * Liệt kê các phần tử xuất nhiều hơn một lần trong dãy N
 * Example: input: 5 7 9 10 20 9 7 11
 * output: 7 9
 *
 */
public class ex01 {
	public static void main(String[] args) {
		List<Integer> lists = getList(10);
		lists.forEach(System.out::println);
		List<Integer> notUnique =  lists.stream()
		.filter(a -> 
				{
					int count = 0;
					for(Integer list : lists) {
						if(a == list) {
							count++;
						}
					}
					return count == 1;
				})
		.distinct()
		.collect(Collectors.toList());
		System.out.println();
		notUnique.forEach(System.out::println);
		
		List<Integer> Unique =  lists.stream()
				.filter(a -> 
						{
							int count = 0;
							for(Integer list : lists) {
								if(a == list) {
									count++;
								}
							}
							return count != 1;
						})
				.distinct()
				.collect(Collectors.toList());
				System.out.println();
				Unique.forEach(System.out::println);

	}
	public static List<Integer> getList(int n){
		List<Integer> list = new ArrayList<>();
		Random rd = new Random();
		for(int i = 0; i < n; i++) {
			list.add(rd.nextInt(20));
		}
		return list;
	}
}
