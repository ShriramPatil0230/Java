import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static long fact(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    public static void main(String[] args) throws java.lang.Exception {
        // your code here
        Scanner sr = new Scanner(System.in);

        int n = sr.nextInt();
        int r = sr.nextInt();

        long num = fact(n);
        long deno = fact(n - r);

        long ans = num / deno;
        ans = ans / fact(r);

        System.out.println(ans);
    }
}