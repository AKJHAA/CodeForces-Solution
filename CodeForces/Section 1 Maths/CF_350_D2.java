import java.util.*;
public class CF_350_D2 {
    public static int n ;
    static long[] a ;
    static long[] b ;
    static long k;


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt() ;
        k = sc.nextInt();
        a = new long[n];
        b = new long[n];
        // long sum = 0;

        for(int i = 0 ; i<n ; i++)
            a[i]=sc.nextLong();

        for(int i = 0 ; i<n ; i++){
            b[i]=sc.nextLong();
            // sum+=b[i];
        }

        long l = 0 , r = 2000000000, ans = 0;

        while(l<=r){

            long mid = l+(r-l)/2;

            if(valid(mid)) {
                ans = mid;
                l = mid + 1;
            }else
                r = mid-1;
        }

            System.out.println(ans);

    }

    public static boolean valid(long mid){
        long cost = 0;
        for(int i = 0 ; i<n ; i++){
            cost+=Math.max(0,a[i]*mid-b[i]);

            if(cost>k)
                return false ;
        }
        if(cost<=k)
            return true;

        return false;

    }
}