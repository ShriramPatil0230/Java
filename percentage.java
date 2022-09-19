import java.util.Scanner;

public class percentage {
    public static void main(String[] args)

    {
        int p;
        System.out.println(" Enter Your percentage:");
        p = new Scanner(System.in).nextInt();
        if (p < 35) {
            System.out.println("Fail");
        } else if (p >= 35 && p < 45) {
            System.out.println("Pass");
        } else if (p > 45 && p <= 55) {
            System.out.println("2nd Class");
        } else if (p >= 55 && p < 75) {
            System.out.println("1st Class");
        } else if (p >= 75 && p <= 100) {
            System.out.println("Distinction");
        } else {
            System.out.println("Enter valid Percentage");
        }
    }
}