import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sr = new Scanner(System.in);
        int N = sr.nextInt();
        if (N > 90 && N <= 100) {
            System.out.println("Excellent");
        } else if (N > 80 && N <= 90) {
            System.out.println("Good");
        } else if (N > 70 && N <= 80) {
            System.out.println("Fair");
        } else if (N > 60 && N <= 70) {
            System.out.println("Meets Expectations");
        } else {
            System.out.println("Below Expectations");
        }
    }
}