import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sr = new Scanner(System.in);
        long n = sr.nextInt();
        long sum = n * (n + 1) / 2l;
        System.out.println(sum);
    }
}