import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        int arr[][] = new int[n][n];
        int diagonalLeftSum = 0;
        int diagonalRightSum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sr.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {           //sum of left diagonal
                    diagonalLeftSum += arr[i][j];
                }
                if ((i + j) == (n - 1)) {    //sum of right diagonal
                    diagonalRightSum += arr[i][j];
                }
            }
        }
        System.out.println(Math.abs(diagonalLeftSum - diagonalRightSum));
    }
}
