import java.io.*;
import java.util.*;
/*
Print pattern
*
**
***
*/
class Main {
    public static void print(int n) {
        if (n == 0)
            return;
        System.out.print("* ");
        print(n - 1);
    }

    public static void solve(int n) {
        if (n == 0)
            return;
        solve(n - 1);
        print(n);
        System.out.println();
    }

    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        solve(n);

    }
}
