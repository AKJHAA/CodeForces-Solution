import java.util.Scanner;

public class CF_1542A 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int odd = 0;
            int even = 0;
            for(int i = 0;i < n*2;i++)
            {
                int temp = sc.nextInt();
                if(temp % 2 == 0)
                    even++;
                else    
                    odd++;
            }
            if(odd == even)
                System.out.println("YES");
            else    
                System.out.println("NO");
        }
    }    
}
/*
 * 5
2
2 3 4 5
3
2 3 4 5 5 5
1
2 4
1
2 3
4
1 5 3 2 6 7 3 4

 */