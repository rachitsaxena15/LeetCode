package mediumproblems;

import java.util.ArrayList;
import java.util.List;

public class WordSubsets {

	public List<String> wordSubsets(String[] A, String[] B) {
		List<String> wordList = new ArrayList<>();

		for(String a : A) {
			boolean exist = false;
			for(String b:B) {
				for(char c : b.toCharArray()) {
					if(a.contains(String.valueOf(c)))
						exist = true;
					else {
						exist = false;
						break;
					}
				}
				if(exist == false)
					break;
			}
			if(exist == true)
				wordList.add(a);
		}
		return wordList;
	}

	public static void main(String[] args) {

		String A[] = {"amazon","apple","facebook","google","leetcode"};
		String B[] = {"e","oo"};
		WordSubsets ws  = new WordSubsets();
		for(String a : ws.wordSubsets(A, B)) {
			System.out.println(a);
		}
	}

}
