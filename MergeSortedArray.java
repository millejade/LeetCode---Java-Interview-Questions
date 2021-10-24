/*
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

 
Example 1:
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

Example 2:
Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
Explanation: The arrays we are merging are [1] and [].
The result of the merge is [1].

Example 3:
Input: nums1 = [0], m = 0, nums2 = [1], n = 1
Output: [1]
Explanation: The arrays we are merging are [] and [1].
The result of the merge is [1].
Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
 

Constraints:

nums1.length == m + n
nums2.length == n
0 <= m, n <= 200
1 <= m + n <= 200
-10^9 <= nums1[i], nums2[j] <= 10^9
*/

public class MergeSortedArray {

    public static void main(String[] args) {
        
        int nums1[] = {1,2,3,0,0,0};
        int nums2[] = {2,5,6};
        int m = 3;
        int n = 3;
        
        merge(nums1, m, nums2, n);
        
    }
    
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        
     
     /*
     we've got to start with rightmost index with values that are greater 0
     i = m - 1 >>> last index of nums1[] array
     j = n - 1 >>> last index of nums2[] array
     k = m + n - 1 >>> last index of new array which will be stored in nums1[] array    
     
     store the new merge sorted array in nums1[] array
     
     IF
     ~ i < 0 :  since 'i' was already negative, we can't use this as an index to get some element in an array, so we'll just use 'j' to become an index
     ~ value of index 'j' is GREATER THAN value of index 'i' >>> assign value of index 'j' to the specific element (k) of NEW ARRAY (nums1[])...
     ...then right after that, we need to remove this value of index 'j' by decrementing 'j'.
     
     ELSE
     ~ value of index 'i' is GREATER THAN value of index 'j' >>> assign value of index 'i' to the specific element (k) of NEW ARRAY (nums1[])...
     ...then right after that, we need to remove this value of index 'i' by decrementing 'i'
     
     */
        for(int i = m - 1, j = n - 1, k = m + n - 1; k >= 0 && j >= 0; k--){
            nums1[k] = (i < 0 || nums1[i] < nums2[j]) ? nums2[j--] : nums1[i--];
          /*
          
                            if(i < 0 || nums1[i] < nums2[j]){
                              nums1[k] = nums2[j--]; //j-- here 'j--' is still 'j', it is assigned before it decrements ( nums1[k] = nums2[j] )
                            }else{
                              nums1[k] = nums1[i--]
                            }
                            
                            example: (why do we need the those conditions from FOR LOOP and IF STATEMENT)
                            m = 1
                            n = 0
                            i = 0, j = -1, k = 0 >>> do nothing in merge method, just print the nums1[] array since nums2[] array got NO ELEMENTS/EMPTY ARRAY
                            
                            m = 0
                            n = 1
                            i = -1, j = 0, k = 0 >>> transfer the elements of nums2[] array into nums1[] array since nums1[] array got NO ELEMENTS/EMPTY ARRAY
                            
          
          */
        }
        
    } 
    
}
