public class RemoveElement {

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(removeElement(nums, val));
    }
    
    public static int removeElement(int[] nums, int val) {
        
        int k = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){ //if element is not equal to value...
                nums[k] = nums[i]; //...then, adjust this element at index[k]... 
                k++; //...then increment k
            }
        }
        
        return k;
        
    }
    
}
