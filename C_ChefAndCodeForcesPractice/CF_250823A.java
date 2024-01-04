import java.util.Scanner;


public class CF_250823A
{
    static public void solve(int[] e, int[] s, int n) 
    {
        for(int i=1; i<n; i++) 
        {
            if (s[i] >= s[0] && e[i] >= e[0]) 
            {
                System.out.println("-1");
                return;
            }
        }
        System.out.println(s[0]);
    }
    public static void main(String[] abhijeet) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) 
        {
            int n = sc.nextInt();
            int[] str = new int[n];
            int[] end = new int[n];

            for (int i = 0; i < n; i++) 
            {
                str[i] = sc.nextInt();
                end[i] = sc.nextInt();
            }
            solve(end , str , n);
        }
    }
}
/*
 * 3
4
7 4
9 3
4 6
2 2
2
4 6
100 100
2
1337 3
1337 3

 * 
 */
