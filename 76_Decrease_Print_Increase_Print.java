import java.util.*;
import java.lang.*;
import java.io.*;
//_Decrease_Print_Increase_Print

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        for (int i = n; i >= 1; --i) {
            System.out.println(i);
        }
        for (int j = 1; j <= n; j++) {
            System.out.println(j);
        }
    }
}
