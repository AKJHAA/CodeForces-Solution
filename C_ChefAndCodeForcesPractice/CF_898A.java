import java.util.Scanner;
public class CF_898A {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String str = sc.next();
            char ch[] = str.toCharArray();
            if(ch[1] == 'c' && ch[2] == 'a' || ch[1] == 'a' && ch[2] == 'b')
                System.out.println("NO");
            else
                System.out.println("YES");
        }
        
    }
    
}
