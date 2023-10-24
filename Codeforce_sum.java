import java.util.Scanner;
public class Codeforce_sum
{
    public static void main(String[] abhijeet)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int a,b,c;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            if(a + b == c || b + c == a || c + a ==  b)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}