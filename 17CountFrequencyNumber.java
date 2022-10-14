import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        int d = sr.nextInt();
        System.out.print(frequency(n, d));
    }

    public static int frequency(int a, int b) {
        int ct = 0;
        for (int i = a; i > 0; i = i / 10) {
            if (i % 10 == b) {
                ct = ct + 1;
            }
        }
        return ct;
    }
}