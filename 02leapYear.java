import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int year = sr.nextInt();
// Leap Year
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) // Check Leap year or not
        {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }

    }

}
