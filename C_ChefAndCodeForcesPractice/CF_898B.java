import java.util.*;
public class CF_898B {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0;i < n ; i++ )
            {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            arr[0] = arr[0] + 1;
            int res = 1;
            for(int i = 0; i < n ;i++)
            {
                res = res * arr[i];
            }
            System.out.println(res);
        }
        
    }
    
}
