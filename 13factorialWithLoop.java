import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sr = new Scanner(System.in);
        long n = sr.nextInt();
        long ans = 1l;

        for (int i = 1; i <= n; i++) {
            ans = ans * i;
        }

        System.out.println(ans);
    }
}