import java.util.*;
import java.lang.*;
import java.io.*;
//_Sub_array_Sum_greaterthan_Middle_Element
public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int mid = arr[n / 2];
        for (int i = 0; i < n; i++) {
            int sum = 0; // store sum of subarray starting from index i
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum > mid) {
                    // print the subarray
                    for (int k = i; k <= j; k++) {
                        System.out.print(arr[k] + " ");
                    }
                    System.out.println();
                }
            }
        }

    }
}
