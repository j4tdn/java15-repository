package view;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Bai1 {
	public static void main(String[] args) {
//		String input = "4\r\n"
//				+ "3 5 2 1\r\n"
//				+ "3 12 5 2\r\n"
//				+ "2 1 2\r\n"
//				+ "3 2 1 5";	
		String input = "2\r\n"
				+ "3 3 2 1\r\n"
				+ "3 2 3 1";
		handleMissIT(input);
	}
	public static void handleMissIT(String source) {
		String[] inputHandle = source.split("\r\n");
		int round = Integer.parseInt(inputHandle[0]);
		Map<Integer, Integer> recordMissIt = new HashMap<>();
		for (int i=1; i <= round ; i++)
		{
			String[] splitRecord = inputHandle[i].split("\\s+");
			for ( int j = 1 ; j <= Integer.parseInt(splitRecord[0]) ; j++)
			{
				int MissCode = Integer.parseInt(splitRecord[j]);
				if(recordMissIt.containsKey(MissCode))
				{
					recordMissIt.put(MissCode, recordMissIt.get(MissCode) + 1);					
				}else {
					recordMissIt.put(MissCode, 0);
				}
			}
		}
		System.out.println(recordMissIt);
		int maxPoint = findMaxPointMissIt(recordMissIt);
		recordMissIt.entrySet().stream().forEach(t -> {
			if(t.getValue() == maxPoint)
			{
//				System.out.println(t.getKey());
			}
		});
		
	}
	public static int findMaxPointMissIt(Map<Integer, Integer> recordMissIt)
	{
		int max = Integer.MIN_VALUE;
		for (int i : recordMissIt.values())
		{
			max = Math.max(max, i);
		}
		return max;
	}
}
