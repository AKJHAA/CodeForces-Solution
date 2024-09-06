// B. Square or Not
import java.util.*;
public class CF_970_B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            String str = sc.next();
            solve(str, n);
        }
            
            
    }
    public static void solve(String str , int n){
        int sq = (int)Math.sqrt(n);
        if(sq * sq != n){
            System.out.println("No");
            return;
        }
        /* Hello Dear */
        boolean flag = true;
        for(int i = 0;i < sq;i++)
        {
            if(str.charAt(i) == '0')
            {
                System.out.println("No");
                return;
            }
        }
        /* Hello Dear */
        for (int i = 1; i < sq - 1; i++) 
        {
            if(flag == false)
                break;
            if (str.charAt(i *sq) != '1' || str.charAt((i + 1) * sq - 1) != '1') 
            {
                flag = false;
                break;
            }
            /* Hello Dear */
            for (int j = 1; j < sq - 1; j++) 
            {
                if (str.charAt(i * sq + j) != '0') 
                {
                    flag = false;
                    break;
                }
            }
        }
        /* Hello Dear */
        if(flag == true)
            System.out.println("Yes");
        else    
            System.out.println("No");
    }
}

