import java.rmi.StubNotFoundException;
import java.util.Scanner;
//Creating Calculator
public class calculator {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter First Number:");
        double n1 = sr.nextDouble();
        System.out.println("Enter Second Number:");
        double n2 = sr.nextDouble();
        System.out.print("Enter operator(+ , - , * , /):");
        char operator = sr.next().charAt(0);
        sr.close();
        double output;

        switch (operator) {
            case '+':
                output = n1 + n2;
                break;

            case '-':
                output = n1 - n2;
                break;

            case '*':
                output = n1 * n2;
                break;

            case '/':
                output = n1 / n2;
                break;

            default:
                System.out.println("Enter valid Operator");
                return;

        }
        System.out.println(n1 + " " + operator + " " + n2 + " =" + output);
    }

}
