package mediumproblems;

import java.util.HashMap;
import java.util.Map;

public class ZigZagConversion {

	public String convert(String s, int numRows) {
		Map<Integer, String> indexMap = new HashMap<>();

		String resultant = "";
		int hashIndex = 0;
		boolean reverse = false;

		if(numRows==1)
			return s;
		else {
			for(char a : s.toCharArray()) {
				String currentVal = indexMap.get(hashIndex) == null ? "" : indexMap.get(hashIndex);
				currentVal+=String.valueOf(a);
				indexMap.put(hashIndex, currentVal);

				if(hashIndex == numRows-1) {
					reverse = true;
				}

				if(hashIndex == 0) {
					reverse = false;				
				}

				if(reverse) {
					hashIndex--;
				}
				else {
					hashIndex++;
				}
			}
		}

		for(int a : indexMap.keySet()) {
			resultant+=indexMap.get(a);
		}
		return resultant;
	}

	public static void main(String[] args) {

		ZigZagConversion zc = new ZigZagConversion();
		String result = zc.convert("PAYPALISHIRING", 1);
		System.out.println(result);

	}

}
