/*Given an array arr of size n. You are required to find Smallest greater elements for all elements in arr.
If there is no such element for some element in arr then put its smallest greater element as -10000000.
Input:
4
13 6 17 12
Output:
17 12 -10000000 13
*/

import java.util.*;
import java.util.*;

class Accio {
    public int[] SmallestGreaterElements(int[] arr) {
        // For all numbers, arr[i]
        // Find the minimum number that is greater than arr[i]
        int n = arr.length;
        int ans[] = new int[n];
        // Consider {13, 6, 17, 12} for i = 1
        for (int i = 0; i < n; i++) {
            int mini = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                if (arr[j] > arr[i] && arr[j] < mini) {
                    mini = arr[j];
                }
            }
            // mini will store the ans for arr[i]
            if (mini != Integer.MAX_VALUE) {
                ans[i] = mini;
            } else {
                // we didn't find any element that's
                // greater than arr[i]
                ans[i] = -10000000;
            }
        }
        return ans;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Accio Obj = new Accio();
        int[] ans = Obj.SmallestGreaterElements(arr);
        for (int a : ans) {
            System.out.print(a + " ");
        }
    }
}
