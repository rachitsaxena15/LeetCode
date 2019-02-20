package easyproblems;

public class ReverseInteger {

	public int reverse(int x) {
		int input = x;
		int len = String.valueOf(input).length();
		int sum = 0;
		if(String.valueOf(input).contains("-")) {
			while(len!=0) {
				int rem = input%10;
				input = input/10;
				sum = (int) (sum + rem*Math.pow(10, (len-2)));
				if(len >0 && sum==Integer.MIN_VALUE)
					return 0;
				
				len-=1;
			}
		}
		else {
			while(len!=0) {
				int rem = input%10;
				input = input/10;
				sum = (int) (sum + rem*Math.pow(10, (len-1)));
				if(sum==Integer.MAX_VALUE)
					return 0;
				len-=1;

			}
		}

		return sum;

	}

	public static void main(String[] args) {
		ReverseInteger res = new ReverseInteger();
		int s = res.reverse(2147483412);
		System.out.println(s);
		System.err.println(Integer.MIN_VALUE);
		System.err.println(Integer.MAX_VALUE);
	}

}
