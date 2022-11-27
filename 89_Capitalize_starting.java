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