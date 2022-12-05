import java.util.*;
//use Recursion
class Solution {
    public long NumberSum(long N) {
        if (N <= 1)
            return N;
        return N + NumberSum(N - 1);

    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();

        Solution Obj = new Solution();
        System.out.println(Obj.NumberSum(N));
    }
}
