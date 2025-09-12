package CodeForces.Main;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = 1; // default for single test case
        // t = sc.nextInt(); // uncomment if multiple test cases

        while (t-- > 0) {
            solve(sc);
        }
        sc.close();
    }

    static void solve(Scanner sc) {
        // Your solution logic goes here
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Example: print sum of array
        long sum = 0;
        for (int num : arr) sum += num;
        System.out.println(sum);
    }
}
