/*
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
Notice that the solution set must not contain duplicate triplets.


Example 1:
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]

Example 2:
Input: nums = []
Output: []

Example 3:
Input: nums = [0]
Output: []
 

Constraints:

0 <= nums.length <= 3000
-10^5 <= nums[i] <= 10^5
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreeSumSoln {

	public static void main(String[] args) {
		int[] nums = {-1, 0, 1, 2, -1, -4};
		//int[] nums = {0, 0, 0};
		System.out.println(threeSum(nums));

	}

	private static List<List<Integer>> threeSum(int[] nums) {
		
		if(nums == null || nums.length < 3) {
			return Collections.emptyList();
		}
		
		Arrays.sort(nums);
		
		final List<List<Integer>> out  = new ArrayList<>();
		for(int i = 0; i < nums.length - 2;  i++) {
			if(nums[i] > 0) break; // this should be negative so we can cancel out the positive side
			if(i > 0 && nums[i] == nums[i - 1]) continue; //skip duplicates
			
			int j = i + 1;
			int k = nums.length - 1;
			
			while(j < k) {
				
				if(nums[i] + nums[j] > 0) break; // this should be negative so we can cancel out the positive side
				if(j > i + 1 && nums[j] == nums[j - 1]) { //skip duplicates
					j++;
					continue;
				}
				
				if(nums[i] + nums[j] + nums[k] < 0) {
					j++;
				}else if(nums[i] + nums[j] + nums[k] > 0) {
					k--;
				}else {
					out.add(Arrays.asList(nums[i], nums[j], nums[k]));	
					j++;
					k--;
				}
			}
		}
		
		return out;
	}

}
