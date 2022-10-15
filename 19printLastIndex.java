import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        String plaintext = sc.nextLine();
        String xyz = "1";
        boolean x = false;
        int result = 0;

        for (int i = 0; i < xyz.length(); i++) {
            for (int j = 0; j < plaintext.length(); j++) {
                if (plaintext.charAt(j) == xyz.charAt(i)) {

                    result = j;
                    x = true;

                }

            }
        }
        if (x) {
            System.out.println(result);
        } else {
            System.out.println("-1");
        }
    }
}