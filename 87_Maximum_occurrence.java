/*You are given an array arr of length n.
Your task is to print the element which has maximum occurrences in the array.
If two elements have the same occurrence then print the smaller element
Input:
8
7 7 6 4 8 7 3 1
Output:
7
*/

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
