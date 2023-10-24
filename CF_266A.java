import java.util.Scanner;
public class CF_266A
{
 
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String str = sc.next();
        int count = 0;
        for(int i = 0;i < str.length()-1;i++)
        {
            if(str.charAt(i) == str.charAt(i+1))
                count++;
        }
        System.out.println(count);
    }
}
/*
5
2
2 1
3
1 2 3
5
1 2 5 4 3
4
1 2 4 3
10
10 2 1 3 6 5 4 7 9 8
 */