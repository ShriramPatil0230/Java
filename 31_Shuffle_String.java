import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sr = new Scanner(System.in);
        int i;
        int n = sr.nextInt();
        String s = sr.next();
        char[] a = new char[n];
        int arr[] = new int[n];
        for (i = 0; i < n; i++)
            arr[i] = sr.nextInt();
        for (i = 0; i < n; i++) {
            a[arr[i]] = s.charAt(i);

        }
        System.out.print(a);

    }
}