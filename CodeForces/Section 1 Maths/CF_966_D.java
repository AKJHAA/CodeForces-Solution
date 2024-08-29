// D. Right Left Wrong
import java.util.*;
public class CF_966_D {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            long val[] = new long[n];
            long arr[] = new long[n];
            long sum = 0;
            for(int i = 0;i < n;i++){
                arr[i] = sc.nextInt();
                sum = sum + arr[i];
                val[i] = sum;
            }
            String str = sc.next();
            solve(arr , val , str);
        }
    }
    public static void solve(long arr[] , long val[] , String str){
        int n = arr.length;
        int start = 0 , end = n - 1;
        long ans = 0;
        while(start < end){
            while(start < n && str.charAt(start) != 'L')
                start++;
            while(end >= 0 && str.charAt(end) != 'R')
                end--;
            ans += addd(arr , val , start , end);
            start++;
            end--;
        }
        System.out.println(ans);
    }
    public static long addd(long arr[] ,long val[] , int i , int j){
        if(i >= arr.length || j < 0) return 0;
        if(i > j) return 0;
        return val[j] - val[i] + arr[i];
    }
}
