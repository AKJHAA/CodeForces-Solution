// A. Primary Task
import java.util.*;
public class CF_964_B {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y1 = sc.nextInt();
            int y2 = sc.nextInt();
            int cnt = 0;
            if(x1 > y1 && x2 > y2) cnt += 2;
            if(x1 > y2 && x2 > y1) cnt += 2;
            if(x1 == y1 && x2 > y2) cnt += 2; 
            if(x1 == y2 && x2 > y1) cnt += 2;
            if(x2 == y1 && x1 > y2) cnt += 2;
            if(x2 == y2 && x1 > y1) cnt += 2;
            System.out.println(cnt);
        }
    }
    
}
