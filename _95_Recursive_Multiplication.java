import java.io.*;
import java.util.*;

public class Main {
    public static void multiplyRecursively(int n, int m) {
        if (n == 0 || m == 0) {
            return;
        } else {
            int multi = n * m;
            System.out.print(multi);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        multiplyRecursively(n, m);
    }
}