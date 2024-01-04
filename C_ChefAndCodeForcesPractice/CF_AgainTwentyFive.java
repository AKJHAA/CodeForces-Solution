import java.util.Scanner;
public class CF_AgainTwentyFive
{
    public static void main(String []args)    
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(solve(n));
    }
    public static long solve(long n)
    {
        //return (long)Math.pow(5,n);   //First solution
        /*if(n==1) // Second solution
            return 5;
        else if(n == 0)
            return 1;
        return 5*solve(n-1);*/
        return 25;
    }
}
