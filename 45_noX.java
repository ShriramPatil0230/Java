import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static String recur(int index, String s) {
        // base case
        if (index >= s.length()) {
            return ""; // "" --> Empty string
        }

        // recursive case
        if (s.charAt(index) == 'x') {
            // ignore the character at this index, answer is coming from next recursion call
            return recur(index + 1, s);
        } else {
            // Final Ans = this character + String from recursion
            String currentAns = s.charAt(index) + recur(index + 1, s);
            return currentAns;
        }
    }

    public static void main(String[] args) {
        // your code here
        Scanner in = new Scanner(System.in);

        String s = in.next();
        String ans = recur(0, s);
        System.out.print(ans);
    }
}
