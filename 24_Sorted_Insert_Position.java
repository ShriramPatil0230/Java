import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sr.nextInt();
        }
        int B = sr.nextInt();
        int index = n;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= B) {
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}
