import java.util.*;
import java.io.*;
public class HelpfulMaths
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = str.replace("+","");
        char arr[] = str.toCharArray();
        
        Arrays.sort(arr);
        //System.out.println(arr);
        for(int i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
            if(i == arr.length-1)
                continue;
            System.out.print("+");
        }
    }
}