import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String a = in.nextLine();

        int i = 0;
        int j = 0;

        int minimumLength = Integer.MAX_VALUE;

        int indexOfWord = -1;

        int l = a.length();
        while (j < l && i < l) {
            
            while (j < l && a.charAt(j) != ' ') {
                j++;
            }

            int lengthOfWord = (j - i);
            if (lengthOfWord < minimumLength) {
                minimumLength = lengthOfWord;
                indexOfWord = i;
            }

            j++;
            i = j;
        }

        System.out.println(a.substring(indexOfWord, indexOfWord + minimumLength));
    }
}
