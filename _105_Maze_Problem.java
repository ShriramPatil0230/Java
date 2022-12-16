
/*
 * You are given two numbers n and m representing number of rows and columns in
 * a maze.
 * 
 * You are standing in the top-left corner and have to reach the bottom-right
 * corner.
 * 
 * In a single move you are allowed to jump 1 or more steps horizontally (as h1,
 * h2, .. ),
 * or 1 or more steps vertically (as v1, v2, ..)
 * or 1 or more steps diagonally (as d1, d2, ..).
 * 
 * Your task is to print the list of all paths that can be used to move
 * from top-left to bottom-right.
 */
import java.io.*;
import java.util.*;

public class Main {
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        if (sr == dr && sc == dc) {
            System.out.println(psf);
            return;
        }
        if (sr > dr || sc > dc)
            return;

        for (int i = 1; i <= dc; i++) {
            printMazePaths(sr, sc + i, dr, dc, psf + 'h' + i);
        }
        for (int i = 1; i <= dr; i++) {
            printMazePaths(sr + i, sc, dr, dc, psf + 'v' + i);
        }
        for (int i = 1; i <= dr; i++) {
            printMazePaths(sr + i, sc + i, dr, dc, psf + 'd' + i);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        int m = sr.nextInt();

        printMazePaths(0, 0, n - 1, m - 1, "");
    }
}