/*
Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:

0 <= a, b, c, d < n
a, b, c, and d are distinct.
nums[a] + nums[b] + nums[c] + nums[d] == target
You may return the answer in any order.

Example 1:
Input: nums = [1,0,-1,0,-2,2], target = 0
Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]

Example 2:
Input: nums = [2,2,2,2,2], target = 8
Output: [[2,2,2,2]]
 
Constraints:
1 <= nums.length <= 200
-10^9 <= nums[i] <= 10^9
-10^9 <= target <= 10^9
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FourSum {

    public static void main(String[] args) {
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        
        System.out.println(fourSum(nums, target));
    }

    private static List<List<Integer>> fourSum(int[] nums, int target) {
        
        if(nums == null || nums.length < 4){
        
            return Collections.emptyList();
        }
        
        Arrays.sort(nums);
        
        final List<List<Integer>> out = new ArrayList<>();
        
        for(int i = 0; i < nums.length - 3; i++){
    
            if(i >  0 && nums[i] == nums[i - 1]) continue; //skip the duplicate
            
            for(int j = i + 1; j < nums.length - 2; j++){
                
                if(j > i + 1 && nums[j] ==  nums[j-1]) continue;
                
                int newTarget = target - nums[i] - nums[j];
                int start = j + 1;
                int limit = nums.length - 1;
                
                while(start < limit){
                    
                    /* check for duplicate */
                    if(start > j + 1 && nums[start] == nums[start-1]){
                        start++;
                        continue;
                    }
                    
                    /* check for duplicate */
                    if(limit < nums.length - 1 && nums[limit] == nums[limit + 1]){
                        limit--;
                        continue;
                    }
                    
                    int sum = nums[start] + nums[limit];
                    
                    if(sum < newTarget){
                        start++;
                    }else if(sum > newTarget){
                        limit--;
                    }else{
                        out.add(Arrays.asList(nums[i], nums[j], nums[start], nums[limit]));
                        start++;
                        limit--;
                    }
                }
        
            }
        }
         
        return out;
    }
    
}
