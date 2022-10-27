import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int numberOfShiftOperation = 0;

        for (int i = 0; i < (n - 1); i++) {

            boolean shift = false;

            for (int j = 0; j < (n - i - 1); j++) {

                if (arr[j] > arr[j + 1]) {

                    numberOfShiftOperation++;
                    shift = true;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

            if (shift == false) {
                break;
            }
        }

        System.out.println(numberOfShiftOperation);

    }
}