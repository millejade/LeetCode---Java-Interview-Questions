/*
Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.

Return the sum of the three integers.

You may assume that each input would have exactly one solution.

Example 1:
Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).

Example 2:
Input: nums = [0,0,0], target = 1
Output: 0
 
Constraints:
3 <= nums.length <= 1000
-1000 <= nums[i] <= 1000
-10^4 <= target <= 10^4
*/

import java.util.Arrays;

public class ThreeSumClosest {

    public static void main(String[] args) {
        
        int nums[] = {-1, 2, 1, -4};
        int target = 1;
        
        System.out.println(threeSumClosest(nums, target));
    }

    private static int threeSumClosest(int[] nums, int target) {
       
        int closest = 0;
        
        if(nums == null) return closest; //when input array is null
        
        Arrays.sort(nums); //sort the array
        
        /* This will be the first/standard/reference closest sum  */
        for(int i = 0; i < nums.length && i < 3; i++){
        
            closest += nums[i];
        
        }
        
        
        if(nums.length < 3){ //when there's < 3 numbers
        
            return closest;
        }
        /* Index at 'i' will always be the first number and make use of it as
           as an operand
        */
        for(int i = 0; i < nums.length - 2; i++){
        
            int lo = i + 1; //start or low bound
            int hi = nums.length - 1; //end or high bound
            
            while(lo < hi){
            
                int sum = nums[i] + nums[lo] + nums[hi];
                
                if(Math.abs(target - sum) < Math.abs(target - closest)){
                
                    closest = sum; //assigned sum as new closest sum
                    
                    if(closest == target) return closest;
                   
                }
                if(sum > target) hi--;
                else lo++;
            }
        
        }
        
        return closest;
   
    }
    
}
