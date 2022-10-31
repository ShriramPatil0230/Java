import java.util.*;
import java.lang.*;
import java.io.*;
//Bubble Sorting

public class Main {
    public static void main(String[] args) throws java.lang.Exception {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int numberOfSwapOperation = 0;

        for (int i = 0; i < (n - 1); i++) {

            boolean swap = false;

            for (int j = 0; j < (n - i - 1); j++) // j can be atmax --> n-2 (n=5)
            {

                if (arr[j] > arr[j + 1]) {

                    numberOfSwapOperation++;
                    swap = true;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

            if (swap == false) {
                break;
            }
        }

        System.out.println("Array is sorted in " + numberOfSwapOperation + " swaps.");
        System.out.println("First Element: " + arr[0]);
        System.out.println("Last Element: " + arr[n - 1]);

    }
}
