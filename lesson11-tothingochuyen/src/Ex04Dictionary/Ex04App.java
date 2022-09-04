package Ex04Dictionary;

import java.util.ArrayList;
import java.util.List;

/**
 * Viết chương trình từ điển tiếng anh. Trong đó, 1 word bao gồm từ, nghĩa, loại từ, và ghi chú.
Chương trình từ điển bao gồm các phuơng thức sau đây:
- Thêm mới từ vựng
- Tra từ điển
 * */
public class Ex04App {
	public static void main(String[] args) {
		List<Word> words = new ArrayList<Word>();
		Dictionary myDic = new Dictionary(words);
		
		myDic.addWord(new Word("computer", "máy tính", "Noun (Danh từ)", null));
		myDic.addWord(new Word("table", "cái bàn", "Noun (Danh từ)", null));
		myDic.addWord(new Word("run", "chạy", "Verb (Động từ)", null));
		myDic.addWord(new Word("sing", "hát", "Noun (Danh từ)", null));
		myDic.addWord(new Word("great", "tuyệt vời", "Adj (Tính từ)", null));
		
		myDic.showDictionary();
		
		System.out.println("======================");
		myDic.findWord("great");
	}
}
