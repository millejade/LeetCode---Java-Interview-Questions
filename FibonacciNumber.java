/*
The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,

F(0) = 0, F(1) = 1
F(n) = F(n - 1) + F(n - 2), for n > 1.
Given n, calculate F(n).

Example 1:
Input: n = 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.

Example 2:
Input: n = 3
Output: 2
Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.

Example 3:
Input: n = 4
Output: 3
Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.
 

Constraints:

0 <= n <= 30
*/

import java.util.Scanner;

public class FibonacciNumber {

    public static void main(String[] args) {
        
        int  n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt(); //user input
        
        System.out.println(fib(n));
        
    }
    
    public static int fib(int n) {
        
        int term = 1; // if n = 1
        int firstTerm = 0; // F(0)
        int secondTerm = 1; // F(1)
        
        if(n == 0) return 0; //if n = 0, then F(0) = 0
        
        /*
        why i = 2? Because we've the first TWO terms, F(0) and F(1) that's why we start with 2.
        term = the last value in a fibonacci sequence with a given 'n'
        
        the for loop is pretty good to understand by yourself
        */
        for(int i = 2; i <= n; i++){
        
            term = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = term;
            
        }
        
        return term;
        
    }
    
}
