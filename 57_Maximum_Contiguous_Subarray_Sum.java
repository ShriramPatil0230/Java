import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sr.nextInt();
        }
        int sum = 0, max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = i; j < n; j++) {
                sum += a[j];
                if (max < sum) {
                    max = sum;
                }
            }
        }
        System.out.println(max);
    }
}