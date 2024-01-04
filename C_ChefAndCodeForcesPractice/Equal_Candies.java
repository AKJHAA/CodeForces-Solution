import java.util.Arrays;
import java.util.Scanner;
public class Equal_Candies
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int count = 0;
            for(int i=1;i<n;i++)
            {
                count = count + (arr[i] - arr[0]);
            }
            System.out.println(count);
        }
    }
}
