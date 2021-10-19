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
