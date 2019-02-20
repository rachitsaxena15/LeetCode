package easyproblems;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *Example:
 *Given nums = [2, 7, 11, 15], target = 9,
 *Because nums[0] + nums[1] = 2 + 7 = 9,
 *return [0, 1].
 */

public class TwoSumSolution {
	public int[] twoSum(int[] nums, int target) {
		int remaining = 0;
		int tempArr[] = new int[nums.length-1];
		int indices[] = new int[2];
		for(int i=0; i<nums.length;i++) {
			remaining = target-nums[i];
			final int difference = remaining;
			indices[0] = i;
			int l=0;
			for(int k=0;k<nums.length;k++) {
				if(k==i)
					continue;
				tempArr[l] = nums[k];
				l++;
				
			}
			boolean contains = IntStream.of(tempArr).anyMatch(x -> x == difference);
			if(contains) {
				for(int j =0; j<nums.length; j++){
					if (nums[j] == remaining){
						indices[1]= j;
					}
				}
				break;
			}
		}
		return indices;
	}


	public static void main(String... args) {

		TwoSumSolution t = new TwoSumSolution();
		int nums[] = {2, 7, 11, 15};
		int a[] = t.twoSum(nums, 9);
		for(int i =0; i<a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
