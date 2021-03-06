/*
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:
Input: nums = [1,2,3,1]
Output: true

Example 2:
Input: nums = [1,2,3,4]
Output: false

Example 3:
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
 
Constraints:
1 <= nums.length <= 105
-109 <= nums[i] <= 109
*/

import java.util.Arrays;

public class ContainsDuplicate {

    public static void main(String[] args) {
        
        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }

    private static boolean containsDuplicate(int[] nums) {
        
        Arrays.sort(nums); //srot tha array
     /*
     it will just check the two consecutive elements in array if they have the same value, since it is sorted...
     if two consecutive elements have the same value, then the array contains duplicate
     */
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1]){
                return true;
            }
        }
        return false;
    }
    
}
