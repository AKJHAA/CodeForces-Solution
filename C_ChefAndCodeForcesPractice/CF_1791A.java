import java.util.Scanner;
public class CF_1791A
{
 
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String str = "codeforces";
        while(t-- > 0)
        {
            String ch = sc.next();
            if(str.contains(ch))
                System.out.println("YES");
            else
                System.out.println("NO");
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