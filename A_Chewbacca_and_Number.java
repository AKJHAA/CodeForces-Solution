import java.util.Scanner;
public class A_Chewbacca_and_Number 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        // System.out.println();
        StringBuilder sb = new StringBuilder("");
        int ans = 0;
        for(int i = 0;i < num.length();i++)
        {
            int temp = (int)(num.charAt(i) - '0');
            if(temp > 4)
                temp = 9-temp;
            if(i == 0 && temp == 0)
                temp = 9;
            char ch = (char)('0' + temp);
            sb.append(ch);
        }
        System.out.println(sb.toString());
    }
}
