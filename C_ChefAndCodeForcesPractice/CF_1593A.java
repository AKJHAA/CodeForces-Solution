import java.util.Scanner;
public class CF_1593A 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int aa = Math.max(Math.max(b,c)-a+1,0);
            int bb = Math.max(Math.max(a,c)-b+1,0);
            int cc = Math.max(Math.max(a,b)-c+1,0);
        
            System.out.println(aa+" "+bb+" "+cc);
        }
    }
}
