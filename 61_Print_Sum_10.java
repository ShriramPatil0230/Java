import java.util.*;
import java.lang.*;
import java.io.*;
//Practice Question Sum of 10 numbers
public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sr = new Scanner(System.in);
        int n = 10;
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
