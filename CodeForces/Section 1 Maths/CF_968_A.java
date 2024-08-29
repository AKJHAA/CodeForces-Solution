// A. Turtle and Good Strings
import java.util.*;
public class CF_968_A {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            String str = sc.next();
            solve(str , n);
        }
    }
    public static void solve(String str , int n){
        if(n < 2){
            System.out.println("NO");
            return;
        }
        if(str.charAt(0) == str.charAt(n - 1)){
            System.out.println("NO");
            return;
        }
        System.out.println("Yes");
    }
}