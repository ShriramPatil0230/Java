import java.util.Scanner;

public class pr {
    public static void main(String args[]) {
        String a, b;
        int c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name:");
        a = sc.nextLine();
        System.out.println("Enter Your NickName:");
        b = sc.nextLine();
        System.out.println("Enter Your Age:");
        c = sc.nextInt();
        System.out.println(a + "\n" + b);
        System.out.println(c);

    }
}