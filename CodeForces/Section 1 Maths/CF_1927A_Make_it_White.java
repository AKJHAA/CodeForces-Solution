// A. Make it White
import java.util.*;
public class CF_1927A_Make_it_White {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            String str = sc.next();
            int cnt = 0;
            int start = 0;
            int end = str.length() - 1;
            for(int i = 0;i < str.length();i++){
                if(str.charAt(i) == 'B')
                {
                    start = i;
                    break;
                }
            }
            for(int i = str.length() - 1;i >= 0;i--){
                if(str.charAt(i) == 'B')
                {
                    end = i;
                    break;
                }
            }
            System.out.println(end - start + 1);
        }
    }
    
}
