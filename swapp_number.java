import java.util.Scanner;

// public class swapp_number {
//     public static void main(String[] args) {
//     int a=20,b=30;
//     System.out.println("Number Before Swapping");
//     System.out.println("a:"+a + "\nb:"+b);
//     a=a+b;
//     b=a-b;
//     a=a-b;
//     System.out.println("Number After Swapping");
//     System.out.println("a:"+a  + "\nb:"+b);    
//     }
// }
public class swapp_number {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number a & b");
        System.out.println("Enter the value of a");
        a = sc.nextInt();
        System.out.println("Enter the value of b");
        b = sc.nextInt();
        System.out.println("Number Before Swapping");
        System.out.println("a:" + a + "\nb:" + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Number After Swapping");
        System.out.println("a:" + a + "\n b:" + b);
    }
}