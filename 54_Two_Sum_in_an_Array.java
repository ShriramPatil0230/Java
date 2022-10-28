import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        int k = sr.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sr.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && arr[i] + arr[j] == k) {
                    System.out.println(i + " " + j);
                    System.exit(0);
                }
            }
        }
    }
}
