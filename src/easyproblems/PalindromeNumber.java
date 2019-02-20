package easyproblems;

public class PalindromeNumber {
	
	 public boolean isPalindrome(int x) {
		 int num = x;
		 if(num < 0)
			 return false;
		 int len = String.valueOf(num).length();
		 String a ="";
		 String b ="";
		 int j = len-1;
		 int loop = 0;
		 if(len%2 == 0)
			 loop = len;
		 else
			 loop = len -1;
		 for(int i=0; i<loop;i++) {
			 if(i<len/2) {
				 a+=String.valueOf(num).charAt(i);
			 }
			 else {
				b+=String.valueOf(num).charAt(j);
				j--;
			 }
		 }
		 if(a.equals(b))
			 return true;
		 
	     return false;   
	    }
	 
	 public static void main(String[] args) {
		PalindromeNumber pa = new PalindromeNumber();
		System.out.println(pa.isPalindrome(121));
	}

}
