// 959A - Mahmoud and Ehab and the even-odd game
import java.util.*;
public class CF_1_959A {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = 1;//sc.nextInt();
        while(t-- > 0)
        {
            int num = sc.nextInt();
            if(num % 2 == 0)
                System.out.println("Mahmoud");
            else
                System.out.println("Ehab");
        }
        //"Mahmoud" (without quotes) if Mahmoud wins and "Ehab"
    }
    
}
