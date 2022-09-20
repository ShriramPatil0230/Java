import java.util.Scanner;

public class forlooppattern {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int n = 5;
        // int m = 5;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= m; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
