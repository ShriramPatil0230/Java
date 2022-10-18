import java.util.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sr = new Scanner(System.in);

        int row = sr.nextInt();
        int col = sr.nextInt();
        // datatype arrayName[][] = new datatype[numberOfRows][numberOfColumns]
        int a[][] = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = sr.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            if (i % 2 == 0) {
                // left to right
                for (int j = 0; j < col; j++) {
                    System.out.print(a[i][j] + " ");
                }
            } else {
                // right to left
                for (int j = (col - 1); j >= 0; j--) {
                    System.out.print(a[i][j] + " ");
                }
            }
            // System.out.println();
        }
    }
}