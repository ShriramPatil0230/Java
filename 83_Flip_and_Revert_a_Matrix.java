import java.util.*;
/*Given a binary matrix, flip it and invert it.
Flipping a matrix means reversing all the rows of the matrix.
 Inverting means changing 0 to 1 and 1 to 0. 
 Input:
3
1 1 0
1 0 1
0 0 0
Output:
1 0 0
0 1 0
1 1 1*/



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                mat[i][j] = sc.nextInt();
        }
        sc.close();
        int[][] res = flipAndInvert(mat);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(res[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static int[][] flipAndInvert(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            int left = 0;
            int right = mat[i].length - 1;
            while (left <= right) {
                if (mat[i][left] == mat[i][right]) {
                    mat[i][left] = 1 - mat[i][right];
                    mat[i][right] = mat[i][left];
                }
                left++;
                right--;
            }
        }
        return mat;
    }
}
