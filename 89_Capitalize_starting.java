/*
Given a string, capitalize the first letter of each word in the string.
You have to complete capitalizeFirstLetter function
which has string str as input and returns string containing first letter capital for each word as output.
Input:
welcome to acciojob
Output:
Welcome To AccioJob
*/


import java.io.*;
import java.util.*;

class Accio {
    public String capitalizeFirstLetter(String str) {
        String subs[] = str.split("\\s");
        String newstr = "";
        for (String s : subs) {
            String first = s.substring(0, 1);
            String rest = s.substring(1);
            newstr += first.toUpperCase() + rest + " ";
        }
        return newstr.trim();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        Accio Obj = new Accio();
        System.out.println(Obj.capitalizeFirstLetter(str));
    }
}
