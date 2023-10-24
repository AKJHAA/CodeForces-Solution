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
/*
2
1
2
1
4
3
4
0


8
6 3
WBWWWB
7 3
WWBWBWW
5 4
BWBWB
5 5
BBBBB
8 2
BWBWBBBB
10 2
WBBWBBWBBW
4 1
BBBB
3 2
WWW


 */
