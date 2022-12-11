/*You are given a number n representing number of stairs in a staircase.

You are standing at the bottom of staircase.
 You are allowed to climb 1 step, 2 steps or 3 steps in one move.

Complete the body of printStairPaths function
 - without changing signature 
- to print the list of all paths that can be used to climb the staircase up.
 Use sample input and output to take idea about output.

Note: Write recursive and not iterative logic */

import java.io.*;
import java.util.*;

public class Main {
    public static void waysToReachAtDestination(String moves, int n) {

        if (n == 0) {
            System.out.println(moves);
            return;
        }

        if (n > 0)
            waysToReachAtDestination(moves + "1", n - 1);

        if (n > 1)
            waysToReachAtDestination(moves + "2", n - 2);

        if (n > 2)
            waysToReachAtDestination(moves + "3", n - 3);

    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        waysToReachAtDestination("", n);
    }
}