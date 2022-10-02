package view;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import bean.Characters;

public class Ex02 {
	public static void main(String[] args) {
		String string = "aaaababbbddc";
		longest(string);
	}
	private static void longest(String string) {
		Integer count = 0;
	char[] chars = string.toCharArray();
	Set<String> sets = new HashSet<>();
	List<String> lists = new ArrayList<>();
	List<Integer> counts = new ArrayList<>();
	List<Character> characters = new ArrayList<>();
for(char sequence : chars) {
		
		lists.add(String.valueOf(sequence)); 
	}
	for(char sequence : chars) {
		
		sets.add(String.valueOf(sequence)); 
	}
	for(String set :sets) {
		
		for(String list: lists) {
			if(set.equals(list)) {
				count++; 
			}
			counts.add(count);
			
		}
		count = 0;
			}
	
	for(int i = 0; i< sets.size();i++) {
		characters.add(new Characters(sets.get(i),lists.get(i)));
	}
	
	
		
	
		
	}

}
