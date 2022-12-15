
/*
 * Given two integers N and M, representing the number of rows and columns in
 * the
 * maze respectively, find all the paths to go from the top left cell to the
 * bottom right cell.
 * 
 * Only two moves are allowed h (1-step horizontal to the right) and
 * v (1-step vertically down).
 * 
 * Complete the body of the print aMazePaths function
 * - without changing the signature
 * - to print the list of all paths that can be used to move from top-left to
 * bottom-right.
 * String psf is initially empty.
 * i and j are two variables with an initial value equal to 1
 */
import java.util.*;
import java.io.*;

public class Main {
    public static void aMazePaths(int n, int m, String psf) {
        // Write your code here
        if (n == 1 && m == 1) {
            System.out.println(psf);
            return;
        }
        if (n <= 0 || m <= 0)
            return;
        aMazePaths(n, m - 1, psf + "h");
        aMazePaths(n - 1, m, psf + "v");
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputLine;
        inputLine = br.readLine().trim().split(" ");
        int n = Integer.parseInt(inputLine[0]);
        inputLine = br.readLine().trim().split(" ");
        int m = Integer.parseInt(inputLine[0]);
        aMazePaths(n, m, "");
    }
}