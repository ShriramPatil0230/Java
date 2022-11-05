import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sr.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                sum = arr[i] + sum;
            }
        }
        System.out.println(sum);
    }
}