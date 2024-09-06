// A. Turtle and Good Strings
import java.util.*;
public class CF_970_A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int sum = x + y * 2;
            // if(y == 0 && x % 2 == 0)
            //     System.out.println("Yes");
            // else if(y == 0 && x % 2 == 1)
            //     System.out.println("No");
            // else if(x % 2 == 0 && y == 0) 
            //     System.out.println("Yes");
            // else
            //     System.out.println("No");
            if(sum % 2 != 0){
                System.out.println("No");      
            }
            else{
                if(y % 2 != 0 && x == 0){
                    System.out.println("nO");
                }
                else{
                    System.out.println("YEs");
                }
            }
        }
            
            
    }
    public static void solve(String str , int n){
        if(n < 2){
            System.out.println("NO");
            return;
        }
        if(str.charAt(0) == str.charAt(n - 1)){
            System.out.println("NO");
            return;
        }
        System.out.println("Yes");
    }
}

