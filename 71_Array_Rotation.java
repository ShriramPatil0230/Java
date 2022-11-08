import java.util.*;
import java.lang.*;
import java.io.*;
//Array Rotation
public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        int k = sr.nextInt();
        int q = sr.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sr.nextInt();
        }
        int[] rot = new int[n];
        for (int i = 0; i < n; i++) {
            rot[(i + k) % n] = arr[i];
        }
        for (int i = 0; i < q; i++) {
            int index = sr.nextInt();
            System.out.print(rot[index] + " ");
        }
    }
}
