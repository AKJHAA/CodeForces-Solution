// A. Closest Point
import java.util.*;
public class CF_ED_169_A {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0;i < n;i++){
                arr[i] = sc.nextInt();
            }
            solve(n , arr);
        }
    }
    public static void solve(int n , int arr[]){
        if(n == 2 && Math.abs(arr[0] - arr[1]) != 1)
            System.out.println("Yes");
        else
            System.out.println("NO");
            
    }
}