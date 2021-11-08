import java.util.Scanner;

public class ClimbingStairsUsingFibonacci {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(solution(n));
        
    }
    
    public static int solution(int n){
        n++;
        
        double sqrt5 = Math.sqrt(5);
        
        /*
        
        Using Binet's Formula (first discover by Leonhard Euler but lost), if you 
        try to get the number of steps manually, you will likely notice that
        the output forms a fibonacci sequence.
        
        Instead of using recursive method on getting the fib(n), Binet's Formula
        is more efficient since it has a time complexity of O(1).
        
        */
        double ways = Math.pow(((1 + sqrt5)/2), n) - Math.pow(((1 - sqrt5)/2), n);
        ways /= sqrt5;
        
        return (int) ways;
    
    }
    
}
