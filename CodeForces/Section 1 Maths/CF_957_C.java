// C. Gorilla and Permutation
import java.util.*;
public class CF_957_C {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            
            for(int i = n;i > m;i--)
                System.out.print(i +" ");
            for(int i = 1;i <= m;i++)
                System.out.print(i + " ");
            System.out.println();
        }
    }
    
}
