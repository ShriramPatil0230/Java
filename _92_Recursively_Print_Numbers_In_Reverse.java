import java.util.*;

public class _92_Recursively_Print_Numbers_In_Reverse {

    public static void printtillN(int N) {

        if (N == 1) {
            System.out.print(N + " ");
            return;
        }
        System.out.print(N + " ");
        printtillN(N - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        printtillN(N);

    }
}
