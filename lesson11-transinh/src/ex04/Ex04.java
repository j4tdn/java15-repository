package ex04;

import java.util.ArrayList;
import java.util.List;

public class Ex04 {
	public static void main(String[] args) {
		List<Word>  dictionarys = new ArrayList<>();
		dictionarys.add(new Word("Attractive","Quyến rũ","adj","/əˈtræktɪv/"));
		dictionarys.add(new Word("Beautiful","Xinh đẹp","adj","/ˈbjutəfəl/"));
		dictionarys.add(new Word("Charming","Thu hút","adj","/ˈʧɑrmɪŋ/"));
		dictionarys.add(new Word("Height","Cao","n","/haɪt/"));
		dictionarys.add(new Word("Weight","Cân nặng","n","/weɪt/"));
		
		Word item = new Word("Thin","Gầy","n","/θɪn/");
		add(item,dictionarys);
		
		System.out.println(dictionarys);
		
		System.out.println("\nSearch : " + search("Charming", dictionarys));
		
	}
	
	public static void add(Word input,List<Word> dictionarys) {
		for (int i = 0; i < dictionarys.size(); i++) {
			if(input.getVocabulary().compareTo(dictionarys.get(i).getVocabulary())==0) {
				dictionarys.add(input);
				break;
			}
		}
	}
	
	private static Word search(String element,List<Word> dictionary)
	{
		for(Word word : dictionary)
		{
			if(word.getVocabulary().equals(element))
			{
				return word;
			}
		}
		return null;
	}
	
}
