package easyproblems;

public class ToLowerCase {

	public String toLowerCase(String str) {
		String lowStr = "";
		for (char c : str.toCharArray()) {
			int ascii = c;
			if(ascii >=65 && ascii <=90) {
				ascii+=32;
				lowStr+=(char)ascii;
			}
			else
				lowStr+=c;
		}
		return lowStr;
	}
	
	public static void main(String[] args) {
		ToLowerCase lc = new ToLowerCase();
		String res = lc.toLowerCase("HELL......");
		System.out.println(res);
	}

}/*
char[] charArray=str.toCharArray();
	
	for (int i=0;i<charArray.length;i++) {
		int j=charArray[i];
		if(j>=65 && j<=90){
			j=j+32;
			charArray[i]=(char)j;
		}

	}
	
	return String.valueOf(charArray);
*/