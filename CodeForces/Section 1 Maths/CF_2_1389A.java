// A. LCM Problem 
import java.util.*;
public class CF_2_1389A {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = 2 * a;

            if (c <= b)
                System.out.println(a + " " + c);
            else
                System.out.println("-1 -1");
        }
        sc.close();
    }
}
/*
Example
inputCopy
4
1 1337
13 69
2 4
88 89
outputCopy
6 7
14 21
2 4
-1 -1
 */
