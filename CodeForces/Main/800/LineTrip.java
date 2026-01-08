import java.util.*;

public class LineTrip{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int max = arr[0];
            for(int i=1;i<n;i++){
                max = Math.max(arr[i]-arr[i-1],max);
            }
            max = Math.max(max,2*(x-arr[n-1]));
            System.out.println(max);
        }
    }
}