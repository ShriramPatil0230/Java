import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static int recur(int index, int arr[], int n) {
        if (index >= n) {
            return 0;
        }
        int count = 0;
        if (arr[index] == 11) {
            count++;
        }
        count += recur(index + 1, arr, n);
        return count;
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sr.nextInt();
        }
        System.out.print(recur(0, arr, n));
    }
}