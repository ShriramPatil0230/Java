import java.util.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sr = new Scanner(System.in);
        String input = sr.next();
        int size = input.length();

        System.out.print(input.charAt(0)); // h

        int numberOfE = size - 2;
        int iteration = 2 * numberOfE;
        while (iteration > 0) {
            System.out.print('e');
            iteration--;
        }

        System.out.print(input.charAt(size - 1)); // y
    }
}