package view;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import bean.Word;

public class Ex04 {
	public static void main(String[] args) {
		List<Word> dictionary = getDictionary();
		Word addWord = new Word("Ocean", "Đại dương", "n", "'ouʃn");
		addDictionary(addWord, dictionary, Comparator.comparing(Word::getVocab,Comparator.reverseOrder()));
		System.out.println(dictionary);
		
		//=====================================
		
		System.out.println("\nSearch : " + searchVocab("Ocean", dictionary));
	}

	private static List<Word> getDictionary() {
		List<Word> dictionary = new ArrayList<>();
		dictionary.add(new Word("Baseball", "Bóng chày", "n", "ˈbāsˌbôl"));
		dictionary.add(new Word("Animal", "Động vật", "n", "'æniməl"));
		dictionary.add(new Word("Backyard", "Sân sau", "n", "'bækˈjɑːd"));
		dictionary.add(new Word("Around", "Xung quanh", "adv", "ə'raund"));
		dictionary.add(new Word("Center", "Trugn tâm", "n", "'sentə"));
		dictionary.add(new Word("University", "Trường đại học", "n", ",ju:ni'və:siti"));
		dictionary.add(new Word("Dependent", "Phụ thuộc", "adj", "di'pendənt"));
		dictionary.add(new Word("Capital", "Thủ đô", "n", "'kæpitl"));
		dictionary.add(new Word("Defuse", "Xoa dịu", "v", "ˌdiːˈfjuːz"));
		dictionary.add(new Word("Eliminate", "Loại bỏ", "v", "i'limineit"));
		dictionary.add(new Word("East", "Phía đông", "n", "ēst"));
		dictionary.sort(Comparator.comparing(Word::getVocab));
		return dictionary;
	}

	private static void addDictionary(Word e, List<Word> dictionary, Comparator<Word> helper) {
		for (int i = 0; i < dictionary.size(); i++) {
			if(helper.compare(e, dictionary.get(i)) > 0)
			//e.getVocab().compareTo(dictionary.get(i).getVocab()) <= 0
			{
				dictionary.add(i,e);
				break;
			}
		}
	}
	private static Word searchVocab(String e,List<Word> dictionary)
	{
		for(Word word : dictionary)
		{
			if(word.getVocab().equals(e))
			{
				return word;
			}
		}
		return null;
	}
}
