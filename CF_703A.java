import java.util.Scanner;
public class CF_703A
{
 
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(x > y)
                a++;
            else if(y > x)
                b++;
            else
            {
                a++;
                b++;
            }
        }
        if(a > b)
                System.out.println("Mishka");
        else if(b > a)
            System.out.println("Chris");
        else
            System.out.println("Friendship is magic!^^");
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