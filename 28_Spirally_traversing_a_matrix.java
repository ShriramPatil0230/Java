import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        // your code here

        Scanner sr = new Scanner(System.in);
        int r = sr.nextInt();
        int c = sr.nextInt();

        int arr[][] = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sr.nextInt();
            }
        }

        int left = 0; // first column index
        int right = c - 1; // last column index
        int top = 0; // first row index
        int bottom = r - 1; // last row index

        while (left <= right && top <= bottom) // stopping check
        {
            // 1st arrow
            for (int i = left; i <= right; i++) {
                System.out.print(arr[top][i] + " ");
            }

            boolean flag = false;

            // 2nd arrow
            top++;
            for (int i = top; i <= bottom; i++) {
                flag = true;
                System.out.print(arr[i][right] + " ");
            }

            if (flag == true) {
                flag = false;
                // 3rd arrow
                right--;
                for (int i = right; i >= left; i--) {
                    flag = true;
                    System.out.print(arr[bottom][i] + " ");
                }
            }

            if (flag == true) {
                // 4th arrow
                bottom--;
                for (int i = bottom; i >= top; i--) {
                    System.out.print(arr[i][left] + " ");
                }
            }

            left++;
        }
    }
}
