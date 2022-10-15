import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sr.nextInt();
        }
        Arrays.sort(arr);
        long ans = 0;
        long p = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans += p * arr[i];
            p *= 2;
        }
        System.out.println(ans);
    }
}