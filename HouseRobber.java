public class HouseRobber {

    public static void main(String[] args) {
        int nums[] = {1,0,0,1,8,2,2,2,5,9,3,7,6,4,2,1};
        System.out.println(rob(nums));
    }
    
    public static int rob(int[] nums) {
       
       if(nums==null||nums.length==0) return 0;
 
       if(nums.length==1) return nums[0];
 
       int[] dp = new int[nums.length];
       dp[0]=nums[0];
       dp[1]=Math.max(nums[0], nums[1]);
 
       for(int i=2; i<nums.length; i++){
           dp[i] = Math.max(dp[i-2]+nums[i], dp[i-1]);
       }
 
       return dp[nums.length-1];
    }
}
