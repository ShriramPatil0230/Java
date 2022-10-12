import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        // your code here
        Scanner in = new Scanner(System.in);

        for (int i = 1; i <= 500; i++) {
            int sum = 0;
            int n = i; // if I change
            while (n > 0) {
                int lastDigit = n % 10; // finding the last digit
                sum = sum + lastDigit * lastDigit * lastDigit; // adding cube of this digit
                n = n / 10; // removing the last digit
            }

            // sum will be having sum of all digits
            if (sum == i) // if sum is as same as original number then it will be amstrong number
            {
                System.out.println(i);
            }
        }

    }
}
