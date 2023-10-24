import java.util.Scanner;
public class SoldierAndBananas
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int k,n,w;//k=price of 1 banana , n = total dollars have , w = numbers of banana
        k = sc.nextInt();
        n = sc.nextInt();
        w = sc.nextInt();
        solve(k,n,w);
    }
    public static void solve(int k , int n, int w)
    {
        int arr[] = new int[w];
        int sum = 0;
        for(int i = 1;i<=w;i++)
        {
            arr[i-1] = k*i;
            sum = sum + arr[i-1];
        }
        if(sum > n)
            System.out.println(sum - n);
        else
            System.out.println(0);
    }
}