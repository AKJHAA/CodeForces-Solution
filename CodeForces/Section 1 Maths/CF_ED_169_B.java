// A. Closest Point
import java.util.*;
public class CF_ED_169_B {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int l = Math.max(x1 , x2);
            int r = Math.min(y1 , y2);
            if(r - l + 1 <= 0)
                System.out.println(1);  
            else {
                int ans = r - l;
                if(x1 != x2) ans++;
                if(y1 != y2) ans++;
                System.out.println(ans);

            }
        }
    }
}