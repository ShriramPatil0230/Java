import java.util.Scanner;

// class sum {
//     public static void main(String[] args) {
//         System.out.print("The sum is:");
//         int a = 12;
//         int b = 12;
//         int Sum = a + b;
//         System.out.println(Sum);

//     }
// }
public class sum {
    public static void main(String[] args)

    {
        int a, b, Sum;
        Scanner sc = new Scanner(System.in);
        {
            System.out.println("Enter 1st Number:");
            a = sc.nextInt();
            System.out.println("Enter 2nd Number:");
            b = sc.nextInt();
            Sum = a + b;
            System.out.println("Sum : " + Sum);
        }
    }
}