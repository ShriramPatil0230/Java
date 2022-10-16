import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sr = new Scanner(System.in);

        int n = sr.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sr.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (a[i] >= largest) {
                secondLargest = largest;
                largest = a[i];
            } else if (a[i] < largest && a[i] > secondLargest) {
                secondLargest = a[i];
            }
        }

        System.out.println(secondLargest);
    }
}
