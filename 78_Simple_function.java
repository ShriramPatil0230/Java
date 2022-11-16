import java.util.*;
import java.lang.*;
import java.io.*;
/*The user gives his name as the input you have to
 return string "name" is a Super Hero from the function. */

public class Main {
    public static void fun(String str) {
        System.out.print(str + " is a Super Hero");
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sr = new Scanner(System.in);
        String str = sr.nextLine();
        fun(str);
    }
}