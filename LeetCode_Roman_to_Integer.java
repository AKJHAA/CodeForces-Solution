import java.util.Scanner;
public class LeetCode_Roman_to_Integer
{
    public static void main (String[] args)
    {
        System.out.print(Rom_to_Int("ILX"));
    }
    public static int Rom_to_Int(String str)
    {
        int sum = 0;
        int pre = 0;
        int length = str.length();
        
        for(int i = length - 1;i>=0;i--)
        {
            int ch = getNumber(str.charAt(i));
            if(i == length-1)
                sum = sum + ch;
            else
            {
                if(ch < pre)
                    sum = sum - ch;
                else   
                    sum = sum + ch;
            }
            pre = ch;
        }
        return sum;
    }
    public static int getNumber(char c)
    {
        int num = 0;
        switch(c)
        {
            case 'I':
            num = 1;
            break;
        case 'V':
            num = 5;
            break;
         case 'X':
            num = 10;
            break;
         case 'L':
             num = 50;
             break;
         case 'C':
             num = 100;
             break;
         case 'D':
             num = 500;
             break;
         case 'M':
             num = 1000;
             break;
         default:
             num = 0;
             break;
        }
        return num;
    }

}
