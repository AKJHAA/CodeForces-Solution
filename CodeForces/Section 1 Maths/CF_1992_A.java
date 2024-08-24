import java.util.*;

public class CF_1992_A{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        int t = sc.nextInt();
        while(t-- > 0)
        {
            solve();
        }
    }
    public static void solve(){
        int arr[] = new int[3];
        for(int i = 0;i < 3;i++)
            arr[i] = sc.nextInt();
        for(int i = 0;i < 5;i++){
            Arrays.sort(arr);
            arr[0]++;
        }
        System.out.println(arr[0] * arr[1] * arr[2]);
    }
}
