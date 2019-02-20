package easyproblems;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWords {

	public int uniqueMorseRepresentations(String[] words) {
		String morse[] = {".-","-...","-.-.","-..",".","..-.","--.","....",
				"..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
				"...","-","..-","...-",".--","-..-","-.--","--.."};
		
		Set<String> morseSet = new HashSet<String>();
		for(String word: words) {
			String uniquemorse = "";
			for(char a: word.toCharArray()) {
				uniquemorse+=morse[(int)a - 96 -1];
			}
			morseSet.add(uniquemorse);
		}
		return morseSet.size();
	}
	
	public static void main(String[] args) {
		
		String arr[] = {"gin", "zen", "gig", "msg"};
		UniqueMorseCodeWords mc = new UniqueMorseCodeWords();
		int count = mc.uniqueMorseRepresentations(arr);
		System.out.println(count);
		
	}

}
