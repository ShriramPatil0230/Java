import java.util.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        // your code here
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int peakElementIndex = -1;

        // STEP 1
        if (n > 1 && a[0] > a[1]) // left boundary
        {
            peakElementIndex = 0; // 0 index
        } else {
            // STEP 2
            for (int index = 1; index <= (n - 2); index++) {
                if (a[index] > a[index - 1] && a[index] > a[index + 1]) {
                    peakElementIndex = index;
                    break; // first peak element
                }
            }

            // STEP 3
            // If peak element is already found it will not be -1
            if (peakElementIndex == -1 && n >= 2 && a[n - 1] > a[n - 2]) // right boundary
            {
                peakElementIndex = n - 1; // last index
            }
        }

        if (n == 1) {
            peakElementIndex = 0;
        }

        System.out.println(peakElementIndex);
    }
}
