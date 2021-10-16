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
