import java.util.Scanner;
public class isLetterOrDigit 
{
    public static void main(String[] args)   
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Character to Check : ");
        char ch = sc.next().charAt(0);
        System.out.println(isLetterOrDigit1(ch));

    }
    public static boolean isLetterOrDigit1(char ch)
    {
        if( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9'))
            return true;
        else    
            return false;
    }
}
