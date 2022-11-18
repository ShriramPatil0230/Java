/*
Given an array of n integers where n > 1,
return an array output such that output[i] is equal to the sum of all the elements of nums except nums[i].
All integers in array are greater than 0.
Example 1
Input
4
4 3 2 10
Output
15 16 17 9
*/
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, j, sum = 0, m = 0;
        n = sc.nextInt();
        int arr[] = new int[n];
        int arr1[] = new int[n];
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                sum = sum + arr[j];
            }
            int a = sum - arr[i];
            arr1[i] = a;
            sum = 0;
        }
        System.out.println(Arrays.toString(arr1).replace("[", " ").replace("]", " ").replace(",", " "));
    }

}
