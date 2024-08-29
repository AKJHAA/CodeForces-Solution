// A. Distanced Coloring
import java.util.*;
public class CF_EPIC_AUGUST_A {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            
            if(n >= k && m >= k)
                System.out.println(k * k);
            else if(n < k && m < k)
                System.out.println(n * m);
            else{
                int mul = Math.min(n , m);
                System.out.println(k * mul);
            }

        }
    }
    /*6
3 3 2
5 1 10000
7 3 4
3 2 7
8 9 6
2 5 4
 */
}