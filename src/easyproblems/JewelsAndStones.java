package easyproblems;

public class JewelsAndStones {
	
	public int numJewelsInStones(String J, String S) {
		
		int count = 0;
		for(char a : S.toCharArray()) {
			if(J.contains(Character.toString(a))) {
				count+=1;
			}
		}
		return count;

	}
	
	public static void main(String[] args) {
		JewelsAndStones js = new JewelsAndStones();
		js.numJewelsInStones("z", "ZZ");
	}

}
