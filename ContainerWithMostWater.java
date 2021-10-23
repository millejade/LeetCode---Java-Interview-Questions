/*
Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of the line i is at (i, ai) and (i, 0). Find two lines, which, together with the x-axis forms a container, such that the container contains the most water.

Notice that you may not slant the container.

 

Example 1:


Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
Example 2:

Input: height = [1,1]
Output: 1
Example 3:

Input: height = [4,3,2,1,4]
Output: 16
Example 4:

Input: height = [1,2,1]
Output: 2
 

Constraints:

n == height.length
2 <= n <= 10^5
0 <= height[i] <= 10^4
*/

//Problems from leetcode.com

public class ContainerWithMostWater {

	public static void main(String[] args) {
		
		int[] container = {5,9,8,2,7}; //change the array if you want to test other sets of data
		int area = maxArea(container);
		System.out.println(area);
	}
	
	public static int maxArea(int[] height) {
		
		int lowerBound = 0;
		int upperBound = height.length - 1;
		int maxArea = 0;
		
		while(lowerBound<upperBound) {
			/*
      Check first which one has the shorter height using Math.min() method
      ...after that, it will be our height that will be multiplied with our width = upperBound - lowerBound
      Then we have the new AREA
      The new AREA will be use as second parameter which will be compared to the first parameter "maxArea" 
      "maxArea" is a previous maximum area.
      
      Compare them which has the greater value using Math.max() method
      
      The one with a greater value will be the new 'maxArea'
      */
			maxArea = Math.max(maxArea, Math.min(height[lowerBound], height[upperBound])*(upperBound - lowerBound));
			
      
      /*
      upperBound are meant to decrease while lowerBound are needed to increase
      */
			if(height[upperBound]<height[lowerBound]) upperBound--;
			else lowerBound++;
			
		}
		
		return maxArea;
	        
	}

}
