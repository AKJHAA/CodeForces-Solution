import java.util.Scanner;
public class CodeForces_R873ArrayDivisibility
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int aasn = sc.nextInt();
            int azzz[] = new int[aasn];
            for(int i=0;i<aasn;i++)
            {
                azzz[i] = i+1;
                if(aasn%2 == 0 && i==(aasn/2)-1)
                {
                    azzz[i] = aasn*2;
                }
                else if(aasn%2 == 1 && i==(aasn/2))
                {
                    azzz[i] = aasn*2;
                }
            }
            for(int i = 0;i<aasn;i++)
            {
                System.out.print(azzz[i] + " ");
            }
            System.out.println();
        }
    }
}