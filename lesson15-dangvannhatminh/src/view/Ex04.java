package view;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import bean.ThiSinh;
import utils.DataModel;
import utils.FileUtils;

public class Ex04 {
	private static String pathname = String.join(File.separator, "miss.txt");

	public static void main(String[] args) {
		List<ThiSinh> TSs = DataModel.getTSs();

		File fileData = new File(pathname);
		List<String> data = FileUtils.readFile(fileData.toPath());

		printResult(TSs, data);
	}

	public static void printResult(List<ThiSinh> TSs, List<String> data) {
		int numberOfExaminer = Integer.parseInt(data.get(0));
		data.remove(0);
		Map<Integer, Integer> mapTSs = TSs.stream().collect(Collectors.toMap(ThiSinh::getId, ThiSinh::getPoint));
		
		for (int round = 0; round < numberOfExaminer; round++) {
			String[] listTS = data.get(round).split("\\s");
			int numberOfTS = Integer.parseInt(listTS[0]);
			int point = 3;
			for (int i = 1; i <= numberOfTS; i++) {
				int idTS = Integer.parseInt(listTS[i]);
				mapTSs.put(idTS,mapTSs.get(idTS) + point);
				point--;
			}
		}
		int maxPoint = findMaxPoint(mapTSs);
		printResult(mapTSs, maxPoint);
		
	}
	public static int findMaxPoint(Map<Integer,Integer> source)
	{
		int max = 0;
		for (Entry<Integer, Integer> entry : source.entrySet()) {
			max = Math.max(max, entry.getValue());
		}
		return max;
	}
	public static void printResult (Map<Integer, Integer> source, int max)
	{
		System.out.print("Thí sinh có id: ");
		for (Entry<Integer, Integer> entry : source.entrySet()) {
			if(entry.getValue() == max)
			{
				System.out.print(entry.getKey() + " ");
			}
		}
		System.out.print("sẽ là người chiến thắng");
	}

}
