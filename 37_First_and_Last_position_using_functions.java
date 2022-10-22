import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void FirstAndLastPosition(int arr[], int n, int target) {
        int firstIndex = -1;
        int secondIndex = -1;

        for (int i = 0; i < n; i++) {
            if (firstIndex == -1 && arr[i] == target) {
                firstIndex = i;
            }
            if (arr[i] == target) {
                secondIndex = i;
            }
        }

        System.out.println(firstIndex + " " + secondIndex);
    }

    public static void main(String[] args) {
        // your code here

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int target = in.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        FirstAndLastPosition(arr, n, target);
    }
}
