public class HouseRobber2 {

    public static void main(String[] args) {
        int nums[] = {1,0,0,1,8,2,2,2,5,9,3,7,6,4,2,1};
        System.out.println(rob(nums));
        
    }
    
    public static int rob(int[] nums) {
       
       if(nums==null||nums.length==0) return 0;
 
       if(nums.length==1) return nums[0];
       
       if(nums.length==2) return Math.max(nums[0], nums[1]);
 
        return Math.max(robRange(nums, 0, nums.length - 2), robRange(nums, 1, nums.length - 1));
    }
    
    private static int robRange(int[] nums, int start, int end){
        
        int include = 0, exclude = 0;
        for(int j = start; j <= end; j++){
            int in = include, ex = exclude;
            include = ex + nums[j];
            exclude = Math.max(ex, in);
        }
        
        return Math.max(include, exclude);
    
    }
    
}
