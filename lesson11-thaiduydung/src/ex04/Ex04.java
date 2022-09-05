package ex04;

import java.util.ArrayList;
import java.util.List;

public class Ex04 {
	public static void main(String[] args) {
		List<Distionary>  dictionarys = new ArrayList<>();
		dictionarys.add(new Distionary("Attractive","Quyến rũ","adj","/əˈtræktɪv/"));
		dictionarys.add(new Distionary("Beautiful","Xinh đẹp","adj","/ˈbjutəfəl/"));
		dictionarys.add(new Distionary("Charming","Thu hút","adj","/ˈʧɑrmɪŋ/"));
		dictionarys.add(new Distionary("Height","Cao","n","/haɪt/"));
		dictionarys.add(new Distionary("Weight","Cân nặng","n","/weɪt/"));
		
		Distionary item = new Distionary("Thin","Gầy","n","/θɪn/");
		add(item,dictionarys);
		
		System.out.println(dictionarys);
		
		System.out.println("\nSearch : " + search("Charming", dictionarys));
		
	}
	
	public static void add(Distionary input,List<Distionary> dictionarys) {
		for (int i = 0; i < dictionarys.size(); i++) {
			if(input.getVocabulary().compareTo(dictionarys.get(i).getVocabulary())==0) {
				dictionarys.add(input);
				break;
			}
		}
	}
	
	private static Distionary search(String element,List<Distionary> dictionary)
	{
		for(Distionary word : dictionary)
		{
			if(word.getVocabulary().equals(element))
			{
				return word;
			}
		}
		return null;
	}
	
}