import java.util.Scanner;
public class CodeForces_Marathon
{
    static Scanner sc =new Scanner(System.in);
    public static void main(String[] args) 
    {
        int t = sc.nextInt();
        while(t-->0)
        {
            solve();
        }
    }
    public static void solve()
    {
        int arr[] = new int[4];
        for(int i = 0;i<4;i++)
            arr[i] = sc.nextInt();
        int count = 0;
        for(int i = 1;i<4;i++)
        {
            if(arr[0] < arr[i])
                count++;
        }
        System.out.println(count);
    }
}
