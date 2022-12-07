import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int largest = Integer.MIN_VALUE;
        int seclargest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr1[i] > largest) {
                seclargest = largest;
                largest = arr1[i];
            } else if (arr1[i] < largest && arr1[i] > seclargest) {
                seclargest = arr1[i];
            }
        }
        boolean flag = false;
        for (int i = 2; i <= seclargest / 2; ++i) {

            if (seclargest % i == 0) {
                flag = true;
                break;
            }

        }
        if (flag == true)
            System.out.println(seclargest);
        else
            System.out.println(-1);

    }
}