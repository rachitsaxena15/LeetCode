package easyproblems;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
	public int romanToInt(String s) {
		Map<String, Integer> romanMap = new HashMap<>();
		romanMap.put("I", 1);
		romanMap.put("V", 5);
		romanMap.put("X", 10);
		romanMap.put("L", 50);
		romanMap.put("C", 100);
		romanMap.put("D", 500);
		romanMap.put("M", 1000);
		
		String num = s;
		
		if(num.length()<2) {
			
		}
		
		return 0;
	}


}
