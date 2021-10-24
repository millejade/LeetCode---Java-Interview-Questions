/*
The Tribonacci sequence Tn is defined as follows: 

T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.

Given n, return the value of Tn.


Example 1:
Input: n = 4
Output: 4
Explanation:
T_3 = 0 + 1 + 1 = 2
T_4 = 1 + 1 + 2 = 4

Example 2:
Input: n = 25
Output: 1389537
 

Constraints:

0 <= n <= 37
The answer is guaranteed to fit within a 32-bit integer, ie. answer <= 2^31 - 1.
*/

public class NthTribonacciNumber {

    public static void main(String[] args) {
        int n = 25;
        System.out.println(tribonacci(n));
    }
    /*
    
    This was just same as Fibonacci...
    
    */
     public static int tribonacci(int n) {
        
        if (n <= 1) return n;
        int F0 = 0;
        int F1 = 1;
        int F2 = 1;
      /*
      
      Why initialized i = 3?
      - Because we've got the first 3 sequence, f(0), f(1) and f(2)
      
      We returned F2 or f(2) as it was assigned to 'temp', this means it is the last number in the sequence and that's all we need.
      */
        for (int i = 3; i <= n; i++) {
            int temp = F0 + F1 + F2;
            F0 = F1;
            F1 = F2;
            F2 = temp;
        }
        return F2;
        
    }
}
