import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {

        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        int a[] = new int[n];
        int c = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sr.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                if (a[i] == a[j]) {
                    c++;
                    break;
                }
            }
        }
        if (c == 1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}