import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        int[][] mat = new int[n][n];
        int sumBlack = 0, sumWhite = 0;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sr.nextInt();
            }
        }
        // check the alternate elements
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                if ((i + j) % 2 == 0) {
                    sumBlack += mat[i][j];
                } else { // count the elements at odd places
                    sumWhite += mat[i][j];

                }
            }
        }

        System.out.println(sumBlack + "\n" + sumWhite);
    }
}
