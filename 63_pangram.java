import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        String s = "";
        for (char i = 'a'; i <= 'z'; i++) {
            if (str.indexOf(i) != -1) {
                s = s + i;
            }
        }
        if (s.length() == 26) {
            System.out.println("pangram");
        } else {
            System.out.println("not pangram");
        }
    }
}