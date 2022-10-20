import java.util.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sr = new Scanner(System.in);
        String time = sr.next();

        int len = time.length();

        int hours = (time.charAt(0) - '0') * 10 + (time.charAt(1) - '0');

        if (time.charAt(len - 2) == 'A') // AM time
        {
            if (hours == 12) {
                System.out.print("00" + time.substring(2, len - 2));
            } else {
                System.out.print(time.substring(0, len - 2));
            }
        } else {
            if (hours == 12) {
                System.out.print(time.substring(0, len - 2));
            } else {
                hours += 12;
                System.out.print(hours + time.substring(2, len - 2));
            }
        }
    }
}
