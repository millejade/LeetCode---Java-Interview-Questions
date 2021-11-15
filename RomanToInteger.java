import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    
//Switch Case is much more efficient in terms of time and space complexity
    
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMLXIX"));
    }
    
     public static int romanToInt(String s) {
         
         Map<Character, Integer> roman = new HashMap<>();
         
         roman.put('I', 1);
         roman.put('V', 5);
         roman.put('X', 10);
         roman.put('L', 50);
         roman.put('C', 100);
         roman.put('D', 500);
         roman.put('M', 1000);
         int num = 0;
         
        for(int i = 0; i < s.length(); i++){
            
            if(i > 0 && roman.get(s.charAt(i)) > roman.get(s.charAt(i - 1))){ //should test FIRST if i > 0 so it doesn't cause OUT OF BOUNDS
                num += roman.get(s.charAt(i)) - (2 * (roman.get(s.charAt(i - 1)))); //times TWO because it was already added to nums so
                                                                                    //...it needs to be erase also
            }else{
                num += roman.get(s.charAt(i));
            }
            
        }
   
        return num;
        
    }
    
}
