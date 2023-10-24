import java.util.Scanner;
public class CF_1791C
{
 
    public static void main(String[] abhijeet)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            String str = sc.next();
            char arr[] = str.toCharArray();
            int res = 0;
            int start = 0;
            int end = n - 1;
            while(start < end)
            {
                if(arr[start] == arr[end])
                    break;
                start++;
                end--;
            }
            if(start != end)
                res = end - start + 1;
            else if(n % 2 == 0)
                res = 0;
            else
                res = 1;
                

            System.out.println(res);
        }
    }
}
/* 
9
3
100
4
0111
5
1 0 1 0 1
0 1 2 3 4 
6
1 0 1 0 1 0
0 1 2 3 4 5
7
1010110
0123456
1
1
2
10
2
11
10
1011011010

 */