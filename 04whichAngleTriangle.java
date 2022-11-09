import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sr = new Scanner(System.in);
        int first = sr.nextInt();
        int second = sr.nextInt();
        int third = sr.nextInt();

        int sumOfSquares = first * first + second * second + third * third;
// Which angle triangle 
        if (2 * third * third < sumOfSquares) {
            System.out.println("1");
        } else if (2 * third * third == sumOfSquares) {
            System.out.println("2");
        } else {
            System.out.println("3");
        }
    }
}
