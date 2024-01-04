import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class printNto1Recursion {
    static ArrayList<String> list = new ArrayList<String>();

    public static void printNto1(int n)
    {
        if(n == 0)
            return;
        System.out.print(n + " ");
        printNto1(n-1);
    }
    public static void print1toN(int n)
    {
        if(n == 0)
            return;
        print1toN(n-1);
        System.out.print(n + " ");
    }
    public static void sum(int i,int sum)
    {
        if(i < 1)
        {
            System.out.println(sum);
            return;
        }
        sum(i-1,sum + i);
    }
    public static int sum1(int n)
    {
        if(n == 1)
            return 1;
        return n + sum1(n - 1);
    }
    public static int factorial(int n)
    {
        if(n == 1)
            return n;
        return n * factorial(n - 1);
    }
    public static void factorial1(int i, int fact)
    {
        if(i < 1)
        {
            System.out.println(fact);
            return;
        }
        factorial1(i - 1, fact * i);
    }
    public static void reverse(int[] arr,int start,int end)
    {
        if(start >= end)
            return;
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverse(arr,start+1,end-1);
    }
    public static boolean palindrome(String str,int start ,int end)
    {
        if(start >= end)
            return true;
        if(str.charAt(start) == str.charAt(end))
            return palindrome(str,start+1,end-1);
        else
            return false;
    }

    public static void subsequences(String str , int i , String ans)
    {
        if(i == str.length())
        {
            if(ans == ""){
                // list.add("{}");
                System.out.println("{}");
            }
            else{
                // list.add(ans);
                System.out.println(ans);
                }
            return;
            
        }
        subsequences(str, i+1, ans+str.charAt(i));
        subsequences(str , i + 1 , ans);
    }

    public static void moveNegativeToEnd(int[] arr)
    {
        int n = arr.length;
        for(int i = 0;i<n;i++)
            System.out.print(arr[i] + " ");
        System.out.println();
        int count = 0;
        for(int i = 0;i < arr.length;i++)
        {
            if(arr[i] >= 0)
            {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
        System.out.println();
        for(int i = 0;i<n;i++)
            System.out.print(arr[i] + " ");
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        int arr[] = {-1 , -2, 3 ,10,18,-20,9,-6, -4 , 5 , 6};
        moveNegativeToEnd(arr);
        // String str = sc.next();
        // String ans = "";
        // subsequences(str , 0 , ans );
        // Collections.sort(list);
        // for(String x : list)
        //     System.out.println(x);
        // System.out.println(palindrome(str,0,str.length()-1));
        // print1toN(num);
        // System.out.println();
        // printNto1(num);
        // sum(num , 0);
        // System.out.println(sum1(num));
        // System.out.println(factorial(num));
        // factorial1(num, 1);
        // int arr[] = new int[num];
        // System.out.println("Enter Array Element : - ");
        // for(int i = 0;i < num;i++)
        // {
        //     arr[i] = sc.nextInt();
        // }
        // System.out.println();
        // for(int i = 0;i < num;i++)
        //     System.out.print(arr[i] + " ");

        // reverse(arr,0,num - 1);

        // System.out.println();
        // for(int i = 0;i < num;i++)
        //     System.out.print(arr[i] + " ");
    }
}
