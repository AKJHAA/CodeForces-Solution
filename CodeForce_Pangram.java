import java.util.Scanner;
public class CodeForce_Pangram
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String str = sc.next();
        if(x < 26)
        {
            System.out.println("NO");
        }
        else
        {
            str = str.toLowerCase();
            int arr[] = new int[26];
            for(int i = 0;i<x;i++)
            {
                arr[str.charAt(i) - 97]++;
            }
            for(int i = 0;i<26;i++)
            {
                if(arr[i] == 0)
                {
                   System.out.println("NO");
                   return;
                }
            }
            System.out.println("YES");
        }
    }
}