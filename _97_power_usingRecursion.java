import java.util.*;

class Main {
    static long power(int x, int y) {
        if (y == 0)
            return 1;
        long value = x * power(x, y - 1);
        return value;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(power(x, y));
    }
}