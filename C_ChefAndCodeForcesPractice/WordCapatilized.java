import java.util.Scanner;
import java.io.*;
public class WordCapatilized
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        PrintStream stream = new PrintStream(System.out);
        String str = sc.next();
        char ch[]  = str.toCharArray();
        if(Character.isLowerCase(ch[0]))
            ch[0] = Character.toUpperCase(ch[0]);
            
        stream.println(ch);
        stream.flush();
  
    }
}