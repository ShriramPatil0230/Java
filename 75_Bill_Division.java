import java.util.*;
import java.lang.*;
import java.io.*;

/*Two friends Anna and Brian, are deciding how to split the bill at a dinner. 
Each will only pay for the items they consume. 
Brian gets the check and calculates Anna portion. 
You must determine if his calculation is correct.

For example, assume the bill has the following prices: bill = [2, 4, 6], 
Anna declines to eat item k = bill[2] which costs 6.
If Brian calculates the bill correctly, Anna will pay (2+4)/2 = 3.
If he includes the cost of bill[2], he will calculate (2 + 4 + 6)/2 = 6.
In the second case, he should refund 3 to Anna.
Your code should print the difference of the share charged by Brian 
and the actual share of Anna. */
public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        int b = sr.nextInt();
        int arr[] = new int[n];
        int sumForAnna = 0;
        int diff = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sr.nextInt();
        }
        int charged = sr.nextInt();
        for (int i = 0; i < arr.length; i++) {
            sumForAnna += arr[i];
        }
        sumForAnna = (sumForAnna - arr[b]) / 2;
        diff = charged - sumForAnna;
        System.out.print(diff);
    }
}
