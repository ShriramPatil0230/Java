import java.util.*;
import java.lang.*;
import java.io.*;
//Inversion Count

public class Main {
    public static int merge(int st, int mid, int en, int arr[]) {
        // st -- mid (first part) (0 -- 2) (0 1 2)
        // mid+1 -- en (second part)
        int currentAns = 0;
        ArrayList<Integer> A = new ArrayList<>();

        for (int i = st; i <= mid; i++) // first part elements
        {
            A.add(arr[i]);
        }

        ArrayList<Integer> B = new ArrayList<>();

        for (int i = (mid + 1); i <= en; i++) // second part elements
        {
            B.add(arr[i]);
        }

        int i = 0;
        int j = 0;

        ArrayList<Integer> C = new ArrayList<>();

        while (i < A.size() && j < B.size()) // either of first or second is finished
        {
            if (A.get(i) <= B.get(j)) {
                C.add(A.get(i));
                i++;
            } else {
                C.add(B.get(j));
                currentAns += (A.size() - i);
                j++;
            }
        }

        // when first part is not finished
        while (i < A.size()) {
            C.add(A.get(i));
            i++;
        }

        // when second part is not finished
        while (j < B.size()) {
            C.add(B.get(j));
            j++;
        }

        // Copy all elements from C to original array ?
        for (int k = 0; k < C.size(); k++) {
            arr[st + k] = C.get(k);
        }

        return currentAns;
    }

    public static int mergesort(int st, int en, int arr[]) {
        // base case
        if (st == en) {
            // one element
            return 0;
        }

        // recursive case
        int mid = (st + en) / 2;

        int ans = 0;
        // first part
        ans += mergesort(st, mid, arr);

        // second part
        ans += mergesort(mid + 1, en, arr);

        // merge first and second part
        ans += merge(st, mid, en, arr);

        return ans;
    }

    public static void main(String[] args) throws java.lang.Exception {
        // your code here
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t > 0) {
            int n = in.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }

            int inv = mergesort(0, n - 1, arr);

            System.out.println(inv);
            t--;
        }
    }
}
