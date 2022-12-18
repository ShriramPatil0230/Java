
/*
 * Doraemon, with his friends, has reached an unknown destination using his
 * anywhere door.
 * Now he wants to get back to his home, but the anywhere door isn't working
 * correctly,i.e., it cannot directly take him back to his house. In order to reach home,
 * he needs to go to different locations in between. 
 * These locations are numbered from 0 to n - 1 and are represented as a
 * 0-indexed array
 * of integers of length n where indices are the location numbers with the 0th
 * location
 * being "Doraemon" and (n - 1)th location being "Home."
 * 
 * Each element in the array represents the maximum distance the anywhere door
 * can take
 * them from that index 'i'. In other words, if Doraemon is at arr[i],
 * he can reach to any arr[i + j] where:
 * 
 * 0 <= j <= arr[i] and i + j < n
 * 
 * Help Doraemon reach his home. Print all possible ways to reach his home.
 * In other words, print all possible paths from the 0th index to (n - 1)th
 * index.
 * 
 * Input:
 * 5
 * 2 3 1 1 4
 * Output:
 * 0 -> 1 -> 2 -> 3 -> 4
 * 0 -> 1 -> 3 -> 4
 * 0 -> 1 -> 4
 * 0 -> 2 -> 3 -> 4
 */
import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Solution obj = new Solution();
        obj.allpossiblepaths(0, a, n, "");
    }
}

class Solution {
    public void allpossiblepaths(int i, int[] a, int n, String path) {
        if (i == n - 1) {
            System.out.println(path + String.valueOf(i));
            return;
        }
        for (int jump = 1; jump <= a[i] && i + jump < n; jump++) {
            allpossiblepaths(i + jump, a, n, path + String.valueOf(i) + " -> ");
        }

    }
}