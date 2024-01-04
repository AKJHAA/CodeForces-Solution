import java.util.Scanner;
public class CF_1850C
{
 
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int m = 8;
            StringBuilder str = new StringBuilder();
            for(int i = 0;i<m;i++)
            { 
                String sb = sc.next();
                for(char ch : sb.toCharArray())
                {
                    if(ch != '.')
                        str.append(ch);
                }
            }
            
            System.out.println(str.toString());
                
        }
    }
}
/*
........
........
........
........
...i....
........
........
........
 */