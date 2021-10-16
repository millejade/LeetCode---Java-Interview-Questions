/*
This is a brute force method of problem-solving.
Solved using Array.

Problem: 
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]

*/

public class TwoSum {

	public static void main(String[] args) {
		
		int nums[] = {2,7,11,15};
		int target = 26;
		outerloop:
		for(int i = 0; i < nums.length; i++) {
			for(int j = 0; j < nums.length; j++) {
				if(nums[j] == target - nums[i]) {
					System.out.println("Target: "+target+"\ti: "+i + " \tj: "+ j + " \tValues: "+nums[i]+", "+nums[j]);
					break outerloop;
				}continue;
			}
		}

	}
	
	

}
