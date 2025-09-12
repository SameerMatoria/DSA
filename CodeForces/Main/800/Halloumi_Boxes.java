import java.util.*;

public class Halloumi_Boxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); 
        while (t-- > 0) {
            solve(sc);
        }
        sc.close();
    }

    static void solve(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (isSorted(arr)) {
            System.out.println("YES");
            return;
        }

        if (k == 1) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }

    static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) return false;
        }
        return true;
    }
}
