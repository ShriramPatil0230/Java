import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    /*
     * A
     * BC
     * CDE
     * DEFG
     * EFGHI
     */
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);

        // Get the number of rows from the user

        int rows = scanner.nextInt();
        int alphabet = 65;
        for (int i = 0; i < rows; i++) {
            int temp = i;
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (alphabet + temp));
                temp++;
            }
            System.out.println();
        }
    }
}
