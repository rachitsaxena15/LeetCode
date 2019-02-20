package easyproblems;

public class LongestConmmonPrefix {

	public String longestCommonPrefix(String[] strs) {
		
		String longest = "";
		int shorthestLen = 2147483647;
		int arrLen = strs.length;
		for(String str : strs) {
			System.out.println(str);
			if(str.length() < shorthestLen)
				shorthestLen = str.length();
		}
		System.out.println(shorthestLen);
		
		String temp = "";
		//int i =0;
		for(int i = 0; i < shorthestLen; i++) {  
			for(String st: strs) {
				temp +=+st.charAt(i)+"";
				//st.charAt(i)+"" == a;
			}
			
		}
		
		return "";

	}

	public static void main(String[] args) {
		
		LongestConmmonPrefix lcp = new LongestConmmonPrefix();
		String strs[] = new String[3];
		strs[0] = "flower";
		strs[1] = "flow";
		strs[2] = "flight";
		
		lcp.longestCommonPrefix(strs);

	}

}
