import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        int k = sr.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sr.nextInt();
        }
        int count[] = new int[1000];
        int flag = 0;
        for (int i = 0; i < n; i++) {
            count[a[i]]++;
        }
        for (int i = 0; i < a.length; i++) {
            if (count[a[i]] == k) {
                System.out.println(a[i]);
                System.exit(0);
            } else {
                flag = 1;
            }
        }
        if (flag == 1) {
            System.out.println(-1);
        }
    }
}