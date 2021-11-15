import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String input;
        
        input = scan.nextLine();
        
        System.out.println(isValid(input));
    }
   
    
    public static boolean isValid(String input){
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < input.length(); i++){
            char bracket = input.charAt(i);
            
            if(bracket == '[' ||  bracket == '{' || bracket == '('){
                
                stack.push(bracket);
                continue;
                
            }
            
            if(stack.isEmpty()){ //if the first element is a closing bracket
                return false;
            }
            
            char check;
            
            switch(bracket){ //when the stack is not empty and the character is a closing brackets
            
                case '}':
                    check = stack.pop();
                    if(check == '{') break;
                    else return false;
                    
                case ')':
                    check = stack.pop();
                    if(check == '(') break;
                    else return false;
                
                case ']':
                    check = stack.pop();
                    if(check == '[') break;
                    else return false;
            
            }
            
            
            
        }
        return stack.isEmpty();
    }
    
}
