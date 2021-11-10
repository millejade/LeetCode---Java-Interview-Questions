
package IntersectionOfTwoArrays2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfTwoArrays2 {

    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
        
    }
    
    public static int[] intersect(int[] nums1, int[] nums2) {
        
        Map<Integer, Integer> count = new HashMap<>();
        
        for(int n : nums1){ //traverse the nums1 array 
            count.put(n, count.containsKey(n) ? count.get(n) + 1 : 1);
            
            /*
            
                    let 'm' be the 2nd parameter in count.put
            
                    if(count.containsKey(n)){
                        m = count.get(n) + 1;
                    }else{
                        m = 1;
                    }
            
            What we are doing here is put the 'n' as index (or key) and for the 
            2nd parameter, get the corresponding value of that index 'n' (or key).
            Thus, this key and value will be put into the Map 'count'.
            
            */
        }
        
        List<Integer> intersections = new ArrayList<>(Math.min(nums1.length, nums2.length));
        
        for(int n :  nums2){ //traverse array nums2
            if(count.containsKey(n)){
                intersections.add(n);
                count.put(n, count.get(n) - 1);
                if(count.get(n) == 0){
                    count.remove(n);
                }
            }
        }
        
        int[] res = new int[intersections.size()];
        for(int i = 0; i < intersections.size(); i++){
            res[i] = intersections.get(i);
        }
        return res;
        
    }
    
}
