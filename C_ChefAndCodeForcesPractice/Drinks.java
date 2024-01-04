import java.util.Scanner;
public class Drinks
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double a,count = 0.00000000;
        for(int i=0;i<n;i++)
        {
            a = sc.nextDouble();
            count = count + a; 
        }

        System.out.println(count/n);
    }
}