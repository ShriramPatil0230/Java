import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static int calculateBill(int units) {

        // Condition to find the charges
        // bar in which the units consumed
        
        if (units <= 100) {
            return units * 10;
        } else if (units <= 200) {
            return (100 * 10)
                    + (units - 100)
                            * 15;
        } else if (units <= 300) {
            return (100 * 10)
                    + (100 * 15)
                    + (units - 200)
                            * 20;
        } else if (units > 300) {
            return (100 * 10)
                    + (100 * 15)
                    + (100 * 20)
                    + (units - 300)
                            * 25;
        }
        return 0;
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sr = new Scanner(System.in);
        int units = sr.nextInt();

        System.out.println(calculateBill(units));
    }
}
