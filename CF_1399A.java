import java.util.*;
public class CF_1399A
{
 
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0;i<n;i++)
            {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            String str = "Yes";
            for(int i = 1;i<n;i++)
            {
                if(arr[i] - arr[i - 1] > 1)
                {
                    str = "No";
                    break;
                }
            }
            System.out.println(str);
        }
    }
}
/*
5
3
1 2 2
4
5 5 5 5
3
1 2 4
4
1 3 4 4
1
100
 */