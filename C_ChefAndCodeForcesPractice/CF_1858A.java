import java.util.Scanner;
public class CF_1858A
{
 
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int abhi = a + (c + 1) / 2;
            int jeet = b + c / 2;
            if(abhi > jeet)
                System.out.println("First");
            else
                System.out.println("Second");
                
        }
    }
}