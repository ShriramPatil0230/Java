import java.util.*;

public class Main {
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Solution ob = new Solution();
        System.out.print(ob.maximum_occurrence(arr, n));

    }
}

class Solution {
    int maximum_occurrence(int arr[], int n) {
        Arrays.sort(arr);
        int maxCount = 0; // store the count of variable with highest frequency
        int maxElement = arr[0]; // element with highest freq
        int count = 1; // count of current element
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                count = 1;
            }
            if (count > maxCount) {
                maxCount = count;
                maxElement = arr[i];
            }
        }
        return maxElement;
    }
}