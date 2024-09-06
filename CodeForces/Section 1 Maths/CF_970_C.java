// B. Square or Not
import java.util.*;
public class CF_970_C {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int l = sc.nextInt();
            int r = sc.nextInt();
            if(l == r){
                System.out.println(1);
                continue;
            }
            solve(l, r);
        }
            
            
    }
    public static void solve(int l , int r){
        int cnt = 2;
        l = l + 1;
        int raise = 2;
        while(l + raise <= r){
            l = l + raise++;
            cnt++;
        }
        System.out.println(cnt);
    }
}

