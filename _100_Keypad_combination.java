/*You are given a string str. The string str will contains numbers only, where each number stands for a key pressed on a mobile phone.

The following list is the key to characters map

    0 -> .;
    1 -> abc
    2 -> def
    3 -> ghi
    4 -> jkl
    5 -> mno
    6 -> pqrs
    7 -> tu
    8 -> vwx
    9 -> yz
Complete the body of printKPC function - without changing signature - to print the list of all words that could be produced by the keys in str.

Use sample input and output to take idea about output
 */

import java.io.*;
import java.util.*;

public class Main {
    static String keypad[] = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void printKeypadCombination(String str, String ans, int index) {
        if (index == str.length()) {
            System.out.println(ans);
            return;
        }
        int digit = str.charAt(index) - '0';
        String str_at_digit = keypad[digit]; // extracting string at index;
        for (int i = 0; i < str_at_digit.length(); i++) {
            printKeypadCombination(str, ans + str_at_digit.charAt(i), index + 1);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str;
        str = sc.nextLine();
        printKeypadCombination(str, "", 0);
    }
}