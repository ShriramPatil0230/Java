import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    // Nth number of fibonacci using recursion
    // F(N) = F(N-1) + F(N-2)
    // F(1) = 0, F(2) = 1

    // If something has been calculated, using DP (Dynamic Programming) (we will not
    // recalculate it)
    // Time Complexity - O(2^N)
    // All function call are stored in stack
    // some Extra space has been used by stack for storing function calls of
    // recursion --> O(2^N)
    public static long fibo(int n) {
        // base case
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }

        // recursive case
        long nthNumber = fibo(n - 1) + fibo(n - 2);
        return nthNumber;
    }

    public static void main(String[] args) {
        // your code here
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        long ans = fibo(n);
        System.out.println(ans);
    }
}