//New Year and Hurry 750A CodeForces

import java.util.*;
import java.io.*;
public class NewYearandHurry750A
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        int R_Time = 240 - k;
        
        for(int i = 1;i<=n;i++)
        {
            R_Time  = R_Time - 5 * i;
            if(R_Time >= 0)
                count++;
        }
        System.out.println(count);
    }
}