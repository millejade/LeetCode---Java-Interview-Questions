import java.util.Arrays;

public class NextPermutation {

    public static void main(String[] args) {
        int nums[] = {1, 2, 3};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
    /*
    METHOD nextPermutation():
    
    FIRST: check whether the array is at maximum value or not. If at maximum value, call the reverse method
    We'll start with the last two index and check their values...
    ...as long as we're inside an array AND the last index values is </= to the second to the last index values, decrement the index 'i'...
    ...this will set a new TWO indexes that we were going to compare again....
    ...if it traverse all the elements in the array, 'i' should be equal to -1 (i = -1) to break out of the while loop...
    ..and this means, the array we have has the maximum value (ex. [3, 2, 1]), it will call then the reverse() method...
    ...then the next permutation will be the lowest/minimum value (ex. [1, 2, 3])
    
    ...if not, break out of the while loop and proceed to the IF statement
    
    SECOND: swapping of elements to get the higher value of array
    IF we're inside an array, then initialize 'j' as the last index...
    ...and as long as we're inside an array AND last index value is </= to the index value we want to compare with (index 'i')...
    ...decrement the index 'j'...
    ...if not,  break out of the while loop and swap the values of index 'i' and index 'j'
    ...this swap method will determine our next permutation

    */
    
    public static void nextPermutation(int[] nums) {
        
        int i = nums.length - 2; //start with the second to the last index
        
        while(i >= 0 && nums[i + 1] <= nums[i]) i--; //do nothing when index value is greater than or equal to the last index value
                                                   //just decrement the 'i', it is for checking only the last two index value
                                                   
        //SKIP this IF STATEMENT when the above while loop traverse all elements in the array...
        //...making i = -1
        //This means, we've got the maximum value (ex. [3, 2, 1]) where the next permutation should be the lowest value (ex. [1, 2, 3])
        if(i >= 0){
            int j = nums.length - 1;
            while(j >= 0 && nums[j] <= nums[i]) j--; //do nothing when index value is greater than or equal to the last index value
                                                     //just decrement the 'i', it is for checking only the last two index value
                                                     //'i' can be next to the last index value or not
        swap(nums, i, j);
        }
        
        reverse(nums, i + 1);
        
    }
    
    //this will just reverse the elements in the array
    public static void reverse(int[] nums, int start) {
        
        int i = nums.length - 1;
        
        while(start < i){
            
            swap(nums, start, i);
            start++;
            i--;
        }
        
    }
    
    //this will just swap the TWO elements in the array, it can be a two CONSECUTIVE elements or NOT.
    public static void swap(int[] nums, int i, int j) {
        
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        
    }
    
}
