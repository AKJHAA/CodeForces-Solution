import java.util.Scanner;
public class B_arrangingCats {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            String str = sc.next();
            String str1 = sc.next();
            int count1 = 0;
            int count2 = 0;
            for(int i = 0;i < n;i++)
            {
                if(str.charAt(i) == '1' && str1.charAt(i) == '0')
                    count1++;
                if(str1.charAt(i) == '1' && str.charAt(i) == '0')
                    count2++;
            }
            int minimum = Math.min(count1 , count2);
            //difference of count1 and count 2
            int res = (int)Math.abs(count1-count2);
            System.out.println(res + minimum);
        }
    }
}
/*
 * 6
5
10010
00001
1
1
1
3
000
111
4
0101
1010
3
100
101
8
10011001
11111110

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


