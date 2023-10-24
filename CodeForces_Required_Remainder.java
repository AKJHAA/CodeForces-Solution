import java.util.*;
import java.io.*;
 
public class CodeForces_Required_Remainder
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception
    {
        int t = sc.nextInt();
        while (t-->0)
        {
            solve();
        }
    }
 
    public static void solve()
    {
        int x = sc.nextInt();
        int y = sc.nextInt();
        int n = sc.nextInt();
        int k;
        if(n%x == y)
        {
            System.out.println(n);
            return;
        }
 
        k = n-(n%x);
        k+=y;
        if(k>n){
            k-=x;
        }
        System.out.println(k);
 
 
    }
}