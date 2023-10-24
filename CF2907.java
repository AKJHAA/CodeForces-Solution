import java.util.Scanner;
public class CF2907
{
 
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n+1];
            arr[0] = -1;
            for(int i = 1;i<n+1;i++)
            {
                arr[i] = sc.nextInt();
            }
            int count = 0;
            for(int i = 1;i <= n;i++)
            {
                if(i == arr[i])
                {
                    count++;
                }
            }
            if(count % 2 == 0)
                System.out.println(count/2);
            else
                System.out.println(count/2 + 1);
        }
    }
}
/*
5
2
2 1
3
1 2 3
5
1 2 5 4 3
4
1 2 4 3
10
10 2 1 3 6 5 4 7 9 8
 */