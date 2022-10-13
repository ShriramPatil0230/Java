import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int countOfSubarrays = 0;
        for (int start = 0; start < n; start++) {
            // ending point = start - n-1
            int sum = 0;
            for (int end = start; end <= (n - 1); end++) // when this loop is moving starting point is fixed
            {
                sum = sum + a[end]; // sum from start to end
                if (sum % k == 0) {
                    countOfSubarrays++;
                }
            }
        }

        System.out.println(countOfSubarrays);
    }
}