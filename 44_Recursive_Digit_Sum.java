import java.util.*;
import java.lang.*;
import java.io.*;
//Use recursion
public class Main {
    public static int recur(int n) {
        // base case
        if (n < 10) {
            return n;
        }

        // recursive case
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            n = n / 10;
        }

        return recur(sum);
    }

    public static void main(String[] args) {
        // your code here
        Scanner in = new Scanner(System.in);

        String s = in.next();
        int k = in.nextInt();

        int sumOfDigits = 0;
        for (int i = 0; i < s.length(); i++) {
            sumOfDigits += (s.charAt(i) - '0'); // '4' - '0' = 4
        }

        sumOfDigits = sumOfDigits * k; // k times we needed to concatenate

        int ans = recur(sumOfDigits);
        System.out.print(ans);
    }
}
