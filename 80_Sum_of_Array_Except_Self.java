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