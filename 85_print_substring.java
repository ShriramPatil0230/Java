import java.util.*;

class Solution {
    static String repeatEnd(String str, int n) {
        int len = str.length();
        String substr = str.substring(len - n);
        String ans = "";
        for (int i = 0; i < n; i++) { // runs n times
            ans += substr;
        }
        // length of substr is n.
        // your ans string has substr, n times
        // basically, your ans String has n * n characters
        // Space complexity: O(n^2);
        return ans;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        System.out.println(Solution.repeatEnd(s, k));
        sc.close();
    }
}