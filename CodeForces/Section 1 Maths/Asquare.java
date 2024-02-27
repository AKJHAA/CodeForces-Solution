// A. Ichihime and Triangle
import java.util.*;
public class Asquare {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int arr[] = new int[8];
            for(int i = 0; i < 8;i++)
                arr[i] =sc.nextInt();
            if(arr[0] == arr[2])
            {
                int temp = Math.abs((arr[0] - arr[4]));
                System.out.println((int)Math.pow(temp , 2));
            }
            else{
                int temp = Math.abs((arr[0] - arr[2]));
                System.out.println((int)Math.pow(temp , 2));
            }
            
        }
    }
    
}
/*
 * 3
1 2
4 5
1 5
4 2

-1 1
1 -1
1 1
-1 -1

45 11
45 39
17 11
17 39

 */