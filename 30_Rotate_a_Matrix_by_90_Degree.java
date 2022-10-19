import java.util.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);

        int row = in.nextInt();
        int col = in.nextInt();
        // datatype arrayName[][] = new datatype[numberOfRows][numberOfColumns]
        int a[][] = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = in.nextInt();
            }
        }

        // transpose of the matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < i; j++) {
                int temp = a[j][i];
                a[j][i] = a[i][j];
                a[i][j] = temp;
            }
        }

        for (int i = 0; i < row; i++) {
            // for every row do the reverse operation
            int start = 0;
            int end = col - 1;

            while (start < end) {
                // reverse the array
                // interchange a[start] and a[end]
                int temp = a[i][end];
                a[i][end] = a[i][start];
                a[i][start] = temp;

                start++;
                end--;
            }

        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}
