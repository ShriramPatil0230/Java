import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static int recur(int index, int arr[], int n) {
        // base case
        if (index == n) {
            return 0;
        }

        // if(index == (n-1))
        // {
        // return arr[index];
        // }

        // recursive case
        int currentAns = arr[index] + recur(index + 1, arr, n);
        return currentAns;
    }

    public static void main(String[] args) {
        // your code here
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        int testCase = 1;
        while (t > 0) {
            int n = in.nextInt();

            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }

            int ans = recur(0, arr, n);
            System.out.println("Case " + testCase + ": " + ans);

            testCase++;
            t--;
        }
    }
}
