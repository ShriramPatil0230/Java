import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sr = new Scanner(System.in);
        int water = sr.nextInt();
        int cost = 0;
        if (water <= 100) {
            cost = 15 * water;
        } else if (water > 100 && water <= 200) {
            cost = (15 * 100) + (water - 100) * 14;
        } else {
            cost = (15 * 100) + (14 * 100) + (water - 200) * 12;
        }
        System.out.println(cost);
    }
}