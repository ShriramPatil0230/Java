import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        int average = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sr.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            max = arr[i];

            average = sum / n;
            sum = sum + arr[i];
        }
        System.out.print(sum + " " + average + " " + max);

    }
}
