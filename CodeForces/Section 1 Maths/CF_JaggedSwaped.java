import java.util.Scanner;

public class CF_JaggedSwaped {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            solve(n);
        }
    }
    public static void solve(int n){
        int arr[] = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        if(arr[0] == 1)
            System.out.println("YES");
        else
            System.out.println("NO");
                
    }
}
/*
*/