import java.util.Scanner;

public class CodeForces_Lucky
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        int t = sc.nextInt();
        while(t-->0)
        {
            Solve();
        }
    }
    public static void Solve()
    {
        String str = sc.next();
        int num = Integer.parseInt(str);

        int first3 = 0;
        int last3 = 0;
        for(int i = 1;i<=6;i++)
        {
            if(i<=3)
            {
                int rem = num % 10;
                last3 = last3 + rem;
                num = num/10;
            }
            else
            {
                int rem = num % 10;
                first3 = first3 + rem;
                num = num/10;
            }
        }
        if(first3 == last3)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}