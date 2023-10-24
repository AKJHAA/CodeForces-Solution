/*
Input
4
X.........
..........
.......X..
.....X....
......X...
..........
.........X
..X.......
..........
.........X
..........
..........
..........
..........
..........
..........
..........
..........
..........
..........
..........
..........
..........
..........
....X.....
..........
..........
..........
..........
..........
XXXXXXXXXX
XXXXXXXXXX
XXXXXXXXXX
XXXXXXXXXX
XXXXXXXXXX
XXXXXXXXXX
XXXXXXXXXX
XXXXXXXXXX
XXXXXXXXXX
XXXXXXXXXX
----------------------
Output:-
17
0
5
220

 */
import java.util.*;
public class CF_898D
{
    public static void main(String[] Abhijeet)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            char arr[][] = new char[11][11];
            //Taking Input of The Matrix
            for(int i = 1 ; i <= 10; i++)
            {
                String str = sc.next();
                for(int j = 1  ; j <= 10 ; j++)
                {
                    arr[i][j] = str.charAt(j - 1);
                }
            }
            //Operations
            int k = 0;
            for(int i = 1 ; i <= 10; i++)
            {
                for(int j = 1 ; j <= 10 ; j++)
                {
                    if(arr[i][j] == 'X')
                    {
                        if(i <= 5)
                        {
                            if(j <= 5)
                                k += Math.min(i , j);
                            else
                                k += Math.min(i , 11 - j);
                        }
                        else
                        {
                            if(j <= 5)
                                k += Math.min(11 - i , j);
                            else
                                k += Math.min(11 - i , 11 - j); 
                        }
                    }
                }
            }
            //printing result
            System.out.println(k);
        }
    }
}
/*
import java.util.*;
public class CF_898C 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String str = sc.next();
            int count = 0;
            for(int i = 0 ;i < n;)
            {
                if(str.charAt(i) == 'B')
                {
                    count++;
                    i = i + k;
                }
                else
                    i++;
            }
            System.out.println(count);
        } 
    }   
}
 */
//---------------------------
 /*
import java.util.*;
public class CF_898B {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0;i < n ; i++ )
            {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            arr[0] = arr[0] + 1;
            int res = 1;
            for(int i = 0; i < n ;i++)
            {
                res = res * arr[i];
            }
            System.out.println(res);
        }
        
    }
    
}

  */
//--------------------------------------
/*
import java.util.Scanner;
import java.util.*;
public class CF_141A 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();
        if(str1.length() + str2.length() != str3.length())
        {
            System.out.println("NO");
            return;
        }
        String newStr = str1 + str2;
        char ch1[] = newStr.toCharArray();
        char ch2[] = str3.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for(int i = 0; i < ch1.length;i++)
        {
            if(ch1[i] != ch2[i])
            {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
 */