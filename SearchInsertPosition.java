public class SearchInsertPosition {

    public static void main(String[] args) {
        
        int nums[] = {1, 3, 4, 5, 7, 8, 9, 11, 12, 14};
        int target = 4;
        int upper = nums.length - 1;
        int lower = 0;
        int num = 0;
        
        while(upper > lower){
            
            num = (upper + lower)/2;
            if(nums[num] == target) System.out.println(num);
            else if(nums[num] > target) upper = num;
            else lower = num;
        }
        System.out.println(num - 1);
    
    }
}
