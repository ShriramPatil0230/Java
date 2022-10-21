import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        // your code here
        Scanner sr = new Scanner(System.in);

        int n = sr.nextInt();
        String answerKey = sr.next();

        // ABC ABC ABC
        // 012 345 678
        // 123 456 789

        String pattern1 = "ABC";
        int marks1 = 0;

        for (int i = 0; i < n; i++) {
            if (answerKey.charAt(i) == pattern1.charAt((i % 3))) {
                marks1++;
            }
        }

        // BABC BABC
        // 0123 4567

        String pattern2 = "BABC";
        int marks2 = 0;

        for (int i = 0; i < n; i++) {
            if (answerKey.charAt(i) == pattern2.charAt((i % 4))) {
                marks2++;
            }
        }

        String pattern3 = "CCAABB";
        int marks3 = 0;

        for (int i = 0; i < n; i++) {
            if (answerKey.charAt(i) == pattern3.charAt((i % 6))) {
                marks3++;
            }
        }

        int maximumMarks = Math.max(marks1, Math.max(marks2, marks3));
        System.out.println(maximumMarks);
        if (maximumMarks == marks1) {
            System.out.println("Adrian");
        }
        if (maximumMarks == marks2) {
            System.out.println("Bruno");
        }
        if (maximumMarks == marks3) {
            System.out.println("Goran");
        }
    }
}
