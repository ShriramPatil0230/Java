import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        // your code here

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr); // ascending

        long ans1 = arr[n - 1] * arr[n - 2] * arr[n - 3];
        long ans2 = arr[0] * arr[1] * arr[n - 1];

        if (ans1 > ans2) {
            System.out.print(ans1);
        } else {
            System.out.print(ans2);
        }

    }
}HRECURS-

Hello Recursion