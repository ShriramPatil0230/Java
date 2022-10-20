import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String[] names = sr.nextLine().split("-");
        String output = "";
        for (String s : names)
            output += s.charAt(0);
        System.out.println(output);
    }
}
