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