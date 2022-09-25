import java.util.Scanner;

public class array_reverse {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int[] arr = { 11, 12, 13, 14, 15 };
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
