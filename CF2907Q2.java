import java.util.Scanner;
public class CF2907Q2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            // int i =0;
            long n = sc.nextLong();
            int max=0;
            int count = 0;
            for(int i = 1;i<=10000;i++)
            {
                if(n % i == 0)
                {
                    count++;
                }
                else{
                    count = 0;
                }
                max = Math.max(max,count);
            }
            System.out.println(max);
        }
    }
}
/*
 10
1
40
990990
4204474560
169958913706572972
365988220345828080
387701719537826430
620196883578129853
864802341280805662
1000000000000000000
////////////////////
1
2
3
6
4
22
3
1
2
2

 */
