import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt(); // we will input the number given by the user
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int result = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] >= largest) {
                secondLargest = largest;
                largest = a[i];
            } else if (a[i] < largest && a[i] > secondLargest) {
                secondLargest = a[i];
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                result = (largest - 1) * (secondLargest - 1);
            }
        }
        System.out.println(result);
    }
}