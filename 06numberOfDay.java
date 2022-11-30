import java.util.*;
import java.lang.*;
import java.io.*;

//Number Of Days

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sr = new Scanner(System.in);
        int m = sr.nextInt();
        if (m == 2) {
            System.out.println(28);
        } else if (m == 4 || m == 6 || m == 9 || m == 11) {
            System.out.println(30);
        } else {
            System.out.println(31);
        }
    }
}
