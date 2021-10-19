/*
PROBLEM:
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
The overall run time complexity should be O(log (m+n)). - BUT I USED BRUTE FORCED HERE

EXAMPLES:
Example 1:
Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.

Example 2:
Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

Example 3:
Input: nums1 = [0,0], nums2 = [0,0]
Output: 0.00000

Example 4:
Input: nums1 = [], nums2 = [1]
Output: 1.00000

Example 5:
Input: nums1 = [2], nums2 = []
Output: 2.00000
*/


import java.util.Arrays;

public class MedianOfTwoSortedArrays {

	public static void main(String[] args) {
		
		int arr1[] = {1,15,5,7,13}; //m
		int arr2[] = {3,9,11,17}; //n
		double median = findMedianSortedArrays(arr1, arr2);
		System.out.println(median);

	}
	
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int m = nums1.length;
        int n = nums2.length;
        
        int[] merged = new int[m+n];
    
        /* Merging the two arrays*/
        for(int i = 0; i<n+m; i++) {
        	
        	if(i >= m) merged[i] = nums2[i-m];
        	else merged[i] = nums1[i];
        	
        }
        
        /* Sort the merged arrays */
        Arrays.sort(merged);
        
        double median = 0.0d;
        
        /* Find the median */
        if((n+m)%2 != 0) median =  merged[(n+m)/2];
        else {
        	median = merged[(m+n)/2] + merged[((m+n)/2)-1];
        	median = median/2;
        }
		return median;
        
        
        
    }

}
