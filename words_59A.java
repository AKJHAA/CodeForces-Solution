import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class words_59A
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c[] = str.toCharArray();
        int countU = 0, countL = 0;
        for(int i=0;i<str.length();i++)
        {
            if(Character.isUpperCase(c[i]))
                countU++;
            else
                countL++;
        }
        if(countU > countL)
            System.out.println(str.toUpperCase());
        else
            System.out.println(str.toLowerCase());
    }
}